package com.xqt.springboot.cryptotrader;

public class Trade {

    private long id;
    private String name;
    private double price;

    public Trade(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
