package com.udacity.jwdnd.c1.review;

public class ChatForm {

    private String textMessage;

    private String username;

    private String messageType;

    public ChatForm(String textMessage, String username,
                    String messageType) {
        this.textMessage = textMessage;
        this.username = username;
        this.messageType = messageType;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
}
