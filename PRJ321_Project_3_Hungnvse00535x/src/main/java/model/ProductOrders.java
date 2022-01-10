package model;

public class ProductOrders {
    private int ORDER_ID;
    private int PRODUCT_ID;
    private int AMOUNT_PRODUCT;
    private int PRICE_PRODUCT;

    public ProductOrders(int ORDER_ID, int PRODUCT_ID, int AMOUNT_PRODUCT, int PRICE_PRODUCT) {
        this.setORDER_ID(ORDER_ID);
        this.setPRODUCT_ID(PRODUCT_ID);
        this.setAMOUNT_PRODUCT(AMOUNT_PRODUCT);
        this.setPRICE_PRODUCT(PRICE_PRODUCT);
    }


    public int getORDER_ID() {
        return ORDER_ID;
    }

    public void setORDER_ID(int ORDER_ID) {
        this.ORDER_ID = ORDER_ID;
    }

    public int getPRODUCT_ID() {
        return PRODUCT_ID;
    }

    public void setPRODUCT_ID(int PRODUCT_ID) {
        this.PRODUCT_ID = PRODUCT_ID;
    }

    public int getAMOUNT_PRODUCT() {
        return AMOUNT_PRODUCT;
    }

    public void setAMOUNT_PRODUCT(int AMOUNT_PRODUCT) {
        this.AMOUNT_PRODUCT = AMOUNT_PRODUCT;
    }

    public int getPRICE_PRODUCT() {
        return PRICE_PRODUCT;
    }

    public void setPRICE_PRODUCT(int PRICE_PRODUCT) {
        this.PRICE_PRODUCT = PRICE_PRODUCT;
    }
}
