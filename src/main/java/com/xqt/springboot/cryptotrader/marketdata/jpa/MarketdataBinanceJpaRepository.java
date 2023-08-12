package com.xqt.springboot.cryptotrader.marketdata.jpa;

import com.xqt.springboot.cryptotrader.marketdata.MarketdataBinance;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class MarketdataBinanceJpaRepository {

    @PersistenceContext
    EntityManager entityManager;

    public void insert(MarketdataBinance data){
        entityManager.merge(data);
    }
}
