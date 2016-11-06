package com.drunknn1nj4.defuse.fragment;

import com.drunknn1nj4.defuse.R;
import com.drunknn1nj4.defuse.presenter.MazesPresenter;
import com.drunknn1nj4.defuse.view.MazesView;

/**
 * @author Sean Kleinjung
 */
public class MazesFragment extends BaseFragment<MazesPresenter, MazesView> implements MazesView {
    @Override
    public void initializeView() {

    }

    @Override
    protected MazesPresenter createPresenter() {
        return new MazesPresenter();
    }

    @Override
    protected MazesView getFragmentView() {
        return this;
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_maze;
    }
}
