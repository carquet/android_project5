package com.example.android.tourguide;

import android.content.Context;
import android.media.Image;

public class Location {

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    //state
    private int mName;
    private int mInfo;
    private int mAddress;
    private int mImage = NO_IMAGE_PROVIDED;

    //constructor
    public Location(int name, int info, int address, int image) {
        mName = name;
        mInfo = info;
        mAddress = address;
        mImage = image;

    }

    public Location(int name, int info, int address) {
        mName = name;
        mInfo = info;
        mAddress = address;
    }

    //getter and setter methods
    public int getmName() {
        return mName;
    }

    public int getmInfo() {
        return mInfo;
    }

    public int getmAddress() {
        return mAddress;
    }

    public int getmImage() {
        return mImage;
    }

    public boolean hasImage() {
        return mImage != NO_IMAGE_PROVIDED;
    }


}
