package com.udemy.design.command;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("リビングルーム");
        Light kitchenRoomLight = new Light("キッチン");
        GarageDoor garageDoor = new GarageDoor("ガレージ");
        Stereo stereo = new Stereo("リビングルーム");
        CeilingFan ceilingFan = new CeilingFan("リビングルーム");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand lightRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand livingKitchenLightOn = new LightOnCommand(kitchenRoomLight);
        LightOffCommand lightKitchenLightOff = new LightOffCommand(kitchenRoomLight);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        //remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
        remoteControl.setCommand(0, livingRoomLightOn, lightRoomLightOff);
        //remoteControl.setCommand(1, kitchenRoomLight::on, kitchenRoomLight::off);
        remoteControl.setCommand(1, livingKitchenLightOn, lightKitchenLightOff);
        //remoteControl.setCommand(2, garageDoor::up, garageDoor::down);
        remoteControl.setCommand(2, garageDoorUp, garageDoorDown);
        //remoteControl.setCommand(3, stereoOnWithCD, stereo::off);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(4, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(5, ceilingFanHigh, ceilingFanOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(5);;
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}
