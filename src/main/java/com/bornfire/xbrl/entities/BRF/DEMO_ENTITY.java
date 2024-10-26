package com.bornfire.xbrl.entities.BRF;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="DEMO")
public class DEMO_ENTITY {
	private String	r1_sno;
	private String	r1_product;
	private BigDecimal	r1_no_ac_resident;
	private BigDecimal	r1_os_resident;
	private BigDecimal	r1_no_ac_non_resident;
	private BigDecimal	r1_os_non_resident;
	private BigDecimal 	r1_no_ac_total;
	private BigDecimal	r1_os_total;
	private String	r2_sno;
	private String	r2_product;
	private BigDecimal	r2_no_ac_resident;
	private BigDecimal	r2_os_resident;
	private BigDecimal	r2_no_ac_non_resident;
	private BigDecimal	r2_os_non_resident;
	private BigDecimal	r2_no_ac_total;
	private BigDecimal	r2_os_total;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Id
	private Date	report_date;
	private Date	report_from_date;
	private Date	report_to_date;
	private String	entity_flg;
	private String	modify_flg;
	private String	del_flg;
	private String	report_code;
	private Date	report_submit_date;
	public String getR1_sno() {
		return r1_sno;
	}
	public void setR1_sno(String r1_sno) {
		this.r1_sno = r1_sno;
	}
	public String getR1_product() {
		return r1_product;
	}
	public void setR1_product(String r1_product) {
		this.r1_product = r1_product;
	}
	public BigDecimal getR1_no_ac_resident() {
		return r1_no_ac_resident;
	}
	public void setR1_no_ac_resident(BigDecimal r1_no_ac_resident) {
		this.r1_no_ac_resident = r1_no_ac_resident;
	}
	public BigDecimal getR1_os_resident() {
		return r1_os_resident;
	}
	public void setR1_os_resident(BigDecimal r1_os_resident) {
		this.r1_os_resident = r1_os_resident;
	}
	public BigDecimal getR1_no_ac_non_resident() {
		return r1_no_ac_non_resident;
	}
	public void setR1_no_ac_non_resident(BigDecimal r1_no_ac_non_resident) {
		this.r1_no_ac_non_resident = r1_no_ac_non_resident;
	}
	public BigDecimal getR1_os_non_resident() {
		return r1_os_non_resident;
	}
	public void setR1_os_non_resident(BigDecimal r1_os_non_resident) {
		this.r1_os_non_resident = r1_os_non_resident;
	}
	public BigDecimal getR1_no_ac_total() {
		return r1_no_ac_total;
	}
	public void setR1_no_ac_total(BigDecimal r1_no_ac_total) {
		this.r1_no_ac_total = r1_no_ac_total;
	}
	public BigDecimal getR1_os_total() {
		return r1_os_total;
	}
	public void setR1_os_total(BigDecimal r1_os_total) {
		this.r1_os_total = r1_os_total;
	}
	public String getR2_sno() {
		return r2_sno;
	}
	public void setR2_sno(String r2_sno) {
		this.r2_sno = r2_sno;
	}
	public String getR2_product() {
		return r2_product;
	}
	public void setR2_product(String r2_product) {
		this.r2_product = r2_product;
	}
	public BigDecimal getR2_no_ac_resident() {
		return r2_no_ac_resident;
	}
	public void setR2_no_ac_resident(BigDecimal r2_no_ac_resident) {
		this.r2_no_ac_resident = r2_no_ac_resident;
	}
	public BigDecimal getR2_os_resident() {
		return r2_os_resident;
	}
	public void setR2_os_resident(BigDecimal r2_os_resident) {
		this.r2_os_resident = r2_os_resident;
	}
	public BigDecimal getR2_no_ac_non_resident() {
		return r2_no_ac_non_resident;
	}
	public void setR2_no_ac_non_resident(BigDecimal r2_no_ac_non_resident) {
		this.r2_no_ac_non_resident = r2_no_ac_non_resident;
	}
	public BigDecimal getR2_os_non_resident() {
		return r2_os_non_resident;
	}
	public void setR2_os_non_resident(BigDecimal r2_os_non_resident) {
		this.r2_os_non_resident = r2_os_non_resident;
	}
	public BigDecimal getR2_no_ac_total() {
		return r2_no_ac_total;
	}
	public void setR2_no_ac_total(BigDecimal r2_no_ac_total) {
		this.r2_no_ac_total = r2_no_ac_total;
	}
	public BigDecimal getR2_os_total() {
		return r2_os_total;
	}
	public void setR2_os_total(BigDecimal r2_os_total) {
		this.r2_os_total = r2_os_total;
	}
	public Date getReport_date() {
		return report_date;
	}
	public void setReport_date(Date report_date) {
		this.report_date = report_date;
	}
	public Date getReport_from_date() {
		return report_from_date;
	}
	public void setReport_from_date(Date report_from_date) {
		this.report_from_date = report_from_date;
	}
	public Date getReport_to_date() {
		return report_to_date;
	}
	public void setReport_to_date(Date report_to_date) {
		this.report_to_date = report_to_date;
	}
	public String getEntity_flg() {
		return entity_flg;
	}
	public void setEntity_flg(String entity_flg) {
		this.entity_flg = entity_flg;
	}
	public String getModify_flg() {
		return modify_flg;
	}
	public void setModify_flg(String modify_flg) {
		this.modify_flg = modify_flg;
	}
	public String getDel_flg() {
		return del_flg;
	}
	public void setDel_flg(String del_flg) {
		this.del_flg = del_flg;
	}
	public String getReport_code() {
		return report_code;
	}
	public void setReport_code(String report_code) {
		this.report_code = report_code;
	}
	public Date getReport_submit_date() {
		return report_submit_date;
	}
	public void setReport_submit_date(Date report_submit_date) {
		this.report_submit_date = report_submit_date;
	}
	public DEMO_ENTITY() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DEMO_ENTITY(String r1_sno, String r1_product, BigDecimal r1_no_ac_resident, BigDecimal r1_os_resident,
			BigDecimal r1_no_ac_non_resident, BigDecimal r1_os_non_resident, BigDecimal r1_no_ac_total,
			BigDecimal r1_os_total, String r2_sno, String r2_product, BigDecimal r2_no_ac_resident,
			BigDecimal r2_os_resident, BigDecimal r2_no_ac_non_resident, BigDecimal r2_os_non_resident,
			BigDecimal r2_no_ac_total, BigDecimal r2_os_total, Date report_date, Date report_from_date,
			Date report_to_date, String entity_flg, String modify_flg, String del_flg, String report_code,
			Date report_submit_date) {
		super();
		this.r1_sno = r1_sno;
		this.r1_product = r1_product;
		this.r1_no_ac_resident = r1_no_ac_resident;
		this.r1_os_resident = r1_os_resident;
		this.r1_no_ac_non_resident = r1_no_ac_non_resident;
		this.r1_os_non_resident = r1_os_non_resident;
		this.r1_no_ac_total = r1_no_ac_total;
		this.r1_os_total = r1_os_total;
		this.r2_sno = r2_sno;
		this.r2_product = r2_product;
		this.r2_no_ac_resident = r2_no_ac_resident;
		this.r2_os_resident = r2_os_resident;
		this.r2_no_ac_non_resident = r2_no_ac_non_resident;
		this.r2_os_non_resident = r2_os_non_resident;
		this.r2_no_ac_total = r2_no_ac_total;
		this.r2_os_total = r2_os_total;
		this.report_date = report_date;
		this.report_from_date = report_from_date;
		this.report_to_date = report_to_date;
		this.entity_flg = entity_flg;
		this.modify_flg = modify_flg;
		this.del_flg = del_flg;
		this.report_code = report_code;
		this.report_submit_date = report_submit_date;
	}
	
		
	

}
