package com.m25dev.tourguideapp;

import android.content.Context;

import java.util.List;

/**
 * Created by mohamed on 8/25/17.
 */

public class Hotel {

    public static void initHotelList(Context context, List<Place> list) {

        list.add(new Place(
                context.getString(R.string.first_hotel_name),
                context.getString(R.string.first_location),
                context.getString(R.string.first_review),
                context.getString(R.string.first_phone_number),
                context.getString(R.string.first_hotel_about),
                R.drawable.hotel_one
        ));

        list.add(new Place(
                context.getString(R.string.second_hotel_name),
                context.getString(R.string.second_location),
                context.getString(R.string.second_review),
                context.getString(R.string.second_phone_number),
                context.getString(R.string.second_hotel_about),
                R.drawable.hotel_two
        ));

        list.add(new Place(
                context.getString(R.string.third_hotel_name),
                context.getString(R.string.third_location),
                context.getString(R.string.third_review),
                context.getString(R.string.third_phone_number),
                context.getString(R.string.third_hotel_about),
                R.drawable.hotel_three
        ));

        list.add(new Place(
                context.getString(R.string.four_hotel_name),
                context.getString(R.string.four_location),
                context.getString(R.string.four_review),
                context.getString(R.string.four_phone_number),
                context.getString(R.string.four_hotel_about),
                R.drawable.hotel_four
        ));

        list.add(new Place(
                context.getString(R.string.five_hotel_name),
                context.getString(R.string.five_location),
                context.getString(R.string.five_review),
                context.getString(R.string.five_phone_number),
                context.getString(R.string.five_hotel_about),
                R.drawable.hotel_five
        ));

    }
}
