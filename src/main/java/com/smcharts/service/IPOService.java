package com.smcharts.service;

import java.util.List;
import java.util.Optional;

import com.smcharts.model.IPO;

public interface IPOService {

	public List<IPO> getIPOs();

	public IPO createIPO(IPO ipo);

	public Optional<IPO> getIPOById(Long id);

}
