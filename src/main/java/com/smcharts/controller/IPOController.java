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

import com.smcharts.model.IPO;
import com.smcharts.service.IPOService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class IPOController {

	@Autowired
	IPOService ipoService;
	
	@GetMapping(path = "/ipos")
	public List<IPO> getIPOs() {		
		return ipoService.getIPOs();
	}

	@PostMapping(path = "/ipo/create")
	public IPO createIPOs(@RequestBody IPO ipo) {		
		IPO _ipo = ipoService.createIPO(ipo);
		return _ipo;
	}

	@GetMapping(path = "/ipo/{ipoId}")
	public Optional<IPO> getIPOById(@PathVariable Long ipoId) {		
		return ipoService.getIPOById(ipoId);
	}
}
