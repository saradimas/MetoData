package com.metodata;

import java.util.Scanner;

public class WeatherView {

    private Scanner scanner;

    public WeatherView() {
        this.scanner = new Scanner(System.in);
    }

    public String convertTemperature() {
        System.out.print("Do you want to see the weather data in (1) Celsius or (2) Fahrenheit? ");
        String response = scanner.nextLine();

        while (true) {
            if (response.equals("1")) {
                return "Celsius";
            } else if (response.equals("2")) {
                return "Fahrenheit";
            } else {
                System.out.println("That is not a valid answer. Please respond with 1 for Celsius or with 2 for Fahrenheit");
            }
        }
    }

    public void displayErrorMessage(String message) {
        System.out.println("Error: " + message);
    }
}
