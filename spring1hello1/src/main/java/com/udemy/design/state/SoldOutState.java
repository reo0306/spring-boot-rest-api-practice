package com.udemy.design.state;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("25セントを投入することはできません。売り切れです。");
    }

    public void ejectQuarter() {
        System.out.println("返金できません。また25セントを投入してください。");
    }

    public void turnCrank() {
        System.out.println("ハンドルを回しましたが、ガムボールがありません。");
    }

    public void dispense() {
        System.out.println("販売するガムボールがありません。");
    }
}
