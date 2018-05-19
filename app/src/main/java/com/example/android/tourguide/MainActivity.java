package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView buttonMonuments = (TextView) findViewById(R.id.button_monuments);
        buttonMonuments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMonuments = new Intent(MainActivity.this, MonumentsActivity.class);
                startActivity(intentMonuments);
            }
        });
        TextView buttonRestaurants = (TextView) findViewById(R.id.button_restaurants);
        buttonRestaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRestaurants = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(intentRestaurants);
            }
        });
        /*TextView buttonEvents = (TextView) findViewById(R.id.button_events);
        TextView buttonMuseums = (TextView) findViewById(R.id.button_museums);*/
    }
}
