package com.metodata;

public class LocationController {

    private Location location;
    private LocationView locationView;
    private LocationSource locationSource;

    public LocationController(LocationView view) {
        this.locationView = view;

    }


    //Iterate over the list of locations obtained from locationSource.
    //For each location in the list, check if it matches the location obtained from the user input through locationView.
    //If there is a match, set the location variable to the current location and exit the loop.
    //Return the location variable.
    public Location getLocation() {
        for (Location local : locationSource.getListOfLocations()) {
            if (locationView.getLocationFromUser().equals(local.getLocation())) {
                ;
                location = local;
                break;
            }
        }

        return location;
    }

    public void updateLocation(Location location) {
        this.location = location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public LocationView getLocationView() {
        return locationView;
    }

    public void setLocationView(LocationView locationView) {
        this.locationView = locationView;
    }
}
