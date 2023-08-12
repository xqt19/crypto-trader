package com.xqt.springboot.cryptotrader.restapi.bean;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Component;
import java.util.*;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@Component
public class HelloDaoService {

    private static List<HelloWorldBean> hwblist = new ArrayList<>();
    private static long beansCount = 0;

    static{
        hwblist.add(new HelloWorldBean(++beansCount,"BTCUSD", 0.105367, 0.10542));
        hwblist.add(new HelloWorldBean(++beansCount, "ETHUSD", 0.205367, 0.20542));
        hwblist.add(new HelloWorldBean(++beansCount, "XQTUSD", 0.305367, 0.30542));
    }

    public List<HelloWorldBean> retrieveAllBeans(){
        return hwblist;
    }
    public HelloWorldBean save(HelloWorldBean bean){
        bean.setId(++beansCount);
        hwblist.add(bean);
        return bean;
    }

    public EntityModel<HelloWorldBean> findById(long id) {
        for (HelloWorldBean bean : hwblist){
            if (bean.getId() == id){
                EntityModel<HelloWorldBean> model =  EntityModel.of(bean);
                WebMvcLinkBuilder link = linkTo(methodOn(HelloWorldResource.class).retrieveAllBeans());
                model.add(link.withRel("all-users"));
                return model;
            }
        }
        EntityModel <HelloWorldBean>model = EntityModel.of(new HelloWorldBean(0,"No such bean", 0, 0));
        return model;
    }

}
