package com.drunknn1nj4.defuse.fragment;

import com.drunknn1nj4.defuse.R;
import com.drunknn1nj4.defuse.presenter.KnobsPresenter;
import com.drunknn1nj4.defuse.view.KnobsView;

/**
 * @author Sean Kleinjung
 */
public class KnobsFragment extends BaseFragment<KnobsPresenter, KnobsView> implements KnobsView {
    @Override
    public void initializeView() {

    }

    @Override
    protected KnobsPresenter createPresenter() {
        return new KnobsPresenter();
    }

    @Override
    protected KnobsView getFragmentView() {
        return this;
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_knob;
    }
}
