package com.udemy.design.composite;

import com.udemy.design.iterator.CafeMenu;
import com.udemy.design.iterator.DinerMenu;
import com.udemy.design.iterator.PancakeHouseMenu;
import com.udemy.design.iterator.Waitress;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        com.udemy.design.iterator.Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);

        waitress.printMenu();
    }
}
