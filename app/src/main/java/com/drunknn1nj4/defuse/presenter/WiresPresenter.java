package com.drunknn1nj4.defuse.presenter;

import android.support.annotation.NonNull;

import com.drunknn1nj4.defuse.model.Module;
import com.drunknn1nj4.defuse.service.ModuleService;
import com.drunknn1nj4.defuse.view.ModuleListView;
import com.drunknn1nj4.defuse.view.WiresView;

/**
 * @author Sean Kleinjung
 */
public class WiresPresenter extends BasePresenter<WiresView> {
    private WiresView view;

    public void attachView(WiresView view) {
        this.view = view;
    }

    public void refreshView() {
        if (view != null) {
        }
    }
}
