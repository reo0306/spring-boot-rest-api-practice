package com.udemy.design.templateMethod;

public class BeverageTestDrive {
    public static void main(String[] args) {
        Tea myTea = new Tea();
        myTea.prepareRecipe();

        Coffee myCoffee = new Coffee();
        myCoffee.prepareRecipe();
    }
}
