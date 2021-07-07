package org.maktab.market.activities;

import androidx.fragment.app.Fragment;

import org.maktab.market.fragments.MarketFragment;

public class MarketActivity extends SingleFragmentActivity {


    @Override
    public Fragment createFragment() {
        return MarketFragment.newInstance();
    }
}