package com.drunknn1nj4.defuse.presenter;

import android.content.res.Resources;
import android.support.annotation.NonNull;

import com.drunknn1nj4.defuse.R;
import com.drunknn1nj4.defuse.model.Module;
import com.drunknn1nj4.defuse.service.ModuleService;
import com.drunknn1nj4.defuse.view.ModuleListView;
import com.drunknn1nj4.defuse.view.WiresView;

/**
 * @author Sean Kleinjung
 */
public class WiresPresenter extends BasePresenter<WiresView> {
    private Resources resources;

    public WiresPresenter(Resources resources) {
        this.resources = resources;
    }

    public void refreshView() {
        view.setWireColors(resources.getStringArray(R.array.wire_colors));
    }
}
