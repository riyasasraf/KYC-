package com.bornfire.xbrl.entities.MCIB;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

import org.springframework.format.annotation.DateTimeFormat;

@Embeddable
public class MCIBReportId  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date report_date;
	private String acct_no;
	public Date getReport_date() {
		return report_date;
	}
	public void setReport_date(Date report_date) {
		this.report_date = report_date;
	}
	public String getAcct_no() {
		return acct_no;
	}
	public void setAcct_no(String acct_no) {
		this.acct_no = acct_no;
	}
	public MCIBReportId(Date report_date, String acct_no) {
		super();
		this.report_date = report_date;
		this.acct_no = acct_no;
	}
	public MCIBReportId() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acct_no == null) ? 0 : acct_no.hashCode());
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
		MCIBReportId other = (MCIBReportId) obj;
		if (acct_no == null) {
			if (other.acct_no != null)
				return false;
		} else if (!acct_no.equals(other.acct_no))
			return false;
		if (report_date == null) {
			if (other.report_date != null)
				return false;
		} else if (!report_date.equals(other.report_date))
			return false;
		return true;
	}
	

}
