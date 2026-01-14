package com.udemy.design.templateMethod;

public class BeverageTestDrive {
    public static void main(String[] args) {
        Tea myTea = new Tea();
        myTea.prepareRecipe();

        System.out.println("\n");

        Coffee myCoffee = new Coffee();
        myCoffee.prepareRecipe();

        System.out.println("\n");

        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        System.out.println("\nコーヒーを淹れる");
        coffeeWithHook.prepareRecipe();
    }
}
