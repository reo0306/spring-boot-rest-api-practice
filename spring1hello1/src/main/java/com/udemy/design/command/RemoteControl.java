package com.udemy.design.command;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append("\n-----リモコン----\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append(
                    " [スロット").append(i).append("] ")
                    .append(onCommands[i].getClass().getName())
                    .append(" ").append(offCommands[i].getClass().getName())
                    .append(" ").append(undoCommand.getClass().getName())
                    .append("\n");
        }
        return stringBuffer.toString();
    }

}
