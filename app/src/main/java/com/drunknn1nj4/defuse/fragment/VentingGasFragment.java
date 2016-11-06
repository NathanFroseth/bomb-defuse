package com.drunknn1nj4.defuse.fragment;

import com.drunknn1nj4.defuse.R;
import com.drunknn1nj4.defuse.presenter.VentingGasPresenter;
import com.drunknn1nj4.defuse.view.VentingGasView;

/**
 * @author Sean Kleinjung
 */
public class VentingGasFragment extends BaseFragment<VentingGasPresenter, VentingGasView> implements VentingGasView {
    @Override
    public void initializeView() {

    }

    @Override
    protected VentingGasPresenter createPresenter() {
        return new VentingGasPresenter();
    }

    @Override
    protected VentingGasView getFragmentView() {
        return this;
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_venting_gas;
    }
}
