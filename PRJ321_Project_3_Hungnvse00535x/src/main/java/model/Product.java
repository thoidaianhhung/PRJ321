package model;

import java.io.Serializable;

public class Product implements Serializable {
    private int PRODUCT_ID;
    private String PRODUCT_NAME;
    private String PRODUCT_DES;
    private float PRODUCT_PRICE;
    private String PRODUCT_IMG_SOURCE;
    private String PRODUCT_TYPE;
    private String PRODUCT_BRAND;
    private int PRODUCT_NUMBER;

    public Product() {
    }

    public Product(int PRODUCT_ID, String PRODUCT_NAME, String PRODUCT_DES, float PRODUCT_PRICE, String PRODUCT_IMG_SOURCE,
                   String PRODUCT_TYPE, String PRODUCT_BRAND, int PRODUCT_NUMBER) {
        this.PRODUCT_ID = PRODUCT_ID;
        this.PRODUCT_NAME = PRODUCT_NAME;
        this.PRODUCT_DES = PRODUCT_DES;
        this.PRODUCT_PRICE = PRODUCT_PRICE;
        this.PRODUCT_IMG_SOURCE = PRODUCT_IMG_SOURCE;
        this.PRODUCT_TYPE = PRODUCT_TYPE;
        this.PRODUCT_BRAND = PRODUCT_BRAND;
        this.PRODUCT_NUMBER = PRODUCT_NUMBER;
    }

    public int getPRODUCT_ID() {
        return PRODUCT_ID;
    }

    public void setPRODUCT_ID(int PRODUCT_ID) {
        this.PRODUCT_ID = PRODUCT_ID;
    }

    public String getPRODUCT_NAME() {
        return PRODUCT_NAME;
    }

    public void setPRODUCT_NAME(String PRODUCT_NAME) {
        this.PRODUCT_NAME = PRODUCT_NAME;
    }

    public String getPRODUCT_DES() {
        return PRODUCT_DES;
    }

    public void setPRODUCT_DES(String PRODUCT_DES) {
        this.PRODUCT_DES = PRODUCT_DES;
    }

    public float getPRODUCT_PRICE() {
        return PRODUCT_PRICE;
    }

    public void setPRODUCT_PRICE(float PRODUCT_PRICE) {
        this.PRODUCT_PRICE = PRODUCT_PRICE;
    }

    public String getPRODUCT_IMG_SOURCE() {
        return PRODUCT_IMG_SOURCE;
    }

    public void setPRODUCT_IMG_SOURCE(String PRODUCT_IMG_SOURCE) {
        this.PRODUCT_IMG_SOURCE = PRODUCT_IMG_SOURCE;
    }

    public String getPRODUCT_TYPE() {
        return PRODUCT_TYPE;
    }

    public void setPRODUCT_TYPE(String PRODUCT_TYPE) {
        this.PRODUCT_TYPE = PRODUCT_TYPE;
    }

    public String getPRODUCT_BRAND() {
        return PRODUCT_BRAND;
    }

    public void setPRODUCT_BRAND(String PRODUCT_BRAND) {
        this.PRODUCT_BRAND = PRODUCT_BRAND;
    }

    public int getPRODUCT_NUMBER() {
        return PRODUCT_NUMBER;
    }

    public void setPRODUCT_NUMBER(int PRODUCT_NUMBER) {
        this.PRODUCT_NUMBER = PRODUCT_NUMBER;
    }
}
