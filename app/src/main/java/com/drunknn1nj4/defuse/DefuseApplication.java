package com.drunknn1nj4.defuse;

import android.app.Application;
import android.content.Context;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

/**
 * @author Sean Kleinjung
 */
public class DefuseApplication extends Application {
    private Bus bus;

    public static DefuseApplication get(Context context) {
        return (DefuseApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        bus = new Bus(ThreadEnforcer.MAIN);
    }

    public Bus getBus() {
        return bus;
    }
}
