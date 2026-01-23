package com.udemy.design.compound;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observable implements QuackObservable {
    List<CObserver> observers = new ArrayList<CObserver>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    public void registerObserver(CObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers() {

        for (CObserver observer : observers) {
            observer.update(duck);
        }
    }
}
