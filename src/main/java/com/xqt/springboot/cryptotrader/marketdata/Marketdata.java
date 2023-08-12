package com.xqt.springboot.cryptotrader.marketdata;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Marketdata {

    @Id
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="bidprice", precision=10)
    private double bidprice;
    @Column(name="askprice", precision=10)
    private double askprice;


    public Marketdata(long id, String name, double bidprice, double askprice) {
        this.id = id;
        this.name = name;
        this.bidprice = bidprice;
        this.askprice = askprice;
    }

    public Marketdata(){};

    public String toString() {return "ID-"+ this.id + " Name-"+ this.name + " bidprice-"+ this.bidprice + " askprice-" + this.askprice;}

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBidprice() {
        return bidprice;
    }

    public double getAskprice() {
        return askprice;
    }
}
