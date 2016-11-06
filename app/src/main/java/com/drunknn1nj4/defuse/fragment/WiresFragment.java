package com.drunknn1nj4.defuse.fragment;

import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.drunknn1nj4.defuse.R;
import com.drunknn1nj4.defuse.presenter.WiresPresenter;
import com.drunknn1nj4.defuse.view.WiresView;

import java.util.Arrays;

import butterknife.BindView;

/**
 * @author Sean Kleinjung
 */
public class WiresFragment extends BaseFragment<WiresPresenter, WiresView> implements WiresView {

    @BindView(R.id.wire1)
    Spinner wireColor1;
    @BindView(R.id.wire2)
    Spinner wireColor2;
    @BindView(R.id.wire3)
    Spinner wireColor3;
    @BindView(R.id.wire4)
    Spinner wireColor4;
    @BindView(R.id.wire5)
    Spinner wireColor5;
    @BindView(R.id.wire6)
    Spinner wireColor6;

    @Override
    public void initializeView() {

    }

    @Override
    protected WiresPresenter createPresenter() {
        return new WiresPresenter(getResources());
    }

    @Override
    protected WiresView getFragmentView() {
        return this;
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_wires;
    }

    @Override
    public void setWireColors(String[] stringArray) {
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = new ArrayAdapter<CharSequence>(getActivity(), R.layout.item_spinner, stringArray);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        wireColor1.setAdapter(adapter);
        wireColor2.setAdapter(adapter);
        wireColor3.setAdapter(adapter);
        wireColor4.setAdapter(adapter);
        wireColor5.setAdapter(adapter);
        wireColor6.setAdapter(adapter);
    }
}
