package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public abstract class TourFragmentPagerAdapter extends FragmentPagerAdapter{
    private String tabTitles[] = new String[] {"Monuments", "Restaurants", "Museums", "Events"};


    public TourFragmentPagerAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new MonumentsFragment();
        } else if (position == 1){
            return new RestaurantsFragment();
        } else if (position == 2){
            return new MuseumsFragment();
        } else {
            return  new EventsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    //gives the title to each tab
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }


}