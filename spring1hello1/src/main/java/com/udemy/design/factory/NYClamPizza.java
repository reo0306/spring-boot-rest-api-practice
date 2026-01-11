package com.udemy.design.factory;

public class NYClamPizza extends Pizza {
    public NYClamPizza() {
        name = "ニューヨークスタイルのアサリピザ";
        dough = "厚いクラフト生地";
        sauce = "アサリソース";

        toppings.add("レッジャーノチーズ");
    }
}
