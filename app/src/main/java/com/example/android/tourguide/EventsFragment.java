package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        //Initialising locations objects
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.festival_arte, R.string.info_festival_arte, R.string.address_festival_arte));
        locations.add(new Location(R.string.flameco, R.string.info_flamenco, R.string.address_flamenco));
        locations.add(new Location(R.string.fiver, R.string.info_fiver, R.string.address_fiver));
        locations.add(new Location(R.string.musa, R.string.info_musa, R.string.address_musa));

        LocationsAdapter locationAdapter = new LocationsAdapter(getActivity(), locations);

        ListView locationListView = (ListView) rootView.findViewById(R.id.root_view);
        locationListView.setAdapter(locationAdapter);

        return rootView;
    }

}
