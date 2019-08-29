package com.smcharts.service;

import java.util.List;
import java.util.Optional;

import com.smcharts.model.Company;

public interface CompanyService {

	public List<Company> getCompanies();

	public Company addCompany(Company company);

	public Optional<Company> getCompanyById(Long id);

	public List<Company> getCompaniesBySectorName(String sectorName);
	
}
