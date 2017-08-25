package com.m25dev.tourguideapp;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ShareCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mohamed on 8/23/17.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    ArrayList<Place> mPlaces;

    public PlaceAdapter(@NonNull Context context, ArrayList<Place> places) {
        super(context, 0, places);

        mPlaces = places;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            //if the view is null then inflate a new one;
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final Place currentPlace = getItem(position);

        TextView tvName = (TextView) view.findViewById(R.id.place_name_text_view);
        tvName.setText(currentPlace.getName());

        TextView tvAbout = (TextView) view.findViewById(R.id.place_about_text_view);
        tvAbout.setText(currentPlace.getAbout());

        TextView tvReview = (TextView) view.findViewById(R.id.place_review_text_view);
        tvReview.setText(currentPlace.getReviews());

//        TextView tvLocation = (TextView) view.findViewById(R.id.place_location_text_view);
//        tvLocation.setText(currentPlace.getLocation());

        TextView tvNumber = (TextView) view.findViewById(R.id.place_number_text_view);
        tvNumber.setText(currentPlace.getNumber());

        ImageView ivRestaurant = (ImageView) view.findViewById(R.id.place_image_view);
        ivRestaurant.setImageResource(currentPlace.getImageID());

        LinearLayout callLinearLayout = (LinearLayout) view.findViewById(R.id.call_linear_layout);
        callLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:" + currentPlace.getNumber()));

                if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the do
                    return;
                }
                getContext().startActivity(intent);
            }
        });

        LinearLayout containerLinearLayout = (LinearLayout) view.findViewById(R.id.container_linear_layout);
        if(currentPlace.isInfo()) {
            containerLinearLayout.setVisibility(View.INVISIBLE);
        }

        //Share intent to share text including the name and the about;
        LinearLayout shareLinearLayout = (LinearLayout) view.findViewById(R.id.share_linear_layout);
        shareLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent shareIntent = ShareCompat.IntentBuilder
                                    .from((Activity) getContext())
                                    .setType("text/plain")
                                    .setText("Place Name : "+ currentPlace.getName()
                                            +"About it :"+ currentPlace.getAbout())
                                    .getIntent();
                getContext().startActivity(shareIntent);
            }
        });
        return view;
    }
}
