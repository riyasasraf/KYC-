package com.bornfire.xbrl.entities.MCIB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "DETAILS")
@XmlType(propOrder = { "msgDesc", "coName"})
public class Details {
	
	private String msgDesc;
	private String coName;
	public String getMsgDesc() {
		return msgDesc;
	}
	@XmlElement(name = "MSG_DESC")
	public void setMsgDesc(String msgDesc) {
		this.msgDesc = msgDesc;
	}
	public String getCoName() {
		return coName;
	}
	@XmlElement(name = "CO_NAME")
	public void setCoName(String coName) {
		this.coName = coName;
	}
	public Details(String msgDesc, String coName) {
		super();
		this.msgDesc = msgDesc;
		this.coName = coName;
	}
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
