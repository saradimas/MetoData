package com.metodata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class OpenWeatherMapSource implements WeatherSource {

    private final String apiKey;

    public OpenWeatherMapSource(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public WeatherData getWeatherData(Location location) throws IOException, CustomException {
        // Construct URL for OpenWeatherMap API request

        String urlString = "";

        if (!location.getLocation().isEmpty()) {
            urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + location.getLocation() + "&appid=" + apiKey;
        } else if (location.getLatitude() != 0 && location.getLongitude() != 0){
            urlString = "https://api.openweathermap.org/data/2.5/weather?lat=" + location.getLatitude() +
                    "&lon=" + location.getLongitude() + "&appid=" + apiKey;
        } else {
            throw new CustomException("You must have a valid location or latitude and longitude to proceed");
        }
        // Send HTTP request to OpenWeatherMap API and get response as a string
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder responseBuilder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            responseBuilder.append(line);
        }
        reader.close();
        String response = responseBuilder.toString();
        System.out.println(response);
        // Parse response string into WeatherData object
        Wea
        WeatherController weatherController = new WeatherController(this);
        WeatherData weatherData = weatherController.parseWeatherData(response);

        return weatherData;
    }
}

