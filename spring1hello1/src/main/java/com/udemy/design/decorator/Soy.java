package com.udemy.design.decorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + "、豆乳";
    }

    public double cost() {
        return beverage.cost() + 0.10;
    }
}
