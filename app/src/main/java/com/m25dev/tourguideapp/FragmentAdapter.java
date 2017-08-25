package com.m25dev.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by mohamed on 8/22/17.
 */

public class FragmentAdapter extends FragmentPagerAdapter {

    Context mContext;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0) {
            return new RestaurantFragment();
        } else if(position == 1) {
            return new HotelFragment();
        } else if(position == 2) {
            return new ShopFragment();
        } else {
            return new InfoFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0) {
            return mContext.getResources().getString(R.string.restaurants_category);
        } else if(position == 1) {
            return mContext.getResources().getString(R.string.hotel_category);
        } else if(position == 2) {
            return mContext.getResources().getString(R.string.shop_category);
        } else {
            return mContext.getResources().getString(R.string.info_category);
        }
    }
}
