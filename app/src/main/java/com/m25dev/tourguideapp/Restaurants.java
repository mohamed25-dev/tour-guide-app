package com.m25dev.tourguideapp;

import android.content.Context;

import java.util.List;

/**
 * Created by mohamed on 8/24/17.
 */

public class Restaurants {

    public static void initRestaurantList(Context context, List<Place> list) {

        list.add(new Place(
                context.getString(R.string.first_res_name),
                context.getString(R.string.first_location),
                context.getString(R.string.first_review),
                context.getString(R.string.first_phone_number),
                context.getString(R.string.first_res_about),
                R.drawable.restaurant_one
        ));

        list.add(new Place(
                context.getString(R.string.second_res_name),
                context.getString(R.string.second_location),
                context.getString(R.string.second_review),
                context.getString(R.string.second_phone_number),
                context.getString(R.string.second_res_about),
                R.drawable.restaurant_two
        ));

        list.add(new Place(
                context.getString(R.string.third_res_name),
                context.getString(R.string.third_location),
                context.getString(R.string.third_review),
                context.getString(R.string.third_phone_number),
                context.getString(R.string.third_res_about),
                R.drawable.restaurants_three
        ));

        list.add(new Place(
                context.getString(R.string.four_res_name),
                context.getString(R.string.four_location),
                context.getString(R.string.four_review),
                context.getString(R.string.four_phone_number),
                context.getString(R.string.four_res_about),
                R.drawable.restaurants_four
        ));

        list.add(new Place(
                context.getString(R.string.five_res_name),
                context.getString(R.string.five_location),
                context.getString(R.string.five_review),
                context.getString(R.string.five_phone_number),
                context.getString(R.string.five_res_about),
                R.drawable.restaurant_five
        ));

    }
}
