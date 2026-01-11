package com.udemy.design.factory;

public class ChicagoPepperoniPizza extends Pizza {
    public ChicagoPepperoniPizza() {
        name = "シカゴスタイルのペパロニピザ";
        dough = "クラフト生地";
        sauce = "ペパロニソース";

        toppings.add("厚いシュレッドモッツァレラチーズ");
    }
}
