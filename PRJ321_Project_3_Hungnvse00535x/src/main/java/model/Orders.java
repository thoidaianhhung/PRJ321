package model;

import java.util.Date;

public class Orders {
    private String USER_MAIL;
    private int ORDER_ID;
    private int ORDER_STATUS;
    private Date ORDER_DATE;
    private String ORDER_DISCOUNT_CODE;
    private String ORDER_ADDRESS;

    public Orders(String USER_MAIL, int ORDER_ID, int ORDER_STATUS, Date ORDER_DATE, String ORDER_DISCOUNT_CODE, String ORDER_ADDRESS) {
        this.USER_MAIL = USER_MAIL;
        this.ORDER_ID = ORDER_ID;
        this.ORDER_STATUS = ORDER_STATUS;
        this.ORDER_DATE = ORDER_DATE;
        this.ORDER_DISCOUNT_CODE = ORDER_DISCOUNT_CODE;
        this.ORDER_ADDRESS = ORDER_ADDRESS;
    }

    public String getUSER_MAIL() {
        return USER_MAIL;
    }

    public void setUSER_MAIL(String USER_MAIL) {
        this.USER_MAIL = USER_MAIL;
    }

    public int getORDER_ID() {
        return ORDER_ID;
    }

    public void setORDER_ID(int ORDER_ID) {
        this.ORDER_ID = ORDER_ID;
    }

    public int getORDER_STATUS() {
        return ORDER_STATUS;
    }

    public void setORDER_STATUS(int ORDER_STATUS) {
        this.ORDER_STATUS = ORDER_STATUS;
    }

    public Date getORDER_DATE() {
        return ORDER_DATE;
    }

    public void setORDER_DATE(Date ORDER_DATE) {
        this.ORDER_DATE = ORDER_DATE;
    }

    public String getORDER_DISCOUNT_CODE() {
        return ORDER_DISCOUNT_CODE;
    }

    public void setORDER_DISCOUNT_CODE(String ORDER_DISCOUNT_CODE) {
        this.ORDER_DISCOUNT_CODE = ORDER_DISCOUNT_CODE;
    }

    public String getORDER_ADDRESS() {
        return ORDER_ADDRESS;
    }

    public void setORDER_ADDRESS(String ORDER_ADDRESS) {
        this.ORDER_ADDRESS = ORDER_ADDRESS;
    }
}
