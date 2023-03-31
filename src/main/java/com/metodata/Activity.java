package com.metodata;

// Activity class
public class Activity {
    private String name;
    private String description;
    private Location location;

    public Activity(String name, String description, Location location) {
        this.name = name;
        this.description = description;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Location getLocation() {
        return location;
    }
}
