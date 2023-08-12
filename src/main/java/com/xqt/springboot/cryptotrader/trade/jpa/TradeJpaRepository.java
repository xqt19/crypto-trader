package com.xqt.springboot.cryptotrader.trade.jpa;

import com.xqt.springboot.cryptotrader.trade.Trade;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class TradeJpaRepository {
    @PersistenceContext
    EntityManager entityManager;

    public void insert(Trade trade){
        entityManager.merge(trade);
    }
}
