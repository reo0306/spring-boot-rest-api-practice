package com.udemy.design.command;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("リビングルーム");
        LightOnCommand lightOn = new LightOnCommand(light);

        GarageDoor garageDoor = new GarageDoor("ガレージ");
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();
    }
}
