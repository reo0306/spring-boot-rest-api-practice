package com.udemy.design.command;

public class GarageDoor {
    String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println(name + " ドアが上がりました。");
    }

    public void down() {
        System.out.println(name + " ドアが下がりました。");
    }

    public void stop() {
        System.out.println(name + " ドアが止まりました。");
    }

    public void lightOn() {
        System.out.println(name + " 照明が点きました。");
    }

    public void lightOff() {
        System.out.println(name + " 照明が消えました。");
    }
}
