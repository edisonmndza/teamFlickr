package com.mendozae.teamflickr;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

public class UserProfilePagerAdapter extends FragmentPagerAdapter {

    int mNumOfTabs;
    public UserProfilePagerAdapter(FragmentManager fm, int numTabs){
        super(fm);
        this.mNumOfTabs = numTabs;
    }
    @Override
    public Fragment getItem(int i) {
        switch(i){
            case 0:
                Log.i("fwf", "fwefe");
                return new Public(); //if the first tab is pressed, it creates a new Public() fragment object
            case 1:
                Log.i("fweaf", "fefaewf");
                return new Faves(); //if the second tab is pressed, it creates a new Albums() fragment object
            case 2:
                Log.i("k;jk;j", "l;kj;");
                return new About(); //if the third tab is pressed, it creates a new About() fragment object
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    } //returns how many tabs there are intended to be
}
