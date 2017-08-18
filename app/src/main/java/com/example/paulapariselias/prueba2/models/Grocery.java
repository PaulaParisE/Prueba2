package com.example.paulapariselias.prueba2.models;

import com.orm.SugarRecord;

/**
 * Created by paulapariselias on 12-08-17.
 */

public class Grocery extends SugarRecord {

    private String name;
    private int price, quantity;

    // variable done?//

    public Grocery() {
    }

    public Grocery(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
