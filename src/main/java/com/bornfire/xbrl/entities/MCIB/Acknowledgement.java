package com.bornfire.xbrl.entities.MCIB;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "ACK")
@XmlType(propOrder = { "group", "submittedBy", "submissionDate", "loadDate" ,"noOfRecords","validRecords","log"})
public class Acknowledgement {
	
	private String fileName;
	private String loadFlag;
	private String group;
	private String submittedBy;
	private Date submissionDate;
	private Date loadDate;
	private String noOfRecords;
	private String validRecords;
	private List<Log> log;
	
	
	
	public String getFileName() {
		return fileName;
	}


	@XmlAttribute(name="file_name")
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}



	public String getLoadFlag() {
		return loadFlag;
	}


	@XmlAttribute(name="load_flag")
	public void setLoadFlag(String loadFlag) {
		this.loadFlag = loadFlag;
	}


	
	public String getGroup() {
		return group;
	}


	@XmlElement(name = "GROUP")
	public void setGroup(String group) {
		this.group = group;
	}



	public String getSubmittedBy() {
		return submittedBy;
	}


	@XmlElement(name = "SUBMITTED_BY")
	public void setSubmittedBy(String submittedBy) {
		this.submittedBy = submittedBy;
	}



	public Date getSubmissionDate() {
		return submissionDate;
	}

	@XmlJavaTypeAdapter(DateAdapter.class)
	@XmlElement(name = "SUBMISSION_DATE")
	public void setSubmissionDate(Date submissionDate) {
		this.submissionDate = submissionDate;
	}



	public Date getLoadDate() {
		return loadDate;
	}


	@XmlJavaTypeAdapter(DateAdapter.class)
	@XmlElement(name = "LOAD_DATE")
	public void setLoadDate(Date loadDate) {
		this.loadDate = loadDate;
	}



	public String getNoOfRecords() {
		return noOfRecords;
	}


	@XmlElement(name = "NO_OF_RECORDS")
	public void setNoOfRecords(String noOfRecords) {
		this.noOfRecords = noOfRecords;
	}



	public String getValidRecords() {
		return validRecords;
	}


	@XmlElement(name = "VALID_RECORDS")
	public void setValidRecords(String validRecords) {
		this.validRecords = validRecords;
	}





	public List<Log> getLog() {
		return log;
	}

	@XmlElement(name = "LOG")
	public void setLog(List<Log> log) {
		this.log = log;
	}





	public Acknowledgement(String fileName, String loadFlag, String group, String submittedBy, Date submissionDate,
			Date loadDate, String noOfRecords, String validRecords, List<Log> log) {
		super();
		this.fileName = fileName;
		this.loadFlag = loadFlag;
		this.group = group;
		this.submittedBy = submittedBy;
		this.submissionDate = submissionDate;
		this.loadDate = loadDate;
		this.noOfRecords = noOfRecords;
		this.validRecords = validRecords;
		this.log = log;
	}


	public Acknowledgement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
