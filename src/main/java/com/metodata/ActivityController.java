package com.metodata;

public class ActivityController {

    private Double temperature;
    private Double visibility;
    private String typeOfTemperature;

    public ActivityController() {

    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getVisibility() {
        return visibility;
    }

    public void setVisibility(Double visibility) {
        this.visibility = visibility;
    }

    public String getTypeOfTemperature() {
        return typeOfTemperature;
    }

    public void setTypeOfTemperature(String typeOfTemperature) {
        this.typeOfTemperature = typeOfTemperature;
    }
}
