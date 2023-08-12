package com.xqt.springboot.cryptotrader.marketdata;


public class MarketdataHuobi{
    private data data;
    private status status;
    private ts ts;
}
class data {
    private String symbol;
    private double open;
    private double high;
    private double low;
    private double close;
    private double amount;
    private double vol;
    private double count;
    private double bid;
    private double bidSize;
    private double ask;
    private double askSize;
}

class status {
    private String status;
}

class ts {
    private long ts;
}
