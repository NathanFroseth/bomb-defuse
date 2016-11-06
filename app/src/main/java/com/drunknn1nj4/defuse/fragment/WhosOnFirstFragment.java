package com.drunknn1nj4.defuse.fragment;

import com.drunknn1nj4.defuse.R;
import com.drunknn1nj4.defuse.presenter.WhosOnFirstPresenter;
import com.drunknn1nj4.defuse.view.WhosOnFirstView;

/**
 * @author Sean Kleinjung
 */
public class WhosOnFirstFragment extends BaseFragment<WhosOnFirstPresenter, WhosOnFirstView> implements WhosOnFirstView {
    @Override
    public void initializeView() {

    }

    @Override
    protected WhosOnFirstPresenter createPresenter() {
        return new WhosOnFirstPresenter();
    }

    @Override
    protected WhosOnFirstView getFragmentView() {
        return this;
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_whos_on_first;
    }
}
