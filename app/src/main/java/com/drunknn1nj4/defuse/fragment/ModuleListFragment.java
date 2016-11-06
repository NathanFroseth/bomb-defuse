package com.drunknn1nj4.defuse.fragment;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.drunknn1nj4.defuse.DefuseApplication;
import com.drunknn1nj4.defuse.R;
import com.drunknn1nj4.defuse.model.Module;
import com.drunknn1nj4.defuse.presenter.ModuleListPresenter;
import com.drunknn1nj4.defuse.service.impl.ModuleServiceDefaultImpl;
import com.drunknn1nj4.defuse.view.ModuleListView;

import java.util.List;

import butterknife.BindView;

/**
 * @author Sean Kleinjung
 */
public class ModuleListFragment extends BaseFragment<ModuleListPresenter, ModuleListView> implements ModuleListView {

    @BindView(R.id.module_list)
    ListView moduleList;

    private ModuleListAdapter moduleListAdapter;

    @Override
    public void initializeView() {
        moduleListAdapter = new ModuleListAdapter(getActivity());
        moduleList.setAdapter(moduleListAdapter);
        moduleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                presenter.onModuleSelected(moduleListAdapter.getItem(position));
            }
        });
    }

    @Override
    protected ModuleListPresenter createPresenter() {
        return new ModuleListPresenter(DefuseApplication.get(getActivity()).getBus(), new ModuleServiceDefaultImpl());
    }

    @Override
    protected ModuleListView getFragmentView() {
        return this;
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_module_list;
    }

    @Override
    public void setModules(List<Module> modules) {
        moduleListAdapter.clear();
        moduleListAdapter.addAll(modules);
        moduleListAdapter.notifyDataSetChanged();
    }

    private class ModuleListAdapter extends ArrayAdapter<Module> {
        ModuleListAdapter(Context context) {
            super(context, 0);
        }

        @NonNull
        @Override
        public View getView(int position, View view, ViewGroup parent) {
            if (view == null) {
                view = LayoutInflater.from(getContext()).inflate(R.layout.item_module, parent, false);
            }

            Module module = getItem(position);

            if (module != null) {
                TextView moduleName = (TextView) view.findViewById(R.id.module_name);
                moduleName.setText(module.getName());
            }

            return view;
        }
    }
}
