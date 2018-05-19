package com.example.android.tourguide;

import android.content.Context;
import android.media.Image;

public class Location {

    //status
    private int mName;
    private int mInfo;


    //constructor
    public Location(int name, int info){
        mName = name;
        mInfo = info;

    }

    //getter and setter methods
    public int getmName(){
        return mName;
    }

    public int getmInfo() {
        return mInfo;
    }


}
