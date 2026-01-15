package com.udemy.design.iterator;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("ベジタリアンBLT", "サンドイッチ1", true, 2.99);
        addItem("BLT", "サンドイッチ2", false, 2.99);
        addItem("本日のスープ", "ポテトサラダを添えた本日のスープ", false, 3.29);
        addItem("Hotdog", "ホットドッグ", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("メニューはいっぱいです！メニューに項目を追加できません");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
