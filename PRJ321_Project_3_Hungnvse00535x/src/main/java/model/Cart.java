package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cart implements Serializable {
    private List<Product> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void add(Product ci) {
        for (Product x : items) {
            if (ci.getPRODUCT_ID() == x.getPRODUCT_ID()) {
                x.setPRODUCT_NUMBER(x.getPRODUCT_NUMBER() + 1);
                return;
            }
        }


        items.add(ci);

        System.out.println("SIze: " + items.size());
    }

    public void remove(int id) {
        for (Product x : items) {
            if (x.getPRODUCT_ID() == id) {
                items.remove(x);
                return;
            }
        }
    }

    public double getAmount() {
        double s = 0;
        for (Product x : items) {
            s += x.getPRODUCT_PRICE() * x.getPRODUCT_NUMBER();
        }
        return Math.round(s * 100.0) / 100.0;
    }

    public List<Product> getItems() {
        return items;
    }
}
