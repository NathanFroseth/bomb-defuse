package com.drunknn1nj4.defuse.fragment;

import com.drunknn1nj4.defuse.R;
import com.drunknn1nj4.defuse.presenter.WiresPresenter;
import com.drunknn1nj4.defuse.view.WiresView;

/**
 * @author Sean Kleinjung
 */
public class WiresFragment extends BaseFragment<WiresPresenter, WiresView> implements WiresView {
    @Override
    public void initializeView() {

    }

    @Override
    protected WiresPresenter createPresenter() {
        return new WiresPresenter();
    }

    @Override
    protected WiresView getFragmentView() {
        return this;
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_wires;
    }
}
