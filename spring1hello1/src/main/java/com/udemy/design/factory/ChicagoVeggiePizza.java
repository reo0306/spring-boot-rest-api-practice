package com.udemy.design.factory;

public class ChicagoVeggiePizza extends Pizza {
    public ChicagoVeggiePizza() {
        name = "シカゴスタイルの野菜ピザ";
        dough = "硬いクラフト生地";
        sauce = "野菜ソース";

        toppings.add("シュレッドモッツァレラチーズ");
    }

    public void cut() {
        System.out.println("ピザを四角形にカットする");
    }
}
