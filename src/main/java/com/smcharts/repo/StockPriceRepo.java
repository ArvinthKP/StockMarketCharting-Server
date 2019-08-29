package com.smcharts.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.smcharts.model.StockPrice;

public interface StockPriceRepo extends CrudRepository<StockPrice, Long>{

	public List<StockPrice> getByCompanyId(long companyId);
}
