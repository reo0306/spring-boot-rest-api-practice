package com.udemy.design.templateMethod;

public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("お湯を沸かす");
    }

    void pourInCup() {
        System.out.println("カップに注ぐ");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
