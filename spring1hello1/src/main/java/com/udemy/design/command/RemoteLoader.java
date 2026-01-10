package com.udemy.design.command;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("リビングルーム");
        Light kitchenRoomLight = new Light("キッチン");
        GarageDoor garageDoor = new GarageDoor("ガレージ");
        Stereo stereo = new Stereo("リビングルーム");

        //LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        //LightOffCommand lightRoomLightOff = new LightOffCommand(livingRoomLight);

        //LightOnCommand livingKitchenLightOn = new LightOnCommand(kitchenRoomLight);
        //LightOffCommand lightKitchenLightOff = new LightOffCommand(kitchenRoomLight);

        //GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        //GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        //StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
        //remoteControl.setCommand(0, livingRoomLightOn, lightRoomLightOff);
        remoteControl.setCommand(1, kitchenRoomLight::on, kitchenRoomLight::off);
        //remoteControl.setCommand(1, livingKitchenLightOn, lightKitchenLightOff);
        remoteControl.setCommand(2, garageDoor::up, garageDoor::down);
        //remoteControl.setCommand(2, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(3, stereoOnWithCD, stereo::off);
        //remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

    }
}
