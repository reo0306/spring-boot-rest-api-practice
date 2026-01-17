package com.udemy.design.decorator;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "ダークロースコーヒー";
    }

    public double cost() {
        return 1.19;
    }
}
