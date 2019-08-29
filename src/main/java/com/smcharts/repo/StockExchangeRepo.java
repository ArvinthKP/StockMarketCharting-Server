package com.smcharts.repo;

import org.springframework.data.repository.CrudRepository;

import com.smcharts.model.StockExchange;

public interface StockExchangeRepo extends CrudRepository<StockExchange, Long> {

}
