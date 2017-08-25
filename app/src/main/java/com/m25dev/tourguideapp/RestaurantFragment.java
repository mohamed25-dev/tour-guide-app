package com.m25dev.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_place, container, false);

        ArrayList<Place> places = new ArrayList<>();

        Restaurants.initRestaurantList(getContext(), places);

        ListView listView = (ListView) view.findViewById(R.id.restaurants_list_view);

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        listView.setAdapter(placeAdapter);

        return view;
    }

}
