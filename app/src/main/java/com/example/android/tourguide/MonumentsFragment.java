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
public class MonumentsFragment extends Fragment {


    public MonumentsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        //Initialising locations objects
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.puerta_alcala, R.string.info_puerta_alcala, R.string.address_puerta_alacala,R.drawable.puerta_de_alcala));
        locations.add(new Location(R.string.palacio_cristal, R.string.info_palacio_cristal, R.string.address_palacio_cristal,R.drawable.palacio_de_cristal));
        locations.add(new Location(R.string.plaza_cibeles, R.string.info_plaza_cibeles, R.string.address_plaza_cibeles,R.drawable.plaza_cibeles));
        locations.add(new Location(R.string.palacio_real, R.string.info_palacio_real, R.string.address_palacio_real,R.drawable.palacio_real));
        locations.add(new Location(R.string.retiro, R.string.info_retiro, R.string.address_retiro,R.drawable.retiro));

        LocationsAdapter locationAdapter = new LocationsAdapter(getActivity(), locations);

        ListView locationListView = (ListView) rootView.findViewById(R.id.root_view);
        locationListView.setAdapter(locationAdapter);

        return rootView;
    }

}
