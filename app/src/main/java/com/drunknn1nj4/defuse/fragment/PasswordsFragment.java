package com.drunknn1nj4.defuse.fragment;

import com.drunknn1nj4.defuse.R;
import com.drunknn1nj4.defuse.presenter.PasswordsPresenter;
import com.drunknn1nj4.defuse.view.PasswordsView;

/**
 * @author Sean Kleinjung
 */
public class PasswordsFragment extends BaseFragment<PasswordsPresenter, PasswordsView> implements PasswordsView {
    @Override
    public void initializeView() {

    }

    @Override
    protected PasswordsPresenter createPresenter() {
        return new PasswordsPresenter();
    }

    @Override
    protected PasswordsView getFragmentView() {
        return this;
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_passwords;
    }
}
