package com.drunknn1nj4.defuse.fragment;

import com.drunknn1nj4.defuse.R;
import com.drunknn1nj4.defuse.presenter.MemoryPresenter;
import com.drunknn1nj4.defuse.view.MemoryView;

/**
 * @author Sean Kleinjung
 */
public class MemoryFragment extends BaseFragment<MemoryPresenter, MemoryView> implements MemoryView {
    @Override
    public void initializeView() {

    }

    @Override
    protected MemoryPresenter createPresenter() {
        return new MemoryPresenter();
    }

    @Override
    protected MemoryView getFragmentView() {
        return this;
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_memory;
    }
}
