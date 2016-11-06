package com.drunknn1nj4.defuse.fragment;

import com.drunknn1nj4.defuse.R;
import com.drunknn1nj4.defuse.presenter.CapacitorDischargePresenter;
import com.drunknn1nj4.defuse.view.CapacitorDischargeView;

/**
 * @author Sean Kleinjung
 */
public class CapacitoDischargeFragment extends BaseFragment<CapacitorDischargePresenter, CapacitorDischargeView> implements CapacitorDischargeView {
    @Override
    public void initializeView() {

    }

    @Override
    protected CapacitorDischargePresenter createPresenter() {
        return new CapacitorDischargePresenter();
    }

    @Override
    protected CapacitorDischargeView getFragmentView() {
        return this;
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_capacitor_discharge;
    }
}
