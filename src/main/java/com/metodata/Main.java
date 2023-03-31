package com.metodata;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, CustomException {


        LocationView locationView = new LocationView();
        WeatherView weatherView = new WeatherView();
        LocationController locationController = new LocationController(locationView);

        Location location = new Location(-0.1257,51.5085);

        Location location1 = new Location(locationView.getLocationFromUser().trim());

//        location.setLocation(locationView.getLocationFromUser().trim());
        WeatherSource weatherAPI = new OpenWeatherMapSource("59b00d36ee08c075fe5c0194f6345bca");
        WeatherController weatherController = new WeatherController(weatherAPI);
        weatherController.setWeatherView(weatherView);

        weatherController.convertTemperature(weatherAPI.getWeatherData(location1).getTemperature());
//        System.out.println(weatherAPI.getWeatherData(location).getTemperature());
//        weatherAPI.getWeatherData(locationController.getLocation());


    }

}
