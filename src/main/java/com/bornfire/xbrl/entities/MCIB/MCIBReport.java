package com.bornfire.xbrl.entities.MCIB;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="MCIB_ADJ_RPT_TB")
public class MCIBReport {
	
	@EmbeddedId
	MCIBReportId mcibReportId;
	String credit_type;
	String currency;
	BigDecimal sanct_lim;
	BigDecimal acct_balance;
	Date date_update;
	BigDecimal amount_arrear;
	Date date_regul;
	public MCIBReportId getMcibReportId() {
		return mcibReportId;
	}
	public void setMcibReportId(MCIBReportId mcibReportId) {
		this.mcibReportId = mcibReportId;
	}
	public String getCredit_type() {
		return credit_type;
	}
	public void setCredit_type(String credit_type) {
		this.credit_type = credit_type;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public BigDecimal getSanct_lim() {
		return sanct_lim;
	}
	public void setSanct_lim(BigDecimal sanct_lim) {
		this.sanct_lim = sanct_lim;
	}
	public BigDecimal getAcct_balance() {
		return acct_balance;
	}
	public void setAcct_balance(BigDecimal acct_balance) {
		this.acct_balance = acct_balance;
	}
	public Date getDate_update() {
		return date_update;
	}
	public void setDate_update(Date date_update) {
		this.date_update = date_update;
	}
	public BigDecimal getAmount_arrear() {
		return amount_arrear;
	}
	public void setAmount_arrear(BigDecimal amount_arrear) {
		this.amount_arrear = amount_arrear;
	}
	public Date getDate_regul() {
		return date_regul;
	}
	public void setDate_regul(Date date_regul) {
		this.date_regul = date_regul;
	}
	public MCIBReport(MCIBReportId mcibReportId, String credit_type, String currency, BigDecimal sanct_lim,
			BigDecimal acct_balance, Date date_update, BigDecimal amount_arrear, Date date_regul) {
		super();
		this.mcibReportId = mcibReportId;
		this.credit_type = credit_type;
		this.currency = currency;
		this.sanct_lim = sanct_lim;
		this.acct_balance = acct_balance;
		this.date_update = date_update;
		this.amount_arrear = amount_arrear;
		this.date_regul = date_regul;
	}
	public MCIBReport() {
		super();
		// TODO Auto-generated constructor stub
	}


}
