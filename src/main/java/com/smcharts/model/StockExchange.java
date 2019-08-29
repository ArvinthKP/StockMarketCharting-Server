package com.smcharts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock_exchange")
public class StockExchange {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private String stockExchangeName;

	@Column
	private String brief;

	@Column
	private String address;

	public StockExchange() {

	}

	public StockExchange(String stockExchangeName, String brief, String address) {
		this.stockExchangeName = stockExchangeName;
		this.brief = brief;
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public String getBrief() {
		return brief;
	}

	public long getId() {
		return id;
	}

	public String getStockExchangeName() {
		return stockExchangeName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setStockExchangeName(String stockExchangeName) {
		this.stockExchangeName = stockExchangeName;
	}

	@Override
	public String toString() {
		return "StockExchange [id=" + id + ", stockExchangeName=" + stockExchangeName + ", brief=" + brief
				+ ", address=" + address + "]";
	}

}
