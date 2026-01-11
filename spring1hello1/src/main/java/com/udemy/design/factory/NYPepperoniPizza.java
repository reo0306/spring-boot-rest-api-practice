package com.udemy.design.factory;

public class NYPepperoniPizza extends Pizza {
    public NYPepperoniPizza() {
        name = "ニューヨークスタイルのペパロニピザ";
        dough = "クラフト生地";
        sauce = "ペパロニソース";

        toppings.add("厚いレッジャーノチーズ");
    }
}
