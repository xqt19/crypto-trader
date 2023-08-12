package com.xqt.springboot.cryptotrader.trade.jdbc;

import com.xqt.springboot.cryptotrader.trade.Trade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TradeJDBCRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY =
            """
                insert into trade (id, name, price) values (?,?,?);
            """;

    public void insert(Trade trade){
        springJdbcTemplate.update(INSERT_QUERY, trade.getId(), trade.getName(), trade.getPrice());
    }
}
