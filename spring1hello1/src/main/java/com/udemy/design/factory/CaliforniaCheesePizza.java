package com.udemy.design.factory;

public class CaliforniaCheesePizza extends Pizza {
    public CaliforniaCheesePizza() {
        name = "カルフォルニアタイルのソース&チーズピザ";
        dough = "薄いクラフト生地";
        sauce = "ソース";

        toppings.add("チーズ");
    }
}
