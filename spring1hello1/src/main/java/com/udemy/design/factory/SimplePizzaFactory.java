package com.udemy.design.factory;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("チーズ")) {
            pizza = new NYCheesePizza();
        } else if (type.equals("ペパロニ")) {
            pizza = new NYPepperoniPizza();
        } else if (type.equals("アサリ")) {
            pizza = new NYClamPizza();
        } else if (type.equals("野菜")) {
            pizza = new NYVeggiePizza();
        }
        return pizza;
    }
}
