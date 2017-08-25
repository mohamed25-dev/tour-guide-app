package com.m25dev.tourguideapp;

import android.content.Context;

import java.util.List;

/**
 * Created by mohamed on 8/25/17.
 */

public class Info {

    public static void initInfoList(Context context, List<Place> list) {

        list.add(new Place(
                context.getString(R.string.inf_about_header),
                null,
                null,
                null,
                context.getString(R.string.info_about),
                R.drawable.info_first,
                true
        ));

        list.add(new Place(
                context.getString(R.string.info_location_header),
                null,
                null,
                null,
                context.getString(R.string.info_location),
                R.drawable.info_second,
                true
        ));

        list.add(new Place(
                context.getString(R.string.info_general_header),
                null,
                null,
                null,
                context.getString(R.string.info_general),
                R.drawable.info_third,
                true
        ));
    }
}
