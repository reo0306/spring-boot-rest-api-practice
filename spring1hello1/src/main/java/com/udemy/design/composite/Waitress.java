package com.udemy.design.composite;

import com.udemy.design.iterator.Menu;
import com.udemy.design.iterator.MenuItem;

import java.util.Iterator;

public class Waitress {
    com.udemy.design.iterator.Menu pancakeHouseMenu;
    com.udemy.design.iterator.Menu dinerMenu;
    com.udemy.design.iterator.Menu cafeMenu;

    public Waitress(com.udemy.design.iterator.Menu pancakeHouseMenu, com.udemy.design.iterator.Menu dinerMenu, Menu careMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = careMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();

        System.out.println("メニュー\n----\n朝食");
        printMenu(pancakeIterator);
        System.out.println("\n昼食");
        printMenu(dinerIterator);
        System.out.println("\n夕食");
        printMenu(cafeIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName() + "、");
            System.out.println(menuItem.getPrice() + "、");
            System.out.println(menuItem.getDescription());
        }
    }
}
