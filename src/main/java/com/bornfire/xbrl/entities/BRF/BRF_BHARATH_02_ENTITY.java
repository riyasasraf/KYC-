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
@Table(name="BRF_BHARATH_02")
public class BRF_BHARATH_02_ENTITY {

	private String	r1_product;
	private BigDecimal	r1_res_aed_accts;
	private BigDecimal	r1_res_aed_amt;
	private BigDecimal	r1_res_fcy_accts;
	private BigDecimal	r1_res_fcy_amt;
	private BigDecimal	r1_nonres_aed_accts;
	private BigDecimal	r1_nonres_aed_amt;
	private BigDecimal	r1_nonres_fcy_accts;
	private BigDecimal	r1_nonres_fcy_amt;
	private BigDecimal	r1_totalamt;
	private String	r2_product;
	private BigDecimal	r2_res_aed_accts;
	private BigDecimal	r2_res_aed_amt;
	private BigDecimal	r2_res_fcy_accts;
	private BigDecimal	r2_res_fcy_amt;
	private BigDecimal	r2_nonres_aed_accts;
	private BigDecimal	r2_nonres_aed_amt;
	private BigDecimal	r2_nonres_fcy_accts;
	private BigDecimal	r2_nonres_fcy_amt;
	private BigDecimal	r2_totalamt;
	
	private String	r3_product;
	private BigDecimal	r3_res_aed_accts;
	private BigDecimal	r3_res_aed_amt;
	private BigDecimal	r3_res_fcy_accts;
	private BigDecimal	r3_res_fcy_amt;
	private BigDecimal	r3_nonres_aed_accts;
	private BigDecimal	r3_nonres_aed_amt;
	private BigDecimal	r3_nonres_fcy_accts;
	private BigDecimal	r3_nonres_fcy_amt;
	private BigDecimal	r3_totalamt;
	
	private String	r4_product;
	private BigDecimal	r4_res_aed_accts;
	private BigDecimal	r4_res_aed_amt;
	private BigDecimal	r4_res_fcy_accts;
	private BigDecimal	r4_res_fcy_amt;
	private BigDecimal	r4_nonres_aed_accts;
	private BigDecimal	r4_nonres_aed_amt;
	private BigDecimal	r4_nonres_fcy_accts;
	private BigDecimal	r4_nonres_fcy_amt;
	private BigDecimal	r4_totalamt;
	
