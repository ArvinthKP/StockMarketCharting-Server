package com.smcharts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "company_name")
	private String companyName;

	@Column
	private String turnover;

	@Column
	private String ceo;

	@Column(name = "board_of_director")
	private String boardOfDirector;

	@Column(name = "stock_exchange")
	private String stockExchange;

	@Column
	private String sector;

	@Column
	private String brief;

	public Company() {

	}

	public Company(String companyName, String turnover, String ceo, String boardOfDirector, String stockExchange,
			String sector, String brief) {
		this.companyName = companyName;
		this.turnover = turnover;
		this.ceo = ceo;
		this.boardOfDirector = boardOfDirector;
		this.stockExchange = stockExchange;
		this.sector = sector;
		this.brief = brief;
	}

	public String getBoardOfDirector() {
		return boardOfDirector;
	}

	public String getBrief() {
		return brief;
	}

	public String getCeo() {
		return ceo;
	}

	public String getCompanyName() {
		return companyName;
	}

	public long getId() {
		return id;
	}

	public String getSector() {
		return sector;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public String getTurnover() {
		return turnover;
	}

	public void setBoardOfDirector(String boardOfDirector) {
		this.boardOfDirector = boardOfDirector;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	public void setTurnover(String turnover) {
		this.turnover = turnover;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", companyName=" + companyName + ", turnover=" + turnover + ", ceo=" + ceo
				+ ", boardOfDirector=" + boardOfDirector + ", stockExchange=" + stockExchange + ", sector=" + sector
				+ ", brief=" + brief + "]";
	}

}
