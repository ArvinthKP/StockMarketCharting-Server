package com.smcharts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smcharts.model.Sector;
import com.smcharts.repo.SectorRepo;

@Service
public class SectorServiceImpl implements SectorService {

	@Autowired
	SectorRepo sectorRepo;

	@Override
	public List<Sector> getSectors() {
		return (List<Sector>) sectorRepo.findAll();
	}

	@Override
	public Sector createSector(Sector sector) {
		return sectorRepo.save(sector);
	}

	@Override
	public Optional<Sector> getSectorById(Long id) {
		return sectorRepo.findById(id);
	}

}
