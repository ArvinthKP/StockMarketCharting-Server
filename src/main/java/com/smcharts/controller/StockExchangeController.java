package com.smcharts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smcharts.model.StockExchange;
import com.smcharts.service.StockExchangeService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class StockExchangeController {

	@Autowired
	StockExchangeService stockExchangeService;

	@GetMapping(path = "/stockExchanges")
	public List<StockExchange> getStockExchanges() {
		
		return stockExchangeService.getStockExchanges();
	}

	@PostMapping(path = "/stockExchange/create")
	public StockExchange createStockExchange(@RequestBody StockExchange stockExchange) {
		
		StockExchange _stockExchange = stockExchangeService.createStockExchange(stockExchange);
		return _stockExchange;
	}

	@GetMapping(path = "/stockExchange/{stockExchangeId}")
	public Optional<StockExchange> getStockExchangeById(@PathVariable Long id) {
		
		return stockExchangeService.getStockExchangeById(id);
	}

}
