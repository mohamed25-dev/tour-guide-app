package com.m25dev.tourguideapp;

import android.content.Context;

import java.util.List;

/**
 * Created by mohamed on 8/25/17.
 */

public class Shop {
    public static void initShopList(Context context, List<Place> list) {

        list.add(new Place(
                context.getString(R.string.first_shop_name),
                context.getString(R.string.first_location),
                context.getString(R.string.first_review),
                context.getString(R.string.first_phone_number),
                context.getString(R.string.first_shop_about),
                R.drawable.shop_one
        ));

        list.add(new Place(
                context.getString(R.string.second_shop_name),
                context.getString(R.string.second_location),
                context.getString(R.string.second_review),
                context.getString(R.string.second_phone_number),
                context.getString(R.string.second_shop_about),
                R.drawable.shop_two
        ));

        list.add(new Place(
                context.getString(R.string.third_shop_name),
                context.getString(R.string.third_location),
                context.getString(R.string.third_review),
                context.getString(R.string.third_phone_number),
                context.getString(R.string.third_hotel_about),
                R.drawable.shop_three
        ));

        list.add(new Place(
                context.getString(R.string.four_shop_name),
                context.getString(R.string.four_location),
                context.getString(R.string.four_review),
                context.getString(R.string.four_phone_number),
                context.getString(R.string.four_shop_about),
                R.drawable.shop_four
        ));

        list.add(new Place(
                context.getString(R.string.five_shop_name),
                context.getString(R.string.five_location),
                context.getString(R.string.five_review),
                context.getString(R.string.five_phone_number),
                context.getString(R.string.five_shop_about),
                R.drawable.shop_five
        ));

    }
}
