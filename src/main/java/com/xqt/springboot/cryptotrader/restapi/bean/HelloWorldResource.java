package com.xqt.springboot.cryptotrader.restapi.bean;

import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.*;

@RestController
public class HelloWorldResource {

    private HelloDaoService service;

    public HelloWorldResource(HelloDaoService service){
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET, path="/beans")
    @GetMapping("/beans")
    public List<HelloWorldBean>retrieveAllBeans(){
        return service.retrieveAllBeans();
    }

    @RequestMapping(method = RequestMethod.GET, path="/bean/{id}")
    public EntityModel<HelloWorldBean> helloworldpathvariable(@PathVariable long id){
        return service.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, path="/beans")
    public ResponseEntity<Object> createUser(@RequestBody HelloWorldBean bean){
        HelloWorldBean savedBean = service.save(bean);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                        .path("/{id}")
                        .buildAndExpand(savedBean.getId())
                        .toUri();
        return ResponseEntity.created(location).build();
    }
}
