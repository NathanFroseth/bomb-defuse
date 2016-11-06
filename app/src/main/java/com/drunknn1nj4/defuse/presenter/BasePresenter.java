package com.drunknn1nj4.defuse.presenter;

import com.drunknn1nj4.defuse.view.BaseView;

/**
 * @author Sean Kleinjung
 */
public class BasePresenter<V extends BaseView> {
    protected V view;

    public void attachView(V view) {
        this.view = view;
    }

    public void refreshView() {

    }
}
