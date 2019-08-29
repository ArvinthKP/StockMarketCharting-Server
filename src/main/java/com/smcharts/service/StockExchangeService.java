package com.smcharts.service;

import java.util.List;
import java.util.Optional;

import com.smcharts.model.StockExchange;


public interface StockExchangeService{

	public List<StockExchange> getStockExchanges();

	public StockExchange createStockExchange(StockExchange stockExchange);

	public Optional<StockExchange> getStockExchangeById(Long id);
	
}
