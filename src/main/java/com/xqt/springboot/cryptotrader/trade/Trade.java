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

    @Column(name="customer_id")
    private long customer_id;


    public Trade(long id, String name, double price, long customer_id) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.customer_id = customer_id;
    }

    public Trade(){}

}
