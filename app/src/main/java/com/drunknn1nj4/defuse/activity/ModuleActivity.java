package com.drunknn1nj4.defuse.activity;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @author Sean Kleinjung
 */
public class ModuleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getFragmentManager()
                .beginTransaction()
                .replace(android.R.id.content, getFragment())
                .commit();
    }

    private Fragment getFragment() {
        try {
            return (Fragment) getFragmentClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException("Failed to instantiate fragment class: " + e.toString(), e);
        }
    }

    /**
     * Gets the URL to display on this web activity.
     * @return the URL to display.
     */
    protected Class getFragmentClass() {
        try {
            return Class.forName(getIntent().getStringExtra("moduleFragmentClass"));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Failed to get module fragment class: " + e.toString(), e);
        }
    }
}
