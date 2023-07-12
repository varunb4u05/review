package com.udacity.jwdnd.c1.review;

import java.math.BigInteger;

public class User {

    private BigInteger userid;
    private String username;
    private String salt;
    private String password;
    private String firstname;
    private String lastname;

    public BigInteger getUserid() {
        return userid;
    }

    public void setUserid(BigInteger userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
