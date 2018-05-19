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

        ArrayList<String > locations = new ArrayList<>();
        locations.add("Casa Botin");
        locations.add("Tablao Villa Rosa");
        locations.add("Mercado de San Miguel");
        locations.add("Casa Labra");
        locations.add("Lhardy");

        ArrayAdapter<String> locationAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, locations);
        ListView locationListView = (ListView) findViewById(R.id.root_view);
        locationListView.setAdapter(locationAdapter);
    }
}
