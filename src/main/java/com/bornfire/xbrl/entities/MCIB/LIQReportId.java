package com.bornfire.xbrl.entities.MCIB;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class LIQReportId  implements Serializable{
	private static final long serialVersionUID = 1L;
	Date report_date;
	String currency;
	public Date getReport_date() {
		return report_date;
	}
	public void setReport_date(Date report_date) {
		this.report_date = report_date;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + ((report_date == null) ? 0 : report_date.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LIQReportId other = (LIQReportId) obj;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (report_date == null) {
			if (other.report_date != null)
				return false;
		} else if (!report_date.equals(other.report_date))
			return false;
		return true;
	}
	public LIQReportId(Date report_date, String currency) {
		super();
		this.report_date = report_date;
		this.currency = currency;
	}
	public LIQReportId() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
