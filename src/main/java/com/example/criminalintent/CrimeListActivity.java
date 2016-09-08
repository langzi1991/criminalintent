package com.example.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by mac on 16/9/8.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
