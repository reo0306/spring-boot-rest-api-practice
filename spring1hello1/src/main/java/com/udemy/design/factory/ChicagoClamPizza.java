package com.udemy.design.factory;

public class ChicagoClamPizza extends Pizza {
    public ChicagoClamPizza() {
        name = "シカゴスタイルのアサリピザ";
        dough = "極厚クラフト生地";
        sauce = "プラムソース";

        toppings.add("シュレッドモッツァレラチーズ");
    }

    public void cut() {
        System.out.println("ピザを四角形にカットする");
    }
}
