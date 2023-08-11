package com.xqt.springboot.cryptotrader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class AppController {

    @RequestMapping("/tradehistory")
    public List <Trade>retrieveAllTrade(){
        return Arrays.asList(
                new Trade(1, "Name", 0.06279000),
                new Trade(2, "Name2", 0.00818600)
        );
    }

}
