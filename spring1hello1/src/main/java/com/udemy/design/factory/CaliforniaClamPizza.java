package com.udemy.design.factory;

public class CaliforniaClamPizza extends Pizza {
    public CaliforniaClamPizza() {
        name = "カルフォルニアスタイルのアサリピザ";
        dough = "クラフト生地";
        sauce = "ソース";

        toppings.add("チーズ");
    }
}
