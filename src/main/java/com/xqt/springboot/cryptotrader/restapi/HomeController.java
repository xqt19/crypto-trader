package com.xqt.springboot.cryptotrader.restapi;
import com.xqt.springboot.cryptotrader.customer.Customer;
import com.xqt.springboot.cryptotrader.trade.Trade;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class HomeController {
    private Customer customer = Customer.getInstance();
    private DaoService service;
    public HomeController(DaoService service){this.service = service;}

    //Profile Home, See my current portfolio and USDT
    @RequestMapping(method = RequestMethod.GET, path="/home")
    public String home(){
        String str1 = "Welcome to Crypto Trader! You have "+ customer.getBalance()+ " USDT remaining.";
        String str2 = "You may buy crypto by going to http://localhost:8080/market.";
        String str3 = "You may see your past trades at http://localhost:8080/past-trades.";

        return (str1 + '\n' + str2 + '\n'+ str3);
    }


    //See trading history
    @RequestMapping(method = RequestMethod.GET, path="/past-trades")
    public String getAllTrades(){
        return "Hello World!";
    }

    //See the market prices, allow buying and selling
    @RequestMapping(method = RequestMethod.GET, path="/market")
    public String getAllMarketdata(){
        return "Hello World!";
    }

    @RequestMapping(method = RequestMethod.GET, path="/prices")
    public List<Trade> getPrices(){
        return service.getPrices();
    }


}
