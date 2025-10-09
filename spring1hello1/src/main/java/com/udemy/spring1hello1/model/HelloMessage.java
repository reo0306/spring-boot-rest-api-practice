package com.udemy.spring1hello1.model;

public class HelloMessage {
    private String strMessage;

    public HelloMessage(final String inMsg) {
        this.strMessage = inMsg;
    }

    public String getStrMessage() {
        return strMessage;
    }

    public void setStrMessage(String strMessage) {
        this.strMessage = strMessage;
    }
}
