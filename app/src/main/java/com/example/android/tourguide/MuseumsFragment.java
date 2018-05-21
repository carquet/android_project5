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
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.reina_sofia, R.string.info_reina_sofia, R.string.address_reina_sofia, R.drawable.reina_sofia));
        locations.add(new Location(R.string.naval, R.string.info_naval, R.string.address_naval, R.drawable.naval));
        locations.add(new Location(R.string.thyssen, R.string.info_thyssen, R.string.address_thyssen, R.drawable.thyssen));
        locations.add(new Location(R.string.arqueologico, R.string.info_arqueologico, R.string.address_arqueologico, R.drawable.arqueologico));
        locations.add(new Location(R.string.prado, R.string.info_prado, R.string.address_prado, R.drawable.prado));


        LocationsAdapter locationAdapter = new LocationsAdapter(getActivity(), locations);

        ListView locationListView = (ListView) rootView.findViewById(R.id.root_view);
        locationListView.setAdapter(locationAdapter);

        return rootView;
    }

}
