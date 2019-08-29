package com.smcharts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smcharts.model.IPO;
import com.smcharts.repo.IPORepo;

@Service
public class IPOServiceImpl implements IPOService{

	@Autowired
	IPORepo ipoRepo;

	@Override
	public List<IPO> getIPOs() {
		return (List<IPO>) ipoRepo.findAll();
	}

	@Override
	public IPO createIPO(IPO ipo) {
		return ipoRepo.save(ipo);
	}

	@Override
	public Optional<IPO> getIPOById(Long id) {
		return ipoRepo.findById(id);
	}
	
	
}
