package com.xqt.springboot.cryptotrader.marketdata.jpa;

import com.xqt.springboot.cryptotrader.marketdata.Marketdata;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class MarketdataJpaRepository {

    @PersistenceContext
    EntityManager entityManager;

    public void insert(Marketdata marketdata){
        entityManager.merge(marketdata);
    }
}
