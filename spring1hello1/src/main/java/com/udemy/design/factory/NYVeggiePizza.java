package com.udemy.design.factory;

public class NYVeggiePizza extends Pizza {
    public NYVeggiePizza() {
        name = "ニューヨークスタイルの野菜ピザ";
        dough = "硬いクラフト生地";
        sauce = "野菜ソース";

        toppings.add("薄いレッジャーノチーズ");
    }
}
