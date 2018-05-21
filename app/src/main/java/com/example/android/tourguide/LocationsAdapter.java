package com.example.android.tourguide;



import android.app.Activity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class LocationsAdapter extends ArrayAdapter<Location>{

    public LocationsAdapter(Activity context, ArrayList<Location> locations){
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, locations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //iteration through the ArrayList<Location>
        Location currentLocation = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentLocation.getmImage());

        //find the template in the converview
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        //inject content from the first object
        nameTextView.setText(currentLocation.getmName());

        TextView infoTextView = (TextView) listItemView.findViewById(R.id.info);
        infoTextView.setText(currentLocation.getmInfo());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address);
        addressTextView.setText(currentLocation.getmAddress());

        //return the inflated view
        return listItemView;

    }
}
