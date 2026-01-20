package com.udemy.design.observer;

public class WeatherStation {
    public static void main(String[] argsS) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.settMeasurements(80, 65, 30.4f);
        weatherData.settMeasurements(82, 70, 29.2f);
        weatherData.settMeasurements(78, 90, 29.2f);
    }
}
