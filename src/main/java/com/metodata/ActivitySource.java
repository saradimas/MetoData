package com.metodata;

import java.util.List;

public interface ActivitySource {

        List<Activity> getActivities(Location location, WeatherData weatherData);

}
