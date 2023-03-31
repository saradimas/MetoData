package com.metodata;

public class WeatherData {
        private Double temperature;
        private Double humidity;

        private Double windSpeed;

        private String description;
    private WeatherController weatherController;

        public WeatherData(WeatherController controller) {
            this.weatherController = controller;
        }

        public Double getTemperature() {
//            return weatherController.getCurrentWeatherData().temperature;
            return temperature;
        }

        public Double getHumidity() {
            return humidity;
        }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public WeatherController getWeatherController() {
        return weatherController;
    }

    public void setWeatherController(WeatherController weatherController) {
        this.weatherController = weatherController;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
