package com.example.jesus.dessertandcode;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by jm12232 on 2/1/2016.
 */
public class FragmentPageAdapter extends FragmentStatePagerAdapter
{

    int mNumofTabs=0;
    private Context context;

    public FragmentPageAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
this.mNumofTabs=NumOfTabs;
    }

    @Override
    public int getCount() {
        return mNumofTabs;
    }

    @Override
    public Fragment getItem(int position)
    {
            switch (position)
            {
                case 0:
                    BlankFragment tab1=new BlankFragment();
                    return tab1;

                default:
                    BlankFragment tab0=new BlankFragment();
                    return tab0;

            }
}

    }




