package com.drunknn1nj4.defuse.fragment;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.drunknn1nj4.defuse.R;
import com.drunknn1nj4.defuse.activity.ModuleActivity;
import com.drunknn1nj4.defuse.model.Module;
import com.drunknn1nj4.defuse.presenter.BasePresenter;
import com.drunknn1nj4.defuse.presenter.ModuleListPresenter;
import com.drunknn1nj4.defuse.service.impl.ModuleServiceDefaultImpl;
import com.drunknn1nj4.defuse.view.BaseView;
import com.drunknn1nj4.defuse.view.ModuleListView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Sean Kleinjung
 */
public abstract class BaseFragment<P extends BasePresenter<V>, V extends BaseView> extends Fragment implements BaseView {

    protected P presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();
    }

    public abstract void initializeView();
    protected abstract P createPresenter();
    protected abstract V getFragmentView();
    protected abstract int getLayoutResourceId();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutResourceId(), container, false);
        ButterKnife.bind(this, view);
        initializeView();
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        presenter.attachView(getFragmentView());
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.refreshView();
    }
}
