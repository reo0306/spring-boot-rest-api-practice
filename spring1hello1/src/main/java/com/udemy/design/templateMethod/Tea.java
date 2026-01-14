package com.udemy.design.templateMethod;

public class Tea extends CaffeineBeverage {

    public void brew() {
        System.out.println("紅茶に浸す");
    }

    public void addCondiments() {
        System.out.println("レモンを追加する");
    }
}
