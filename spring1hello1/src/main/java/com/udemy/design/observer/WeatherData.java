package com.udemy.design.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private final List<DObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<DObserver>();
    }

    public void registerObserver(DObserver o) {
        observers.add(o);
    }

    public void removeObserver(DObserver o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (DObserver observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void settMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
