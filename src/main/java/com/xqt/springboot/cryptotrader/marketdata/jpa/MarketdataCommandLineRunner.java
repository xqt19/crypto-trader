package com.xqt.springboot.cryptotrader.marketdata.jpa;
import com.xqt.springboot.cryptotrader.marketdata.Marketdata;
import com.xqt.springboot.cryptotrader.marketdata.MarketdataBinance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@EnableScheduling
@ConditionalOnProperty(name = "scheduler.enabled", matchIfMissing = true)
public class MarketdataCommandLineRunner implements CommandLineRunner {

    private double btcbidprice;
    private double btcaskprice;
    private double ethbidprice;
    private double ethaskprice;
    @Autowired
    private MarketdataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception{
    }

    @Scheduled(fixedDelay = 10000)
    public void run() throws Exception{
        repository.insert(new Marketdata(1, "BTCUSDT", this.btcbidprice, this.btcaskprice));
        repository.insert(new Marketdata(2, "ETHUSDT", this.ethbidprice, this.ethaskprice));
    }

    @Scheduled(fixedDelay = 5000)
    public void updatePrice(){
        String uri = "https://api.binance.com/api/v3/ticker/bookTicker";
        RestTemplate res = new RestTemplate();
        List<MarketdataBinance> data = Arrays.asList(res.getForObject(uri, MarketdataBinance[].class));
        List<MarketdataBinance> results = new ArrayList<>();
        for (MarketdataBinance x: data ){
            if (x.getSymbol().equals("BTCUSDT")){
                btcbidprice = x.getBidPrice();
                btcaskprice = x.getAskPrice();
            }
            if (x.getSymbol().equals("ETHUSDT")){
                ethbidprice = x.getBidPrice();
                ethaskprice = x.getAskPrice();
            }
        }
    }
}
