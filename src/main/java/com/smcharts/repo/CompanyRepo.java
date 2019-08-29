package com.smcharts.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.smcharts.model.Company;

public interface CompanyRepo extends CrudRepository<Company, Long>{
	
	public List<Company> findBySector(String sectoName);

}
