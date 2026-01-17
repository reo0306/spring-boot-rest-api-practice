package com.udemy.design.decorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + "、モカ";
    }

    public double cost() {
        return beverage.cost() + 0.20;
    }
}
