package com.bornfire.xbrl.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "KYC_IND")
public class KYC_I {

	@Id
	@Column(name = "CUSTOMER_ID")
	private String customerId;

	@Column(name = "ACCOUNT_TYPE")
	private String accountType;

	@Column(name = "NAME")
	private String name;

	@Column(name = "ACCOUNT_NUMBER")
	private String accountNumber;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "DATE_OF_BIRTH")
	private Date dateOfBirth;

	@Column(name = "PLACE_OF_BIRTH")
	private String placeOfBirth;

	@Column(name = "NATIONALITY")
	private String nationality;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "ACCOUNT_OPENING_DATE")
	private Date accountOpeningDate;

	@Column(name = "COUNTRY_OF_CITIZENSHIP")
	private String countryOfCitizenship;

	@Column(name = "COUNTRY_OF_CURRENT_RESIDENCY")
	private String countryOfCurrentResidency;

	@Column(name = "OCCUPATION")
	private String occupation;

	@Column(name = "BUSINESS_ACTIVITY")
	private String businessActivity;

	@Column(name = "ANNUAL_INCOME")
	private Double annualIncome;

	@Column(name = "SOURCE_OF_FUNDS")
	private String sourceOfFunds;

	@Column(name = "PURPOSE_OF_ACCOUNT_OPENING")
	private String purposeOfAccountOpening;

	@Column(name = "TAX_REGISTRATION")
	private String taxRegistration;

	@Column(name = "TAX_ID_NUMBER")
	private String taxIdNumber;

	@Column(name = "PRIMARY_ADDRESS")
	private String primaryAddress;

	@Column(name = "PRIMARY_ADDRESS_COUNTRY")
	private String primaryAddressCountry;

	@Column(name = "PRIMARY_ADDRESS_CITY")
	private String primaryAddressCity;

	@Column(name = "PRIMARY_ADDRESS_PO_BOX")
	private String primaryAddressPoBox;

	@Column(name = "MOBILE_NUMBER")
	private String mobileNumber;

	@Column(name = "PRIMARY_TELEPHONE")
	private String primaryTelephone;

	@Column(name = "SECONDARY_TELEPHONE")
	private String secondaryTelephone;

	@Column(name = "EMAIL_ID")
	private String emailId;

	@Column(name = "RESIDENTIAL_STATUS_CHANGED")
	private String residentialStatusChanged;

	@Column(name = "NEW_COUNTRY_OF_RESIDENCY")
	private String newCountryOfResidency;

	@Column(name = "NEW_CITY_OF_RESIDENCY")
	private String newCityOfResidency;

	@Column(name = "NEW_PO_BOX_OF_RESIDENCY")
	private String newPoBoxOfResidency;

	@Column(name = "JOINT_HOLDER1_NAME")
	private String jointHolder1Name;

	@Column(name = "JOINT_HOLDER1_ADDRESS")
	private String jointHolder1Address;

	@Column(name = "JOINT_HOLDER1_ADDRESS_COUNTRY")
	private String jointHolder1AddressCountry;

	@Column(name = "JOINT_HOLDER1_ADDRESS_CITY")
	private String jointHolder1AddressCity;

	@Column(name = "JOINT_HOLDER1_ADDRESS_PO_BOX")
	private String jointHolder1AddressPoBox;

	@Column(name = "JOINT_HOLDER1_MOBILE")
	private String jointHolder1Mobile;

	@Column(name = "JOINT_HOLDER1_PRIMARY_TELEPHONE")
	private String jointHolder1PrimaryTelephone;

	@Column(name = "JOINT_HOLDER1_SECONDARY_TELEPHONE")
	private String jointHolder1SecondaryTelephone;

	@Column(name = "JOINT_HOLDER1_EMAIL")
	private String jointHolder1Email;

	@Column(name = "JOINT_HOLDER1_RESIDENTIAL_STATUS_CHANGED")
	private String jointHolder1ResidentialStatusChanged;

	@Column(name = "JOINT_HOLDER1_NEW_COUNTRY_OF_RESIDENCY")
	private String jointHolder1NewCountryOfResidency;

	@Column(name = "JOINT_HOLDER1_NEW_CITY_OF_RESIDENCY")
	private String jointHolder1NewCityOfResidency;

	@Column(name = "JOINT_HOLDER1_NEW_PO_BOX_OF_RESIDENCY")
	private String jointHolder1NewPoBoxOfResidency;

	@Column(name = "JOINT_HOLDER2_NAME")
	private String jointHolder2Name;

	@Column(name = "JOINT_HOLDER2_ADDRESS")
	private String jointHolder2Address;

	@Column(name = "JOINT_HOLDER2_ADDRESS_COUNTRY")
	private String jointHolder2AddressCountry;

	@Column(name = "JOINT_HOLDER2_ADDRESS_CITY")
	private String jointHolder2AddressCity;

	@Column(name = "JOINT_HOLDER2_ADDRESS_PO_BOX")
	private String jointHolder2AddressPoBox;

	@Column(name = "JOINT_HOLDER2_MOBILE")
	private String jointHolder2Mobile;

	@Column(name = "JOINT_HOLDER2_PRIMARY_TELEPHONE")
	private String jointHolder2PrimaryTelephone;

	@Column(name = "JOINT_HOLDER2_SECONDARY_TELEPHONE")
	private String jointHolder2SecondaryTelephone;

	@Column(name = "JOINT_HOLDER2_EMAIL")
	private String jointHolder2Email;

	@Column(name = "JOINT_HOLDER2_RESIDENTIAL_STATUS_CHANGED")
	private String jointHolder2ResidentialStatusChanged;

	@Column(name = "JOINT_HOLDER2_NEW_COUNTRY_OF_RESIDENCY")
	private String jointHolder2NewCountryOfResidency;

	@Column(name = "JOINT_HOLDER2_NEW_CITY_OF_RESIDENCY")
	private String jointHolder2NewCityOfResidency;

	@Column(name = "JOINT_HOLDER2_NEW_PO_BOX_OF_RESIDENCY")
	private String jointHolder2NewPoBoxOfResidency;

	@Column(name = "PRIMARY_ACCOUNT_HOLDER_NATIONALITY")
	private String primaryAccountHolderNationality;

	@Column(name = "JOINT_ACCOUNT_HOLDER_1_NATIONALITY")
	private String jointAccountHolder1Nationality;

	@Column(name = "JOINT_ACCOUNT_HOLDER_2_NATIONALITY")
	private String jointAccountHolder2Nationality;

	@Column(name = "PRIMARY_ACCOUNT_HOLDER_PASSPORT")
	private String primaryAccountHolderPassport;

	@Column(name = "JOINT_ACCOUNT_HOLDER_1_PASSPORT")
	private String jointAccountHolder1Passport;

	@Column(name = "JOINT_ACCOUNT_HOLDER_2_PASSPORT")
	private String jointAccountHolder2Passport;

	@Column(name = "PRIMARY_ACCOUNT_HOLDER_VISA_EID")
	private String primaryAccountHolderVisaEid;

	@Column(name = "JOINT_ACCOUNT_HOLDER_1_VISA_EID")
	private String jointAccountHolder1VisaEid;

	@Column(name = "JOINT_ACCOUNT_HOLDER_2_VISA_EID")
	private String jointAccountHolder2VisaEid;

	@Column(name = "PRIMARY_ACCOUNT_HOLDER_VALID_RESIDENCE")
	private String primaryAccountHolderValidResidence;

	@Column(name = "JOINT_ACCOUNT_HOLDER_1_VALID_RESIDENCE")
	private String jointAccountHolder1ValidResidence;

	@Column(name = "JOINT_ACCOUNT_HOLDER_2_VALID_RESIDENCE")
	private String jointAccountHolder2ValidResidence;

	@Column(name = "PRIMARY_ACCOUNT_HOLDER_PROOF_SOURCE_INCOME")
	private String primaryAccountHolderProofSourceIncome;

	@Column(name = "JOINT_ACCOUNT_HOLDER_1_PROOF_SOURCE_INCOME")
	private String jointAccountHolder1ProofSourceIncome;

	@Column(name = "JOINT_ACCOUNT_HOLDER_2_PROOF_SOURCE_INCOME")
	private String jointAccountHolder2ProofSourceIncome;

	@Column(name = "LINKED_ACCOUNT1_NAME")
	private String linkedAccount1Name;

	@Column(name = "LINKED_ACCOUNT1_NUMBER")
	private String linkedAccount1Number;

	@Column(name = "LINKED_ACCOUNT1_TYPE")
	private String linkedAccount1Type;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "LINKED_ACCOUNT1_OPENING_DATE")
	private Date linkedAccount1OpeningDate;

	@Column(name = "LINKED_ACCOUNT1_CURRENCY")
	private String linkedAccount1Currency;

	@Column(name = "LINKED_ACCOUNT1_STATUS")
	private String linkedAccount1Status;

	@Column(name = "LINKED_ACCOUNT2_NAME")
	private String linkedAccount2Name;

	@Column(name = "LINKED_ACCOUNT2_NUMBER")
	private String linkedAccount2Number;

	@Column(name = "LINKED_ACCOUNT2_TYPE")
	private String linkedAccount2Type;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "LINKED_ACCOUNT2_OPENING_DATE")
	private Date linkedAccount2OpeningDate;

	@Column(name = "LINKED_ACCOUNT2_CURRENCY")
	private String linkedAccount2Currency;

	@Column(name = "LINKED_ACCOUNT2_STATUS")
	private String linkedAccount2Status;

	@Column(name = "LINKED_ACCOUNT3_NAME")
	private String linkedAccount3Name;

	@Column(name = "LINKED_ACCOUNT3_NUMBER")
	private String linkedAccount3Number;

	@Column(name = "LINKED_ACCOUNT3_TYPE")
	private String linkedAccount3Type;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "LINKED_ACCOUNT3_OPENING_DATE")
	private Date linkedAccount3OpeningDate;

	@Column(name = "LINKED_ACCOUNT3_CURRENCY")
	private String linkedAccount3Currency;

	@Column(name = "LINKED_ACCOUNT3_STATUS")
	private String linkedAccount3Status;

	@Column(name = "LINKED_ACCOUNT4_NAME")
	private String linkedAccount4Name;

	@Column(name = "LINKED_ACCOUNT4_NUMBER")
	private String linkedAccount4Number;

	@Column(name = "LINKED_ACCOUNT4_TYPE")
	private String linkedAccount4Type;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "LINKED_ACCOUNT4_OPENING_DATE")
	private Date linkedAccount4OpeningDate;

	@Column(name = "LINKED_ACCOUNT4_CURRENCY")
	private String linkedAccount4Currency;

	@Column(name = "LINKED_ACCOUNT4_STATUS")
	private String linkedAccount4Status;

	@Column(name = "ACCOUNT_SATISFACTORY")
	private String accountSatisfactory;

	@Column(name = "TRANSACTION_COMMENSURATE")
	private String transactionCommensurate;

	@Column(name = "HIGH_VALUE_TRANSACTIONS_OBSERVED")
	private String highValueTransactionsObserved;

	@Column(name = "HIGH_VALUE_TRANSACTIONS_DETAILS1")
	private String highValueTransactionsDetails1;

	@Column(name = "HIGH_VALUE_TRANSACTIONS_DETAILS2")
	private String highValueTransactionsDetails2;

	@Column(name = "HIGH_VALUE_TRANSACTIONS_DETAILS3")
	private String highValueTransactionsDetails3;

	@Column(name = "HIGH_VALUE_TRANSACTIONS_DETAILS4")
	private String highValueTransactionsDetails4;

	@Column(name = "SUSPICION_OBSERVED")
	private String suspicionObserved;

	@Column(name = "SUSPICION_OBSERVED_DETAILS")
	private String suspicionObservedDetails;

	@Column(name = "BRANCH_SATISFIED_WITH_TRANSACTIONS")
	private String branchSatisfiedWithTransactions;

	@Column(name = "SUPPORTING_DOCUMENT_OBTAINED")
	private String supportingDocumentObtained;

	@Column(name = "CURRENT_TURNOVER")
	private Double currentTurnover;

	@Column(name = "EXPECTED_TURNOVER")
	private Double expectedTurnover;

	@Column(name = "EXPECTED_TRANSACTION_TYPES")
	private String expectedTransactionTypes;

	@Column(name = "EXPECTED_TRANSACTION_VOLUME")
	private Double expectedTransactionVolume;

	@Column(name = "TRANSACTION_FREQUENCY")
	private String transactionFrequency;

	@Column(name = "KNOWN_COUNTRIES_OF_TRANSACTION_1")
	private String knownCountriesOfTransaction1;

	@Column(name = "KNOWN_COUNTRIES_OF_TRANSACTION_2")
	private String knownCountriesOfTransaction2;

	@Column(name = "KNOWN_COUNTRIES_OF_TRANSACTION_3")
	private String knownCountriesOfTransaction3;

	@Column(name = "KNOWN_COUNTRIES_OF_TRANSACTION_4")
	private String knownCountriesOfTransaction4;

	@Column(name = "OTHER_EXPECTED_COUNTRIES_1")
	private String otherExpectedCountries1;

	@Column(name = "OTHER_EXPECTED_COUNTRIES_2")
	private String otherExpectedCountries2;

	@Column(name = "OTHER_EXPECTED_COUNTRIES_3")
	private String otherExpectedCountries3;

	@Column(name = "OTHER_EXPECTED_COUNTRIES_4")
	private String otherExpectedCountries4;

	@Column(name = "UAE")
	private String uae;

	@Column(name = "UN")
	private String un;

	@Column(name = "OFAC")
	private String ofac;

	@Column(name = "HMT")
	private String hmt;

	@Column(name = "EU")
	private String eu;

	@Column(name = "OTHERS")
	private String others;

	@Column(name = "CBU_CHECK_DONE")
	private String cbuCheckDone;

	@Column(name = "GOOGLE_MEDIA_SEARCH")
	private String googleMediaSearch;

	@Column(name = "INTERNAL_DENY_LIST_SCREENING")
	private String internalDenyListScreening;

	@Column(name = "SUPPORTING_DOCUMENT_OBTAINED_2")
	private String supportingDocumentObtained2;

	@Column(name = "JOINT_UAE")
	private String jointUae;

	@Column(name = "JOINT_UN")
	private String jointUn;

	@Column(name = "JOINT_OFAC")
	private String jointOfac;

	@Column(name = "JOINT_HMT")
	private String jointHmt;

	@Column(name = "JOINT_EU")
	private String jointEu;

	@Column(name = "JOINT_OTHERS")
	private String jointOthers;

	@Column(name = "JOINT_CBU_CHECK_DONE")
	private String jointCbuCheckDone;

	@Column(name = "JOINT_GOOGLE_MEDIA_SEARCH")
	private String jointGoogleMediaSearch;

	@Column(name = "JOINT_INTERNAL_DENY_LIST_SCREENING")
	private String jointInternalDenyListScreening;

	@Column(name = "JOINT_SUSPICION_OBSERVED")
	private String jointSuspicionObserved;

	@Column(name = "JOINT_SUPPORTING_DOCUMENT_OBTAINED")
	private String jointSupportingDocumentObtained;

	@Column(name = "IS_PEP")
	private String isPep;

	@Column(name = "SENIOR_MANAGEMENT_APPROVAL")
	private String seniorManagementApproval;

	@Column(name = "FOREIGN_CURRENCY_REQUEST")
	private String foreignCurrencyRequest;

	@Column(name = "SENIOR_MANAGEMENT_APPROVAL_FC")
	private String seniorManagementApprovalFc;

	@Column(name = "CUSTOMER_RISK")
	private String customerRisk;

	@Column(name = "HIGH_RISK_REASON")
	private String highRiskReason;

	@Column(name = "FURTHER_DUE_DILIGENCE")
	private String furtherDueDiligence;

	@Column(name = "OBSERVATIONS_OF_BANK_OFFICIAL")
	private String observationsOfBankOfficial;

	@Column(name = "ACCOUNT_OPENING_OFFICER_SIGNATURE")
	private String accountOpeningOfficerSignature;

	@Column(name = "ACCOUNT_OPENING_OFFICER_NAME")
	private String accountOpeningOfficerName;

	@Column(name = "ACCOUNT_OPENING_OFFICER_DESIGNATION")
	private String accountOpeningOfficerDesignation;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "ACCOUNT_OPENING_OFFICER_DATE")
	private Date accountOpeningOfficerDate;

	@Column(name = "BRANCH_OFFICIAL_SIGNATURE")
	private String branchOfficialSignature;

	@Column(name = "BRANCH_OFFICIAL_NAME")
	private String branchOfficialName;

	@Column(name = "BRANCH_OFFICIAL_DESIGNATION")
	private String branchOfficialDesignation;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "BRANCH_OFFICIAL_DATE")
	private Date branchOfficialDate;

	@Column(name = "ENTITY_FLG")
	private Character entityFlg;

	@Column(name = "MODIFY_FLG")
	private Character modifyFlg;

	@Column(name = "DEL_FLG")
	private Character delFlg;

	@Column(name = "ENTRY_USER")
	private String entryUser;

	@Column(name = "MODIFY_USER")
	private String modifyUser;

	@Column(name = "VERIFY_USER")
	private String verifyUser;

	@Column(name = "ENTRY_TIME")
	private Date entryTime;

	@Column(name = "MODIFY_TIME")
	private Date modifyTime;

	@Column(name = "VERIFY_TIME")
	private Date verifyTime;

	@Column(name = "DEBIT")
	private String debit;

	@Column(name = "CREDIT")
	private String credit;

	@Column(name = "SUSPICION_OBSERVED_1")
	private String suspicionObserved1;

	@Column(name = "COUNTRY_OF_CITIZENSHIP_OTHERS")
	private String countryOfCitizenshipOthers;

	@Column(name = "REASON_FOR_RED_FLAG_1")
	private String reasonForRedFlag1;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getAccountOpeningDate() {
		return accountOpeningDate;
	}

	public void setAccountOpeningDate(Date accountOpeningDate) {
		this.accountOpeningDate = accountOpeningDate;
	}

	public String getCountryOfCitizenship() {
		return countryOfCitizenship;
	}

	public void setCountryOfCitizenship(String countryOfCitizenship) {
		this.countryOfCitizenship = countryOfCitizenship;
	}

	public String getCountryOfCurrentResidency() {
		return countryOfCurrentResidency;
	}

	public void setCountryOfCurrentResidency(String countryOfCurrentResidency) {
		this.countryOfCurrentResidency = countryOfCurrentResidency;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getBusinessActivity() {
		return businessActivity;
	}

	public void setBusinessActivity(String businessActivity) {
		this.businessActivity = businessActivity;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getSourceOfFunds() {
		return sourceOfFunds;
	}

	public void setSourceOfFunds(String sourceOfFunds) {
		this.sourceOfFunds = sourceOfFunds;
	}

	public String getPurposeOfAccountOpening() {
		return purposeOfAccountOpening;
	}

	public void setPurposeOfAccountOpening(String purposeOfAccountOpening) {
		this.purposeOfAccountOpening = purposeOfAccountOpening;
	}

	public String getTaxRegistration() {
		return taxRegistration;
	}

	public void setTaxRegistration(String taxRegistration) {
		this.taxRegistration = taxRegistration;
	}

	public String getTaxIdNumber() {
		return taxIdNumber;
	}

	public void setTaxIdNumber(String taxIdNumber) {
		this.taxIdNumber = taxIdNumber;
	}

	public String getPrimaryAddress() {
		return primaryAddress;
	}

	public void setPrimaryAddress(String primaryAddress) {
		this.primaryAddress = primaryAddress;
	}

	public String getPrimaryAddressCountry() {
		return primaryAddressCountry;
	}

	public void setPrimaryAddressCountry(String primaryAddressCountry) {
		this.primaryAddressCountry = primaryAddressCountry;
	}

	public String getPrimaryAddressCity() {
		return primaryAddressCity;
	}

	public void setPrimaryAddressCity(String primaryAddressCity) {
		this.primaryAddressCity = primaryAddressCity;
	}

	public String getPrimaryAddressPoBox() {
		return primaryAddressPoBox;
	}

	public void setPrimaryAddressPoBox(String primaryAddressPoBox) {
		this.primaryAddressPoBox = primaryAddressPoBox;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPrimaryTelephone() {
		return primaryTelephone;
	}

	public void setPrimaryTelephone(String primaryTelephone) {
		this.primaryTelephone = primaryTelephone;
	}

	public String getSecondaryTelephone() {
		return secondaryTelephone;
	}

	public void setSecondaryTelephone(String secondaryTelephone) {
		this.secondaryTelephone = secondaryTelephone;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getResidentialStatusChanged() {
		return residentialStatusChanged;
	}

	public void setResidentialStatusChanged(String residentialStatusChanged) {
		this.residentialStatusChanged = residentialStatusChanged;
	}

	public String getNewCountryOfResidency() {
		return newCountryOfResidency;
	}

	public void setNewCountryOfResidency(String newCountryOfResidency) {
		this.newCountryOfResidency = newCountryOfResidency;
	}

	public String getNewCityOfResidency() {
		return newCityOfResidency;
	}

	public void setNewCityOfResidency(String newCityOfResidency) {
		this.newCityOfResidency = newCityOfResidency;
	}

	public String getNewPoBoxOfResidency() {
		return newPoBoxOfResidency;
	}

	public void setNewPoBoxOfResidency(String newPoBoxOfResidency) {
		this.newPoBoxOfResidency = newPoBoxOfResidency;
	}

	public String getJointHolder1Name() {
		return jointHolder1Name;
	}

	public void setJointHolder1Name(String jointHolder1Name) {
		this.jointHolder1Name = jointHolder1Name;
	}

	public String getJointHolder1Address() {
		return jointHolder1Address;
	}

	public void setJointHolder1Address(String jointHolder1Address) {
		this.jointHolder1Address = jointHolder1Address;
	}

	public String getJointHolder1AddressCountry() {
		return jointHolder1AddressCountry;
	}

	public void setJointHolder1AddressCountry(String jointHolder1AddressCountry) {
		this.jointHolder1AddressCountry = jointHolder1AddressCountry;
	}

	public String getJointHolder1AddressCity() {
		return jointHolder1AddressCity;
	}

	public void setJointHolder1AddressCity(String jointHolder1AddressCity) {
		this.jointHolder1AddressCity = jointHolder1AddressCity;
	}

	public String getJointHolder1AddressPoBox() {
		return jointHolder1AddressPoBox;
	}

	public void setJointHolder1AddressPoBox(String jointHolder1AddressPoBox) {
		this.jointHolder1AddressPoBox = jointHolder1AddressPoBox;
	}

	public String getJointHolder1Mobile() {
		return jointHolder1Mobile;
	}

	public void setJointHolder1Mobile(String jointHolder1Mobile) {
		this.jointHolder1Mobile = jointHolder1Mobile;
	}

	public String getJointHolder1PrimaryTelephone() {
		return jointHolder1PrimaryTelephone;
	}

	public void setJointHolder1PrimaryTelephone(String jointHolder1PrimaryTelephone) {
		this.jointHolder1PrimaryTelephone = jointHolder1PrimaryTelephone;
	}

	public String getJointHolder1SecondaryTelephone() {
		return jointHolder1SecondaryTelephone;
	}

	public void setJointHolder1SecondaryTelephone(String jointHolder1SecondaryTelephone) {
		this.jointHolder1SecondaryTelephone = jointHolder1SecondaryTelephone;
	}

	public String getJointHolder1Email() {
		return jointHolder1Email;
	}

	public void setJointHolder1Email(String jointHolder1Email) {
		this.jointHolder1Email = jointHolder1Email;
	}

	public String getJointHolder1ResidentialStatusChanged() {
		return jointHolder1ResidentialStatusChanged;
	}

	public void setJointHolder1ResidentialStatusChanged(String jointHolder1ResidentialStatusChanged) {
		this.jointHolder1ResidentialStatusChanged = jointHolder1ResidentialStatusChanged;
	}

	public String getJointHolder1NewCountryOfResidency() {
		return jointHolder1NewCountryOfResidency;
	}

	public void setJointHolder1NewCountryOfResidency(String jointHolder1NewCountryOfResidency) {
		this.jointHolder1NewCountryOfResidency = jointHolder1NewCountryOfResidency;
	}

	public String getJointHolder1NewCityOfResidency() {
		return jointHolder1NewCityOfResidency;
	}

	public void setJointHolder1NewCityOfResidency(String jointHolder1NewCityOfResidency) {
		this.jointHolder1NewCityOfResidency = jointHolder1NewCityOfResidency;
	}

	public String getJointHolder1NewPoBoxOfResidency() {
		return jointHolder1NewPoBoxOfResidency;
	}

	public void setJointHolder1NewPoBoxOfResidency(String jointHolder1NewPoBoxOfResidency) {
		this.jointHolder1NewPoBoxOfResidency = jointHolder1NewPoBoxOfResidency;
	}

	public String getJointHolder2Name() {
		return jointHolder2Name;
	}

	public void setJointHolder2Name(String jointHolder2Name) {
		this.jointHolder2Name = jointHolder2Name;
	}

	public String getJointHolder2Address() {
		return jointHolder2Address;
	}

	public void setJointHolder2Address(String jointHolder2Address) {
		this.jointHolder2Address = jointHolder2Address;
	}

	public String getJointHolder2AddressCountry() {
		return jointHolder2AddressCountry;
	}

	public void setJointHolder2AddressCountry(String jointHolder2AddressCountry) {
		this.jointHolder2AddressCountry = jointHolder2AddressCountry;
	}

	public String getJointHolder2AddressCity() {
		return jointHolder2AddressCity;
	}

	public void setJointHolder2AddressCity(String jointHolder2AddressCity) {
		this.jointHolder2AddressCity = jointHolder2AddressCity;
	}

	public String getJointHolder2AddressPoBox() {
		return jointHolder2AddressPoBox;
	}

	public void setJointHolder2AddressPoBox(String jointHolder2AddressPoBox) {
		this.jointHolder2AddressPoBox = jointHolder2AddressPoBox;
	}

	public String getJointHolder2Mobile() {
		return jointHolder2Mobile;
	}

	public void setJointHolder2Mobile(String jointHolder2Mobile) {
		this.jointHolder2Mobile = jointHolder2Mobile;
	}

	public String getJointHolder2PrimaryTelephone() {
		return jointHolder2PrimaryTelephone;
	}

	public void setJointHolder2PrimaryTelephone(String jointHolder2PrimaryTelephone) {
		this.jointHolder2PrimaryTelephone = jointHolder2PrimaryTelephone;
	}

	public String getJointHolder2SecondaryTelephone() {
		return jointHolder2SecondaryTelephone;
	}

	public void setJointHolder2SecondaryTelephone(String jointHolder2SecondaryTelephone) {
		this.jointHolder2SecondaryTelephone = jointHolder2SecondaryTelephone;
	}

	public String getJointHolder2Email() {
		return jointHolder2Email;
	}

	public void setJointHolder2Email(String jointHolder2Email) {
		this.jointHolder2Email = jointHolder2Email;
	}

	public String getJointHolder2ResidentialStatusChanged() {
		return jointHolder2ResidentialStatusChanged;
	}

	public void setJointHolder2ResidentialStatusChanged(String jointHolder2ResidentialStatusChanged) {
		this.jointHolder2ResidentialStatusChanged = jointHolder2ResidentialStatusChanged;
	}

	public String getJointHolder2NewCountryOfResidency() {
		return jointHolder2NewCountryOfResidency;
	}

	public void setJointHolder2NewCountryOfResidency(String jointHolder2NewCountryOfResidency) {
		this.jointHolder2NewCountryOfResidency = jointHolder2NewCountryOfResidency;
	}

	public String getJointHolder2NewCityOfResidency() {
		return jointHolder2NewCityOfResidency;
	}

	public void setJointHolder2NewCityOfResidency(String jointHolder2NewCityOfResidency) {
		this.jointHolder2NewCityOfResidency = jointHolder2NewCityOfResidency;
	}

	public String getJointHolder2NewPoBoxOfResidency() {
		return jointHolder2NewPoBoxOfResidency;
	}

	public void setJointHolder2NewPoBoxOfResidency(String jointHolder2NewPoBoxOfResidency) {
		this.jointHolder2NewPoBoxOfResidency = jointHolder2NewPoBoxOfResidency;
	}

	public String getPrimaryAccountHolderNationality() {
		return primaryAccountHolderNationality;
	}

	public void setPrimaryAccountHolderNationality(String primaryAccountHolderNationality) {
		this.primaryAccountHolderNationality = primaryAccountHolderNationality;
	}

	public String getJointAccountHolder1Nationality() {
		return jointAccountHolder1Nationality;
	}

	public void setJointAccountHolder1Nationality(String jointAccountHolder1Nationality) {
		this.jointAccountHolder1Nationality = jointAccountHolder1Nationality;
	}

	public String getJointAccountHolder2Nationality() {
		return jointAccountHolder2Nationality;
	}

	public void setJointAccountHolder2Nationality(String jointAccountHolder2Nationality) {
		this.jointAccountHolder2Nationality = jointAccountHolder2Nationality;
	}

	public String getPrimaryAccountHolderPassport() {
		return primaryAccountHolderPassport;
	}

	public void setPrimaryAccountHolderPassport(String primaryAccountHolderPassport) {
		this.primaryAccountHolderPassport = primaryAccountHolderPassport;
	}

	public String getJointAccountHolder1Passport() {
		return jointAccountHolder1Passport;
	}

	public void setJointAccountHolder1Passport(String jointAccountHolder1Passport) {
		this.jointAccountHolder1Passport = jointAccountHolder1Passport;
	}

	public String getJointAccountHolder2Passport() {
		return jointAccountHolder2Passport;
	}

	public void setJointAccountHolder2Passport(String jointAccountHolder2Passport) {
		this.jointAccountHolder2Passport = jointAccountHolder2Passport;
	}

	public String getPrimaryAccountHolderVisaEid() {
		return primaryAccountHolderVisaEid;
	}

	public void setPrimaryAccountHolderVisaEid(String primaryAccountHolderVisaEid) {
		this.primaryAccountHolderVisaEid = primaryAccountHolderVisaEid;
	}

	public String getJointAccountHolder1VisaEid() {
		return jointAccountHolder1VisaEid;
	}

	public void setJointAccountHolder1VisaEid(String jointAccountHolder1VisaEid) {
		this.jointAccountHolder1VisaEid = jointAccountHolder1VisaEid;
	}

	public String getJointAccountHolder2VisaEid() {
		return jointAccountHolder2VisaEid;
	}

	public void setJointAccountHolder2VisaEid(String jointAccountHolder2VisaEid) {
		this.jointAccountHolder2VisaEid = jointAccountHolder2VisaEid;
	}

	public String getPrimaryAccountHolderValidResidence() {
		return primaryAccountHolderValidResidence;
	}

	public void setPrimaryAccountHolderValidResidence(String primaryAccountHolderValidResidence) {
		this.primaryAccountHolderValidResidence = primaryAccountHolderValidResidence;
	}

	public String getJointAccountHolder1ValidResidence() {
		return jointAccountHolder1ValidResidence;
	}

	public void setJointAccountHolder1ValidResidence(String jointAccountHolder1ValidResidence) {
		this.jointAccountHolder1ValidResidence = jointAccountHolder1ValidResidence;
	}

	public String getJointAccountHolder2ValidResidence() {
		return jointAccountHolder2ValidResidence;
	}

	public void setJointAccountHolder2ValidResidence(String jointAccountHolder2ValidResidence) {
		this.jointAccountHolder2ValidResidence = jointAccountHolder2ValidResidence;
	}

	public String getPrimaryAccountHolderProofSourceIncome() {
		return primaryAccountHolderProofSourceIncome;
	}

	public void setPrimaryAccountHolderProofSourceIncome(String primaryAccountHolderProofSourceIncome) {
		this.primaryAccountHolderProofSourceIncome = primaryAccountHolderProofSourceIncome;
	}

	public String getJointAccountHolder1ProofSourceIncome() {
		return jointAccountHolder1ProofSourceIncome;
	}

	public void setJointAccountHolder1ProofSourceIncome(String jointAccountHolder1ProofSourceIncome) {
		this.jointAccountHolder1ProofSourceIncome = jointAccountHolder1ProofSourceIncome;
	}

	public String getJointAccountHolder2ProofSourceIncome() {
		return jointAccountHolder2ProofSourceIncome;
	}

	public void setJointAccountHolder2ProofSourceIncome(String jointAccountHolder2ProofSourceIncome) {
		this.jointAccountHolder2ProofSourceIncome = jointAccountHolder2ProofSourceIncome;
	}

	public String getLinkedAccount1Name() {
		return linkedAccount1Name;
	}

	public void setLinkedAccount1Name(String linkedAccount1Name) {
		this.linkedAccount1Name = linkedAccount1Name;
	}

	public String getLinkedAccount1Number() {
		return linkedAccount1Number;
	}

	public void setLinkedAccount1Number(String linkedAccount1Number) {
		this.linkedAccount1Number = linkedAccount1Number;
	}

	public String getLinkedAccount1Type() {
		return linkedAccount1Type;
	}

	public void setLinkedAccount1Type(String linkedAccount1Type) {
		this.linkedAccount1Type = linkedAccount1Type;
	}

	public Date getLinkedAccount1OpeningDate() {
		return linkedAccount1OpeningDate;
	}

	public void setLinkedAccount1OpeningDate(Date linkedAccount1OpeningDate) {
		this.linkedAccount1OpeningDate = linkedAccount1OpeningDate;
	}

	public String getLinkedAccount1Currency() {
		return linkedAccount1Currency;
	}

	public void setLinkedAccount1Currency(String linkedAccount1Currency) {
		this.linkedAccount1Currency = linkedAccount1Currency;
	}

	public String getLinkedAccount1Status() {
		return linkedAccount1Status;
	}

	public void setLinkedAccount1Status(String linkedAccount1Status) {
		this.linkedAccount1Status = linkedAccount1Status;
	}

	public String getLinkedAccount2Name() {
		return linkedAccount2Name;
	}

	public void setLinkedAccount2Name(String linkedAccount2Name) {
		this.linkedAccount2Name = linkedAccount2Name;
	}

	public String getLinkedAccount2Number() {
		return linkedAccount2Number;
	}

	public void setLinkedAccount2Number(String linkedAccount2Number) {
		this.linkedAccount2Number = linkedAccount2Number;
	}

	public String getLinkedAccount2Type() {
		return linkedAccount2Type;
	}

	public void setLinkedAccount2Type(String linkedAccount2Type) {
		this.linkedAccount2Type = linkedAccount2Type;
	}

	public Date getLinkedAccount2OpeningDate() {
		return linkedAccount2OpeningDate;
	}

	public void setLinkedAccount2OpeningDate(Date linkedAccount2OpeningDate) {
		this.linkedAccount2OpeningDate = linkedAccount2OpeningDate;
	}

	public String getLinkedAccount2Currency() {
		return linkedAccount2Currency;
	}

	public void setLinkedAccount2Currency(String linkedAccount2Currency) {
		this.linkedAccount2Currency = linkedAccount2Currency;
	}

	public String getLinkedAccount2Status() {
		return linkedAccount2Status;
	}

	public void setLinkedAccount2Status(String linkedAccount2Status) {
		this.linkedAccount2Status = linkedAccount2Status;
	}

	public String getLinkedAccount3Name() {
		return linkedAccount3Name;
	}

	public void setLinkedAccount3Name(String linkedAccount3Name) {
		this.linkedAccount3Name = linkedAccount3Name;
	}

	public String getLinkedAccount3Number() {
		return linkedAccount3Number;
	}

	public void setLinkedAccount3Number(String linkedAccount3Number) {
		this.linkedAccount3Number = linkedAccount3Number;
	}

	public String getLinkedAccount3Type() {
		return linkedAccount3Type;
	}

	public void setLinkedAccount3Type(String linkedAccount3Type) {
		this.linkedAccount3Type = linkedAccount3Type;
	}

	public Date getLinkedAccount3OpeningDate() {
		return linkedAccount3OpeningDate;
	}

	public void setLinkedAccount3OpeningDate(Date linkedAccount3OpeningDate) {
		this.linkedAccount3OpeningDate = linkedAccount3OpeningDate;
	}

	public String getLinkedAccount3Currency() {
		return linkedAccount3Currency;
	}

	public void setLinkedAccount3Currency(String linkedAccount3Currency) {
		this.linkedAccount3Currency = linkedAccount3Currency;
	}

	public String getLinkedAccount3Status() {
		return linkedAccount3Status;
	}

	public void setLinkedAccount3Status(String linkedAccount3Status) {
		this.linkedAccount3Status = linkedAccount3Status;
	}

	public String getLinkedAccount4Name() {
		return linkedAccount4Name;
	}

	public void setLinkedAccount4Name(String linkedAccount4Name) {
		this.linkedAccount4Name = linkedAccount4Name;
	}

	public String getLinkedAccount4Number() {
		return linkedAccount4Number;
	}

	public void setLinkedAccount4Number(String linkedAccount4Number) {
		this.linkedAccount4Number = linkedAccount4Number;
	}

	public String getLinkedAccount4Type() {
		return linkedAccount4Type;
	}

	public void setLinkedAccount4Type(String linkedAccount4Type) {
		this.linkedAccount4Type = linkedAccount4Type;
	}

	public Date getLinkedAccount4OpeningDate() {
		return linkedAccount4OpeningDate;
	}

	public void setLinkedAccount4OpeningDate(Date linkedAccount4OpeningDate) {
		this.linkedAccount4OpeningDate = linkedAccount4OpeningDate;
	}

	public String getLinkedAccount4Currency() {
		return linkedAccount4Currency;
	}

	public void setLinkedAccount4Currency(String linkedAccount4Currency) {
		this.linkedAccount4Currency = linkedAccount4Currency;
	}

	public String getLinkedAccount4Status() {
		return linkedAccount4Status;
	}

	public void setLinkedAccount4Status(String linkedAccount4Status) {
		this.linkedAccount4Status = linkedAccount4Status;
	}

	public String getAccountSatisfactory() {
		return accountSatisfactory;
	}

	public void setAccountSatisfactory(String accountSatisfactory) {
		this.accountSatisfactory = accountSatisfactory;
	}

	public String getTransactionCommensurate() {
		return transactionCommensurate;
	}

	public void setTransactionCommensurate(String transactionCommensurate) {
		this.transactionCommensurate = transactionCommensurate;
	}

	public String getHighValueTransactionsObserved() {
		return highValueTransactionsObserved;
	}

	public void setHighValueTransactionsObserved(String highValueTransactionsObserved) {
		this.highValueTransactionsObserved = highValueTransactionsObserved;
	}

	public String getHighValueTransactionsDetails1() {
		return highValueTransactionsDetails1;
	}

	public void setHighValueTransactionsDetails1(String highValueTransactionsDetails1) {
		this.highValueTransactionsDetails1 = highValueTransactionsDetails1;
	}

	public String getHighValueTransactionsDetails2() {
		return highValueTransactionsDetails2;
	}

	public void setHighValueTransactionsDetails2(String highValueTransactionsDetails2) {
		this.highValueTransactionsDetails2 = highValueTransactionsDetails2;
	}

	public String getHighValueTransactionsDetails3() {
		return highValueTransactionsDetails3;
	}

	public void setHighValueTransactionsDetails3(String highValueTransactionsDetails3) {
		this.highValueTransactionsDetails3 = highValueTransactionsDetails3;
	}

	public String getHighValueTransactionsDetails4() {
		return highValueTransactionsDetails4;
	}

	public void setHighValueTransactionsDetails4(String highValueTransactionsDetails4) {
		this.highValueTransactionsDetails4 = highValueTransactionsDetails4;
	}

	public String getSuspicionObserved() {
		return suspicionObserved;
	}

	public void setSuspicionObserved(String suspicionObserved) {
		this.suspicionObserved = suspicionObserved;
	}

	public String getSuspicionObservedDetails() {
		return suspicionObservedDetails;
	}

	public void setSuspicionObservedDetails(String suspicionObservedDetails) {
		this.suspicionObservedDetails = suspicionObservedDetails;
	}

	public String getBranchSatisfiedWithTransactions() {
		return branchSatisfiedWithTransactions;
	}

	public void setBranchSatisfiedWithTransactions(String branchSatisfiedWithTransactions) {
		this.branchSatisfiedWithTransactions = branchSatisfiedWithTransactions;
	}

	public String getSupportingDocumentObtained() {
		return supportingDocumentObtained;
	}

	public void setSupportingDocumentObtained(String supportingDocumentObtained) {
		this.supportingDocumentObtained = supportingDocumentObtained;
	}

	public Double getCurrentTurnover() {
		return currentTurnover;
	}

	public void setCurrentTurnover(Double currentTurnover) {
		this.currentTurnover = currentTurnover;
	}

	public Double getExpectedTurnover() {
		return expectedTurnover;
	}

	public void setExpectedTurnover(Double expectedTurnover) {
		this.expectedTurnover = expectedTurnover;
	}

	public String getExpectedTransactionTypes() {
		return expectedTransactionTypes;
	}

	public void setExpectedTransactionTypes(String expectedTransactionTypes) {
		this.expectedTransactionTypes = expectedTransactionTypes;
	}

	public Double getExpectedTransactionVolume() {
		return expectedTransactionVolume;
	}

	public void setExpectedTransactionVolume(Double expectedTransactionVolume) {
		this.expectedTransactionVolume = expectedTransactionVolume;
	}

	public String getTransactionFrequency() {
		return transactionFrequency;
	}

	public void setTransactionFrequency(String transactionFrequency) {
		this.transactionFrequency = transactionFrequency;
	}

	public String getKnownCountriesOfTransaction1() {
		return knownCountriesOfTransaction1;
	}

	public void setKnownCountriesOfTransaction1(String knownCountriesOfTransaction1) {
		this.knownCountriesOfTransaction1 = knownCountriesOfTransaction1;
	}

	public String getKnownCountriesOfTransaction2() {
		return knownCountriesOfTransaction2;
	}

	public void setKnownCountriesOfTransaction2(String knownCountriesOfTransaction2) {
		this.knownCountriesOfTransaction2 = knownCountriesOfTransaction2;
	}

	public String getKnownCountriesOfTransaction3() {
		return knownCountriesOfTransaction3;
	}

	public void setKnownCountriesOfTransaction3(String knownCountriesOfTransaction3) {
		this.knownCountriesOfTransaction3 = knownCountriesOfTransaction3;
	}

	public String getKnownCountriesOfTransaction4() {
		return knownCountriesOfTransaction4;
	}

	public void setKnownCountriesOfTransaction4(String knownCountriesOfTransaction4) {
		this.knownCountriesOfTransaction4 = knownCountriesOfTransaction4;
	}

	public String getOtherExpectedCountries1() {
		return otherExpectedCountries1;
	}

	public void setOtherExpectedCountries1(String otherExpectedCountries1) {
		this.otherExpectedCountries1 = otherExpectedCountries1;
	}

	public String getOtherExpectedCountries2() {
		return otherExpectedCountries2;
	}

	public void setOtherExpectedCountries2(String otherExpectedCountries2) {
		this.otherExpectedCountries2 = otherExpectedCountries2;
	}

	public String getOtherExpectedCountries3() {
		return otherExpectedCountries3;
	}

	public void setOtherExpectedCountries3(String otherExpectedCountries3) {
		this.otherExpectedCountries3 = otherExpectedCountries3;
	}

	public String getOtherExpectedCountries4() {
		return otherExpectedCountries4;
	}

	public void setOtherExpectedCountries4(String otherExpectedCountries4) {
		this.otherExpectedCountries4 = otherExpectedCountries4;
	}

	public String getUae() {
		return uae;
	}

	public void setUae(String uae) {
		this.uae = uae;
	}

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	public String getOfac() {
		return ofac;
	}

	public void setOfac(String ofac) {
		this.ofac = ofac;
	}

	public String getHmt() {
		return hmt;
	}

	public void setHmt(String hmt) {
		this.hmt = hmt;
	}

	public String getEu() {
		return eu;
	}

	public void setEu(String eu) {
		this.eu = eu;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

	public String getCbuCheckDone() {
		return cbuCheckDone;
	}

	public void setCbuCheckDone(String cbuCheckDone) {
		this.cbuCheckDone = cbuCheckDone;
	}

	public String getGoogleMediaSearch() {
		return googleMediaSearch;
	}

	public void setGoogleMediaSearch(String googleMediaSearch) {
		this.googleMediaSearch = googleMediaSearch;
	}

	public String getInternalDenyListScreening() {
		return internalDenyListScreening;
	}

	public void setInternalDenyListScreening(String internalDenyListScreening) {
		this.internalDenyListScreening = internalDenyListScreening;
	}

	public String getSupportingDocumentObtained2() {
		return supportingDocumentObtained2;
	}

	public void setSupportingDocumentObtained2(String supportingDocumentObtained2) {
		this.supportingDocumentObtained2 = supportingDocumentObtained2;
	}

	public String getJointUae() {
		return jointUae;
	}

	public void setJointUae(String jointUae) {
		this.jointUae = jointUae;
	}

	public String getJointUn() {
		return jointUn;
	}

	public void setJointUn(String jointUn) {
		this.jointUn = jointUn;
	}

	public String getJointOfac() {
		return jointOfac;
	}

	public void setJointOfac(String jointOfac) {
		this.jointOfac = jointOfac;
	}

	public String getJointHmt() {
		return jointHmt;
	}

	public void setJointHmt(String jointHmt) {
		this.jointHmt = jointHmt;
	}

	public String getJointEu() {
		return jointEu;
	}

	public void setJointEu(String jointEu) {
		this.jointEu = jointEu;
	}

	public String getJointOthers() {
		return jointOthers;
	}

	public void setJointOthers(String jointOthers) {
		this.jointOthers = jointOthers;
	}

	public String getJointCbuCheckDone() {
		return jointCbuCheckDone;
	}

	public void setJointCbuCheckDone(String jointCbuCheckDone) {
		this.jointCbuCheckDone = jointCbuCheckDone;
	}

	public String getJointGoogleMediaSearch() {
		return jointGoogleMediaSearch;
	}

	public void setJointGoogleMediaSearch(String jointGoogleMediaSearch) {
		this.jointGoogleMediaSearch = jointGoogleMediaSearch;
	}

	public String getJointInternalDenyListScreening() {
		return jointInternalDenyListScreening;
	}

	public void setJointInternalDenyListScreening(String jointInternalDenyListScreening) {
		this.jointInternalDenyListScreening = jointInternalDenyListScreening;
	}

	public String getJointSuspicionObserved() {
		return jointSuspicionObserved;
	}

	public void setJointSuspicionObserved(String jointSuspicionObserved) {
		this.jointSuspicionObserved = jointSuspicionObserved;
	}

	public String getJointSupportingDocumentObtained() {
		return jointSupportingDocumentObtained;
	}

	public void setJointSupportingDocumentObtained(String jointSupportingDocumentObtained) {
		this.jointSupportingDocumentObtained = jointSupportingDocumentObtained;
	}

	public String getIsPep() {
		return isPep;
	}

	public void setIsPep(String isPep) {
		this.isPep = isPep;
	}

	public String getSeniorManagementApproval() {
		return seniorManagementApproval;
	}

	public void setSeniorManagementApproval(String seniorManagementApproval) {
		this.seniorManagementApproval = seniorManagementApproval;
	}

	public String getForeignCurrencyRequest() {
		return foreignCurrencyRequest;
	}

	public void setForeignCurrencyRequest(String foreignCurrencyRequest) {
		this.foreignCurrencyRequest = foreignCurrencyRequest;
	}

	public String getSeniorManagementApprovalFc() {
		return seniorManagementApprovalFc;
	}

	public void setSeniorManagementApprovalFc(String seniorManagementApprovalFc) {
		this.seniorManagementApprovalFc = seniorManagementApprovalFc;
	}

	public String getCustomerRisk() {
		return customerRisk;
	}

	public void setCustomerRisk(String customerRisk) {
		this.customerRisk = customerRisk;
	}

	public String getHighRiskReason() {
		return highRiskReason;
	}

	public void setHighRiskReason(String highRiskReason) {
		this.highRiskReason = highRiskReason;
	}

	public String getFurtherDueDiligence() {
		return furtherDueDiligence;
	}

	public void setFurtherDueDiligence(String furtherDueDiligence) {
		this.furtherDueDiligence = furtherDueDiligence;
	}

	public String getObservationsOfBankOfficial() {
		return observationsOfBankOfficial;
	}

	public void setObservationsOfBankOfficial(String observationsOfBankOfficial) {
		this.observationsOfBankOfficial = observationsOfBankOfficial;
	}

	public String getAccountOpeningOfficerSignature() {
		return accountOpeningOfficerSignature;
	}

	public void setAccountOpeningOfficerSignature(String accountOpeningOfficerSignature) {
		this.accountOpeningOfficerSignature = accountOpeningOfficerSignature;
	}

	public String getAccountOpeningOfficerName() {
		return accountOpeningOfficerName;
	}

	public void setAccountOpeningOfficerName(String accountOpeningOfficerName) {
		this.accountOpeningOfficerName = accountOpeningOfficerName;
	}

	public String getAccountOpeningOfficerDesignation() {
		return accountOpeningOfficerDesignation;
	}

	public void setAccountOpeningOfficerDesignation(String accountOpeningOfficerDesignation) {
		this.accountOpeningOfficerDesignation = accountOpeningOfficerDesignation;
	}

	public Date getAccountOpeningOfficerDate() {
		return accountOpeningOfficerDate;
	}

	public void setAccountOpeningOfficerDate(Date accountOpeningOfficerDate) {
		this.accountOpeningOfficerDate = accountOpeningOfficerDate;
	}

	public String getBranchOfficialSignature() {
		return branchOfficialSignature;
	}

	public void setBranchOfficialSignature(String branchOfficialSignature) {
		this.branchOfficialSignature = branchOfficialSignature;
	}

	public String getBranchOfficialName() {
		return branchOfficialName;
	}

	public void setBranchOfficialName(String branchOfficialName) {
		this.branchOfficialName = branchOfficialName;
	}

	public String getBranchOfficialDesignation() {
		return branchOfficialDesignation;
	}

	public void setBranchOfficialDesignation(String branchOfficialDesignation) {
		this.branchOfficialDesignation = branchOfficialDesignation;
	}

	public Date getBranchOfficialDate() {
		return branchOfficialDate;
	}

	public void setBranchOfficialDate(Date branchOfficialDate) {
		this.branchOfficialDate = branchOfficialDate;
	}

	public Character getEntityFlg() {
		return entityFlg;
	}

	public void setEntityFlg(Character entityFlg) {
		this.entityFlg = entityFlg;
	}

	public Character getModifyFlg() {
		return modifyFlg;
	}

	public void setModifyFlg(Character modifyFlg) {
		this.modifyFlg = modifyFlg;
	}

	public Character getDelFlg() {
		return delFlg;
	}

	public void setDelFlg(Character delFlg) {
		this.delFlg = delFlg;
	}

	public String getEntryUser() {
		return entryUser;
	}

	public void setEntryUser(String entryUser) {
		this.entryUser = entryUser;
	}

	public String getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}

	public String getVerifyUser() {
		return verifyUser;
	}

	public void setVerifyUser(String verifyUser) {
		this.verifyUser = verifyUser;
	}

	public Date getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Date getVerifyTime() {
		return verifyTime;
	}

	public void setVerifyTime(Date verifyTime) {
		this.verifyTime = verifyTime;
	}

	public String getDebit() {
		return debit;
	}

	public void setDebit(String debit) {
		this.debit = debit;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getSuspicionObserved1() {
		return suspicionObserved1;
	}

	public void setSuspicionObserved1(String suspicionObserved1) {
		this.suspicionObserved1 = suspicionObserved1;
	}

	public String getCountryOfCitizenshipOthers() {
		return countryOfCitizenshipOthers;
	}

	public void setCountryOfCitizenshipOthers(String countryOfCitizenshipOthers) {
		this.countryOfCitizenshipOthers = countryOfCitizenshipOthers;
	}

	public String getReasonForRedFlag1() {
		return reasonForRedFlag1;
	}

	public void setReasonForRedFlag1(String reasonForRedFlag1) {
		this.reasonForRedFlag1 = reasonForRedFlag1;
	}

	public KYC_I(String customerId, String accountType, String name, String accountNumber, Date dateOfBirth,
			String placeOfBirth, String nationality, Date accountOpeningDate, String countryOfCitizenship,
			String countryOfCurrentResidency, String occupation, String businessActivity, Double annualIncome,
			String sourceOfFunds, String purposeOfAccountOpening, String taxRegistration, String taxIdNumber,
			String primaryAddress, String primaryAddressCountry, String primaryAddressCity, String primaryAddressPoBox,
			String mobileNumber, String primaryTelephone, String secondaryTelephone, String emailId,
			String residentialStatusChanged, String newCountryOfResidency, String newCityOfResidency,
			String newPoBoxOfResidency, String jointHolder1Name, String jointHolder1Address,
			String jointHolder1AddressCountry, String jointHolder1AddressCity, String jointHolder1AddressPoBox,
			String jointHolder1Mobile, String jointHolder1PrimaryTelephone, String jointHolder1SecondaryTelephone,
			String jointHolder1Email, String jointHolder1ResidentialStatusChanged,
			String jointHolder1NewCountryOfResidency, String jointHolder1NewCityOfResidency,
			String jointHolder1NewPoBoxOfResidency, String jointHolder2Name, String jointHolder2Address,
			String jointHolder2AddressCountry, String jointHolder2AddressCity, String jointHolder2AddressPoBox,
			String jointHolder2Mobile, String jointHolder2PrimaryTelephone, String jointHolder2SecondaryTelephone,
			String jointHolder2Email, String jointHolder2ResidentialStatusChanged,
			String jointHolder2NewCountryOfResidency, String jointHolder2NewCityOfResidency,
			String jointHolder2NewPoBoxOfResidency, String primaryAccountHolderNationality,
			String jointAccountHolder1Nationality, String jointAccountHolder2Nationality,
			String primaryAccountHolderPassport, String jointAccountHolder1Passport, String jointAccountHolder2Passport,
			String primaryAccountHolderVisaEid, String jointAccountHolder1VisaEid, String jointAccountHolder2VisaEid,
			String primaryAccountHolderValidResidence, String jointAccountHolder1ValidResidence,
			String jointAccountHolder2ValidResidence, String primaryAccountHolderProofSourceIncome,
			String jointAccountHolder1ProofSourceIncome, String jointAccountHolder2ProofSourceIncome,
			String linkedAccount1Name, String linkedAccount1Number, String linkedAccount1Type,
			Date linkedAccount1OpeningDate, String linkedAccount1Currency, String linkedAccount1Status,
			String linkedAccount2Name, String linkedAccount2Number, String linkedAccount2Type,
			Date linkedAccount2OpeningDate, String linkedAccount2Currency, String linkedAccount2Status,
			String linkedAccount3Name, String linkedAccount3Number, String linkedAccount3Type,
			Date linkedAccount3OpeningDate, String linkedAccount3Currency, String linkedAccount3Status,
			String linkedAccount4Name, String linkedAccount4Number, String linkedAccount4Type,
			Date linkedAccount4OpeningDate, String linkedAccount4Currency, String linkedAccount4Status,
			String accountSatisfactory, String transactionCommensurate, String highValueTransactionsObserved,
			String highValueTransactionsDetails1, String highValueTransactionsDetails2,
			String highValueTransactionsDetails3, String highValueTransactionsDetails4, String suspicionObserved,
			String suspicionObservedDetails, String branchSatisfiedWithTransactions, String supportingDocumentObtained,
			Double currentTurnover, Double expectedTurnover, String expectedTransactionTypes,
			Double expectedTransactionVolume, String transactionFrequency, String knownCountriesOfTransaction1,
			String knownCountriesOfTransaction2, String knownCountriesOfTransaction3,
			String knownCountriesOfTransaction4, String otherExpectedCountries1, String otherExpectedCountries2,
			String otherExpectedCountries3, String otherExpectedCountries4, String uae, String un, String ofac,
			String hmt, String eu, String others, String cbuCheckDone, String googleMediaSearch,
			String internalDenyListScreening, String supportingDocumentObtained2, String jointUae, String jointUn,
			String jointOfac, String jointHmt, String jointEu, String jointOthers, String jointCbuCheckDone,
			String jointGoogleMediaSearch, String jointInternalDenyListScreening, String jointSuspicionObserved,
			String jointSupportingDocumentObtained, String isPep, String seniorManagementApproval,
			String foreignCurrencyRequest, String seniorManagementApprovalFc, String customerRisk,
			String highRiskReason, String furtherDueDiligence, String observationsOfBankOfficial,
			String accountOpeningOfficerSignature, String accountOpeningOfficerName,
			String accountOpeningOfficerDesignation, Date accountOpeningOfficerDate, String branchOfficialSignature,
			String branchOfficialName, String branchOfficialDesignation, Date branchOfficialDate, Character entityFlg,
			Character modifyFlg, Character delFlg, String entryUser, String modifyUser, String verifyUser,
			Date entryTime, Date modifyTime, Date verifyTime, String debit, String credit, String suspicionObserved1,
			String countryOfCitizenshipOthers, String reasonForRedFlag1) {
		super();
		this.customerId = customerId;
		this.accountType = accountType;
		this.name = name;
		this.accountNumber = accountNumber;
		this.dateOfBirth = dateOfBirth;
		this.placeOfBirth = placeOfBirth;
		this.nationality = nationality;
		this.accountOpeningDate = accountOpeningDate;
		this.countryOfCitizenship = countryOfCitizenship;
		this.countryOfCurrentResidency = countryOfCurrentResidency;
		this.occupation = occupation;
		this.businessActivity = businessActivity;
		this.annualIncome = annualIncome;
		this.sourceOfFunds = sourceOfFunds;
		this.purposeOfAccountOpening = purposeOfAccountOpening;
		this.taxRegistration = taxRegistration;
		this.taxIdNumber = taxIdNumber;
		this.primaryAddress = primaryAddress;
		this.primaryAddressCountry = primaryAddressCountry;
		this.primaryAddressCity = primaryAddressCity;
		this.primaryAddressPoBox = primaryAddressPoBox;
		this.mobileNumber = mobileNumber;
		this.primaryTelephone = primaryTelephone;
		this.secondaryTelephone = secondaryTelephone;
		this.emailId = emailId;
		this.residentialStatusChanged = residentialStatusChanged;
		this.newCountryOfResidency = newCountryOfResidency;
		this.newCityOfResidency = newCityOfResidency;
		this.newPoBoxOfResidency = newPoBoxOfResidency;
		this.jointHolder1Name = jointHolder1Name;
		this.jointHolder1Address = jointHolder1Address;
		this.jointHolder1AddressCountry = jointHolder1AddressCountry;
		this.jointHolder1AddressCity = jointHolder1AddressCity;
		this.jointHolder1AddressPoBox = jointHolder1AddressPoBox;
		this.jointHolder1Mobile = jointHolder1Mobile;
		this.jointHolder1PrimaryTelephone = jointHolder1PrimaryTelephone;
		this.jointHolder1SecondaryTelephone = jointHolder1SecondaryTelephone;
		this.jointHolder1Email = jointHolder1Email;
		this.jointHolder1ResidentialStatusChanged = jointHolder1ResidentialStatusChanged;
		this.jointHolder1NewCountryOfResidency = jointHolder1NewCountryOfResidency;
		this.jointHolder1NewCityOfResidency = jointHolder1NewCityOfResidency;
		this.jointHolder1NewPoBoxOfResidency = jointHolder1NewPoBoxOfResidency;
		this.jointHolder2Name = jointHolder2Name;
		this.jointHolder2Address = jointHolder2Address;
		this.jointHolder2AddressCountry = jointHolder2AddressCountry;
		this.jointHolder2AddressCity = jointHolder2AddressCity;
		this.jointHolder2AddressPoBox = jointHolder2AddressPoBox;
		this.jointHolder2Mobile = jointHolder2Mobile;
		this.jointHolder2PrimaryTelephone = jointHolder2PrimaryTelephone;
		this.jointHolder2SecondaryTelephone = jointHolder2SecondaryTelephone;
		this.jointHolder2Email = jointHolder2Email;
		this.jointHolder2ResidentialStatusChanged = jointHolder2ResidentialStatusChanged;
		this.jointHolder2NewCountryOfResidency = jointHolder2NewCountryOfResidency;
		this.jointHolder2NewCityOfResidency = jointHolder2NewCityOfResidency;
		this.jointHolder2NewPoBoxOfResidency = jointHolder2NewPoBoxOfResidency;
		this.primaryAccountHolderNationality = primaryAccountHolderNationality;
		this.jointAccountHolder1Nationality = jointAccountHolder1Nationality;
		this.jointAccountHolder2Nationality = jointAccountHolder2Nationality;
		this.primaryAccountHolderPassport = primaryAccountHolderPassport;
		this.jointAccountHolder1Passport = jointAccountHolder1Passport;
		this.jointAccountHolder2Passport = jointAccountHolder2Passport;
		this.primaryAccountHolderVisaEid = primaryAccountHolderVisaEid;
		this.jointAccountHolder1VisaEid = jointAccountHolder1VisaEid;
		this.jointAccountHolder2VisaEid = jointAccountHolder2VisaEid;
		this.primaryAccountHolderValidResidence = primaryAccountHolderValidResidence;
		this.jointAccountHolder1ValidResidence = jointAccountHolder1ValidResidence;
		this.jointAccountHolder2ValidResidence = jointAccountHolder2ValidResidence;
		this.primaryAccountHolderProofSourceIncome = primaryAccountHolderProofSourceIncome;
		this.jointAccountHolder1ProofSourceIncome = jointAccountHolder1ProofSourceIncome;
		this.jointAccountHolder2ProofSourceIncome = jointAccountHolder2ProofSourceIncome;
		this.linkedAccount1Name = linkedAccount1Name;
		this.linkedAccount1Number = linkedAccount1Number;
		this.linkedAccount1Type = linkedAccount1Type;
		this.linkedAccount1OpeningDate = linkedAccount1OpeningDate;
		this.linkedAccount1Currency = linkedAccount1Currency;
		this.linkedAccount1Status = linkedAccount1Status;
		this.linkedAccount2Name = linkedAccount2Name;
		this.linkedAccount2Number = linkedAccount2Number;
		this.linkedAccount2Type = linkedAccount2Type;
		this.linkedAccount2OpeningDate = linkedAccount2OpeningDate;
		this.linkedAccount2Currency = linkedAccount2Currency;
		this.linkedAccount2Status = linkedAccount2Status;
		this.linkedAccount3Name = linkedAccount3Name;
		this.linkedAccount3Number = linkedAccount3Number;
		this.linkedAccount3Type = linkedAccount3Type;
		this.linkedAccount3OpeningDate = linkedAccount3OpeningDate;
		this.linkedAccount3Currency = linkedAccount3Currency;
		this.linkedAccount3Status = linkedAccount3Status;
		this.linkedAccount4Name = linkedAccount4Name;
		this.linkedAccount4Number = linkedAccount4Number;
		this.linkedAccount4Type = linkedAccount4Type;
		this.linkedAccount4OpeningDate = linkedAccount4OpeningDate;
		this.linkedAccount4Currency = linkedAccount4Currency;
		this.linkedAccount4Status = linkedAccount4Status;
		this.accountSatisfactory = accountSatisfactory;
		this.transactionCommensurate = transactionCommensurate;
		this.highValueTransactionsObserved = highValueTransactionsObserved;
		this.highValueTransactionsDetails1 = highValueTransactionsDetails1;
		this.highValueTransactionsDetails2 = highValueTransactionsDetails2;
		this.highValueTransactionsDetails3 = highValueTransactionsDetails3;
		this.highValueTransactionsDetails4 = highValueTransactionsDetails4;
		this.suspicionObserved = suspicionObserved;
		this.suspicionObservedDetails = suspicionObservedDetails;
		this.branchSatisfiedWithTransactions = branchSatisfiedWithTransactions;
		this.supportingDocumentObtained = supportingDocumentObtained;
		this.currentTurnover = currentTurnover;
		this.expectedTurnover = expectedTurnover;
		this.expectedTransactionTypes = expectedTransactionTypes;
		this.expectedTransactionVolume = expectedTransactionVolume;
		this.transactionFrequency = transactionFrequency;
		this.knownCountriesOfTransaction1 = knownCountriesOfTransaction1;
		this.knownCountriesOfTransaction2 = knownCountriesOfTransaction2;
		this.knownCountriesOfTransaction3 = knownCountriesOfTransaction3;
		this.knownCountriesOfTransaction4 = knownCountriesOfTransaction4;
		this.otherExpectedCountries1 = otherExpectedCountries1;
		this.otherExpectedCountries2 = otherExpectedCountries2;
		this.otherExpectedCountries3 = otherExpectedCountries3;
		this.otherExpectedCountries4 = otherExpectedCountries4;
		this.uae = uae;
		this.un = un;
		this.ofac = ofac;
		this.hmt = hmt;
		this.eu = eu;
		this.others = others;
		this.cbuCheckDone = cbuCheckDone;
		this.googleMediaSearch = googleMediaSearch;
		this.internalDenyListScreening = internalDenyListScreening;
		this.supportingDocumentObtained2 = supportingDocumentObtained2;
		this.jointUae = jointUae;
		this.jointUn = jointUn;
		this.jointOfac = jointOfac;
		this.jointHmt = jointHmt;
		this.jointEu = jointEu;
		this.jointOthers = jointOthers;
		this.jointCbuCheckDone = jointCbuCheckDone;
		this.jointGoogleMediaSearch = jointGoogleMediaSearch;
		this.jointInternalDenyListScreening = jointInternalDenyListScreening;
		this.jointSuspicionObserved = jointSuspicionObserved;
		this.jointSupportingDocumentObtained = jointSupportingDocumentObtained;
		this.isPep = isPep;
		this.seniorManagementApproval = seniorManagementApproval;
		this.foreignCurrencyRequest = foreignCurrencyRequest;
		this.seniorManagementApprovalFc = seniorManagementApprovalFc;
		this.customerRisk = customerRisk;
		this.highRiskReason = highRiskReason;
		this.furtherDueDiligence = furtherDueDiligence;
		this.observationsOfBankOfficial = observationsOfBankOfficial;
		this.accountOpeningOfficerSignature = accountOpeningOfficerSignature;
		this.accountOpeningOfficerName = accountOpeningOfficerName;
		this.accountOpeningOfficerDesignation = accountOpeningOfficerDesignation;
		this.accountOpeningOfficerDate = accountOpeningOfficerDate;
		this.branchOfficialSignature = branchOfficialSignature;
		this.branchOfficialName = branchOfficialName;
		this.branchOfficialDesignation = branchOfficialDesignation;
		this.branchOfficialDate = branchOfficialDate;
		this.entityFlg = entityFlg;
		this.modifyFlg = modifyFlg;
		this.delFlg = delFlg;
		this.entryUser = entryUser;
		this.modifyUser = modifyUser;
		this.verifyUser = verifyUser;
		this.entryTime = entryTime;
		this.modifyTime = modifyTime;
		this.verifyTime = verifyTime;
		this.debit = debit;
		this.credit = credit;
		this.suspicionObserved1 = suspicionObserved1;
		this.countryOfCitizenshipOthers = countryOfCitizenshipOthers;
		this.reasonForRedFlag1 = reasonForRedFlag1;
	}

	public KYC_I() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "KYC_I [customerId=" + customerId + ", accountType=" + accountType + ", name=" + name
				+ ", accountNumber=" + accountNumber + ", dateOfBirth=" + dateOfBirth + ", placeOfBirth=" + placeOfBirth
				+ ", nationality=" + nationality + ", accountOpeningDate=" + accountOpeningDate
				+ ", countryOfCitizenship=" + countryOfCitizenship + ", countryOfCurrentResidency="
				+ countryOfCurrentResidency + ", occupation=" + occupation + ", businessActivity=" + businessActivity
				+ ", annualIncome=" + annualIncome + ", sourceOfFunds=" + sourceOfFunds + ", purposeOfAccountOpening="
				+ purposeOfAccountOpening + ", taxRegistration=" + taxRegistration + ", taxIdNumber=" + taxIdNumber
				+ ", primaryAddress=" + primaryAddress + ", primaryAddressCountry=" + primaryAddressCountry
				+ ", primaryAddressCity=" + primaryAddressCity + ", primaryAddressPoBox=" + primaryAddressPoBox
				+ ", mobileNumber=" + mobileNumber + ", primaryTelephone=" + primaryTelephone + ", secondaryTelephone="
				+ secondaryTelephone + ", emailId=" + emailId + ", residentialStatusChanged=" + residentialStatusChanged
				+ ", newCountryOfResidency=" + newCountryOfResidency + ", newCityOfResidency=" + newCityOfResidency
				+ ", newPoBoxOfResidency=" + newPoBoxOfResidency + ", jointHolder1Name=" + jointHolder1Name
				+ ", jointHolder1Address=" + jointHolder1Address + ", jointHolder1AddressCountry="
				+ jointHolder1AddressCountry + ", jointHolder1AddressCity=" + jointHolder1AddressCity
				+ ", jointHolder1AddressPoBox=" + jointHolder1AddressPoBox + ", jointHolder1Mobile="
				+ jointHolder1Mobile + ", jointHolder1PrimaryTelephone=" + jointHolder1PrimaryTelephone
				+ ", jointHolder1SecondaryTelephone=" + jointHolder1SecondaryTelephone + ", jointHolder1Email="
				+ jointHolder1Email + ", jointHolder1ResidentialStatusChanged=" + jointHolder1ResidentialStatusChanged
				+ ", jointHolder1NewCountryOfResidency=" + jointHolder1NewCountryOfResidency
				+ ", jointHolder1NewCityOfResidency=" + jointHolder1NewCityOfResidency
				+ ", jointHolder1NewPoBoxOfResidency=" + jointHolder1NewPoBoxOfResidency + ", jointHolder2Name="
				+ jointHolder2Name + ", jointHolder2Address=" + jointHolder2Address + ", jointHolder2AddressCountry="
				+ jointHolder2AddressCountry + ", jointHolder2AddressCity=" + jointHolder2AddressCity
				+ ", jointHolder2AddressPoBox=" + jointHolder2AddressPoBox + ", jointHolder2Mobile="
				+ jointHolder2Mobile + ", jointHolder2PrimaryTelephone=" + jointHolder2PrimaryTelephone
				+ ", jointHolder2SecondaryTelephone=" + jointHolder2SecondaryTelephone + ", jointHolder2Email="
				+ jointHolder2Email + ", jointHolder2ResidentialStatusChanged=" + jointHolder2ResidentialStatusChanged
				+ ", jointHolder2NewCountryOfResidency=" + jointHolder2NewCountryOfResidency
				+ ", jointHolder2NewCityOfResidency=" + jointHolder2NewCityOfResidency
				+ ", jointHolder2NewPoBoxOfResidency=" + jointHolder2NewPoBoxOfResidency
				+ ", primaryAccountHolderNationality=" + primaryAccountHolderNationality
				+ ", jointAccountHolder1Nationality=" + jointAccountHolder1Nationality
				+ ", jointAccountHolder2Nationality=" + jointAccountHolder2Nationality
				+ ", primaryAccountHolderPassport=" + primaryAccountHolderPassport + ", jointAccountHolder1Passport="
				+ jointAccountHolder1Passport + ", jointAccountHolder2Passport=" + jointAccountHolder2Passport
				+ ", primaryAccountHolderVisaEid=" + primaryAccountHolderVisaEid + ", jointAccountHolder1VisaEid="
				+ jointAccountHolder1VisaEid + ", jointAccountHolder2VisaEid=" + jointAccountHolder2VisaEid
				+ ", primaryAccountHolderValidResidence=" + primaryAccountHolderValidResidence
				+ ", jointAccountHolder1ValidResidence=" + jointAccountHolder1ValidResidence
				+ ", jointAccountHolder2ValidResidence=" + jointAccountHolder2ValidResidence
				+ ", primaryAccountHolderProofSourceIncome=" + primaryAccountHolderProofSourceIncome
				+ ", jointAccountHolder1ProofSourceIncome=" + jointAccountHolder1ProofSourceIncome
				+ ", jointAccountHolder2ProofSourceIncome=" + jointAccountHolder2ProofSourceIncome
				+ ", linkedAccount1Name=" + linkedAccount1Name + ", linkedAccount1Number=" + linkedAccount1Number
				+ ", linkedAccount1Type=" + linkedAccount1Type + ", linkedAccount1OpeningDate="
				+ linkedAccount1OpeningDate + ", linkedAccount1Currency=" + linkedAccount1Currency
				+ ", linkedAccount1Status=" + linkedAccount1Status + ", linkedAccount2Name=" + linkedAccount2Name
				+ ", linkedAccount2Number=" + linkedAccount2Number + ", linkedAccount2Type=" + linkedAccount2Type
				+ ", linkedAccount2OpeningDate=" + linkedAccount2OpeningDate + ", linkedAccount2Currency="
				+ linkedAccount2Currency + ", linkedAccount2Status=" + linkedAccount2Status + ", linkedAccount3Name="
				+ linkedAccount3Name + ", linkedAccount3Number=" + linkedAccount3Number + ", linkedAccount3Type="
				+ linkedAccount3Type + ", linkedAccount3OpeningDate=" + linkedAccount3OpeningDate
				+ ", linkedAccount3Currency=" + linkedAccount3Currency + ", linkedAccount3Status="
				+ linkedAccount3Status + ", linkedAccount4Name=" + linkedAccount4Name + ", linkedAccount4Number="
				+ linkedAccount4Number + ", linkedAccount4Type=" + linkedAccount4Type + ", linkedAccount4OpeningDate="
				+ linkedAccount4OpeningDate + ", linkedAccount4Currency=" + linkedAccount4Currency
				+ ", linkedAccount4Status=" + linkedAccount4Status + ", accountSatisfactory=" + accountSatisfactory
				+ ", transactionCommensurate=" + transactionCommensurate + ", highValueTransactionsObserved="
				+ highValueTransactionsObserved + ", highValueTransactionsDetails1=" + highValueTransactionsDetails1
				+ ", highValueTransactionsDetails2=" + highValueTransactionsDetails2
				+ ", highValueTransactionsDetails3=" + highValueTransactionsDetails3
				+ ", highValueTransactionsDetails4=" + highValueTransactionsDetails4 + ", suspicionObserved="
				+ suspicionObserved + ", suspicionObservedDetails=" + suspicionObservedDetails
				+ ", branchSatisfiedWithTransactions=" + branchSatisfiedWithTransactions
				+ ", supportingDocumentObtained=" + supportingDocumentObtained + ", currentTurnover=" + currentTurnover
				+ ", expectedTurnover=" + expectedTurnover + ", expectedTransactionTypes=" + expectedTransactionTypes
				+ ", expectedTransactionVolume=" + expectedTransactionVolume + ", transactionFrequency="
				+ transactionFrequency + ", knownCountriesOfTransaction1=" + knownCountriesOfTransaction1
				+ ", knownCountriesOfTransaction2=" + knownCountriesOfTransaction2 + ", knownCountriesOfTransaction3="
				+ knownCountriesOfTransaction3 + ", knownCountriesOfTransaction4=" + knownCountriesOfTransaction4
				+ ", otherExpectedCountries1=" + otherExpectedCountries1 + ", otherExpectedCountries2="
				+ otherExpectedCountries2 + ", otherExpectedCountries3=" + otherExpectedCountries3
				+ ", otherExpectedCountries4=" + otherExpectedCountries4 + ", uae=" + uae + ", un=" + un + ", ofac="
				+ ofac + ", hmt=" + hmt + ", eu=" + eu + ", others=" + others + ", cbuCheckDone=" + cbuCheckDone
				+ ", googleMediaSearch=" + googleMediaSearch + ", internalDenyListScreening="
				+ internalDenyListScreening + ", supportingDocumentObtained2=" + supportingDocumentObtained2
				+ ", jointUae=" + jointUae + ", jointUn=" + jointUn + ", jointOfac=" + jointOfac + ", jointHmt="
				+ jointHmt + ", jointEu=" + jointEu + ", jointOthers=" + jointOthers + ", jointCbuCheckDone="
				+ jointCbuCheckDone + ", jointGoogleMediaSearch=" + jointGoogleMediaSearch
				+ ", jointInternalDenyListScreening=" + jointInternalDenyListScreening + ", jointSuspicionObserved="
				+ jointSuspicionObserved + ", jointSupportingDocumentObtained=" + jointSupportingDocumentObtained
				+ ", isPep=" + isPep + ", seniorManagementApproval=" + seniorManagementApproval
				+ ", foreignCurrencyRequest=" + foreignCurrencyRequest + ", seniorManagementApprovalFc="
				+ seniorManagementApprovalFc + ", customerRisk=" + customerRisk + ", highRiskReason=" + highRiskReason
				+ ", furtherDueDiligence=" + furtherDueDiligence + ", observationsOfBankOfficial="
				+ observationsOfBankOfficial + ", accountOpeningOfficerSignature=" + accountOpeningOfficerSignature
				+ ", accountOpeningOfficerName=" + accountOpeningOfficerName + ", accountOpeningOfficerDesignation="
				+ accountOpeningOfficerDesignation + ", accountOpeningOfficerDate=" + accountOpeningOfficerDate
				+ ", branchOfficialSignature=" + branchOfficialSignature + ", branchOfficialName=" + branchOfficialName
				+ ", branchOfficialDesignation=" + branchOfficialDesignation + ", branchOfficialDate="
				+ branchOfficialDate + ", entityFlg=" + entityFlg + ", modifyFlg=" + modifyFlg + ", delFlg=" + delFlg
				+ ", entryUser=" + entryUser + ", modifyUser=" + modifyUser + ", verifyUser=" + verifyUser
				+ ", entryTime=" + entryTime + ", modifyTime=" + modifyTime + ", verifyTime=" + verifyTime + ", debit="
				+ debit + ", credit=" + credit + ", suspicionObserved1=" + suspicionObserved1
				+ ", countryOfCitizenshipOthers=" + countryOfCitizenshipOthers + ", reasonForRedFlag1="
				+ reasonForRedFlag1 + ", getCustomerId()=" + getCustomerId() + ", getAccountType()=" + getAccountType()
				+ ", getName()=" + getName() + ", getAccountNumber()=" + getAccountNumber() + ", getDateOfBirth()="
				+ getDateOfBirth() + ", getPlaceOfBirth()=" + getPlaceOfBirth() + ", getNationality()="
				+ getNationality() + ", getAccountOpeningDate()=" + getAccountOpeningDate()
				+ ", getCountryOfCitizenship()=" + getCountryOfCitizenship() + ", getCountryOfCurrentResidency()="
				+ getCountryOfCurrentResidency() + ", getOccupation()=" + getOccupation() + ", getBusinessActivity()="
				+ getBusinessActivity() + ", getAnnualIncome()=" + getAnnualIncome() + ", getSourceOfFunds()="
				+ getSourceOfFunds() + ", getPurposeOfAccountOpening()=" + getPurposeOfAccountOpening()
				+ ", getTaxRegistration()=" + getTaxRegistration() + ", getTaxIdNumber()=" + getTaxIdNumber()
				+ ", getPrimaryAddress()=" + getPrimaryAddress() + ", getPrimaryAddressCountry()="
				+ getPrimaryAddressCountry() + ", getPrimaryAddressCity()=" + getPrimaryAddressCity()
				+ ", getPrimaryAddressPoBox()=" + getPrimaryAddressPoBox() + ", getMobileNumber()=" + getMobileNumber()
				+ ", getPrimaryTelephone()=" + getPrimaryTelephone() + ", getSecondaryTelephone()="
				+ getSecondaryTelephone() + ", getEmailId()=" + getEmailId() + ", getResidentialStatusChanged()="
				+ getResidentialStatusChanged() + ", getNewCountryOfResidency()=" + getNewCountryOfResidency()
				+ ", getNewCityOfResidency()=" + getNewCityOfResidency() + ", getNewPoBoxOfResidency()="
				+ getNewPoBoxOfResidency() + ", getJointHolder1Name()=" + getJointHolder1Name()
				+ ", getJointHolder1Address()=" + getJointHolder1Address() + ", getJointHolder1AddressCountry()="
				+ getJointHolder1AddressCountry() + ", getJointHolder1AddressCity()=" + getJointHolder1AddressCity()
				+ ", getJointHolder1AddressPoBox()=" + getJointHolder1AddressPoBox() + ", getJointHolder1Mobile()="
				+ getJointHolder1Mobile() + ", getJointHolder1PrimaryTelephone()=" + getJointHolder1PrimaryTelephone()
				+ ", getJointHolder1SecondaryTelephone()=" + getJointHolder1SecondaryTelephone()
				+ ", getJointHolder1Email()=" + getJointHolder1Email() + ", getJointHolder1ResidentialStatusChanged()="
				+ getJointHolder1ResidentialStatusChanged() + ", getJointHolder1NewCountryOfResidency()="
				+ getJointHolder1NewCountryOfResidency() + ", getJointHolder1NewCityOfResidency()="
				+ getJointHolder1NewCityOfResidency() + ", getJointHolder1NewPoBoxOfResidency()="
				+ getJointHolder1NewPoBoxOfResidency() + ", getJointHolder2Name()=" + getJointHolder2Name()
				+ ", getJointHolder2Address()=" + getJointHolder2Address() + ", getJointHolder2AddressCountry()="
				+ getJointHolder2AddressCountry() + ", getJointHolder2AddressCity()=" + getJointHolder2AddressCity()
				+ ", getJointHolder2AddressPoBox()=" + getJointHolder2AddressPoBox() + ", getJointHolder2Mobile()="
				+ getJointHolder2Mobile() + ", getJointHolder2PrimaryTelephone()=" + getJointHolder2PrimaryTelephone()
				+ ", getJointHolder2SecondaryTelephone()=" + getJointHolder2SecondaryTelephone()
				+ ", getJointHolder2Email()=" + getJointHolder2Email() + ", getJointHolder2ResidentialStatusChanged()="
				+ getJointHolder2ResidentialStatusChanged() + ", getJointHolder2NewCountryOfResidency()="
				+ getJointHolder2NewCountryOfResidency() + ", getJointHolder2NewCityOfResidency()="
				+ getJointHolder2NewCityOfResidency() + ", getJointHolder2NewPoBoxOfResidency()="
				+ getJointHolder2NewPoBoxOfResidency() + ", getPrimaryAccountHolderNationality()="
				+ getPrimaryAccountHolderNationality() + ", getJointAccountHolder1Nationality()="
				+ getJointAccountHolder1Nationality() + ", getJointAccountHolder2Nationality()="
				+ getJointAccountHolder2Nationality() + ", getPrimaryAccountHolderPassport()="
				+ getPrimaryAccountHolderPassport() + ", getJointAccountHolder1Passport()="
				+ getJointAccountHolder1Passport() + ", getJointAccountHolder2Passport()="
				+ getJointAccountHolder2Passport() + ", getPrimaryAccountHolderVisaEid()="
				+ getPrimaryAccountHolderVisaEid() + ", getJointAccountHolder1VisaEid()="
				+ getJointAccountHolder1VisaEid() + ", getJointAccountHolder2VisaEid()="
				+ getJointAccountHolder2VisaEid() + ", getPrimaryAccountHolderValidResidence()="
				+ getPrimaryAccountHolderValidResidence() + ", getJointAccountHolder1ValidResidence()="
				+ getJointAccountHolder1ValidResidence() + ", getJointAccountHolder2ValidResidence()="
				+ getJointAccountHolder2ValidResidence() + ", getPrimaryAccountHolderProofSourceIncome()="
				+ getPrimaryAccountHolderProofSourceIncome() + ", getJointAccountHolder1ProofSourceIncome()="
				+ getJointAccountHolder1ProofSourceIncome() + ", getJointAccountHolder2ProofSourceIncome()="
				+ getJointAccountHolder2ProofSourceIncome() + ", getLinkedAccount1Name()=" + getLinkedAccount1Name()
				+ ", getLinkedAccount1Number()=" + getLinkedAccount1Number() + ", getLinkedAccount1Type()="
				+ getLinkedAccount1Type() + ", getLinkedAccount1OpeningDate()=" + getLinkedAccount1OpeningDate()
				+ ", getLinkedAccount1Currency()=" + getLinkedAccount1Currency() + ", getLinkedAccount1Status()="
				+ getLinkedAccount1Status() + ", getLinkedAccount2Name()=" + getLinkedAccount2Name()
				+ ", getLinkedAccount2Number()=" + getLinkedAccount2Number() + ", getLinkedAccount2Type()="
				+ getLinkedAccount2Type() + ", getLinkedAccount2OpeningDate()=" + getLinkedAccount2OpeningDate()
				+ ", getLinkedAccount2Currency()=" + getLinkedAccount2Currency() + ", getLinkedAccount2Status()="
				+ getLinkedAccount2Status() + ", getLinkedAccount3Name()=" + getLinkedAccount3Name()
				+ ", getLinkedAccount3Number()=" + getLinkedAccount3Number() + ", getLinkedAccount3Type()="
				+ getLinkedAccount3Type() + ", getLinkedAccount3OpeningDate()=" + getLinkedAccount3OpeningDate()
				+ ", getLinkedAccount3Currency()=" + getLinkedAccount3Currency() + ", getLinkedAccount3Status()="
				+ getLinkedAccount3Status() + ", getLinkedAccount4Name()=" + getLinkedAccount4Name()
				+ ", getLinkedAccount4Number()=" + getLinkedAccount4Number() + ", getLinkedAccount4Type()="
				+ getLinkedAccount4Type() + ", getLinkedAccount4OpeningDate()=" + getLinkedAccount4OpeningDate()
				+ ", getLinkedAccount4Currency()=" + getLinkedAccount4Currency() + ", getLinkedAccount4Status()="
				+ getLinkedAccount4Status() + ", getAccountSatisfactory()=" + getAccountSatisfactory()
				+ ", getTransactionCommensurate()=" + getTransactionCommensurate()
				+ ", getHighValueTransactionsObserved()=" + getHighValueTransactionsObserved()
				+ ", getHighValueTransactionsDetails1()=" + getHighValueTransactionsDetails1()
				+ ", getHighValueTransactionsDetails2()=" + getHighValueTransactionsDetails2()
				+ ", getHighValueTransactionsDetails3()=" + getHighValueTransactionsDetails3()
				+ ", getHighValueTransactionsDetails4()=" + getHighValueTransactionsDetails4()
				+ ", getSuspicionObserved()=" + getSuspicionObserved() + ", getSuspicionObservedDetails()="
				+ getSuspicionObservedDetails() + ", getBranchSatisfiedWithTransactions()="
				+ getBranchSatisfiedWithTransactions() + ", getSupportingDocumentObtained()="
				+ getSupportingDocumentObtained() + ", getCurrentTurnover()=" + getCurrentTurnover()
				+ ", getExpectedTurnover()=" + getExpectedTurnover() + ", getExpectedTransactionTypes()="
				+ getExpectedTransactionTypes() + ", getExpectedTransactionVolume()=" + getExpectedTransactionVolume()
				+ ", getTransactionFrequency()=" + getTransactionFrequency() + ", getKnownCountriesOfTransaction1()="
				+ getKnownCountriesOfTransaction1() + ", getKnownCountriesOfTransaction2()="
				+ getKnownCountriesOfTransaction2() + ", getKnownCountriesOfTransaction3()="
				+ getKnownCountriesOfTransaction3() + ", getKnownCountriesOfTransaction4()="
				+ getKnownCountriesOfTransaction4() + ", getOtherExpectedCountries1()=" + getOtherExpectedCountries1()
				+ ", getOtherExpectedCountries2()=" + getOtherExpectedCountries2() + ", getOtherExpectedCountries3()="
				+ getOtherExpectedCountries3() + ", getOtherExpectedCountries4()=" + getOtherExpectedCountries4()
				+ ", getUae()=" + getUae() + ", getUn()=" + getUn() + ", getOfac()=" + getOfac() + ", getHmt()="
				+ getHmt() + ", getEu()=" + getEu() + ", getOthers()=" + getOthers() + ", getCbuCheckDone()="
				+ getCbuCheckDone() + ", getGoogleMediaSearch()=" + getGoogleMediaSearch()
				+ ", getInternalDenyListScreening()=" + getInternalDenyListScreening()
				+ ", getSupportingDocumentObtained2()=" + getSupportingDocumentObtained2() + ", getJointUae()="
				+ getJointUae() + ", getJointUn()=" + getJointUn() + ", getJointOfac()=" + getJointOfac()
				+ ", getJointHmt()=" + getJointHmt() + ", getJointEu()=" + getJointEu() + ", getJointOthers()="
				+ getJointOthers() + ", getJointCbuCheckDone()=" + getJointCbuCheckDone()
				+ ", getJointGoogleMediaSearch()=" + getJointGoogleMediaSearch()
				+ ", getJointInternalDenyListScreening()=" + getJointInternalDenyListScreening()
				+ ", getJointSuspicionObserved()=" + getJointSuspicionObserved()
				+ ", getJointSupportingDocumentObtained()=" + getJointSupportingDocumentObtained() + ", getIsPep()="
				+ getIsPep() + ", getSeniorManagementApproval()=" + getSeniorManagementApproval()
				+ ", getForeignCurrencyRequest()=" + getForeignCurrencyRequest() + ", getSeniorManagementApprovalFc()="
				+ getSeniorManagementApprovalFc() + ", getCustomerRisk()=" + getCustomerRisk()
				+ ", getHighRiskReason()=" + getHighRiskReason() + ", getFurtherDueDiligence()="
				+ getFurtherDueDiligence() + ", getObservationsOfBankOfficial()=" + getObservationsOfBankOfficial()
				+ ", getAccountOpeningOfficerSignature()=" + getAccountOpeningOfficerSignature()
				+ ", getAccountOpeningOfficerName()=" + getAccountOpeningOfficerName()
				+ ", getAccountOpeningOfficerDesignation()=" + getAccountOpeningOfficerDesignation()
				+ ", getAccountOpeningOfficerDate()=" + getAccountOpeningOfficerDate()
				+ ", getBranchOfficialSignature()=" + getBranchOfficialSignature() + ", getBranchOfficialName()="
				+ getBranchOfficialName() + ", getBranchOfficialDesignation()=" + getBranchOfficialDesignation()
				+ ", getBranchOfficialDate()=" + getBranchOfficialDate() + ", getEntityFlg()=" + getEntityFlg()
				+ ", getModifyFlg()=" + getModifyFlg() + ", getDelFlg()=" + getDelFlg() + ", getEntryUser()="
				+ getEntryUser() + ", getModifyUser()=" + getModifyUser() + ", getVerifyUser()=" + getVerifyUser()
				+ ", getEntryTime()=" + getEntryTime() + ", getModifyTime()=" + getModifyTime() + ", getVerifyTime()="
				+ getVerifyTime() + ", getDebit()=" + getDebit() + ", getCredit()=" + getCredit()
				+ ", getSuspicionObserved1()=" + getSuspicionObserved1() + ", getCountryOfCitizenshipOthers()="
				+ getCountryOfCitizenshipOthers() + ", getReasonForRedFlag1()=" + getReasonForRedFlag1()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
