package org.maktab.market.fragments;

import android.content.Context;
import android.database.DatabaseUtils;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.maktab.market.R;
import org.maktab.market.databinding.FragmentMarketBinding;

public class MarketFragment extends Fragment {

    FragmentMarketBinding mBinding;

    public MarketFragment() {
    }

    public static MarketFragment newInstance() {
        MarketFragment fragment = new MarketFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater,
                R.layout.fragment_market,
                container,
                false);

        initViews();

        return mBinding.getRoot();
    }

    private void initViews(){
        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.HORIZONTAL,
                false));
    }
}