	private String	r5_product;
	private BigDecimal	r5_res_aed_accts;
	private BigDecimal	r5_res_aed_amt;
	private BigDecimal	r5_res_fcy_accts;
	private BigDecimal	r5_res_fcy_amt;
	private BigDecimal	r5_nonres_aed_accts;
	private BigDecimal	r5_nonres_aed_amt;
	private BigDecimal	r5_nonres_fcy_accts;
	private BigDecimal	r5_nonres_fcy_amt;
	private BigDecimal	r5_totalamt;
	
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
	
	
	public String getR1_product() {
		return r1_product;
	}
	public void setR1_product(String r1_product) {
		this.r1_product = r1_product;
	}
	public BigDecimal getR1_res_aed_accts() {
		return r1_res_aed_accts;
	}
	public void setR1_res_aed_accts(BigDecimal r1_res_aed_accts) {
		this.r1_res_aed_accts = r1_res_aed_accts;
	}
	public BigDecimal getR1_res_aed_amt() {
		return r1_res_aed_amt;
	}
	public void setR1_res_aed_amt(BigDecimal r1_res_aed_amt) {
		this.r1_res_aed_amt = r1_res_aed_amt;
	}
	public BigDecimal getR1_res_fcy_accts() {
		return r1_res_fcy_accts;
	}
	public void setR1_res_fcy_accts(BigDecimal r1_res_fcy_accts) {
		this.r1_res_fcy_accts = r1_res_fcy_accts;
	}
	public BigDecimal getR1_res_fcy_amt() {
		return r1_res_fcy_amt;
	}
	public void setR1_res_fcy_amt(BigDecimal r1_res_fcy_amt) {
		this.r1_res_fcy_amt = r1_res_fcy_amt;
	}
	public BigDecimal getR1_nonres_aed_accts() {
		return r1_nonres_aed_accts;
	}
	public void setR1_nonres_aed_accts(BigDecimal r1_nonres_aed_accts) {
		this.r1_nonres_aed_accts = r1_nonres_aed_accts;
	}
	public BigDecimal getR1_nonres_aed_amt() {
		return r1_nonres_aed_amt;
	}
	public void setR1_nonres_aed_amt(BigDecimal r1_nonres_aed_amt) {
		this.r1_nonres_aed_amt = r1_nonres_aed_amt;
	}
	public BigDecimal getR1_nonres_fcy_accts() {
		return r1_nonres_fcy_accts;
	}
	public void setR1_nonres_fcy_accts(BigDecimal r1_nonres_fcy_accts) {
		this.r1_nonres_fcy_accts = r1_nonres_fcy_accts;
	}
	public BigDecimal getR1_nonres_fcy_amt() {
		return r1_nonres_fcy_amt;
	}
	public void setR1_nonres_fcy_amt(BigDecimal r1_nonres_fcy_amt) {
		this.r1_nonres_fcy_amt = r1_nonres_fcy_amt;
	}
	public BigDecimal getR1_totalamt() {
		return r1_totalamt;
	}
	public void setR1_totalamt(BigDecimal r1_totalamt) {
		this.r1_totalamt = r1_totalamt;
	}
	public String getR2_product() {
		return r2_product;
	}
	public void setR2_product(String r2_product) {
		this.r2_product = r2_product;
	}
	public BigDecimal getR2_res_aed_accts() {
		return r2_res_aed_accts;
	}
	public void setR2_res_aed_accts(BigDecimal r2_res_aed_accts) {
		this.r2_res_aed_accts = r2_res_aed_accts;
	}
	public BigDecimal getR2_res_aed_amt() {
		return r2_res_aed_amt;
	}
	public void setR2_res_aed_amt(BigDecimal r2_res_aed_amt) {
		this.r2_res_aed_amt = r2_res_aed_amt;
	}
	public BigDecimal getR2_res_fcy_accts() {
		return r2_res_fcy_accts;
	}
	public void setR2_res_fcy_accts(BigDecimal r2_res_fcy_accts) {
		this.r2_res_fcy_accts = r2_res_fcy_accts;
	}
	public BigDecimal getR2_res_fcy_amt() {
		return r2_res_fcy_amt;
	}
	public void setR2_res_fcy_amt(BigDecimal r2_res_fcy_amt) {
		this.r2_res_fcy_amt = r2_res_fcy_amt;
	}
	public BigDecimal getR2_nonres_aed_accts() {
		return r2_nonres_aed_accts;
	}
	public void setR2_nonres_aed_accts(BigDecimal r2_nonres_aed_accts) {
		this.r2_nonres_aed_accts = r2_nonres_aed_accts;
	}
	public BigDecimal getR2_nonres_aed_amt() {
		return r2_nonres_aed_amt;
	}
	public void setR2_nonres_aed_amt(BigDecimal r2_nonres_aed_amt) {
		this.r2_nonres_aed_amt = r2_nonres_aed_amt;
	}
	public BigDecimal getR2_nonres_fcy_accts() {
		return r2_nonres_fcy_accts;
	}
	public void setR2_nonres_fcy_accts(BigDecimal r2_nonres_fcy_accts) {
		this.r2_nonres_fcy_accts = r2_nonres_fcy_accts;
	}
	public BigDecimal getR2_nonres_fcy_amt() {
		return r2_nonres_fcy_amt;
	}
	public void setR2_nonres_fcy_amt(BigDecimal r2_nonres_fcy_amt) {
		this.r2_nonres_fcy_amt = r2_nonres_fcy_amt;
	}
	public BigDecimal getR2_totalamt() {
		return r2_totalamt;
	}
	public void setR2_totalamt(BigDecimal r2_totalamt) {
		this.r2_totalamt = r2_totalamt;
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
	public String getR3_product() {
		return r3_product;
	}
	public void setR3_product(String r3_product) {
		this.r3_product = r3_product;
	}
	public BigDecimal getR3_res_aed_accts() {
		return r3_res_aed_accts;
	}
	public void setR3_res_aed_accts(BigDecimal r3_res_aed_accts) {
		this.r3_res_aed_accts = r3_res_aed_accts;
	}
	public BigDecimal getR3_res_aed_amt() {
		return r3_res_aed_amt;
	}
	public void setR3_res_aed_amt(BigDecimal r3_res_aed_amt) {
		this.r3_res_aed_amt = r3_res_aed_amt;
	}
	public BigDecimal getR3_res_fcy_accts() {
		return r3_res_fcy_accts;
	}
	public void setR3_res_fcy_accts(BigDecimal r3_res_fcy_accts) {
		this.r3_res_fcy_accts = r3_res_fcy_accts;
	}
	public BigDecimal getR3_res_fcy_amt() {
		return r3_res_fcy_amt;
	}
	public void setR3_res_fcy_amt(BigDecimal r3_res_fcy_amt) {
		this.r3_res_fcy_amt = r3_res_fcy_amt;
	}
	public BigDecimal getR3_nonres_aed_accts() {
		return r3_nonres_aed_accts;
	}
	public void setR3_nonres_aed_accts(BigDecimal r3_nonres_aed_accts) {
		this.r3_nonres_aed_accts = r3_nonres_aed_accts;
	}
	public BigDecimal getR3_nonres_aed_amt() {
		return r3_nonres_aed_amt;
	}
	public void setR3_nonres_aed_amt(BigDecimal r3_nonres_aed_amt) {
		this.r3_nonres_aed_amt = r3_nonres_aed_amt;
	}
	public BigDecimal getR3_nonres_fcy_accts() {
		return r3_nonres_fcy_accts;
	}
	public void setR3_nonres_fcy_accts(BigDecimal r3_nonres_fcy_accts) {
		this.r3_nonres_fcy_accts = r3_nonres_fcy_accts;
	}
	public BigDecimal getR3_nonres_fcy_amt() {
		return r3_nonres_fcy_amt;
	}
	public void setR3_nonres_fcy_amt(BigDecimal r3_nonres_fcy_amt) {
		this.r3_nonres_fcy_amt = r3_nonres_fcy_amt;
	}
	public BigDecimal getR3_totalamt() {
		return r3_totalamt;
	}
	public void setR3_totalamt(BigDecimal r3_totalamt) {
		this.r3_totalamt = r3_totalamt;
	}
	

	/*
	 * public BRF_BHARATH_02_ENTITY(String r1_product, BigDecimal r1_res_aed_accts,
	 * BigDecimal r1_res_aed_amt, BigDecimal r1_res_fcy_accts, BigDecimal
	 * r1_res_fcy_amt, BigDecimal r1_nonres_aed_accts, BigDecimal r1_nonres_aed_amt,
	 * BigDecimal r1_nonres_fcy_accts, BigDecimal r1_nonres_fcy_amt, BigDecimal
	 * r1_totalamt, String r2_product, BigDecimal r2_res_aed_accts, BigDecimal
	 * r2_res_aed_amt, BigDecimal r2_res_fcy_accts, BigDecimal r2_res_fcy_amt,
	 * BigDecimal r2_nonres_aed_accts, BigDecimal r2_nonres_aed_amt, BigDecimal
	 * r2_nonres_fcy_accts, BigDecimal r2_nonres_fcy_amt, BigDecimal r2_totalamt,
	 * Date report_date, Date report_from_date, Date report_to_date, String
	 * entity_flg, String modify_flg, String del_flg, String report_code, Date
	 * report_submit_date) { super(); this.r1_product = r1_product;
	 * this.r1_res_aed_accts = r1_res_aed_accts; this.r1_res_aed_amt =
	 * r1_res_aed_amt; this.r1_res_fcy_accts = r1_res_fcy_accts; this.r1_res_fcy_amt
	 * = r1_res_fcy_amt; this.r1_nonres_aed_accts = r1_nonres_aed_accts;
	 * this.r1_nonres_aed_amt = r1_nonres_aed_amt; this.r1_nonres_fcy_accts =
	 * r1_nonres_fcy_accts; this.r1_nonres_fcy_amt = r1_nonres_fcy_amt;
	 * this.r1_totalamt = r1_totalamt; this.r2_product = r2_product;
	 * this.r2_res_aed_accts = r2_res_aed_accts; this.r2_res_aed_amt =
	 * r2_res_aed_amt; this.r2_res_fcy_accts = r2_res_fcy_accts; this.r2_res_fcy_amt
	 * = r2_res_fcy_amt; this.r2_nonres_aed_accts = r2_nonres_aed_accts;
	 * this.r2_nonres_aed_amt = r2_nonres_aed_amt; this.r2_nonres_fcy_accts =
	 * r2_nonres_fcy_accts; this.r2_nonres_fcy_amt = r2_nonres_fcy_amt;
	 * this.r2_totalamt = r2_totalamt; this.report_date = report_date;
	 * this.report_from_date = report_from_date; this.report_to_date =
	 * report_to_date; this.entity_flg = entity_flg; this.modify_flg = modify_flg;
	 * this.del_flg = del_flg; this.report_code = report_code;
	 * this.report_submit_date = report_submit_date; }
	 */
	
	
	
	public String getR4_product() {
		return r4_product;
	}
	public void setR4_product(String r4_product) {
		this.r4_product = r4_product;
	}
	public BigDecimal getR4_res_aed_accts() {
		return r4_res_aed_accts;
	}
	public void setR4_res_aed_accts(BigDecimal r4_res_aed_accts) {
		this.r4_res_aed_accts = r4_res_aed_accts;
	}
	public BigDecimal getR4_res_aed_amt() {
		return r4_res_aed_amt;
	}
	public void setR4_res_aed_amt(BigDecimal r4_res_aed_amt) {
		this.r4_res_aed_amt = r4_res_aed_amt;
	}
	public BigDecimal getR4_res_fcy_accts() {
		return r4_res_fcy_accts;
	}
	public void setR4_res_fcy_accts(BigDecimal r4_res_fcy_accts) {
		this.r4_res_fcy_accts = r4_res_fcy_accts;
	}
	public BigDecimal getR4_res_fcy_amt() {
		return r4_res_fcy_amt;
	}
	public void setR4_res_fcy_amt(BigDecimal r4_res_fcy_amt) {
		this.r4_res_fcy_amt = r4_res_fcy_amt;
	}
	public BigDecimal getR4_nonres_aed_accts() {
		return r4_nonres_aed_accts;
	}
	public void setR4_nonres_aed_accts(BigDecimal r4_nonres_aed_accts) {
		this.r4_nonres_aed_accts = r4_nonres_aed_accts;
	}
	public BigDecimal getR4_nonres_aed_amt() {
		return r4_nonres_aed_amt;
	}
	public void setR4_nonres_aed_amt(BigDecimal r4_nonres_aed_amt) {
		this.r4_nonres_aed_amt = r4_nonres_aed_amt;
	}
	public BigDecimal getR4_nonres_fcy_accts() {
		return r4_nonres_fcy_accts;
	}
	public void setR4_nonres_fcy_accts(BigDecimal r4_nonres_fcy_accts) {
		this.r4_nonres_fcy_accts = r4_nonres_fcy_accts;
	}
	public BigDecimal getR4_nonres_fcy_amt() {
		return r4_nonres_fcy_amt;
	}
	public void setR4_nonres_fcy_amt(BigDecimal r4_nonres_fcy_amt) {
		this.r4_nonres_fcy_amt = r4_nonres_fcy_amt;
	}
	public BigDecimal getR4_totalamt() {
		return r4_totalamt;
	}
	public void setR4_totalamt(BigDecimal r4_totalamt) {
		this.r4_totalamt = r4_totalamt;
	}
	public String getR5_product() {
		return r5_product;
	}
	public void setR5_product(String r5_product) {
		this.r5_product = r5_product;
	}
	public BigDecimal getR5_res_aed_accts() {
		return r5_res_aed_accts;
	}
	public void setR5_res_aed_accts(BigDecimal r5_res_aed_accts) {
		this.r5_res_aed_accts = r5_res_aed_accts;
	}
	public BigDecimal getR5_res_aed_amt() {
		return r5_res_aed_amt;
	}
	public void setR5_res_aed_amt(BigDecimal r5_res_aed_amt) {
		this.r5_res_aed_amt = r5_res_aed_amt;
	}
	public BigDecimal getR5_res_fcy_accts() {
		return r5_res_fcy_accts;
	}
	public void setR5_res_fcy_accts(BigDecimal r5_res_fcy_accts) {
		this.r5_res_fcy_accts = r5_res_fcy_accts;
	}
	public BigDecimal getR5_res_fcy_amt() {
		return r5_res_fcy_amt;
	}
	public void setR5_res_fcy_amt(BigDecimal r5_res_fcy_amt) {
		this.r5_res_fcy_amt = r5_res_fcy_amt;
	}
	public BigDecimal getR5_nonres_aed_accts() {
		return r5_nonres_aed_accts;
	}
	public void setR5_nonres_aed_accts(BigDecimal r5_nonres_aed_accts) {
		this.r5_nonres_aed_accts = r5_nonres_aed_accts;
	}
	public BigDecimal getR5_nonres_aed_amt() {
		return r5_nonres_aed_amt;
	}
	public void setR5_nonres_aed_amt(BigDecimal r5_nonres_aed_amt) {
		this.r5_nonres_aed_amt = r5_nonres_aed_amt;
	}
	public BigDecimal getR5_nonres_fcy_accts() {
		return r5_nonres_fcy_accts;
	}
	public void setR5_nonres_fcy_accts(BigDecimal r5_nonres_fcy_accts) {
		this.r5_nonres_fcy_accts = r5_nonres_fcy_accts;
	}
	public BigDecimal getR5_nonres_fcy_amt() {
		return r5_nonres_fcy_amt;
	}
	public void setR5_nonres_fcy_amt(BigDecimal r5_nonres_fcy_amt) {
		this.r5_nonres_fcy_amt = r5_nonres_fcy_amt;
	}
	public BigDecimal getR5_totalamt() {
		return r5_totalamt;
	}
	public void setR5_totalamt(BigDecimal r5_totalamt) {
		this.r5_totalamt = r5_totalamt;
	}
	
	public BRF_BHARATH_02_ENTITY(String r1_product, BigDecimal r1_res_aed_accts, BigDecimal r1_res_aed_amt,
			BigDecimal r1_res_fcy_accts, BigDecimal r1_res_fcy_amt, BigDecimal r1_nonres_aed_accts,
			BigDecimal r1_nonres_aed_amt, BigDecimal r1_nonres_fcy_accts, BigDecimal r1_nonres_fcy_amt,
			BigDecimal r1_totalamt, String r2_product, BigDecimal r2_res_aed_accts, BigDecimal r2_res_aed_amt,
			BigDecimal r2_res_fcy_accts, BigDecimal r2_res_fcy_amt, BigDecimal r2_nonres_aed_accts,
			BigDecimal r2_nonres_aed_amt, BigDecimal r2_nonres_fcy_accts, BigDecimal r2_nonres_fcy_amt,
			BigDecimal r2_totalamt, String r3_product, BigDecimal r3_res_aed_accts, BigDecimal r3_res_aed_amt,
			BigDecimal r3_res_fcy_accts, BigDecimal r3_res_fcy_amt, BigDecimal r3_nonres_aed_accts,
			BigDecimal r3_nonres_aed_amt, BigDecimal r3_nonres_fcy_accts, BigDecimal r3_nonres_fcy_amt,
			BigDecimal r3_totalamt, String r4_product, BigDecimal r4_res_aed_accts, BigDecimal r4_res_aed_amt,
			BigDecimal r4_res_fcy_accts, BigDecimal r4_res_fcy_amt, BigDecimal r4_nonres_aed_accts,
			BigDecimal r4_nonres_aed_amt, BigDecimal r4_nonres_fcy_accts, BigDecimal r4_nonres_fcy_amt,
			BigDecimal r4_totalamt, String r5_product, BigDecimal r5_res_aed_accts, BigDecimal r5_res_aed_amt,
			BigDecimal r5_res_fcy_accts, BigDecimal r5_res_fcy_amt, BigDecimal r5_nonres_aed_accts,
			BigDecimal r5_nonres_aed_amt, BigDecimal r5_nonres_fcy_accts, BigDecimal r5_nonres_fcy_amt,
			BigDecimal r5_totalamt, Date report_date, Date report_from_date, Date report_to_date, String entity_flg,
			String modify_flg, String del_flg, String report_code, Date report_submit_date) {
		super();
		this.r1_product = r1_product;
		this.r1_res_aed_accts = r1_res_aed_accts;
		this.r1_res_aed_amt = r1_res_aed_amt;
		this.r1_res_fcy_accts = r1_res_fcy_accts;
		this.r1_res_fcy_amt = r1_res_fcy_amt;
		this.r1_nonres_aed_accts = r1_nonres_aed_accts;
		this.r1_nonres_aed_amt = r1_nonres_aed_amt;
		this.r1_nonres_fcy_accts = r1_nonres_fcy_accts;
		this.r1_nonres_fcy_amt = r1_nonres_fcy_amt;
		this.r1_totalamt = r1_totalamt;
		this.r2_product = r2_product;
		this.r2_res_aed_accts = r2_res_aed_accts;
		this.r2_res_aed_amt = r2_res_aed_amt;
		this.r2_res_fcy_accts = r2_res_fcy_accts;
		this.r2_res_fcy_amt = r2_res_fcy_amt;
		this.r2_nonres_aed_accts = r2_nonres_aed_accts;
		this.r2_nonres_aed_amt = r2_nonres_aed_amt;
		this.r2_nonres_fcy_accts = r2_nonres_fcy_accts;
		this.r2_nonres_fcy_amt = r2_nonres_fcy_amt;
		this.r2_totalamt = r2_totalamt;
		this.r3_product = r3_product;
		this.r3_res_aed_accts = r3_res_aed_accts;
		this.r3_res_aed_amt = r3_res_aed_amt;
		this.r3_res_fcy_accts = r3_res_fcy_accts;
		this.r3_res_fcy_amt = r3_res_fcy_amt;
		this.r3_nonres_aed_accts = r3_nonres_aed_accts;
		this.r3_nonres_aed_amt = r3_nonres_aed_amt;
		this.r3_nonres_fcy_accts = r3_nonres_fcy_accts;
		this.r3_nonres_fcy_amt = r3_nonres_fcy_amt;
		this.r3_totalamt = r3_totalamt;
		this.r4_product = r4_product;
		this.r4_res_aed_accts = r4_res_aed_accts;
		this.r4_res_aed_amt = r4_res_aed_amt;
		this.r4_res_fcy_accts = r4_res_fcy_accts;
		this.r4_res_fcy_amt = r4_res_fcy_amt;
		this.r4_nonres_aed_accts = r4_nonres_aed_accts;
		this.r4_nonres_aed_amt = r4_nonres_aed_amt;
		this.r4_nonres_fcy_accts = r4_nonres_fcy_accts;
		this.r4_nonres_fcy_amt = r4_nonres_fcy_amt;
		this.r4_totalamt = r4_totalamt;
		this.r5_product = r5_product;
		this.r5_res_aed_accts = r5_res_aed_accts;
		this.r5_res_aed_amt = r5_res_aed_amt;
		this.r5_res_fcy_accts = r5_res_fcy_accts;
		this.r5_res_fcy_amt = r5_res_fcy_amt;
		this.r5_nonres_aed_accts = r5_nonres_aed_accts;
		this.r5_nonres_aed_amt = r5_nonres_aed_amt;
		this.r5_nonres_fcy_accts = r5_nonres_fcy_accts;
		this.r5_nonres_fcy_amt = r5_nonres_fcy_amt;
		this.r5_totalamt = r5_totalamt;
		this.report_date = report_date;
		this.report_from_date = report_from_date;
		this.report_to_date = report_to_date;
		this.entity_flg = entity_flg;
		this.modify_flg = modify_flg;
		this.del_flg = del_flg;
		this.report_code = report_code;
		this.report_submit_date = report_submit_date;
	}
	public BRF_BHARATH_02_ENTITY() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
