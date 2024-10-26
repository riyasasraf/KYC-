package com.bornfire.xbrl.entities.MCIB;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MCIB_UNIQUE_ID_REF_TB")
public class MCIBAcknowledgement {

	private String record_no;
	private String entity_code;
	private String entity_type;
	private String passport_no;
	private String country_code;
	private String ref_no;
	@Id
	private String unique_ref_id;
	private Date lchg_time;
	private String lchg_user;
	public String getRecord_no() {
		return record_no;
	}
	public void setRecord_no(String record_no) {
		this.record_no = record_no;
	}
	public String getEntity_code() {
		return entity_code;
	}
	public void setEntity_code(String entity_code) {
		this.entity_code = entity_code;
	}
	public String getEntity_type() {
		return entity_type;
	}
	public void setEntity_type(String entity_type) {
		this.entity_type = entity_type;
	}
	public String getPassport_no() {
		return passport_no;
	}
	public void setPassport_no(String passport_no) {
		this.passport_no = passport_no;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getRef_no() {
		return ref_no;
	}
	public void setRef_no(String ref_no) {
		this.ref_no = ref_no;
	}
	public String getUnique_ref_id() {
		return unique_ref_id;
	}
	public void setUnique_ref_id(String unique_ref_id) {
		this.unique_ref_id = unique_ref_id;
	}
	public Date getLchg_time() {
		return lchg_time;
	}
	public void setLchg_time(Date lchg_time) {
		this.lchg_time = lchg_time;
	}
	public String getLchg_user() {
		return lchg_user;
	}
	public void setLchg_user(String lchg_user) {
		this.lchg_user = lchg_user;
	}
	public MCIBAcknowledgement(String record_no, String entity_code, String entity_type, String passport_no,
			String country_code, String ref_no, String unique_ref_id, Date lchg_time, String lchg_user) {
		super();
		this.record_no = record_no;
		this.entity_code = entity_code;
		this.entity_type = entity_type;
		this.passport_no = passport_no;
		this.country_code = country_code;
		this.ref_no = ref_no;
		this.unique_ref_id = unique_ref_id;
		this.lchg_time = lchg_time;
		this.lchg_user = lchg_user;
	}
	public MCIBAcknowledgement() {
		super();
		// TODO Auto-generated constructor stub
	}


	public MCIBAcknowledgement(Log lg) {
		this.record_no = lg.getRecordNo();
		this.entity_code = lg.getEntityCode();
		this.entity_type = lg.getEntityType();
		this.passport_no = lg.getPassportNo();
		this.country_code = lg.getCountryCode();
		this.ref_no = lg.getRefNo();
		this.unique_ref_id = lg.getUniqueRefId();
		
	}

}
