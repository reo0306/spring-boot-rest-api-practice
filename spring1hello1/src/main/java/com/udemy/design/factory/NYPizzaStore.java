package com.udemy.design.factory;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("チーズ")) {
            return new NYCheesePizza();
        } else if (type.equals("ペパロニ")) {
            return new NYPepperoniPizza();
        } else if (type.equals("アサリ")) {
            return new NYClamPizza();
        } else if (type.equals("野菜")) {
            return new NYVeggiePizza();
        } else {
            return null;
        }
    }
}
