package com.xqt.springboot.cryptotrader.restapi.bean;
import com.xqt.springboot.cryptotrader.restapi.bean.HelloWorldBean;
import org.springframework.web.bind.annotation.*;


@RestController
public class AppController {

    @RequestMapping(method = RequestMethod.GET, path="/hello-world")
    public String helloworld(){
        return "Hello World!";
    }

    @RequestMapping(method = RequestMethod.GET, path="/hello-world-bean")
    public HelloWorldBean helloworldbean(){
        return new HelloWorldBean(1, "Hello World!", 0.005367, 0.00542);
    }

    @RequestMapping(method = RequestMethod.GET, path="/hello-world/path-variable/{name}")
    public HelloWorldBean helloworldpathvariable(@PathVariable String name){
        return new HelloWorldBean(1, String.format("Hello World, %s!",name), 0.005367, 0.00542);
    }



//    @RequestMapping(method = RequestMethod.GET, path="/tradehistory")
//    public List <Trade>retrieveAllTrade(){
//        return Arrays.asList(
//                new Trade(1, "Name", 0.06279000),
//                new Trade(2, "Name2", 0.00818600)
//        );
//    }

}
