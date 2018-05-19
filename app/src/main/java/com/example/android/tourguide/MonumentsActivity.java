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
        ArrayList<String> locations = new ArrayList<>();
        locations.add("Puerta de Alcalà");
        locations.add("Palacio de Cristal");
        locations.add("Plaza Cibeles");
        locations.add("Palacio Real");
        locations.add("El Parque del Buen Retiro");

/*        ArrayAdapter<String> locationAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, locations);
        ListView locationListView = (ListView) findViewById(R.id.root_view);
        locationListView.setAdapter(locationAdapter);*/
    }
}
