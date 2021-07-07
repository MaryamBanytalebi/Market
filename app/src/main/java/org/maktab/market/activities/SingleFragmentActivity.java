package org.maktab.market.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import org.maktab.market.R;
import org.maktab.market.databinding.ActivityFragmentBinding;

public abstract class SingleFragmentActivity extends AppCompatActivity {

    public abstract Fragment createFragment();
    private ActivityFragmentBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container);

        if (fragment == null){
            fragmentManager
                    .beginTransaction()
                    .add(R.id.fragment_container, createFragment())
                    .commit();
        }
    }
}