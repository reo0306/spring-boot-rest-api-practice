package com.udemy.design.state;

public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("もう一度25セントを投入することはできません。");
    }

    public void ejectQuarter() {
        System.out.println("25セントを投入していません。");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
    public void turnCrank() {
        System.out.println("ハンドルを回しました。");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("ガムボールが出てきません。");
    }
}
