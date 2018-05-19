package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MonumentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monuments);

        //Initialising locations objects
        ArrayList<String> locations = new ArrayList<>();
        locations.add("Puerta de Alcalà");
        locations.add("Palacio de Cristal");
        locations.add("Plaza Cibeles");
        locations.add("Palacio Real");
        locations.add("El Parque del Buen Retiro");

        LinearLayout root = (LinearLayout) findViewById(R.id.root_view);
        //iterating through the arraylist to grab the information and display it on the correct TextView
        for(String location : locations){
            TextView locationView = new TextView(this);
            locationView.setText(location);
            root.addView(locationView);
        }


    }
}
