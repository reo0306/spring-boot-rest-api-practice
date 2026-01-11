package com.udemy.design.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();

    public void prepare() {
        System.out.println(name + "を下準備");
        System.out.println("生地をこねる");
        System.out.println("ソースを追加");
        System.out.println("トッピングを追加：");
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    }
    public void bake() {
        System.out.println("180度で25分間焼く");
    }

    public void cut() {
        System.out.println("ピザを扇形にカットする");
    }

    public void box() {
        System.out.println("PizzaStoreの箱にピザを入れる");
    }

    public String getName() {
        return name;
    }
}
