package com.udemy.design.command;

public class Stereo {
    String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " ステレオがonになりました。");
    }

    public void off() {
        System.out.println(name + " ステレオがoffになりました。");
    }

    public void secCd() {
        System.out.println(name + " ステレオにCDをセットしました。");
    }

    public void secDvd() {
        System.out.println(name + " ステレオにDVDをセットしました。");
    }

    public void secRadio() {
        System.out.println(name + " ステレオにRadioをセットしました。");
    }
    
    public void secVolume(int volume) {
        System.out.println(name + " ステレオのボリュームを" + volume + "にセットしました。");
    }
}
