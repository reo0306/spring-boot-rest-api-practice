package com.udemy.design.observer;

public interface Subject {
    public void registerObserver(DObserver o);
    public void removeObserver(DObserver o);
    public void notifyObservers();
}
