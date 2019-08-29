package com.smcharts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ipo")
public class IPO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "stock_exchange_name")
	private String stockExchangeName;

	@Column(name = "price_per_pay")
	private String pricePerPay;

	@Column(name = "total_number_of_shares")
	private String totalNumberOfShares;

	@Column(name = "open_date_time")
	private String openDateTime;

	@Column
	private String remarks;

	public IPO() {

	}

	public IPO(String companyName, String stockExchangeName, String pricePerPay, String totalNumberOfShares,
			String openDateTime, String remarks) {
		this.companyName = companyName;
		this.stockExchangeName = stockExchangeName;
		this.pricePerPay = pricePerPay;
		this.totalNumberOfShares = totalNumberOfShares;
		this.openDateTime = openDateTime;
		this.remarks = remarks;
	}

	public String getCompanyName() {
		return companyName;
	}

	public long getId() {
		return id;
	}

	public String getOpenDateTime() {
		return openDateTime;
	}

	public String getPricePerPay() {
		return pricePerPay;
	}

	public String getRemarks() {
		return remarks;
	}

	public String getStockExchangeName() {
		return stockExchangeName;
	}

	public String getTotalNumberOfShares() {
		return totalNumberOfShares;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setOpenDateTime(String openDateTime) {
		this.openDateTime = openDateTime;
	}

	public void setPricePerPay(String pricePerPay) {
		this.pricePerPay = pricePerPay;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public void setStockExchangeName(String stockExchangeName) {
		this.stockExchangeName = stockExchangeName;
	}

	public void setTotalNumberOfShares(String totalNumberOfShares) {
		this.totalNumberOfShares = totalNumberOfShares;
	}

	@Override
	public String toString() {
		return "IPO [id=" + id + ", companyName=" + companyName + ", stockExchangeName=" + stockExchangeName
				+ ", pricePerPay=" + pricePerPay + ", totalNumberOfShares=" + totalNumberOfShares + ", openDateTime="
				+ openDateTime + ", remarks=" + remarks + "]";
	}

}
