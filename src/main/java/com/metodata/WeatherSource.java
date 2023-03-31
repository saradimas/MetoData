package com.metodata;

import java.io.IOException;

public interface WeatherSource {

        WeatherData getWeatherData(Location location) throws IOException, CustomException;

}
