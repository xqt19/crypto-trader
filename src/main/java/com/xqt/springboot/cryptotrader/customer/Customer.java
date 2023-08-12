package com.xqt.springboot.cryptotrader.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.xqt.springboot.cryptotrader.trade.Trade;
import jakarta.persistence.*;
import java.util.*;

@Entity
public class Customer {

    @Id
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="balance")
    private double balance;
    public static Customer single_instance = null;

    private Customer(long id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public static Customer getInstance(){
        if(single_instance==null) {
            Customer newCus = new Customer(1, "User", 50000);
            single_instance = newCus;
            return newCus;
        }
        return single_instance;
    }

    public double getBalance() {
        return balance;
    }
}
