package com.smcharts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sector")
public class Sector {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "sector_name")
	private String sectorName;

	public Sector() {

	}

	public Sector(String sectorName) {
		this.sectorName = sectorName;
	}

	public long getId() {
		return id;
	}

	public String getSectorName() {
		return sectorName;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}

	@Override
	public String toString() {
		return "Sector [id=" + id + ", sectorName=" + sectorName + "]";
	}

}
