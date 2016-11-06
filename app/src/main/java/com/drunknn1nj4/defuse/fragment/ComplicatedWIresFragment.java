package com.drunknn1nj4.defuse.fragment;

import com.drunknn1nj4.defuse.R;
import com.drunknn1nj4.defuse.presenter.ComplicatedWiresPresenter;
import com.drunknn1nj4.defuse.presenter.WiresPresenter;
import com.drunknn1nj4.defuse.view.ComplicatedWiresView;
import com.drunknn1nj4.defuse.view.WiresView;

/**
 * @author Sean Kleinjung
 */
public class ComplicatedWiresFragment extends BaseFragment<ComplicatedWiresPresenter, ComplicatedWiresView> implements ComplicatedWiresView {
    @Override
    public void initializeView() {

    }

    @Override
    protected ComplicatedWiresPresenter createPresenter() {
        return new ComplicatedWiresPresenter();
    }

    @Override
    protected ComplicatedWiresView getFragmentView() {
        return this;
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_complicated_wires;
    }
}
