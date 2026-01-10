package com.udemy.design.command;

public class Light {
    String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " 照明が点いています");
    }

    public void off() {
        System.out.println(name + "照明が消えています");
    }
}
