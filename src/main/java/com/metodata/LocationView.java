package com.metodata;

import java.util.Scanner;

public class LocationView {
    private Scanner scanner;

    public LocationView() {
        this.scanner = new Scanner(System.in);
    }

    public String getLocationFromUser() {
        System.out.print("Please enter your location: ");
        String location = scanner.nextLine();
        return location;
    }

    public void displayErrorMessage(String message) {
        System.out.println("Error: " + message);
    }

    // Other methods for displaying location data and recommendations could be added here...
}

