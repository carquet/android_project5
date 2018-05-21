package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonumentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        //Initialising locations objects
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.puerta_alcala, R.string.info_puerta_alcala, R.string.address_puerta_alacala,R.drawable.puerta_de_alcala));
        locations.add(new Location(R.string.palacio_cristal, R.string.info_palacio_cristal, R.string.address_palacio_cristal,R.drawable.palacio_de_cristal));
        locations.add(new Location(R.string.plaza_cibeles, R.string.info_plaza_cibeles, R.string.address_plaza_cibeles,R.drawable.plaza_cibeles));
        locations.add(new Location(R.string.palacio_real, R.string.info_palacio_real, R.string.address_palacio_real,R.drawable.palacio_real));
        locations.add(new Location(R.string.retiro, R.string.info_retiro, R.string.address_retiro,R.drawable.retiro));

        LocationsAdapter locationAdapter = new LocationsAdapter(this, locations);

        ListView locationListView = (ListView) findViewById(R.id.root_view);
        locationListView.setAdapter(locationAdapter);
    }
}
