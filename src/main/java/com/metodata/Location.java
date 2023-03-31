package com.metodata;

// Location class
public class Location {

    private double latitude;
    private double longitude;

    private String location;

    private LocationController locationController;

    public Location(String location) {
        this.location = location;
//        this.locationController = controller;
    }

    public String getLocation() {
        return location;
    }


    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String locationByLatitudeLongitude(){

        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}


