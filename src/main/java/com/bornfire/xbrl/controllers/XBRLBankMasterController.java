package com.bornfire.xbrl.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bornfire.xbrl.entities.BankMaster;
import com.bornfire.xbrl.entities.LOAN_ELIGIBILITY_PARAMETER_ENTITY;

import com.bornfire.xbrl.services.BankServices;



@Controller
public class XBRLBankMasterController {

	
	@Autowired
	BankServices bankmasterRepServices;

	@RequestMapping(value = "bankmasteredit", method = RequestMethod.POST)
	@ResponseBody
	public String bankmasteredit(@ModelAttribute("singledetail") BankMaster detail,  HttpServletRequest hs) {
		String userid = (String) hs.getSession().getAttribute("USERID");
		return bankmasterRepServices.detailChanges(detail, 'E', userid);
		
	}
	
	
	
	@RequestMapping(value = "bankmasteradd", method = RequestMethod.POST)
	@ResponseBody
	public String bankmasterAdd(@ModelAttribute("singledetail") BankMaster detail,  HttpServletRequest hs) {
		String userid = (String) hs.getSession().getAttribute("USERID");
		return bankmasterRepServices.detailChanges(detail, 'A',userid);
		
	}
	
	
	@RequestMapping(value = "bankmasterdelete", method = RequestMethod.POST)
	@ResponseBody
	public String bankmasterDelete(@ModelAttribute("singledetail") BankMaster detail,  HttpServletRequest hs) {
		String userid = (String) hs.getSession().getAttribute("USERID");
		return bankmasterRepServices.detailChanges(detail, 'D',userid);
		
	}
	
	@RequestMapping(value = "loanparameteredit", method = RequestMethod.POST)
	@ResponseBody
	public String loanparameteredit(@ModelAttribute("singledetail") LOAN_ELIGIBILITY_PARAMETER_ENTITY detail,  HttpServletRequest hs) {
		String userid = (String) hs.getSession().getAttribute("USERID");
		return bankmasterRepServices.loanparameterdetailChanges(detail, 'E', userid);
		
	}
	
	
	
	@RequestMapping(value = "loanparameteradd", method = RequestMethod.POST)
	@ResponseBody
	public String loanparameterAdd(@ModelAttribute("singledetail") LOAN_ELIGIBILITY_PARAMETER_ENTITY detail,  HttpServletRequest hs) {
		String userid = (String) hs.getSession().getAttribute("USERID");
		return bankmasterRepServices.loanparameterdetailChanges(detail, 'A',userid);
		
	}
	
	
	@RequestMapping(value = "loanparameterdelete", method = RequestMethod.POST)
	@ResponseBody
	public String loanparameterDelete(@ModelAttribute("singledetail") LOAN_ELIGIBILITY_PARAMETER_ENTITY detail,  HttpServletRequest hs) {
		String userid = (String) hs.getSession().getAttribute("USERID");
		return bankmasterRepServices.loanparameterdetailChanges(detail, 'D',userid);
		
	}
}
