package com.udemy.design.templateMethod;

public class Coffee extends CaffeineBeverage {

    public void brew() {
        System.out.println("フィルターでコーヒーをドリップする");
    }

    public void addCondiments() {
        System.out.println("砂糖とミルクを追加する");
    }
}
