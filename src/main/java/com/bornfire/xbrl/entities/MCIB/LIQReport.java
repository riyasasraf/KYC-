package com.bornfire.xbrl.entities.MCIB;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="MIS_LIQUIDITY_MAST_TABLE")
public class LIQReport {
	
	@EmbeddedId
	LIQReportId liqReportId;
	
	
	BigDecimal savings;
	BigDecimal current_dep;
	BigDecimal term_dep;
	BigDecimal advances;
	BigDecimal profit;
	public LIQReportId getLiqReportId() {
		return liqReportId;
	}
	public void setLiqReportId(LIQReportId liqReportId) {
		this.liqReportId = liqReportId;
	}
	
	public BigDecimal getSavings() {
		return savings;
	}
	public void setSavings(BigDecimal savings) {
		this.savings = savings;
	}
	public BigDecimal getCurrent_dep() {
		return current_dep;
	}
	public void setCurrent_dep(BigDecimal current_dep) {
		this.current_dep = current_dep;
	}
	public BigDecimal getTerm_dep() {
		return term_dep;
	}
	public void setTerm_dep(BigDecimal term_dep) {
		this.term_dep = term_dep;
	}
	public BigDecimal getAdvances() {
		return advances;
	}
	public void setAdvances(BigDecimal advances) {
		this.advances = advances;
	}
	public BigDecimal getProfit() {
		return profit;
	}
	public void setProfit(BigDecimal profit) {
		this.profit = profit;
	}
	public LIQReport(LIQReportId liqReportId, BigDecimal savings, BigDecimal current_dep, BigDecimal term_dep,
			BigDecimal advances, BigDecimal profit) {
		super();
		this.liqReportId = liqReportId;
		this.savings = savings;
		this.current_dep = current_dep;
		this.term_dep = term_dep;
		this.advances = advances;
		this.profit = profit;
	}
	public LIQReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
