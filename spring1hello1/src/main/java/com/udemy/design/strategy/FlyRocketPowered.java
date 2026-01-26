package com.udemy.design.strategy;

public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("ロケットを飛んでいます");
    }
}
