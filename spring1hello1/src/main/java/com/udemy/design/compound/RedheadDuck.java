package com.udemy.design.compound;

public class RedheadDuck implements Quackable {
    Observable observable;

    public RedheadDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
       System.out.println("ガーガー");
       notifyObservers();
    }

    @Override
    public void registerObserver(CObserver observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
