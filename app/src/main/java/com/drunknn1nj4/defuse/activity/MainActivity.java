package com.drunknn1nj4.defuse.activity;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;

import com.drunknn1nj4.defuse.DefuseApplication;
import com.drunknn1nj4.defuse.R;
import com.drunknn1nj4.defuse.event.ModuleSelectedEvent;
import com.drunknn1nj4.defuse.fragment.WiresFragment;
import com.squareup.otto.Subscribe;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.module_container)
    @Nullable
    ViewGroup moduleContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        DefuseApplication.get(this).getBus().register(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        DefuseApplication.get(this).getBus().unregister(this);
    }

    private boolean isDualPane() {
        return moduleContainer != null;
    }

    @Subscribe
    public void onModuleSelectedEvent(ModuleSelectedEvent event) {
        if ("Wires".equals(event.getModule().getName())) {
            showFragment(WiresFragment.class);
        }
    }

    private void showFragment(Class<WiresFragment> wiresFragmentClass) {
        if (isDualPane()) {
            try {
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.module_container, wiresFragmentClass.newInstance())
                        .commit();
            } catch (java.lang.InstantiationException | IllegalAccessException ignored) {
                throw new RuntimeException("Failed to instantiate fragment class: " + ignored.toString(), ignored);
            }
        } else {
            Intent intent = new Intent(this, ModuleActivity.class);
            intent.putExtra("moduleFragmentClass", wiresFragmentClass.getName());
            startActivity(intent);
        }
    }
}
