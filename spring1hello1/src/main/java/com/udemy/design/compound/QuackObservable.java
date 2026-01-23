package com.udemy.design.compound;

import java.util.Observer;

public interface QuackObservable {
    public void registerObserver(CObserver observer);
    public void notifyObservers();
}
