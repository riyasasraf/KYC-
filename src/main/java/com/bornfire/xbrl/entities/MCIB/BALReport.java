package com.bornfire.xbrl.entities.MCIB;

import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="MIS_BAL_RPT_TB")
public class BALReport {
	
	@EmbeddedId
	BALReportId balReportId;
	String ref_code_liab;
	String instance_desc_liab;
	BigDecimal usd_amt_liab;
	BigDecimal inr_amt_liab;
	String ref_code_ass;
	String instance_desc_ass;
	BigDecimal usd_amt_ass;
	BigDecimal inr_amt_ass;
	public BALReport(BALReportId balReportId, String ref_code_liab, String instance_desc_liab, BigDecimal usd_amt_liab,
			BigDecimal inr_amt_liab, String ref_code_ass, String instance_desc_ass, BigDecimal usd_amt_ass,
			BigDecimal inr_amt_ass) {
		super();
		this.balReportId = balReportId;
		this.ref_code_liab = ref_code_liab;
		this.instance_desc_liab = instance_desc_liab;
		this.usd_amt_liab = usd_amt_liab;
		this.inr_amt_liab = inr_amt_liab;
		this.ref_code_ass = ref_code_ass;
		this.instance_desc_ass = instance_desc_ass;
		this.usd_amt_ass = usd_amt_ass;
		this.inr_amt_ass = inr_amt_ass;
	}
	public BALReportId getBalReportId() {
		return balReportId;
	}
	public void setBalReportId(BALReportId balReportId) {
		this.balReportId = balReportId;
	}
	public String getRef_code_liab() {
		return ref_code_liab;
	}
	public void setRef_code_liab(String ref_code_liab) {
		this.ref_code_liab = ref_code_liab;
	}
	public String getInstance_desc_liab() {
		return instance_desc_liab;
	}
	public void setInstance_desc_liab(String instance_desc_liab) {
		this.instance_desc_liab = instance_desc_liab;
	}
	public BigDecimal getUsd_amt_liab() {
		return usd_amt_liab;
	}
	public void setUsd_amt_liab(BigDecimal usd_amt_liab) {
		this.usd_amt_liab = usd_amt_liab;
	}
	public BigDecimal getInr_amt_liab() {
		return inr_amt_liab;
	}
	public void setInr_amt_liab(BigDecimal inr_amt_liab) {
		this.inr_amt_liab = inr_amt_liab;
	}
	public String getRef_code_ass() {
		return ref_code_ass;
	}
	public void setRef_code_ass(String ref_code_ass) {
		this.ref_code_ass = ref_code_ass;
	}
	public String getInstance_desc_ass() {
		return instance_desc_ass;
	}
	public void setInstance_desc_ass(String instance_desc_ass) {
		this.instance_desc_ass = instance_desc_ass;
	}
	public BigDecimal getUsd_amt_ass() {
		return usd_amt_ass;
	}
	public void setUsd_amt_ass(BigDecimal usd_amt_ass) {
		this.usd_amt_ass = usd_amt_ass;
	}
	public BigDecimal getInr_amt_ass() {
		return inr_amt_ass;
	}
	public void setInr_amt_ass(BigDecimal inr_amt_ass) {
		this.inr_amt_ass = inr_amt_ass;
	}
	public BALReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
