package com.udemy.design.factory;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("チーズ")) {
            return new ChicagoCheesePizza();
        } else if (type.equals("ペパロニ")) {
            return new ChicagoPepperoniPizza();
        } else if (type.equals("アサリ")) {
            return new ChicagoClamPizza();
        } else if (type.equals("野菜")) {
            return new ChicagoVeggiePizza();
        } else {
            return null;
        }
    }
}
