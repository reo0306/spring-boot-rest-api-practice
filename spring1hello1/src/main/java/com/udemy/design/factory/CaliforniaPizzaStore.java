package com.udemy.design.factory;

public class CaliforniaPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("チーズ")) {
            return new CaliforniaCheesePizza();
        } else if (type.equals("ペパロニ")) {
            return new CaliforniaPepperoniPizza();
        } else if (type.equals("アサリ")) {
            return new CaliforniaClamPizza();
        } else if (type.equals("野菜")) {
            return new CaliforniaVeggiePizza();
        } else {
            return null;
        }
    }
}
