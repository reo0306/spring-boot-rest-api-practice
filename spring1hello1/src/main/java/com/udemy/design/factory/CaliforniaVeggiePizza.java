package com.udemy.design.factory;

public class CaliforniaVeggiePizza extends Pizza {
    public CaliforniaVeggiePizza() {
        name = "カルフォルニアスタイルの野菜ピザ";
        dough = "クラフト生地";
        sauce = "ソース";

        toppings.add("チーズ");
    }
}
