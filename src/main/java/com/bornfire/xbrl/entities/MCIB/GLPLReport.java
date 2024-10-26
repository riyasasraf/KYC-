package com.bornfire.xbrl.entities.MCIB;

import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="MIS_GLPL_MAST_TABLE")
public class GLPLReport {
	
	@EmbeddedId
	GLPLReportId glplReportId;
	BigDecimal sol_9031;
	BigDecimal sol_9032;
	BigDecimal sol_9033;
	BigDecimal sol_9034;
	BigDecimal sol_9035;
	BigDecimal sol_9036;
	BigDecimal sol_9038;
	BigDecimal sol_9456;
	public GLPLReportId getGlplReportId() {
		return glplReportId;
	}
	public void setGlplReportId(GLPLReportId glplReportId) {
		this.glplReportId = glplReportId;
	}
	public BigDecimal getSol_9031() {
		return sol_9031;
	}
	public void setSol_9031(BigDecimal sol_9031) {
		this.sol_9031 = sol_9031;
	}
	public BigDecimal getSol_9032() {
		return sol_9032;
	}
	public void setSol_9032(BigDecimal sol_9032) {
		this.sol_9032 = sol_9032;
	}
	public BigDecimal getSol_9033() {
		return sol_9033;
	}
	public void setSol_9033(BigDecimal sol_9033) {
		this.sol_9033 = sol_9033;
	}
	public BigDecimal getSol_9034() {
		return sol_9034;
	}
	public void setSol_9034(BigDecimal sol_9034) {
		this.sol_9034 = sol_9034;
	}
	public BigDecimal getSol_9035() {
		return sol_9035;
	}
	public void setSol_9035(BigDecimal sol_9035) {
		this.sol_9035 = sol_9035;
	}
	public BigDecimal getSol_9036() {
		return sol_9036;
	}
	public void setSol_9036(BigDecimal sol_9036) {
		this.sol_9036 = sol_9036;
	}
	public BigDecimal getSol_9038() {
		return sol_9038;
	}
	public void setSol_9038(BigDecimal sol_9038) {
		this.sol_9038 = sol_9038;
	}
	public BigDecimal getSol_9456() {
		return sol_9456;
	}
	public void setSol_9456(BigDecimal sol_9456) {
		this.sol_9456 = sol_9456;
	}
	public GLPLReport(GLPLReportId glplReportId, BigDecimal sol_9031, BigDecimal sol_9032, BigDecimal sol_9033,
			BigDecimal sol_9034, BigDecimal sol_9035, BigDecimal sol_9036, BigDecimal sol_9038, BigDecimal sol_9456) {
		super();
		this.glplReportId = glplReportId;
		this.sol_9031 = sol_9031;
		this.sol_9032 = sol_9032;
		this.sol_9033 = sol_9033;
		this.sol_9034 = sol_9034;
		this.sol_9035 = sol_9035;
		this.sol_9036 = sol_9036;
		this.sol_9038 = sol_9038;
		this.sol_9456 = sol_9456;
	}
	public GLPLReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
