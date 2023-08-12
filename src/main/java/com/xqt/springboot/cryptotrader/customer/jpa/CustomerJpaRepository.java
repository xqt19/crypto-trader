package com.xqt.springboot.cryptotrader.customer.jpa;

import com.xqt.springboot.cryptotrader.customer.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CustomerJpaRepository {

    @PersistenceContext
    EntityManager entityManager;

    public void insert(Customer customer){
        entityManager.merge(customer);
    }
}
