package com.udemy.design.composite;

public class Menu extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public Menu(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean getVegetarian() {
        return vegetarian;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.println(" " + getName());
        if (isVegetarian()) {
            System.out.println("(v)");
        }
        System.out.println("、" + getPrice());
        System.out.println("   -- " + getDescription());
    }
}
