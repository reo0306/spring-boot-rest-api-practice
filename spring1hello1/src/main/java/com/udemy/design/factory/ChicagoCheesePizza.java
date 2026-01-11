package com.udemy.design.factory;

public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
        name = "シカゴスタイルのソース&チーズピザ";
        dough = "極厚クラフト生地";
        sauce = "プラムソース";

        toppings.add("シュレッドモッツァレラチーズ");
    }

    public void cut() {
        System.out.println("ピザを四角形にカットする");
    }
}
