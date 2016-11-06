package com.drunknn1nj4.defuse.activity;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;

import com.drunknn1nj4.defuse.DefuseApplication;
import com.drunknn1nj4.defuse.R;
import com.drunknn1nj4.defuse.event.ModuleSelectedEvent;
import com.drunknn1nj4.defuse.fragment.CapacitoDischargeFragment;
import com.drunknn1nj4.defuse.fragment.ComplicatedWiresFragment;
import com.drunknn1nj4.defuse.fragment.KeypadFragment;
import com.drunknn1nj4.defuse.fragment.KnobsFragment;
import com.drunknn1nj4.defuse.fragment.MazesFragment;
import com.drunknn1nj4.defuse.fragment.MemoryFragment;
import com.drunknn1nj4.defuse.fragment.MorseCodeFragment;
import com.drunknn1nj4.defuse.fragment.PasswordsFragment;
import com.drunknn1nj4.defuse.fragment.SimonSaysFragment;
import com.drunknn1nj4.defuse.fragment.TheButtonFragment;
import com.drunknn1nj4.defuse.fragment.VentingGasFragment;
import com.drunknn1nj4.defuse.fragment.WhosOnFirstFragment;
import com.drunknn1nj4.defuse.fragment.WireSequencesFragment;
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
        } else if ("The Button".equals(event.getModule().getName())) {
            showFragment(TheButtonFragment.class);
        } else if ("Keypads".equals(event.getModule().getName())) {
            showFragment(KeypadFragment.class);
        } else if ("Simon Says".equals(event.getModule().getName())) {
            showFragment(SimonSaysFragment.class);
        } else if ("Who's on First".equals(event.getModule().getName())) {
            showFragment(WhosOnFirstFragment.class);
        } else if ("Memory".equals(event.getModule().getName())) {
            showFragment(MemoryFragment.class);
        } else if ("Morse Code".equals(event.getModule().getName())) {
            showFragment(MorseCodeFragment.class);
        } else if ("Complicated Wires".equals(event.getModule().getName())) {
            showFragment(ComplicatedWiresFragment.class);
        } else if ("Wire Sequences".equals(event.getModule().getName())) {
            showFragment(WireSequencesFragment.class);
        } else if ("Mazes".equals(event.getModule().getName())) {
            showFragment(MazesFragment.class);
        } else if ("Passwords".equals(event.getModule().getName())) {
            showFragment(PasswordsFragment.class);
        } else if ("Venting Gas".equals(event.getModule().getName())) {
            showFragment(VentingGasFragment.class);
        } else if ("Capacitor Discharge".equals(event.getModule().getName())) {
            showFragment(CapacitoDischargeFragment.class);
        } else if ("Knobs".equals(event.getModule().getName())) {
            showFragment(KnobsFragment.class);
        }
    }

    private void showFragment(Class<? extends Fragment> wiresFragmentClass) {
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
