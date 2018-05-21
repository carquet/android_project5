package com.example.android.tourguide;

import android.content.Context;
import android.media.Image;

public class Location {

    //status
    private int mName;
    private int mInfo;
    private int mAddress;
    private int mImage;


    //constructor
    public Location(int name, int info, int address, int image){
        mName = name;
        mInfo = info;
        mAddress = address;
        mImage = image;

    }

    public Location(int name, int info, int address){
        mName = name;
        mInfo = info;
        mAddress = address;
    }

    //getter and setter methods
    public int getmName(){
        return mName;
    }

    public int getmInfo() {
        return mInfo;
    }

    public int getmAddress() {
        return mAddress;
    }

    public int getmImage(){
        return mImage;
    }


}
