package com.udemy.design.observer;

public class CurrentConditionsDisplay implements DObserver, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("現在の気象状況：温度" + temperature + "度（摂氏） 湿度" + humidity + "%");
    }
}
