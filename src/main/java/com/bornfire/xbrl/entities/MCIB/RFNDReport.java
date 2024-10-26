package com.bornfire.xbrl.entities.MCIB;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MIS_RFND_RPT_TB")
public class RFNDReport {
	
	@Id
	String tran_id;
	Date tran_date;
	String rfundid;
	String tranid;
	BigDecimal mur;
	BigDecimal inr;
	BigDecimal exchange;
	public String getTran_id() {
		return tran_id;
	}
	public void setTran_id(String tran_id) {
		this.tran_id = tran_id;
	}
	public Date getTran_date() {
		return tran_date;
	}
	public void setTran_date(Date tran_date) {
		this.tran_date = tran_date;
	}
	public String getRfundid() {
		return rfundid;
	}
	public void setRfundid(String rfundid) {
		this.rfundid = rfundid;
	}
	public String getTranid() {
		return tranid;
	}
	public void setTranid(String tranid) {
		this.tranid = tranid;
	}
	public BigDecimal getMur() {
		return mur;
	}
	public void setMur(BigDecimal mur) {
		this.mur = mur;
	}
	public BigDecimal getInr() {
		return inr;
	}
	public void setInr(BigDecimal inr) {
		this.inr = inr;
	}
	public BigDecimal getExchange() {
		return exchange;
	}
	public void setExchange(BigDecimal exchange) {
		this.exchange = exchange;
	}
	public RFNDReport(String tran_id, Date tran_date, String rfundid, String tranid, BigDecimal mur, BigDecimal inr,
			BigDecimal exchange) {
		super();
		this.tran_id = tran_id;
		this.tran_date = tran_date;
		this.rfundid = rfundid;
		this.tranid = tranid;
		this.mur = mur;
		this.inr = inr;
		this.exchange = exchange;
	}
	public RFNDReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
