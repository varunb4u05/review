package com.udacity.jwdnd.c1.review;

import java.math.BigInteger;

public class Messages {

    private BigInteger messageid;
    private String username;
    private String messagetext;

    public BigInteger getMessageid() {
        return messageid;
    }

    public void setMessageid(BigInteger messageid) {
        this.messageid = messageid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessagetext() {
        return messagetext;
    }

    public void setMessagetext(String messagetext) {
        this.messagetext = messagetext;
    }
}
