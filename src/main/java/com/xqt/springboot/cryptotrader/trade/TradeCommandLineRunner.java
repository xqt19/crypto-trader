package com.xqt.springboot.cryptotrader.trade;

import com.xqt.springboot.cryptotrader.trade.jpa.TradeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TradeCommandLineRunner implements CommandLineRunner {

    @Autowired
    private TradeJpaRepository repository;

    @Override
    public void run(String... args) throws Exception{
        repository.insert(new Trade(1, "BTC", 0.09732000));
        repository.insert(new Trade(2, "ETH", 0.06279000));

    }
}
