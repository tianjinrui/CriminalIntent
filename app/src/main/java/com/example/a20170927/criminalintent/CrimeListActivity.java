package com.example.a20170927.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by 20170927 on 2017/10/27.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
