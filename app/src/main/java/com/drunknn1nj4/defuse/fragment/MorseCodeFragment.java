package com.drunknn1nj4.defuse.fragment;

import com.drunknn1nj4.defuse.R;
import com.drunknn1nj4.defuse.presenter.MorseCodePresenter;
import com.drunknn1nj4.defuse.view.MorseCodeView;

/**
 * @author Sean Kleinjung
 */
public class MorseCodeFragment extends BaseFragment<MorseCodePresenter, MorseCodeView> implements MorseCodeView {
    @Override
    public void initializeView() {

    }

    @Override
    protected MorseCodePresenter createPresenter() {
        return new MorseCodePresenter();
    }

    @Override
    protected MorseCodeView getFragmentView() {
        return this;
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_morse_code;
    }
}
