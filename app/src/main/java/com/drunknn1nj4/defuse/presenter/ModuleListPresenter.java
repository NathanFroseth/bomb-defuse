package com.drunknn1nj4.defuse.presenter;

import android.support.annotation.NonNull;

import com.drunknn1nj4.defuse.event.ModuleSelectedEvent;
import com.drunknn1nj4.defuse.model.Module;
import com.drunknn1nj4.defuse.service.ModuleService;
import com.drunknn1nj4.defuse.view.ModuleListView;
import com.squareup.otto.Bus;

/**
 * @author Sean Kleinjung
 */
public class ModuleListPresenter extends BasePresenter<ModuleListView> {
    private Bus bus;
    private ModuleService moduleService;
    private ModuleListView view;

    public ModuleListPresenter(@NonNull Bus bus, @NonNull ModuleService moduleService) {
        this.bus = bus;
        this.moduleService = moduleService;
    }

    public void attachView(ModuleListView view) {
        this.view = view;
    }

    public void refreshView() {
        if (view != null) {
            view.setModules(moduleService.getAllModules());
        }
    }

    public void onModuleSelected(Module module) {
        if (view == null) {
            return;
        }

        bus.post(new ModuleSelectedEvent(module));
    }
}
