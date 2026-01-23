package com.udemy.design.compound;

public class Quackologist implements CObserver {
    public void update(QuackObservable duck) {
        System.out.println("カモの鳴き声学者:" + duck + "が鳴きました");
    }
}
