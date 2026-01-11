package com.udemy.design.factory;

public class NYCheesePizza extends Pizza {
    public NYCheesePizza() {
        name = "ニューヨークスタイルのソース&チーズピザ";
        dough = "薄いクラフト生地";
        sauce = "マリナラソース";

        toppings.add("すりおろしたレッジャーノチーズ");
    }
}
