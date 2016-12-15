package com.example.a52374.mystock.bean;

import java.io.Serializable;

/**
 * Created by 52374 on 2016/12/15.
 */
public class Stock implements Serializable {
      private String name,id;
    private double price,adr;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAdr(double adr) {
        this.adr = adr;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public double getAdr() {
        return adr;
    }
}
