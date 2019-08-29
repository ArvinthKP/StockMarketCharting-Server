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

import com.smcharts.model.Company;
import com.smcharts.service.CompanyService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CompanyController {
	
	@Autowired
	CompanyService companyService;
	
	@GetMapping(path = "/companies")
	public List<Company> getCompanies() {
				return companyService.getCompanies();
	}

	@PostMapping(path = "/company/create")
	public Company addCompany(@RequestBody Company company) {
		
		Company _company = companyService.addCompany(company);
		return _company;
	}

	@GetMapping(path = "/company/{companyId}")
	public Optional<Company> getCompanyById(@PathVariable Long companyId) {
		
		return companyService.getCompanyById(companyId);
	}
	
	@GetMapping(path = "/companies/{sectorName}")
	public List<Company> getCompanies(@PathVariable String sectorName) {
		
		return companyService.getCompaniesBySectorName(sectorName);
	}

}
