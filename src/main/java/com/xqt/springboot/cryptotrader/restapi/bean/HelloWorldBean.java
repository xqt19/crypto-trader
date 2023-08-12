package com.xqt.springboot.cryptotrader.restapi.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class HelloWorldBean {

    @Id
    @GeneratedValue
    private long id;
    @JsonProperty("symbol")
    private String message;
    @JsonProperty("bid_price")
    private double bidprice;
    @JsonProperty("ask_price")
    private double askprice;

    public HelloWorldBean (long id, String message, double bidprice, double askprice){
        this.id = id;
        this.message = message;
        this.bidprice= bidprice;
        this.askprice = askprice;
    }

    public HelloWorldBean(){}

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", bidprice=" + bidprice +
                ", askprice=" + askprice +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getBidprice() {
        return bidprice;
    }

    public void setBidprice(double bidprice) {
        this.bidprice = bidprice;
    }

    public double getAskprice() {
        return askprice;
    }

    public void setAskprice(double askprice) {
        this.askprice = askprice;
    }
}
