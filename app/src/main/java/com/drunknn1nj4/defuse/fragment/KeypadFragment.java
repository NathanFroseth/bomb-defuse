package com.drunknn1nj4.defuse.fragment;

import com.drunknn1nj4.defuse.R;
import com.drunknn1nj4.defuse.presenter.KeypadsPresenter;
import com.drunknn1nj4.defuse.view.KeypadView;

/**
 * @author Sean Kleinjung
 */
public class KeypadFragment extends BaseFragment<KeypadsPresenter, KeypadView> implements KeypadView {
    @Override
    public void initializeView() {

    }

    @Override
    protected KeypadsPresenter createPresenter() {
        return new KeypadsPresenter();
    }

    @Override
    protected KeypadView getFragmentView() {
        return this;
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_keypad;
    }
}
