package com.udemy.design.strategy;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<<沈黙>>");
    }
}
