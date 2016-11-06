package com.drunknn1nj4.defuse.fragment;

import com.drunknn1nj4.defuse.R;
import com.drunknn1nj4.defuse.presenter.SimonSaysPresenter;
import com.drunknn1nj4.defuse.view.SimonSaysView;

/**
 * @author Sean Kleinjung
 */
public class SimonSaysFragment extends BaseFragment<SimonSaysPresenter, SimonSaysView> implements SimonSaysView {
    @Override
    public void initializeView() {

    }

    @Override
    protected SimonSaysPresenter createPresenter() {
        return new SimonSaysPresenter();
    }

    @Override
    protected SimonSaysView getFragmentView() {
        return this;
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_simon_says;
    }
}
