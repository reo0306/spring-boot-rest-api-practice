package com.udemy.design.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {
    Map<String, MenuItem> menuItems = new HashMap<String, MenuItem>();

    public CafeMenu() {
        addItem("野菜ハンバーガーとフライドポテト", "レタスとトマトを挟んだ野菜ハンバーガー", true, 3.99);
        addItem("本日のスープ", "サラダが付いたスープ", false, 3.69);
        addItem("ブリトー", "インゲン豆、サルサ、グアカモーレブリトー", true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
