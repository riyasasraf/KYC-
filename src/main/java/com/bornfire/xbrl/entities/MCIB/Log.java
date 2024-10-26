package com.bornfire.xbrl.entities.MCIB;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "LOG")
@XmlType(propOrder = { "entityCode", "entityType", "passportNo", "countryCode" ,"refNo","uniqueRefId","details"})
public class Log {

	
	private String recordNo;
	private String entityCode;
	private String entityType;
	private String passportNo;
	private String countryCode;
	private String refNo;
	private String uniqueRefId;
	private Details details;
	public String getRecordNo() {
		return recordNo;
	}
	@XmlAttribute(name="record_no")
	public void setRecordNo(String recordNo) {
		this.recordNo = recordNo;
	}
	public String getEntityCode() {
		return entityCode;
	}
	@XmlElement(name = "ENTITY_CODE")
	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}
	public String getEntityType() {
		return entityType;
	}
	@XmlElement(name = "ENTITY_TYPE")
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	public String getPassportNo() {
		return passportNo;
	}
	@XmlElement(name = "PASSPORT_NO")
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public String getCountryCode() {
		return countryCode;
	}
	@XmlElement(name = "COUNTRY_CODE")
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	public String getRefNo() {
		return refNo;
	}
	@XmlElement(name = "REF_NO")
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public String getUniqueRefId() {
		return uniqueRefId;
	}
	@XmlElement(name = "UNIQUE_REF_ID")
	public void setUniqueRefId(String uniqueRefId) {
		this.uniqueRefId = uniqueRefId;
	}
	public Details getDetails() {
		return details;
	}
	@XmlElement(name = "DETAILS")
	public void setDetails(Details details) {
		this.details = details;
	}
	public Log(String recordNo, String entityCode, String entityType, String passportNo, String countryCode,
			String refNo, String uniqueRefId, Details details) {
		super();
		this.recordNo = recordNo;
		this.entityCode = entityCode;
		this.entityType = entityType;
		this.passportNo = passportNo;
		this.countryCode = countryCode;
		this.refNo = refNo;
		this.uniqueRefId = uniqueRefId;
		this.details = details;
	}
	public Log() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
