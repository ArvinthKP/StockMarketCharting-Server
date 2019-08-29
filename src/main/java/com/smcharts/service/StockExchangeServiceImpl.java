package com.smcharts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smcharts.model.StockExchange;
import com.smcharts.repo.StockExchangeRepo;

@Service
public class StockExchangeServiceImpl implements StockExchangeService {

	@Autowired
	StockExchangeRepo stockExchangeRepo;

	@Override
	public List<StockExchange> getStockExchanges() {
		return (List<StockExchange>) stockExchangeRepo.findAll();
	}

	@Override
	public StockExchange createStockExchange(StockExchange stockExchange) {
		return stockExchangeRepo.save(stockExchange);
	}

	@Override
	public Optional<StockExchange> getStockExchangeById(Long id) {
		return stockExchangeRepo.findById(id);
	}

}
