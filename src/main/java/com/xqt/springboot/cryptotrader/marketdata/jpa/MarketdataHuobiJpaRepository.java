package com.xqt.springboot.cryptotrader.marketdata.jpa;

import com.xqt.springboot.cryptotrader.marketdata.MarketdataHuobi;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class MarketdataHuobiJpaRepository {
    @PersistenceContext
    EntityManager entityManager;

    public void insert(MarketdataHuobi data){
        entityManager.merge(data);
    }
}
