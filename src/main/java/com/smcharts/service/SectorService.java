package com.smcharts.service;

import java.util.List;
import java.util.Optional;

import com.smcharts.model.Sector;

public interface SectorService {

	public List<Sector> getSectors();

	public Sector createSector(Sector sector);

	public Optional<Sector> getSectorById(Long id);

}
