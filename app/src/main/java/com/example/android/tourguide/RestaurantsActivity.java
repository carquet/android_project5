package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<Location > locations = new ArrayList<>();
        locations.add(new Location(R.string.botin, R.string.info_botin, R.string.address_botin,R.drawable.casa_botin));
        locations.add(new Location(R.string.villa_rosa, R.string.info_villa_rosa,R.string.address_villa_rosa,R.drawable.tablao_villa_rosa));
        locations.add(new Location(R.string.san_miguel, R.string.info_san_miguel,R.string.address_san_miguel,R.drawable.mercado_san_miguel));
        locations.add(new Location(R.string.casa_labra, R.string.info_casa_labra, R.string.address_casa_labra,R.drawable.casa_labra));
        locations.add(new Location(R.string.lhardy, R.string.info_lhardy, R.string.address_lhardy,R.drawable.lhardy));


        LocationsAdapter locationAdapter = new LocationsAdapter(this, locations);

        ListView locationListView = (ListView) findViewById(R.id.root_view);
        locationListView.setAdapter(locationAdapter);
    }
}
