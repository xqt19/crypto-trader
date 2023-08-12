package com.xqt.springboot.cryptotrader.customer;

import com.xqt.springboot.cryptotrader.customer.jpa.CustomerJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomerCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CustomerJpaRepository repository;

    @Override
    public void run(String... args) throws Exception{
        repository.insert(new Customer(1, "XQT", 50000.12));
    }
}
