package com.drunknn1nj4.defuse.presenter;

import android.support.annotation.NonNull;

import com.drunknn1nj4.defuse.service.ModuleService;
import com.drunknn1nj4.defuse.view.ModuleListView;

/**
 * @author Sean Kleinjung
 */
public class ModuleListPresenter {
    private ModuleService moduleService;
    private ModuleListView view;

    public ModuleListPresenter(@NonNull ModuleService moduleService) {
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
}
