package com.udemy.design.compound;

public class MallardDuck implements Quackable {
    Observable observable;

    public MallardDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("ガーガー");
        notifyObservers();
    }

    public void registerObserver(CObserver observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
