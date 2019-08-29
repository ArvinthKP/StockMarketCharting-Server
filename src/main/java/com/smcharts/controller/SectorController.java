package com.smcharts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smcharts.model.Sector;
import com.smcharts.service.SectorService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class SectorController {

	@Autowired
	SectorService sectorService;
	
	@GetMapping(path = "/sectors")
	public List<Sector> getIPOS() {
		
		return sectorService.getSectors();
	}
	
}
