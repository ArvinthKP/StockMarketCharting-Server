package com.smcharts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock_price")
public class StockPrice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "company_id")
	private long companyId;

	@Column(name = "stock_exchange_name")
	private String stockExchangeName;

	@Column(name = "current_price")
	private long currentPrice;

	@Column
	private String date;

	@Column
	private String time;

	public StockPrice() {

	}

	public StockPrice(long companyId, String stockExchangeName, long currentPrice, String date, String time) {
		this.companyId = companyId;
		this.stockExchangeName = stockExchangeName;
		this.currentPrice = currentPrice;
		this.date = date;
		this.time = time;
	}

	public long getCompanyId() {
		return companyId;
	}

	public long getCurrentPrice() {
		return currentPrice;
	}

	public String getDate() {
		return date;
	}

	public String getStockExchangeName() {
		return stockExchangeName;
	}

	public String getTime() {
		return time;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public void setCurrentPrice(long currentPrice) {
		this.currentPrice = currentPrice;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setStockExchangeName(String stockExchangeName) {
		this.stockExchangeName = stockExchangeName;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "StockPrice [companyId=" + companyId + ", stockExchangeName=" + stockExchangeName + ", currentPrice="
				+ currentPrice + ", date=" + date + ", time=" + time + "]";
	}
}
