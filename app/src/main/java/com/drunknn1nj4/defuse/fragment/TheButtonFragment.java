package com.drunknn1nj4.defuse.fragment;

import com.drunknn1nj4.defuse.R;
import com.drunknn1nj4.defuse.presenter.TheButtonPresenter;
import com.drunknn1nj4.defuse.view.TheButtonView;

/**
 * @author Sean Kleinjung
 */
public class TheButtonFragment extends BaseFragment<TheButtonPresenter, TheButtonView> implements TheButtonView {
    @Override
    public void initializeView() {

    }

    @Override
    protected TheButtonPresenter createPresenter() {
        return new TheButtonPresenter();
    }

    @Override
    protected TheButtonView getFragmentView() {
        return this;
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_the_button;
    }
}
