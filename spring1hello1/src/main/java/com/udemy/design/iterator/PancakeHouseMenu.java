package com.udemy.design.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("K&Bのパンケーキ朝食", "スクランブルエッグとトースト付きパンケーキ", true, 2.99);
        addItem("いつものパンケーキ朝食", "卵焼きとソーセージ付きパンケーキ", false, 2.99);
        addItem("ブルーベリーパンケーキ", "新鮮なブルーベリーを使ったパンケーキ", true, 3.49);
        addItem("ワッフル", "ブルーベリーか苺の好きなほうをのせたパンケーキ", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
