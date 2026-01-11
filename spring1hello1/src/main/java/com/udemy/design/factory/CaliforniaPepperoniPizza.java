package com.udemy.design.factory;

public class CaliforniaPepperoniPizza extends Pizza {
    public CaliforniaPepperoniPizza() {
        name = "カルフォルニアスタイルのペパロニピザ";
        dough = "クラフト生地";
        sauce = "ソース";

        toppings.add("チーズ");
    }
}
