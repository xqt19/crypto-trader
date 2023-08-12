package com.xqt.springboot.cryptotrader.trade.springdatajpa;

import com.xqt.springboot.cryptotrader.trade.Trade;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface TradeSpringDataJpaRepository extends JpaRepository<Trade, Long> {

    List<Trade> findByName(String name);
}
