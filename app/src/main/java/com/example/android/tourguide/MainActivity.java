package com.example.android.tourguide;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set the content of the activity to use the activity_main layout xml file
        setContentView(R.layout.activity_category);

        //find the view page that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        //create an adapter that knows which fragment should be shown on each page
        TourFragmentPagerAdapter fragmentAdapter = new TourFragmentPagerAdapter(getSupportFragmentManager()) {
        };

        //set the adapter onto the view pager
        viewPager.setAdapter(fragmentAdapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

    }
}
