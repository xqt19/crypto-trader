package com.xqt.springboot.cryptotrader.marketdata;

import com.xqt.springboot.cryptotrader.marketdata.jpa.MarketdataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MarketdataCommandLineRunner implements CommandLineRunner {

    @Autowired
    private MarketdataJpaRepository repository;

    public void run(String... args) throws Exception{
        repository.insert(new Marketdata(1, "ETHUSDT", 1848.59000000, 1848.60000000));
        repository.insert(new Marketdata(2, "BTCUSDT", 29389.41000000, 29389.42000000));
    }
}
