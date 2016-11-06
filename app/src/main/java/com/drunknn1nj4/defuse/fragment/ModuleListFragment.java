package com.drunknn1nj4.defuse.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.drunknn1nj4.defuse.R;
import com.drunknn1nj4.defuse.model.Module;
import com.drunknn1nj4.defuse.presenter.ModuleListPresenter;
import com.drunknn1nj4.defuse.service.impl.ModuleServiceDefaultImpl;
import com.drunknn1nj4.defuse.view.ModuleListView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Sean Kleinjung
 */
public class ModuleListFragment extends Fragment implements ModuleListView {

    private ModuleListPresenter presenter;

    @BindView(R.id.module_list)
    ListView moduleList;

    private ModuleListAdapter moduleListAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new ModuleListPresenter(new ModuleServiceDefaultImpl());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_module_list, container, false);
        ButterKnife.bind(this, view);

        moduleListAdapter = new ModuleListAdapter(getActivity());
        moduleList.setAdapter(moduleListAdapter);

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        presenter.attachView(this);
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.refreshView();
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
