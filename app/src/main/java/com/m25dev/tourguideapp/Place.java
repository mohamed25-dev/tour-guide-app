package com.m25dev.tourguideapp;

/**
 * Created by mohamed on 8/23/17.
 */

public class Place {

    private String mName;
    private String mLocation;
    private String mReview;
    private String mNumber;
    private String mAbout;
    private int mImageID;

    private boolean mIsInfo = false;

    public Place(String name, String location, String reviews, String number, String about, int imageID) {
        mName = name;
        mLocation = location;
        mReview = reviews;
        mNumber = number;
        mImageID = imageID;
        mAbout = about;
    }

    //another constructer to be used  making isInfo true;
    public Place(String name, String location, String reviews, String number, String about, int imageID, boolean isInfo) {
        this(name, location, reviews, number, about, imageID);
        mIsInfo = isInfo;
    }

    public String getName() {
        return mName;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getReviews() {
        return mReview;
    }

    public String getNumber() {
        return mNumber;
    }

    public int getImageID() {
        return mImageID;
    }

    public String getAbout() {
        return mAbout;
    }

    public boolean isInfo() {
        return mIsInfo;
    }
}
