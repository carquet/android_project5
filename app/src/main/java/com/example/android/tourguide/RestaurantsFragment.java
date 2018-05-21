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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Location > locations = new ArrayList<>();
        locations.add(new Location(R.string.botin, R.string.info_botin, R.string.address_botin,R.drawable.casa_botin));
        locations.add(new Location(R.string.villa_rosa, R.string.info_villa_rosa,R.string.address_villa_rosa,R.drawable.tablao_villa_rosa));
        locations.add(new Location(R.string.san_miguel, R.string.info_san_miguel,R.string.address_san_miguel,R.drawable.mercado_san_miguel));
        locations.add(new Location(R.string.casa_labra, R.string.info_casa_labra, R.string.address_casa_labra,R.drawable.casa_labra));
        locations.add(new Location(R.string.lhardy, R.string.info_lhardy, R.string.address_lhardy,R.drawable.lhardy));


        LocationsAdapter locationAdapter = new LocationsAdapter(getActivity(), locations);

        ListView locationListView = (ListView) rootView.findViewById(R.id.root_view);
        locationListView.setAdapter(locationAdapter);

        return rootView;
    }

}
