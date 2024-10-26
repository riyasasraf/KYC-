package com.bornfire.xbrl.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LOAN_ELIGIBILITY_PARAMETER")
public class LOAN_ELIGIBILITY_PARAMETER_ENTITY {
	
	@Id
	private String	product_code;
	private String	product_desc;
	private BigDecimal	minimum_loan;
	private BigDecimal	maximum_loan;
	private BigDecimal	income_range;
	private BigDecimal	monthly_expenses;
	private String	purpose;
	private String	eligible_category;
	private BigDecimal	age_limit;
	private BigDecimal	credit_score;
	private BigDecimal	interest_range;
	private String	property_type;
	private BigDecimal	emi_tenure;
	private String	conditions;
	private String	special_conditions;
	private String	eligibility_criteria;
	private String	entity_flg;
	private String	del_flg;
	private String	modify_flg;
	private String	entry_user;
	private String	modify_user;
	private String	verify_user;
	private Date	entry_time;
	private Date	modify_time;
	private Date	verify_time;
	private String	qtr_flg;
	public String getProduct_code() {
		return product_code;
	}
	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}
	public String getProduct_desc() {
		return product_desc;
	}
	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}
	public BigDecimal getMinimum_loan() {
		return minimum_loan;
	}
	public void setMinimum_loan(BigDecimal minimum_loan) {
		this.minimum_loan = minimum_loan;
	}
	public BigDecimal getMaximum_loan() {
		return maximum_loan;
	}
	public void setMaximum_loan(BigDecimal maximum_loan) {
		this.maximum_loan = maximum_loan;
	}
	public BigDecimal getIncome_range() {
		return income_range;
	}
	public void setIncome_range(BigDecimal income_range) {
		this.income_range = income_range;
	}
	public BigDecimal getMonthly_expenses() {
		return monthly_expenses;
	}
	public void setMonthly_expenses(BigDecimal monthly_expenses) {
		this.monthly_expenses = monthly_expenses;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getEligible_category() {
		return eligible_category;
	}
	public void setEligible_category(String eligible_category) {
		this.eligible_category = eligible_category;
	}
	public BigDecimal getAge_limit() {
		return age_limit;
	}
	public void setAge_limit(BigDecimal age_limit) {
		this.age_limit = age_limit;
	}
	public BigDecimal getCredit_score() {
		return credit_score;
	}
	public void setCredit_score(BigDecimal credit_score) {
		this.credit_score = credit_score;
	}
	public BigDecimal getInterest_range() {
		return interest_range;
	}
	public void setInterest_range(BigDecimal interest_range) {
		this.interest_range = interest_range;
	}
	public String getProperty_type() {
		return property_type;
	}
	public void setProperty_type(String property_type) {
		this.property_type = property_type;
	}
	public BigDecimal getEmi_tenure() {
		return emi_tenure;
	}
	public void setEmi_tenure(BigDecimal emi_tenure) {
		this.emi_tenure = emi_tenure;
	}
	public String getConditions() {
		return conditions;
	}
	public void setConditions(String conditions) {
		this.conditions = conditions;
	}
	public String getSpecial_conditions() {
		return special_conditions;
	}
	public void setSpecial_conditions(String special_conditions) {
		this.special_conditions = special_conditions;
	}
	public String getEligibility_criteria() {
		return eligibility_criteria;
	}
	public void setEligibility_criteria(String eligibility_criteria) {
		this.eligibility_criteria = eligibility_criteria;
	}
	public String getEntity_flg() {
		return entity_flg;
	}
	public void setEntity_flg(String entity_flg) {
		this.entity_flg = entity_flg;
	}
	public String getDel_flg() {
		return del_flg;
	}
	public void setDel_flg(String del_flg) {
		this.del_flg = del_flg;
	}
	public String getModify_flg() {
		return modify_flg;
	}
	public void setModify_flg(String modify_flg) {
		this.modify_flg = modify_flg;
	}
	public String getEntry_user() {
		return entry_user;
	}
	public void setEntry_user(String entry_user) {
		this.entry_user = entry_user;
	}
	public String getModify_user() {
		return modify_user;
	}
	public void setModify_user(String modify_user) {
		this.modify_user = modify_user;
	}
	public String getVerify_user() {
		return verify_user;
	}
	public void setVerify_user(String verify_user) {
		this.verify_user = verify_user;
	}
	public Date getEntry_time() {
		return entry_time;
	}
	public void setEntry_time(Date entry_time) {
		this.entry_time = entry_time;
	}
	public Date getModify_time() {
		return modify_time;
	}
	public void setModify_time(Date modify_time) {
		this.modify_time = modify_time;
	}
	public Date getVerify_time() {
		return verify_time;
	}
	public void setVerify_time(Date verify_time) {
		this.verify_time = verify_time;
	}
	public String getQtr_flg() {
		return qtr_flg;
	}
	public void setQtr_flg(String qtr_flg) {
		this.qtr_flg = qtr_flg;
	}
	public LOAN_ELIGIBILITY_PARAMETER_ENTITY(String product_code, String product_desc, BigDecimal minimum_loan,
			BigDecimal maximum_loan, BigDecimal income_range, BigDecimal monthly_expenses, String purpose,
			String eligible_category, BigDecimal age_limit, BigDecimal credit_score, BigDecimal interest_range,
			String property_type, BigDecimal emi_tenure, String conditions, String special_conditions,
			String eligibility_criteria, String entity_flg, String del_flg, String modify_flg, String entry_user,
			String modify_user, String verify_user, Date entry_time, Date modify_time, Date verify_time,
			String qtr_flg) {
		super();
		this.product_code = product_code;
		this.product_desc = product_desc;
		this.minimum_loan = minimum_loan;
		this.maximum_loan = maximum_loan;
		this.income_range = income_range;
		this.monthly_expenses = monthly_expenses;
		this.purpose = purpose;
		this.eligible_category = eligible_category;
		this.age_limit = age_limit;
		this.credit_score = credit_score;
		this.interest_range = interest_range;
		this.property_type = property_type;
		this.emi_tenure = emi_tenure;
		this.conditions = conditions;
		this.special_conditions = special_conditions;
		this.eligibility_criteria = eligibility_criteria;
		this.entity_flg = entity_flg;
		this.del_flg = del_flg;
		this.modify_flg = modify_flg;
		this.entry_user = entry_user;
		this.modify_user = modify_user;
		this.verify_user = verify_user;
		this.entry_time = entry_time;
		this.modify_time = modify_time;
		this.verify_time = verify_time;
		this.qtr_flg = qtr_flg;
	}
	public LOAN_ELIGIBILITY_PARAMETER_ENTITY() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
