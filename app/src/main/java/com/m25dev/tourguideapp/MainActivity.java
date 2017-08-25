package com.m25dev.tourguideapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setElevation(0);

        FragmentAdapter fragmentAdapter = new FragmentAdapter(this, getSupportFragmentManager());

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);

        viewPager.setAdapter(fragmentAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
