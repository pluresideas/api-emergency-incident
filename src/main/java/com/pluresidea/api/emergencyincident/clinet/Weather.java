package com.pluresidea.api.emergencyincident.clinet;

public class Weather {

    private Currently currently;

    public Weather() {
    }

    public Weather(Currently currently) {
        this.currently = currently;
    }

    public Currently getCurrently() {
        return currently;
    }

    public void setCurrently(Currently currently) {
        this.currently = currently;
    }
}
