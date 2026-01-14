package com.udemy.design.templateMethod;

public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("お湯を沸かす");
    }

    void pourInCup() {
        System.out.println("カップに注ぐ");
    }
}
