package com.udemy.design.compound;

public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;
    Observable observable;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
        observable = new Observable(this);
    }

    public void quack() {
        duck.quack();
        numberOfQuacks++;
        notifyObservers();
    }

    public void registerObserver(CObserver observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }
}
