package com.m25dev.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class InfoFragment extends Fragment {


    public InfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_place, container, false);
        ArrayList<Place> places = new ArrayList<>();
        Info.initInfoList(getContext(), places);

        PlaceAdapter adapter = new PlaceAdapter(getContext(), places);

        ListView listView = (ListView) view.findViewById(R.id.restaurants_list_view);
        listView.setAdapter(adapter);

        return view;
    }

}
