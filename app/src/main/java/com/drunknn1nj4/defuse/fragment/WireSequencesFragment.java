package com.drunknn1nj4.defuse.fragment;

import com.drunknn1nj4.defuse.R;
import com.drunknn1nj4.defuse.presenter.WireSequencesPresenter;
import com.drunknn1nj4.defuse.view.WireSequencesView;

/**
 * @author Sean Kleinjung
 */
public class WireSequencesFragment extends BaseFragment<WireSequencesPresenter, WireSequencesView> implements WireSequencesView {
    @Override
    public void initializeView() {

    }

    @Override
    protected WireSequencesPresenter createPresenter() {
        return new WireSequencesPresenter();
    }

    @Override
    protected WireSequencesView getFragmentView() {
        return this;
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_wire_sequences;
    }
}
