package com.example.michailgromtsev.remindeme.adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.michailgromtsev.remindeme.fragments.ExampleFragment;

public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {
    private String[] mTabTitles;

    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        mTabTitles = new String[] {
                "Tab ",
                "Напоминание",
                "Tab 2",
        };
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ExampleFragment.getInstance();
            case 1:
                return ExampleFragment.getInstance();
            case 2:
                return ExampleFragment.getInstance();
            default:
                break;
     }
        return null;
    }

    @Override
    public int getCount() {
        return mTabTitles.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mTabTitles[position];
    }
}
