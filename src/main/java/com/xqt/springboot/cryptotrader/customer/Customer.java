package com.xqt.springboot.cryptotrader.customer;

import jakarta.persistence.*;

@Entity
public class Customer {

    @Id
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="balance")
    private double balance;

    public Customer(long id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Customer(){};

    public String toString() {return "ID-"+ this.id + " Name-"+ this.name + " Price-"+ this.balance;}

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
