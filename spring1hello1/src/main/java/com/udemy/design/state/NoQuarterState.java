package com.udemy.design.state;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("25セントを投入しました。");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("25セントを投入していません。");
    }
    public void turnCrank() {
        System.out.println("ハンドルを回しましたが、25セントを投入してません。");
    }

    public void dispense() {
        System.out.println("まずはお金を払う必要があります。");
    }
}
