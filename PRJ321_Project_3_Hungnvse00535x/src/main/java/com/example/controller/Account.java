package com.example.controller;

public class Account {
    private String USER_MAIL;
    private String PASSWORD;
    private int ACCOUNT_ROLE;
    private String USER_NAME;
    private String USER_ADDRESS;
    private String USER_PHONE;

    public Account() {
    }

    public Account(String USER_MAIL, String PASSWORD, int ACCOUNT_ROLE, String USER_NAME, String USER_ADDRESS, String USER_PHONE) {
        this.USER_MAIL = USER_MAIL;
        this.PASSWORD = PASSWORD;
        this.ACCOUNT_ROLE = ACCOUNT_ROLE;
        this.USER_NAME = USER_NAME;
        this.USER_ADDRESS = USER_ADDRESS;
        this.USER_PHONE = USER_PHONE;
    }

    public String getUSER_MAIL() {
        return USER_MAIL;
    }

    public void setUSER_MAIL(String USER_MAIL) {
        this.USER_MAIL = USER_MAIL;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public int getACCOUNT_ROLE() {
        return ACCOUNT_ROLE;
    }

    public void setACCOUNT_ROLE(int ACCOUNT_ROLE) {
        this.ACCOUNT_ROLE = ACCOUNT_ROLE;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }

    public String getUSER_ADDRESS() {
        return USER_ADDRESS;
    }

    public void setUSER_ADDRESS(String USER_ADDRESS) {
        this.USER_ADDRESS = USER_ADDRESS;
    }

    public String getUSER_PHONE() {
        return USER_PHONE;
    }

    public void setUSER_PHONE(String USER_PHONE) {
        this.USER_PHONE = USER_PHONE;
    }
}
