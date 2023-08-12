package com.xqt.springboot.cryptotrader.trade;

import jakarta.persistence.*;

@Entity
public class Trade {

    @Id
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="price")
    private double price;

    public Trade(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Trade(){};

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {return "ID-"+ this.id + " Name-"+ this.name + " Price-"+ this.price;}
}
