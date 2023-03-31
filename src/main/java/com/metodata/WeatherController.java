package com.metodata;

import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

public class WeatherController {
    private WeatherSource weatherSource;
    private WeatherData currentWeatherData;

    private String typeOfTemp = "";
    private ActivityController activityController;
    private WeatherView weatherView;

    public WeatherController(WeatherSource weatherSource) {
        this.weatherSource = weatherSource;

    }

    public void updateWeatherData(Location location) throws IOException, CustomException {
        WeatherData newWeatherData = weatherSource.getWeatherData(location);
        this.currentWeatherData = newWeatherData;
    }

    public WeatherData getCurrentWeatherData() {
        return currentWeatherData;
    }

    public List<String> getRecommendedActivities() {
        // Use the currentWeatherData object to generate a list of recommended activities
        // ...
        return List.of(/* recommended activities */);
    }

    public WeatherData parseWeatherData(String weatherDataString) {
        JSONObject weatherDataJson = new JSONObject(weatherDataString);

        // Extract temperature and humidity data from JSON object
        Double temperature = weatherDataJson.getJSONObject("main").getDouble("temp");

        Double humidity = weatherDataJson.getJSONObject("main").getDouble("humidity");

        Double windSpeed = weatherDataJson.getJSONObject("wind").getDouble("speed");

        String description = weatherDataJson.getJSONObject("weather").getString("description");

        // Create new WeatherData object with parsed data
        WeatherData weatherData = new WeatherData(this);
        weatherData.setTemperature(temperature);
        weatherData.setHumidity(humidity);
        weatherData.setDescription(description);
        weatherData.setWindSpeed(windSpeed);

        return weatherData;
    }

    public WeatherView getWeatherView() {
        return weatherView;
    }

    public void setWeatherView(WeatherView weatherView) {
        this.weatherView = weatherView;
    }

    public Double convertTemperature(Double kelvinTemperature) {
        String temperatureConversion = weatherView.convertTemperature();

        double celsiusTemperature = kelvinTemperature - 273.15;
        double fahrenheitTemperature = celsiusTemperature * 9 / 5 + 32;

        if (temperatureConversion.equals("Celsius")) {
            typeOfTemp = "Celsius";
            System.out.println("Temperature in Celsius: " + Math.round(celsiusTemperature));
            activityController.setTypeOfTemperature(typeOfTemp);
            return celsiusTemperature;
        } else {
            typeOfTemp = "Fahrenheit";
            System.out.println("Temperature in Fahrenheit: " + Math.round(fahrenheitTemperature));
            activityController.setTypeOfTemperature("Fahrenheit");
            return fahrenheitTemperature;
        }


        }
    // Other methods for interacting with the model and view could be added here...
}
