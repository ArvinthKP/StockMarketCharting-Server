package com.smcharts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smcharts.model.Company;
import com.smcharts.repo.CompanyRepo;

@Service
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	CompanyRepo companyRepo;

	@Override
	public List<Company> getCompanies() {
		return (List<Company>) companyRepo.findAll();
	}

	@Override
	public Company addCompany(Company company) {
		return companyRepo.save(company);
	}

	@Override
	public Optional<Company> getCompanyById(Long id) {
		return companyRepo.findById(id);
	}

	@Override
	public List<Company> getCompaniesBySectorName(String sectorName) {
		return companyRepo.findBySector(sectorName);
	}
}
