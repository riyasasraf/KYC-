package com.bornfire.xbrl.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "kyc_corp")
public class Kyc_Corprate {
	@Column(name = "COMPANY_NAME")
	private String CompanyName;

	@Id
	@Column(name = "CUSTOMER_ID")
	private String CustomerId;
	@Column(name = "ACCOUNT_NUMBER")
	private String AccountNumber;
	@Column(name = "LEGAL_STATUS")
	private String LegalStatus;
	@Column(name = "TRADE_LICENSE_NUMBER")
	private String TradeLicenseNumber;
	@Column(name = "TRADE_LICENSE_ISSUE_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date TradeLicenseIssueDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "TRADE_LICENSE_EXPIRY_DATE")
	private Date TradeLicenseExpiryDate;
	@Column(name = "COUNTRY_OF_ESTABLISHMENT")
	private String CountryOfEstablishment;
	@Column(name = "COUNTRY_OF_OPERATION")
	private String CountryOfOperation;
	@Column(name = "BUSINESS_ACTIVITY")
	private String BusinessActivity;
	@Column(name = "PRODUCTS_SERVICES")
	private String ProductsServices;
	@Column(name = "TRADE_LICENSE")
	private String TradeLicense;
	@Column(name = "MEMORANDUM_OF_ASSOCIATION")
	private String MemorandumOfAssociation;
	@Column(name = "SHARE_CERTIFICATE")
	private String ShareCertificate;
	@Column(name = "CERTIFICATE_OF_INCORPORATION")
	private String CertificateOfIncorporation;
	@Column(name = "OTHER_DOCUMENTS")
	private String OtherDocuments;
	@Column(name = "GOVERNMENT_TENANCY_DOCUMENT")
	private String GovernmentTenancyDocument;
	@Column(name = "UTILITY_BILL")
	private String UtilityBill;
	@Column(name = "FLEXI_DESK_AGREEMENT")
	private String FlexiDeskAgreement;
	@Column(name = "CO_WORKING_AGREEMENT")
	private String CoWorkingAgreement;
	@Column(name = "OFFICE_SHARING_AGREEMENT")
	private String OfficeSharingAgreement;
	@Column(name = "OTHER_ADDRESS_PROOF")
	private String OtherAddressProof;
	@Column(name = "OTHER_BUSINESS_PROOF")
	private String OtherBusinessProof;
	@Column(name = "BANK_ACCOUNT_STATEMENT")
	private String BankAccountStatement;
	@Column(name = "AUDITED_COMPANY_FINANCIALS")
	private String AuditedCompanyFinancials;
	@Column(name = "PERSONAL_BANK_ACCOUNT_STATEMENT")
	private String PersonalBankAccountStatement;
	@Column(name = "OTHER_EQUIVALENT_DOCUMENTS")
	private String OtherEquivalentDocuments;
	@Column(name = "UBO_DIR_POA_1_NAME")
	private String UboDirPoa1Name;
	@Column(name = "UBO_DIR_POA_1_NATIONALITY")
	private String UboDirPoa1Nationality;
	@Column(name = "UBO_DIR_POA_1_SHAREHOLDING_PERCENT")
	private Double UboDirPoa1ShareholdingPercent;
	@Column(name = "UBO_DIR_POA_1_PASSPORT")
	private String UboDirPoa1Passport;
	@Column(name = "UBO_DIR_POA_1_VISA_EID")
	private String UboDirPoa1VisaEid;
	@Column(name = "UBO_DIR_POA_1_RESIDENCE_ADDRESS")
	private String UboDirPoa1ResidenceAddress;
	@Column(name = "UBO_DIR_POA_1_PROOF_SOURCE_OF_INCOME")
	private String UboDirPoa1ProofSourceOfIncome;
	@Column(name = "UBO_DIR_POA_2_NAME")
	private String UboDirPoa2Name;
	@Column(name = "UBO_DIR_POA_2_NATIONALITY")
	private String UboDirPoa2Nationality;
	@Column(name = "UBO_DIR_POA_2_SHAREHOLDING_PERCENT")
	private Double UboDirPoa2ShareholdingPercent;
	@Column(name = "UBO_DIR_POA_2_PASSPORT")
	private String UboDirPoa2Passport;
	@Column(name = "UBO_DIR_POA_2_VISA_EID")
	private String UboDirPoa2VisaEid;
	@Column(name = "UBO_DIR_POA_2_RESIDENCE_ADDRESS")
	private String UboDirPoa2ResidenceAddress;
	@Column(name = "UBO_DIR_POA_2_PROOF_SOURCE_OF_INCOME")
	private String UboDirPoa2ProofSourceOfIncome;
	@Column(name = "UBO_DIR_POA_3_NAME")
	private String UboDirPoa3Name;
	@Column(name = "UBO_DIR_POA_3_NATIONALITY")
	private String UboDirPoa3Nationality;
	@Column(name = "UBO_DIR_POA_3_SHAREHOLDING_PERCENT")
	private Double UboDirPoa3ShareholdingPercent;
	@Column(name = "UBO_DIR_POA_3_PASSPORT")
	private String UboDirPoa3Passport;
	@Column(name = "UBO_DIR_POA_3_VISA_EID")
	private String UboDirPoa3VisaEid;
	@Column(name = "UBO_DIR_POA_3_RESIDENCE_ADDRESS")
	private String UboDirPoa3ResidenceAddress;
	@Column(name = "UBO_DIR_POA_3_PROOF_SOURCE_OF_INCOME")
	private String UboDirPoa3ProofSourceOfIncome;
	@Column(name = "UBO_DIR_POA_4_NAME")
	private String UboDirPoa4Name;
	@Column(name = "UBO_DIR_POA_4_NATIONALITY")
	private String UboDirPoa4Nationality;
	@Column(name = "UBO_DIR_POA_4_SHAREHOLDING_PERCENT")
	private Double UboDirPoa4ShareholdingPercent;
	@Column(name = "UBO_DIR_POA_4_PASSPORT")
	private String UboDirPoa4Passport;
	@Column(name = "UBO_DIR_POA_4_VISA_EID")
	private String UboDirPoa4VisaEid;
	@Column(name = "UBO_DIR_POA_4_RESIDENCE_ADDRESS")
	private String UboDirPoa4ResidenceAddress;
	@Column(name = "UBO_DIR_POA_4_PROOF_SOURCE_OF_INCOME")
	private String UboDirPoa4ProofSourceOfIncome;
	@Column(name = "LINKED_ACCOUNT_NUMBER_1")
	private String LinkedAccountNumber1;
	@Column(name = "LINKED_RELATIONSHIP_DURATION_YEARS_1")
	private Double LinkedRelationshipDurationYears1;
	@Column(name = "LINKED_ACCOUNT_NUMBER_2")
	private String LinkedAccountNumber2;
	@Column(name = "LINKED_RELATIONSHIP_DURATION_YEARS_2")
	private Double LinkedRelationshipDurationYears2;
	@Column(name = "LINKED_ACCOUNT_NUMBER_3")
	private String LinkedAccountNumber3;
	@Column(name = "LINKED_RELATIONSHIP_DURATION_YEARS_3")
	private Double LinkedRelationshipDurationYears3;
	@Column(name = "LINKED_ACCOUNT_NUMBER_4")
	private String LinkedAccountNumber4;
	@Column(name = "LINKED_RELATIONSHIP_DURATION_YEARS_4")
	private Double LinkedRelationshipDurationYears4;
	@Column(name = "LINKED_ACCOUNT_NUMBER_5")
	private String LinkedAccountNumber5;
	@Column(name = "LINKED_RELATIONSHIP_DURATION_YEARS_5")
	private Double LinkedRelationshipDurationYears5;
	@Column(name = "CONDUCT_OF_ACCOUNT_SATISFACTORY")
	private String ConductOfAccountSatisfactory;
	@Column(name = "HIGH_VALUE_TRANSACTIONS_OBSERVED")
	private String HighValueTransactionsObserved;
	@Column(name = "HIGH_VALUE_TRANSACTIONS_DETAILS")
	private String HighValueTransactionsDetails;
	@Column(name = "CURRENT_TURNOVER")
	private Double CurrentTurnover;
	@Column(name = "EXPECTED_TURNOVER")
	private Double ExpectedTurnover;
	@Column(name = "EXPECTED_DEBIT_TRANSACTIONS")
	private Double ExpectedDebitTransactions;
	@Column(name = "EXPECTED_CREDIT_TRANSACTIONS")
	private Double ExpectedCreditTransactions;
	@Column(name = "EXPECTED_TRANSACTION_TYPE")
	private String ExpectedTransactionType;
	@Column(name = "EXPECTED_TRANSACTION_VOLUME")
	private Double ExpectedTransactionVolume;
	@Column(name = "FREQUENCY_OF_TRANSACTIONS")
	private String FrequencyOfTransactions;
	@Column(name = "SANCTIONS_MATCH_UAE")
	private String SanctionsMatchUae;
	@Column(name = "SANCTIONS_MATCH_UN")
	private String SanctionsMatchUn;
	@Column(name = "SANCTIONS_MATCH_OFAC")
	private String SanctionsMatchOfac;
	@Column(name = "SANCTIONS_MATCH_HMT")
	private String SanctionsMatchHmt;
	@Column(name = "SANCTIONS_MATCH_EU")
	private String SanctionsMatchEu;
	@Column(name = "COUNTERPARTY_SR_NO_1")
	private Double CounterpartySrNo1;
	@Column(name = "COUNTERPARTY_NAME_1")
	private String CounterpartyName1;
	@Column(name = "COUNTERPARTY_COUNTRY_1")
	private String CounterpartyCountry1;
	@Column(name = "COUNTERPARTY_PRODUCTS_SERVICES_1")
	private String CounterpartyProductsServices1;
	@Column(name = "COUNTERPARTY_SR_NO_2")
	private Double CounterpartySrNo2;
	@Column(name = "COUNTERPARTY_NAME_2")
	private String CounterpartyName2;
	@Column(name = "COUNTERPARTY_COUNTRY_2")
	private String CounterpartyCountry2;
	@Column(name = "COUNTERPARTY_PRODUCTS_SERVICES_2")
	private String CounterpartyProductsServices2;
	@Column(name = "COUNTERPARTY_SR_NO_3")
	private Double CounterpartySrNo3;
	@Column(name = "COUNTERPARTY_NAME_3")
	private String CounterpartyName3;
	@Column(name = "COUNTERPARTY_COUNTRY_3")
	private String CounterpartyCountry3;
	@Column(name = "COUNTERPARTY_PRODUCTS_SERVICES_3")
	private String CounterpartyProductsServices3;
	@Column(name = "COUNTERPARTY_SR_NO_4")
	private Double CounterpartySrNo4;
	@Column(name = "COUNTERPARTY_NAME_4")
	private String CounterpartyName4;
	@Column(name = "COUNTERPARTY_COUNTRY_4")
	private String CounterpartyCountry4;
	@Column(name = "COUNTERPARTY_PRODUCTS_SERVICES_4")
	private String CounterpartyProductsServices4;
	@Column(name = "INTERMEDIARY_SR_NO_1")
	private Double IntermediarySrNo1;
	@Column(name = "INTERMEDIARY_NAME_1")
	private String IntermediaryName1;
	@Column(name = "INTERMEDIARY_COUNTRY_1")
	private String IntermediaryCountry1;
	@Column(name = "INTERMEDIARY_NAME_2")
	private String IntermediaryName2;
	@Column(name = "INTERMEDIARY_COUNTRY_2")
	private String IntermediaryCountry2;
	@Column(name = "INTERMEDIARY_NAME_3")
	private String IntermediaryName3;
	@Column(name = "INTERMEDIARY_COUNTRY_3")
	private String IntermediaryCountry3;
	@Column(name = "INTERMEDIARY_NAME_4")
	private String IntermediaryName4;
	@Column(name = "INTERMEDIARY_COUNTRY_4")
	private String IntermediaryCountry4;
	@Column(name = "OPERATING_IN_HIGH_RISK_JURISDICTION")
	private String OperatingInHighRiskJurisdiction;
	@Column(name = "HIGH_RISK_JURISDICTION_COUNTRY")
	private String HighRiskJurisdictionCountry;
	@Column(name = "TRANSACTION_COUNTRY_1")
	private String TransactionCountry1;
	@Column(name = "TRANSACTION_COUNTRY_2")
	private String TransactionCountry2;
	@Column(name = "TRANSACTION_COUNTRY_3")
	private String TransactionCountry3;
	@Column(name = "TRANSACTION_COUNTRY_4")
	private String TransactionCountry4;
	@Column(name = "SANCTIONS_UAE_MATCH")
	private String SanctionsUaeMatch;
	@Column(name = "SANCTIONS_UN_MATCH")
	private String SanctionsUnMatch;
	@Column(name = "SANCTIONS_OFAC_MATCH")
	private String SanctionsOfacMatch;
	@Column(name = "SANCTIONS_HMT_MATCH")
	private String SanctionsHmtMatch;
	@Column(name = "SANCTIONS_EU_MATCH")
	private String SanctionsEuMatch;
	@Column(name = "SANCTIONS_OTHERS_MATCH")
	private String SanctionsOthersMatch;
	@Column(name = "CBUAE_BBL_CHECK_DONE")
	private String CbuaeBblCheckDone;
	@Column(name = "GOOGLE_MEDIA_SEARCH_DONE")
	private String GoogleMediaSearchDone;
	@Column(name = "INTERNAL_DENY_LIST_NAME_SCREENING")
	private String InternalDenyListNameScreening;
	@Column(name = "SUSPICION_OBSERVED")
	private String SuspicionObserved;
	@Column(name = "SUSPICION_DETAILS")
	private String SuspicionDetails;
	@Column(name = "RED_FLAG_SUPPORTING_DOCS_OBTAINED")
	private String RedFlagSupportingDocsObtained;
	@Column(name = "RED_FLAG_DETAILS")
	private String RedFlagDetails;
	@Column(name = "UBO_SANCTIONS_UAE_MATCH")
	private String UboSanctionsUaeMatch;
	@Column(name = "UBO_SANCTIONS_UN_MATCH")
	private String UboSanctionsUnMatch;
	@Column(name = "UBO_SANCTIONS_OFAC_MATCH")
	private String UboSanctionsOfacMatch;
	@Column(name = "UBO_SANCTIONS_HMT_MATCH")
	private String UboSanctionsHmtMatch;
	@Column(name = "UBO_SANCTIONS_EU_MATCH")
	private String UboSanctionsEuMatch;
	@Column(name = "UBO_SANCTIONS_OTHERS_MATCH")
	private String UboSanctionsOthersMatch;
	@Column(name = "UBO_CBUAE_BBL_CHECK_DONE")
	private String UboCbuaeBblCheckDone;
	@Column(name = "UBO_GOOGLE_MEDIA_SEARCH_DONE")
	private String UboGoogleMediaSearchDone;
	@Column(name = "UBO_INTERNAL_DENY_LIST_SCREENING")
	private String UboInternalDenyListScreening;
	@Column(name = "UBO_SUSPICION_OBSERVED")
	private String UboSuspicionObserved;
	@Column(name = "UBO_SUSPICION_DETAILS")
	private String UboSuspicionDetails;
	@Column(name = "UBO_RED_FLAG_SUPPORTING_DOCS_OBTAINED")
	private String UboRedFlagSupportingDocsObtained;
	@Column(name = "UBO_RED_FLAG_DETAILS")
	private String UboRedFlagDetails;
	@Column(name = "COUNTERPARTY_SANCTIONS_UAE_MATCH")
	private String CounterpartySanctionsUaeMatch;
	@Column(name = "COUNTERPARTY_SANCTIONS_UN_MATCH")
	private String CounterpartySanctionsUnMatch;
	@Column(name = "COUNTERPARTY_SANCTIONS_OFAC_MATCH")
	private String CounterpartySanctionsOfacMatch;
	@Column(name = "COUNTERPARTY_SANCTIONS_HMT_MATCH")
	private String CounterpartySanctionsHmtMatch;
	@Column(name = "COUNTERPARTY_SANCTIONS_EU_MATCH")
	private String CounterpartySanctionsEuMatch;
	@Column(name = "COUNTERPARTY_SANCTIONS_OTHERS_MATCH")
	private String CounterpartySanctionsOthersMatch;
	@Column(name = "COUNTERPARTY_CBUAE_BBL_CHECK_DONE")
	private String CounterpartyCbuaeBblCheckDone;
	@Column(name = "COUNTERPARTY_GOOGLE_MEDIA_SEARCH_DONE")
	private String CounterpartyGoogleMediaSearchDone;
	@Column(name = "COUNTERPARTY_INTERNAL_DENY_LIST_SCREENING")
	private String CounterpartyInternalDenyListScreening;
	@Column(name = "COUNTERPARTY_SUSPICION_OBSERVED")
	private String CounterpartySuspicionObserved;
	@Column(name = "COUNTERPARTY_SUSPICION_DETAILS")
	private String CounterpartySuspicionDetails;
	@Column(name = "COUNTERPARTY_RED_FLAG_SUPPORTING_DOCS_OBTAINED")
	private String CounterpartyRedFlagSupportingDocsObtained;
	@Column(name = "COUNTERPARTY_RED_FLAG_DETAILS")
	private String CounterpartyRedFlagDetails;
	@Column(name = "SITE_VISIT_COMPLETED")
	private String SiteVisitCompleted;
	@Column(name = "SITE_VISIT_REPORT_ATTACHED")
	private String SiteVisitReportAttached;
	@Column(name = "ADVERSE_OBSERVATIONS_SITE_VISIT")
	private String AdverseObservationsSiteVisit;
	@Column(name = "ADVERSE_OBSERVATION_DETAILS_1")
	private String AdverseObservationDetails1;
	@Column(name = "ADVERSE_OBSERVATION_DETAILS_2")
	private String AdverseObservationDetails2;
	@Column(name = "ADVERSE_OBSERVATION_DETAILS_3")
	private String AdverseObservationDetails3;
	@Column(name = "HIGH_RISK_INDIVIDUAL_POA")
	private String HighRiskIndividualPoa;
	@Column(name = "HIGH_RISK_INDIVIDUAL_POA_DETAILS")
	private String HighRiskIndividualPoaDetails;
	@Column(name = "HIGH_RISK_INDIVIDUAL_RELATIVE_POA")
	private String HighRiskIndividualRelativePoa;
	@Column(name = "HIGH_RISK_INDIVIDUAL_RELATIVE_POA_DETAILS")
	private String HighRiskIndividualRelativePoaDetails;
	@Column(name = "HIGH_RISK_DOMESTIC_INDIVIDUAL_POA")
	private String HighRiskDomesticIndividualPoa;
	@Column(name = "HIGH_RISK_DOMESTIC_INDIVIDUAL_POA_DETAILS")
	private String HighRiskDomesticIndividualPoaDetails;
	@Column(name = "HIGH_RISK_INDIVIDUAL_ENTITY_POA")
	private String HighRiskIndividualEntityPoa;
	@Column(name = "HIGH_RISK_INDIVIDUAL_ENTITY_POA_DETAILS")
	private String HighRiskIndividualEntityPoaDetails;
	@Column(name = "AUDITED_FINANCIAL_STATEMENT")
	private String AuditedFinancialStatement;
	@Column(name = "TRANSACTION_DETAILS_1")
	private String TransactionDetails1;
	@Column(name = "TRANSACTION_DETAILS_2")
	private String TransactionDetails2;
	@Column(name = "TRANSACTION_DETAILS_3")
	private String TransactionDetails3;
	@Column(name = "TRANSACTION_DETAILS_4")
	private String TransactionDetails4;
	@Column(name = "TRANSACTIONS_COMMENSURATE")
	private String TransactionsCommensurate;
	@Column(name = "BRANCH_SATISFIED")
	private String BranchSatisfied;
	@Column(name = "SUPPORTING_DOCUMENT_OBTAINED")
	private String SupportingDocumentObtained;
	@Column(name = "CUSTOMER_IS_PEP")
	private String CustomerIsPep;
	@Column(name = "SENIOR_MANAGEMENT_APPROVAL")
	private String SeniorManagementApproval;
	@Column(name = "REQUESTING_FOREIGN_CURRENCY")
	private String RequestingForeignCurrency;
	@Column(name = "SENIOR_MANAGEMENT_APPROVAL_CURRENCY")
	private String SeniorManagementApprovalCurrency;
	@Column(name = "CASH_INTENSIVE_BUSINESS_DETAIL")
	private String CashIntensiveBusinessDetail;
	@Column(name = "BUSINESS_ACTIVITY_1")
	private String BusinessActivity1;
	@Column(name = "BUSINESS_ACTIVITY_2")
	private String BusinessActivity2;
	@Column(name = "PRODUCTS_OFFERED_1")
	private String ProductsOffered1;
	@Column(name = "PRODUCTS_OFFERED_2")
	private String ProductsOffered2;
	@Column(name = "VOLUME_DEPOSIT_1")
	private Double VolumeDeposit1;
	@Column(name = "VOLUME_DEPOSIT_2")
	private Double VolumeDeposit2;
	@Column(name = "VOLUME_WITHDRAW_1")
	private Double VolumeWithdraw1;
	@Column(name = "VOLUME_WITHDRAW_2")
	private Double VolumeWithdraw2;
	@Column(name = "NUMBER_DEPOSIT_1")
	private Double NumberDeposit1;
	@Column(name = "NUMBER_DEPOSIT_2")
	private Double NumberDeposit2;
	@Column(name = "NUMBER_WITHDRAW_1")
	private Double NumberWithdraw1;
	@Column(name = "NUMBER_WITHDRAW_2")
	private Double NumberWithdraw2;
	@Column(name = "TURNOVER_DEPOSIT_1")
	private Double TurnoverDeposit1;
	@Column(name = "TURNOVER_DEPOSIT_2")
	private Double TurnoverDeposit2;
	@Column(name = "TURNOVER_WITHDRAW_1")
	private Double TurnoverWithdraw1;
	@Column(name = "TURNOVER_WITHDRAW_2")
	private Double TurnoverWithdraw2;
	@Column(name = "BROKER_OR_AGENT")
	private String BrokerOrAgent;
	@Column(name = "DEALER_OF_METALS")
	private String DealerOfMetals;
	@Column(name = "AUDITOR")
	private String Auditor;
	@Column(name = "LEGAL_CONSULTANT")
	private String LegalConsultant;
	@Column(name = "DEALS_DUAL_GOODS")
	private String DealsDualGoods;
	@Column(name = "TRANS_ON_INTERRELATED_1")
	private String TransOnInterrelated1;
	@Column(name = "TRANS_ON_INTERRELATED_2")
	private String TransOnInterrelated2;
	@Column(name = "CUSTOMER_RISK")
	private String CustomerRisk;
	@Column(name = "REASON_FOR_RISK")
	private String ReasonForRisk;
	@Column(name = "DUE_DILIGENCE")
	private String DueDiligence;
	@Column(name = "BANK_OFFICIALS_OBSERVATION")
	private String BankOfficialsObservation;
	@Column(name = "BRANCH_HEAD_OBSERVATION")
	private String BranchHeadObservation;
	@Column(name = "C_SUSPISSIONOBSERVED")
	private String CSuspissionobserved;
	@Column(name = "C_SUSPISION_DETAIL")
	private String CSuspisionDetail;
	@Column(name = "C_HIGHVALUE_TRANSACTION")
	private String CHighvalueTransaction;
	@Column(name = "IS_CASH_INTENSIVE_BUSINESS")
	private String IsCashIntensiveBusiness;
	@Column(name = "ACCOUNT_OPENING_OFFICER_SIGNATURE")
	private String AccountOpeningOfficerSignature;
	@Column(name = "ACCOUNT_OPENING_OFFICER_NAME")
	private String AccountOpeningOfficerName;
	@Column(name = "ACCOUNT_OPENING_OFFICER_DESIGNATION")
	private String AccountOpeningOfficerDesignation;
	@Column(name = "ACCOUNT_OPENING_OFFICER_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date AccountOpeningOfficerDate;
	@Column(name = "ACCOUNT_OPENING_OFFICER_PLACE")
	private String AccountOpeningOfficerPlace;
	@Column(name = "BRANCH_OFFICIAL_SIGNATURE")
	private String BranchOfficialSignature;
	@Column(name = "BRANCH_OFFICIAL_NAME")
	private String BranchOfficialName;
	@Column(name = "BRANCH_OFFICIAL_DESIGNATION")
	private String BranchOfficialDesignation;
	@Column(name = "BRANCH_OFFICIAL_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date BranchOfficialDate;
	@Column(name = "BRANCH_OFFICIAL_PLACE")
	private String BranchOfficialPlace;
	@Column(name = "ENTITY_FLG")
	private Character EntityFlg;
	@Column(name = "MODIFY_FLG")
	private Character ModifyFlg;
	@Column(name = "DEL_FLG")
	private Character DelFlg;
	@Column(name = "ENTRY_USER")
	private String EntryUser;
	@Column(name = "MODIFY_USER")
	private String ModifyUser;
	@Column(name = "VERIFY_USER")
	private String VerifyUser;
	@Column(name = "ENTRY_TIME")

	private Date EntryTime;
	@Column(name = "MODIFY_TIME")

	private Date ModifyTime;
	@Column(name = "VERIFY_TIME")
	private Date VerifyTime;
	@Column(name = "CUSTOMER_OPERATING_BUSINESS")
	private String CustomerOperatingBussiness;
	
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}
	public String getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}
	public String getLegalStatus() {
		return LegalStatus;
	}
	public void setLegalStatus(String legalStatus) {
		LegalStatus = legalStatus;
	}
	public String getTradeLicenseNumber() {
		return TradeLicenseNumber;
	}
	public void setTradeLicenseNumber(String tradeLicenseNumber) {
		TradeLicenseNumber = tradeLicenseNumber;
	}
	public Date getTradeLicenseIssueDate() {
		return TradeLicenseIssueDate;
	}
	public void setTradeLicenseIssueDate(Date tradeLicenseIssueDate) {
		TradeLicenseIssueDate = tradeLicenseIssueDate;
	}
	public Date getTradeLicenseExpiryDate() {
		return TradeLicenseExpiryDate;
	}
	public void setTradeLicenseExpiryDate(Date tradeLicenseExpiryDate) {
		TradeLicenseExpiryDate = tradeLicenseExpiryDate;
	}
	public String getCountryOfEstablishment() {
		return CountryOfEstablishment;
	}
	public void setCountryOfEstablishment(String countryOfEstablishment) {
		CountryOfEstablishment = countryOfEstablishment;
	}
	public String getCountryOfOperation() {
		return CountryOfOperation;
	}
	public void setCountryOfOperation(String countryOfOperation) {
		CountryOfOperation = countryOfOperation;
	}
	public String getBusinessActivity() {
		return BusinessActivity;
	}
	public void setBusinessActivity(String businessActivity) {
		BusinessActivity = businessActivity;
	}
	public String getProductsServices() {
		return ProductsServices;
	}
	public void setProductsServices(String productsServices) {
		ProductsServices = productsServices;
	}
	public String getTradeLicense() {
		return TradeLicense;
	}
	public void setTradeLicense(String tradeLicense) {
		TradeLicense = tradeLicense;
	}
	public String getMemorandumOfAssociation() {
		return MemorandumOfAssociation;
	}
	public void setMemorandumOfAssociation(String memorandumOfAssociation) {
		MemorandumOfAssociation = memorandumOfAssociation;
	}
	public String getShareCertificate() {
		return ShareCertificate;
	}
	public void setShareCertificate(String shareCertificate) {
		ShareCertificate = shareCertificate;
	}
	public String getCertificateOfIncorporation() {
		return CertificateOfIncorporation;
	}
	public void setCertificateOfIncorporation(String certificateOfIncorporation) {
		CertificateOfIncorporation = certificateOfIncorporation;
	}
	public String getOtherDocuments() {
		return OtherDocuments;
	}
	public void setOtherDocuments(String otherDocuments) {
		OtherDocuments = otherDocuments;
	}
	public String getGovernmentTenancyDocument() {
		return GovernmentTenancyDocument;
	}
	public void setGovernmentTenancyDocument(String governmentTenancyDocument) {
		GovernmentTenancyDocument = governmentTenancyDocument;
	}
	public String getUtilityBill() {
		return UtilityBill;
	}
	public void setUtilityBill(String utilityBill) {
		UtilityBill = utilityBill;
	}
	public String getFlexiDeskAgreement() {
		return FlexiDeskAgreement;
	}
	public void setFlexiDeskAgreement(String flexiDeskAgreement) {
		FlexiDeskAgreement = flexiDeskAgreement;
	}
	public String getCoWorkingAgreement() {
		return CoWorkingAgreement;
	}
	public void setCoWorkingAgreement(String coWorkingAgreement) {
		CoWorkingAgreement = coWorkingAgreement;
	}
	public String getOfficeSharingAgreement() {
		return OfficeSharingAgreement;
	}
	public void setOfficeSharingAgreement(String officeSharingAgreement) {
		OfficeSharingAgreement = officeSharingAgreement;
	}
	public String getOtherAddressProof() {
		return OtherAddressProof;
	}
	public void setOtherAddressProof(String otherAddressProof) {
		OtherAddressProof = otherAddressProof;
	}
	public String getOtherBusinessProof() {
		return OtherBusinessProof;
	}
	public void setOtherBusinessProof(String otherBusinessProof) {
		OtherBusinessProof = otherBusinessProof;
	}
	public String getBankAccountStatement() {
		return BankAccountStatement;
	}
	public void setBankAccountStatement(String bankAccountStatement) {
		BankAccountStatement = bankAccountStatement;
	}
	public String getAuditedCompanyFinancials() {
		return AuditedCompanyFinancials;
	}
	public void setAuditedCompanyFinancials(String auditedCompanyFinancials) {
		AuditedCompanyFinancials = auditedCompanyFinancials;
	}
	public String getPersonalBankAccountStatement() {
		return PersonalBankAccountStatement;
	}
	public void setPersonalBankAccountStatement(String personalBankAccountStatement) {
		PersonalBankAccountStatement = personalBankAccountStatement;
	}
	public String getOtherEquivalentDocuments() {
		return OtherEquivalentDocuments;
	}
	public void setOtherEquivalentDocuments(String otherEquivalentDocuments) {
		OtherEquivalentDocuments = otherEquivalentDocuments;
	}
	public String getUboDirPoa1Name() {
		return UboDirPoa1Name;
	}
	public void setUboDirPoa1Name(String uboDirPoa1Name) {
		UboDirPoa1Name = uboDirPoa1Name;
	}
	public String getUboDirPoa1Nationality() {
		return UboDirPoa1Nationality;
	}
	public void setUboDirPoa1Nationality(String uboDirPoa1Nationality) {
		UboDirPoa1Nationality = uboDirPoa1Nationality;
	}
	public Double getUboDirPoa1ShareholdingPercent() {
		return UboDirPoa1ShareholdingPercent;
	}
	public void setUboDirPoa1ShareholdingPercent(Double uboDirPoa1ShareholdingPercent) {
		UboDirPoa1ShareholdingPercent = uboDirPoa1ShareholdingPercent;
	}
	public String getUboDirPoa1Passport() {
		return UboDirPoa1Passport;
	}
	public void setUboDirPoa1Passport(String uboDirPoa1Passport) {
		UboDirPoa1Passport = uboDirPoa1Passport;
	}
	public String getUboDirPoa1VisaEid() {
		return UboDirPoa1VisaEid;
	}
	public void setUboDirPoa1VisaEid(String uboDirPoa1VisaEid) {
		UboDirPoa1VisaEid = uboDirPoa1VisaEid;
	}
	public String getUboDirPoa1ResidenceAddress() {
		return UboDirPoa1ResidenceAddress;
	}
	public void setUboDirPoa1ResidenceAddress(String uboDirPoa1ResidenceAddress) {
		UboDirPoa1ResidenceAddress = uboDirPoa1ResidenceAddress;
	}
	public String getUboDirPoa1ProofSourceOfIncome() {
		return UboDirPoa1ProofSourceOfIncome;
	}
	public void setUboDirPoa1ProofSourceOfIncome(String uboDirPoa1ProofSourceOfIncome) {
		UboDirPoa1ProofSourceOfIncome = uboDirPoa1ProofSourceOfIncome;
	}
	public String getUboDirPoa2Name() {
		return UboDirPoa2Name;
	}
	public void setUboDirPoa2Name(String uboDirPoa2Name) {
		UboDirPoa2Name = uboDirPoa2Name;
	}
	public String getUboDirPoa2Nationality() {
		return UboDirPoa2Nationality;
	}
	public void setUboDirPoa2Nationality(String uboDirPoa2Nationality) {
		UboDirPoa2Nationality = uboDirPoa2Nationality;
	}
	public Double getUboDirPoa2ShareholdingPercent() {
		return UboDirPoa2ShareholdingPercent;
	}
	public void setUboDirPoa2ShareholdingPercent(Double uboDirPoa2ShareholdingPercent) {
		UboDirPoa2ShareholdingPercent = uboDirPoa2ShareholdingPercent;
	}
	public String getUboDirPoa2Passport() {
		return UboDirPoa2Passport;
	}
	public void setUboDirPoa2Passport(String uboDirPoa2Passport) {
		UboDirPoa2Passport = uboDirPoa2Passport;
	}
	public String getUboDirPoa2VisaEid() {
		return UboDirPoa2VisaEid;
	}
	public void setUboDirPoa2VisaEid(String uboDirPoa2VisaEid) {
		UboDirPoa2VisaEid = uboDirPoa2VisaEid;
	}
	public String getUboDirPoa2ResidenceAddress() {
		return UboDirPoa2ResidenceAddress;
	}
	public void setUboDirPoa2ResidenceAddress(String uboDirPoa2ResidenceAddress) {
		UboDirPoa2ResidenceAddress = uboDirPoa2ResidenceAddress;
	}
	public String getUboDirPoa2ProofSourceOfIncome() {
		return UboDirPoa2ProofSourceOfIncome;
	}
	public void setUboDirPoa2ProofSourceOfIncome(String uboDirPoa2ProofSourceOfIncome) {
		UboDirPoa2ProofSourceOfIncome = uboDirPoa2ProofSourceOfIncome;
	}
	public String getUboDirPoa3Name() {
		return UboDirPoa3Name;
	}
	public void setUboDirPoa3Name(String uboDirPoa3Name) {
		UboDirPoa3Name = uboDirPoa3Name;
	}
	public String getUboDirPoa3Nationality() {
		return UboDirPoa3Nationality;
	}
	public void setUboDirPoa3Nationality(String uboDirPoa3Nationality) {
		UboDirPoa3Nationality = uboDirPoa3Nationality;
	}
	public Double getUboDirPoa3ShareholdingPercent() {
		return UboDirPoa3ShareholdingPercent;
	}
	public void setUboDirPoa3ShareholdingPercent(Double uboDirPoa3ShareholdingPercent) {
		UboDirPoa3ShareholdingPercent = uboDirPoa3ShareholdingPercent;
	}
	public String getUboDirPoa3Passport() {
		return UboDirPoa3Passport;
	}
	public void setUboDirPoa3Passport(String uboDirPoa3Passport) {
		UboDirPoa3Passport = uboDirPoa3Passport;
	}
	public String getUboDirPoa3VisaEid() {
		return UboDirPoa3VisaEid;
	}
	public void setUboDirPoa3VisaEid(String uboDirPoa3VisaEid) {
		UboDirPoa3VisaEid = uboDirPoa3VisaEid;
	}
	public String getUboDirPoa3ResidenceAddress() {
		return UboDirPoa3ResidenceAddress;
	}
	public void setUboDirPoa3ResidenceAddress(String uboDirPoa3ResidenceAddress) {
		UboDirPoa3ResidenceAddress = uboDirPoa3ResidenceAddress;
	}
	public String getUboDirPoa3ProofSourceOfIncome() {
		return UboDirPoa3ProofSourceOfIncome;
	}
	public void setUboDirPoa3ProofSourceOfIncome(String uboDirPoa3ProofSourceOfIncome) {
		UboDirPoa3ProofSourceOfIncome = uboDirPoa3ProofSourceOfIncome;
	}
	public String getUboDirPoa4Name() {
		return UboDirPoa4Name;
	}
	public void setUboDirPoa4Name(String uboDirPoa4Name) {
		UboDirPoa4Name = uboDirPoa4Name;
	}
	public String getUboDirPoa4Nationality() {
		return UboDirPoa4Nationality;
	}
	public void setUboDirPoa4Nationality(String uboDirPoa4Nationality) {
		UboDirPoa4Nationality = uboDirPoa4Nationality;
	}
	public Double getUboDirPoa4ShareholdingPercent() {
		return UboDirPoa4ShareholdingPercent;
	}
	public void setUboDirPoa4ShareholdingPercent(Double uboDirPoa4ShareholdingPercent) {
		UboDirPoa4ShareholdingPercent = uboDirPoa4ShareholdingPercent;
	}
	public String getUboDirPoa4Passport() {
		return UboDirPoa4Passport;
	}
	public void setUboDirPoa4Passport(String uboDirPoa4Passport) {
		UboDirPoa4Passport = uboDirPoa4Passport;
	}
	public String getUboDirPoa4VisaEid() {
		return UboDirPoa4VisaEid;
	}
	public void setUboDirPoa4VisaEid(String uboDirPoa4VisaEid) {
		UboDirPoa4VisaEid = uboDirPoa4VisaEid;
	}
	public String getUboDirPoa4ResidenceAddress() {
		return UboDirPoa4ResidenceAddress;
	}
	public void setUboDirPoa4ResidenceAddress(String uboDirPoa4ResidenceAddress) {
		UboDirPoa4ResidenceAddress = uboDirPoa4ResidenceAddress;
	}
	public String getUboDirPoa4ProofSourceOfIncome() {
		return UboDirPoa4ProofSourceOfIncome;
	}
	public void setUboDirPoa4ProofSourceOfIncome(String uboDirPoa4ProofSourceOfIncome) {
		UboDirPoa4ProofSourceOfIncome = uboDirPoa4ProofSourceOfIncome;
	}
	public String getLinkedAccountNumber1() {
		return LinkedAccountNumber1;
	}
	public void setLinkedAccountNumber1(String linkedAccountNumber1) {
		LinkedAccountNumber1 = linkedAccountNumber1;
	}
	public Double getLinkedRelationshipDurationYears1() {
		return LinkedRelationshipDurationYears1;
	}
	public void setLinkedRelationshipDurationYears1(Double linkedRelationshipDurationYears1) {
		LinkedRelationshipDurationYears1 = linkedRelationshipDurationYears1;
	}
	public String getLinkedAccountNumber2() {
		return LinkedAccountNumber2;
	}
	public void setLinkedAccountNumber2(String linkedAccountNumber2) {
		LinkedAccountNumber2 = linkedAccountNumber2;
	}
	public Double getLinkedRelationshipDurationYears2() {
		return LinkedRelationshipDurationYears2;
	}
	public void setLinkedRelationshipDurationYears2(Double linkedRelationshipDurationYears2) {
		LinkedRelationshipDurationYears2 = linkedRelationshipDurationYears2;
	}
	public String getLinkedAccountNumber3() {
		return LinkedAccountNumber3;
	}
	public void setLinkedAccountNumber3(String linkedAccountNumber3) {
		LinkedAccountNumber3 = linkedAccountNumber3;
	}
	public Double getLinkedRelationshipDurationYears3() {
		return LinkedRelationshipDurationYears3;
	}
	public void setLinkedRelationshipDurationYears3(Double linkedRelationshipDurationYears3) {
		LinkedRelationshipDurationYears3 = linkedRelationshipDurationYears3;
	}
	public String getLinkedAccountNumber4() {
		return LinkedAccountNumber4;
	}
	public void setLinkedAccountNumber4(String linkedAccountNumber4) {
		LinkedAccountNumber4 = linkedAccountNumber4;
	}
	public Double getLinkedRelationshipDurationYears4() {
		return LinkedRelationshipDurationYears4;
	}
	public void setLinkedRelationshipDurationYears4(Double linkedRelationshipDurationYears4) {
		LinkedRelationshipDurationYears4 = linkedRelationshipDurationYears4;
	}
	public String getLinkedAccountNumber5() {
		return LinkedAccountNumber5;
	}
	public void setLinkedAccountNumber5(String linkedAccountNumber5) {
		LinkedAccountNumber5 = linkedAccountNumber5;
	}
	public Double getLinkedRelationshipDurationYears5() {
		return LinkedRelationshipDurationYears5;
	}
	public void setLinkedRelationshipDurationYears5(Double linkedRelationshipDurationYears5) {
		LinkedRelationshipDurationYears5 = linkedRelationshipDurationYears5;
	}
	public String getConductOfAccountSatisfactory() {
		return ConductOfAccountSatisfactory;
	}
	public void setConductOfAccountSatisfactory(String conductOfAccountSatisfactory) {
		ConductOfAccountSatisfactory = conductOfAccountSatisfactory;
	}
	public String getHighValueTransactionsObserved() {
		return HighValueTransactionsObserved;
	}
	public void setHighValueTransactionsObserved(String highValueTransactionsObserved) {
		HighValueTransactionsObserved = highValueTransactionsObserved;
	}
	public String getHighValueTransactionsDetails() {
		return HighValueTransactionsDetails;
	}
	public void setHighValueTransactionsDetails(String highValueTransactionsDetails) {
		HighValueTransactionsDetails = highValueTransactionsDetails;
	}
	public Double getCurrentTurnover() {
		return CurrentTurnover;
	}
	public void setCurrentTurnover(Double currentTurnover) {
		CurrentTurnover = currentTurnover;
	}
	public Double getExpectedTurnover() {
		return ExpectedTurnover;
	}
	public void setExpectedTurnover(Double expectedTurnover) {
		ExpectedTurnover = expectedTurnover;
	}
	public Double getExpectedDebitTransactions() {
		return ExpectedDebitTransactions;
	}
	public void setExpectedDebitTransactions(Double expectedDebitTransactions) {
		ExpectedDebitTransactions = expectedDebitTransactions;
	}
	public Double getExpectedCreditTransactions() {
		return ExpectedCreditTransactions;
	}
	public void setExpectedCreditTransactions(Double expectedCreditTransactions) {
		ExpectedCreditTransactions = expectedCreditTransactions;
	}
	public String getExpectedTransactionType() {
		return ExpectedTransactionType;
	}
	public void setExpectedTransactionType(String expectedTransactionType) {
		ExpectedTransactionType = expectedTransactionType;
	}
	public Double getExpectedTransactionVolume() {
		return ExpectedTransactionVolume;
	}
	public void setExpectedTransactionVolume(Double expectedTransactionVolume) {
		ExpectedTransactionVolume = expectedTransactionVolume;
	}
	public String getFrequencyOfTransactions() {
		return FrequencyOfTransactions;
	}
	public void setFrequencyOfTransactions(String frequencyOfTransactions) {
		FrequencyOfTransactions = frequencyOfTransactions;
	}
	public String getSanctionsMatchUae() {
		return SanctionsMatchUae;
	}
	public void setSanctionsMatchUae(String sanctionsMatchUae) {
		SanctionsMatchUae = sanctionsMatchUae;
	}
	public String getSanctionsMatchUn() {
		return SanctionsMatchUn;
	}
	public void setSanctionsMatchUn(String sanctionsMatchUn) {
		SanctionsMatchUn = sanctionsMatchUn;
	}
	public String getSanctionsMatchOfac() {
		return SanctionsMatchOfac;
	}
	public void setSanctionsMatchOfac(String sanctionsMatchOfac) {
		SanctionsMatchOfac = sanctionsMatchOfac;
	}
	public String getSanctionsMatchHmt() {
		return SanctionsMatchHmt;
	}
	public void setSanctionsMatchHmt(String sanctionsMatchHmt) {
		SanctionsMatchHmt = sanctionsMatchHmt;
	}
	public String getSanctionsMatchEu() {
		return SanctionsMatchEu;
	}
	public void setSanctionsMatchEu(String sanctionsMatchEu) {
		SanctionsMatchEu = sanctionsMatchEu;
	}
	public Double getCounterpartySrNo1() {
		return CounterpartySrNo1;
	}
	public void setCounterpartySrNo1(Double counterpartySrNo1) {
		CounterpartySrNo1 = counterpartySrNo1;
	}
	public String getCounterpartyName1() {
		return CounterpartyName1;
	}
	public void setCounterpartyName1(String counterpartyName1) {
		CounterpartyName1 = counterpartyName1;
	}
	public String getCounterpartyCountry1() {
		return CounterpartyCountry1;
	}
	public void setCounterpartyCountry1(String counterpartyCountry1) {
		CounterpartyCountry1 = counterpartyCountry1;
	}
	public String getCounterpartyProductsServices1() {
		return CounterpartyProductsServices1;
	}
	public void setCounterpartyProductsServices1(String counterpartyProductsServices1) {
		CounterpartyProductsServices1 = counterpartyProductsServices1;
	}
	public Double getCounterpartySrNo2() {
		return CounterpartySrNo2;
	}
	public void setCounterpartySrNo2(Double counterpartySrNo2) {
		CounterpartySrNo2 = counterpartySrNo2;
	}
	public String getCounterpartyName2() {
		return CounterpartyName2;
	}
	public void setCounterpartyName2(String counterpartyName2) {
		CounterpartyName2 = counterpartyName2;
	}
	public String getCounterpartyCountry2() {
		return CounterpartyCountry2;
	}
	public void setCounterpartyCountry2(String counterpartyCountry2) {
		CounterpartyCountry2 = counterpartyCountry2;
	}
	public String getCounterpartyProductsServices2() {
		return CounterpartyProductsServices2;
	}
	public void setCounterpartyProductsServices2(String counterpartyProductsServices2) {
		CounterpartyProductsServices2 = counterpartyProductsServices2;
	}
	public Double getCounterpartySrNo3() {
		return CounterpartySrNo3;
	}
	public void setCounterpartySrNo3(Double counterpartySrNo3) {
		CounterpartySrNo3 = counterpartySrNo3;
	}
	public String getCounterpartyName3() {
		return CounterpartyName3;
	}
	public void setCounterpartyName3(String counterpartyName3) {
		CounterpartyName3 = counterpartyName3;
	}
	public String getCounterpartyCountry3() {
		return CounterpartyCountry3;
	}
	public void setCounterpartyCountry3(String counterpartyCountry3) {
		CounterpartyCountry3 = counterpartyCountry3;
	}
	public String getCounterpartyProductsServices3() {
		return CounterpartyProductsServices3;
	}
	public void setCounterpartyProductsServices3(String counterpartyProductsServices3) {
		CounterpartyProductsServices3 = counterpartyProductsServices3;
	}
	public Double getCounterpartySrNo4() {
		return CounterpartySrNo4;
	}
	public void setCounterpartySrNo4(Double counterpartySrNo4) {
		CounterpartySrNo4 = counterpartySrNo4;
	}
	public String getCounterpartyName4() {
		return CounterpartyName4;
	}
	public void setCounterpartyName4(String counterpartyName4) {
		CounterpartyName4 = counterpartyName4;
	}
	public String getCounterpartyCountry4() {
		return CounterpartyCountry4;
	}
	public void setCounterpartyCountry4(String counterpartyCountry4) {
		CounterpartyCountry4 = counterpartyCountry4;
	}
	public String getCounterpartyProductsServices4() {
		return CounterpartyProductsServices4;
	}
	public void setCounterpartyProductsServices4(String counterpartyProductsServices4) {
		CounterpartyProductsServices4 = counterpartyProductsServices4;
	}
	public Double getIntermediarySrNo1() {
		return IntermediarySrNo1;
	}
	public void setIntermediarySrNo1(Double intermediarySrNo1) {
		IntermediarySrNo1 = intermediarySrNo1;
	}
	public String getIntermediaryName1() {
		return IntermediaryName1;
	}
	public void setIntermediaryName1(String intermediaryName1) {
		IntermediaryName1 = intermediaryName1;
	}
	public String getIntermediaryCountry1() {
		return IntermediaryCountry1;
	}
	public void setIntermediaryCountry1(String intermediaryCountry1) {
		IntermediaryCountry1 = intermediaryCountry1;
	}
	public String getIntermediaryName2() {
		return IntermediaryName2;
	}
	public void setIntermediaryName2(String intermediaryName2) {
		IntermediaryName2 = intermediaryName2;
	}
	public String getIntermediaryCountry2() {
		return IntermediaryCountry2;
	}
	public void setIntermediaryCountry2(String intermediaryCountry2) {
		IntermediaryCountry2 = intermediaryCountry2;
	}
	public String getIntermediaryName3() {
		return IntermediaryName3;
	}
	public void setIntermediaryName3(String intermediaryName3) {
		IntermediaryName3 = intermediaryName3;
	}
	public String getIntermediaryCountry3() {
		return IntermediaryCountry3;
	}
	public void setIntermediaryCountry3(String intermediaryCountry3) {
		IntermediaryCountry3 = intermediaryCountry3;
	}
	public String getIntermediaryName4() {
		return IntermediaryName4;
	}
	public void setIntermediaryName4(String intermediaryName4) {
		IntermediaryName4 = intermediaryName4;
	}
	public String getIntermediaryCountry4() {
		return IntermediaryCountry4;
	}
	public void setIntermediaryCountry4(String intermediaryCountry4) {
		IntermediaryCountry4 = intermediaryCountry4;
	}
	public String getOperatingInHighRiskJurisdiction() {
		return OperatingInHighRiskJurisdiction;
	}
	public void setOperatingInHighRiskJurisdiction(String operatingInHighRiskJurisdiction) {
		OperatingInHighRiskJurisdiction = operatingInHighRiskJurisdiction;
	}
	public String getHighRiskJurisdictionCountry() {
		return HighRiskJurisdictionCountry;
	}
	public void setHighRiskJurisdictionCountry(String highRiskJurisdictionCountry) {
		HighRiskJurisdictionCountry = highRiskJurisdictionCountry;
	}
	public String getTransactionCountry1() {
		return TransactionCountry1;
	}
	public void setTransactionCountry1(String transactionCountry1) {
		TransactionCountry1 = transactionCountry1;
	}
	public String getTransactionCountry2() {
		return TransactionCountry2;
	}
	public void setTransactionCountry2(String transactionCountry2) {
		TransactionCountry2 = transactionCountry2;
	}
	public String getTransactionCountry3() {
		return TransactionCountry3;
	}
	public void setTransactionCountry3(String transactionCountry3) {
		TransactionCountry3 = transactionCountry3;
	}
	public String getTransactionCountry4() {
		return TransactionCountry4;
	}
	public void setTransactionCountry4(String transactionCountry4) {
		TransactionCountry4 = transactionCountry4;
	}
	public String getSanctionsUaeMatch() {
		return SanctionsUaeMatch;
	}
	public void setSanctionsUaeMatch(String sanctionsUaeMatch) {
		SanctionsUaeMatch = sanctionsUaeMatch;
	}
	public String getSanctionsUnMatch() {
		return SanctionsUnMatch;
	}
	public void setSanctionsUnMatch(String sanctionsUnMatch) {
		SanctionsUnMatch = sanctionsUnMatch;
	}
	public String getSanctionsOfacMatch() {
		return SanctionsOfacMatch;
	}
	public void setSanctionsOfacMatch(String sanctionsOfacMatch) {
		SanctionsOfacMatch = sanctionsOfacMatch;
	}
	public String getSanctionsHmtMatch() {
		return SanctionsHmtMatch;
	}
	public void setSanctionsHmtMatch(String sanctionsHmtMatch) {
		SanctionsHmtMatch = sanctionsHmtMatch;
	}
	public String getSanctionsEuMatch() {
		return SanctionsEuMatch;
	}
	public void setSanctionsEuMatch(String sanctionsEuMatch) {
		SanctionsEuMatch = sanctionsEuMatch;
	}
	public String getSanctionsOthersMatch() {
		return SanctionsOthersMatch;
	}
	public void setSanctionsOthersMatch(String sanctionsOthersMatch) {
		SanctionsOthersMatch = sanctionsOthersMatch;
	}
	public String getCbuaeBblCheckDone() {
		return CbuaeBblCheckDone;
	}
	public void setCbuaeBblCheckDone(String cbuaeBblCheckDone) {
		CbuaeBblCheckDone = cbuaeBblCheckDone;
	}
	public String getGoogleMediaSearchDone() {
		return GoogleMediaSearchDone;
	}
	public void setGoogleMediaSearchDone(String googleMediaSearchDone) {
		GoogleMediaSearchDone = googleMediaSearchDone;
	}
	public String getInternalDenyListNameScreening() {
		return InternalDenyListNameScreening;
	}
	public void setInternalDenyListNameScreening(String internalDenyListNameScreening) {
		InternalDenyListNameScreening = internalDenyListNameScreening;
	}
	public String getSuspicionObserved() {
		return SuspicionObserved;
	}
	public void setSuspicionObserved(String suspicionObserved) {
		SuspicionObserved = suspicionObserved;
	}
	public String getSuspicionDetails() {
		return SuspicionDetails;
	}
	public void setSuspicionDetails(String suspicionDetails) {
		SuspicionDetails = suspicionDetails;
	}
	public String getRedFlagSupportingDocsObtained() {
		return RedFlagSupportingDocsObtained;
	}
	public void setRedFlagSupportingDocsObtained(String redFlagSupportingDocsObtained) {
		RedFlagSupportingDocsObtained = redFlagSupportingDocsObtained;
	}
	public String getRedFlagDetails() {
		return RedFlagDetails;
	}
	public void setRedFlagDetails(String redFlagDetails) {
		RedFlagDetails = redFlagDetails;
	}
	public String getUboSanctionsUaeMatch() {
		return UboSanctionsUaeMatch;
	}
	public void setUboSanctionsUaeMatch(String uboSanctionsUaeMatch) {
		UboSanctionsUaeMatch = uboSanctionsUaeMatch;
	}
	public String getUboSanctionsUnMatch() {
		return UboSanctionsUnMatch;
	}
	public void setUboSanctionsUnMatch(String uboSanctionsUnMatch) {
		UboSanctionsUnMatch = uboSanctionsUnMatch;
	}
	public String getUboSanctionsOfacMatch() {
		return UboSanctionsOfacMatch;
	}
	public void setUboSanctionsOfacMatch(String uboSanctionsOfacMatch) {
		UboSanctionsOfacMatch = uboSanctionsOfacMatch;
	}
	public String getUboSanctionsHmtMatch() {
		return UboSanctionsHmtMatch;
	}
	public void setUboSanctionsHmtMatch(String uboSanctionsHmtMatch) {
		UboSanctionsHmtMatch = uboSanctionsHmtMatch;
	}
	public String getUboSanctionsEuMatch() {
		return UboSanctionsEuMatch;
	}
	public void setUboSanctionsEuMatch(String uboSanctionsEuMatch) {
		UboSanctionsEuMatch = uboSanctionsEuMatch;
	}
	public String getUboSanctionsOthersMatch() {
		return UboSanctionsOthersMatch;
	}
	public void setUboSanctionsOthersMatch(String uboSanctionsOthersMatch) {
		UboSanctionsOthersMatch = uboSanctionsOthersMatch;
	}
	public String getUboCbuaeBblCheckDone() {
		return UboCbuaeBblCheckDone;
	}
	public void setUboCbuaeBblCheckDone(String uboCbuaeBblCheckDone) {
		UboCbuaeBblCheckDone = uboCbuaeBblCheckDone;
	}
	public String getUboGoogleMediaSearchDone() {
		return UboGoogleMediaSearchDone;
	}
	public void setUboGoogleMediaSearchDone(String uboGoogleMediaSearchDone) {
		UboGoogleMediaSearchDone = uboGoogleMediaSearchDone;
	}
	public String getUboInternalDenyListScreening() {
		return UboInternalDenyListScreening;
	}
	public void setUboInternalDenyListScreening(String uboInternalDenyListScreening) {
		UboInternalDenyListScreening = uboInternalDenyListScreening;
	}
	public String getUboSuspicionObserved() {
		return UboSuspicionObserved;
	}
	public void setUboSuspicionObserved(String uboSuspicionObserved) {
		UboSuspicionObserved = uboSuspicionObserved;
	}
	public String getUboSuspicionDetails() {
		return UboSuspicionDetails;
	}
	public void setUboSuspicionDetails(String uboSuspicionDetails) {
		UboSuspicionDetails = uboSuspicionDetails;
	}
	public String getUboRedFlagSupportingDocsObtained() {
		return UboRedFlagSupportingDocsObtained;
	}
	public void setUboRedFlagSupportingDocsObtained(String uboRedFlagSupportingDocsObtained) {
		UboRedFlagSupportingDocsObtained = uboRedFlagSupportingDocsObtained;
	}
	public String getUboRedFlagDetails() {
		return UboRedFlagDetails;
	}
	public void setUboRedFlagDetails(String uboRedFlagDetails) {
		UboRedFlagDetails = uboRedFlagDetails;
	}
	public String getCounterpartySanctionsUaeMatch() {
		return CounterpartySanctionsUaeMatch;
	}
	public void setCounterpartySanctionsUaeMatch(String counterpartySanctionsUaeMatch) {
		CounterpartySanctionsUaeMatch = counterpartySanctionsUaeMatch;
	}
	public String getCounterpartySanctionsUnMatch() {
		return CounterpartySanctionsUnMatch;
	}
	public void setCounterpartySanctionsUnMatch(String counterpartySanctionsUnMatch) {
		CounterpartySanctionsUnMatch = counterpartySanctionsUnMatch;
	}
	public String getCounterpartySanctionsOfacMatch() {
		return CounterpartySanctionsOfacMatch;
	}
	public void setCounterpartySanctionsOfacMatch(String counterpartySanctionsOfacMatch) {
		CounterpartySanctionsOfacMatch = counterpartySanctionsOfacMatch;
	}
	public String getCounterpartySanctionsHmtMatch() {
		return CounterpartySanctionsHmtMatch;
	}
	public void setCounterpartySanctionsHmtMatch(String counterpartySanctionsHmtMatch) {
		CounterpartySanctionsHmtMatch = counterpartySanctionsHmtMatch;
	}
	public String getCounterpartySanctionsEuMatch() {
		return CounterpartySanctionsEuMatch;
	}
	public void setCounterpartySanctionsEuMatch(String counterpartySanctionsEuMatch) {
		CounterpartySanctionsEuMatch = counterpartySanctionsEuMatch;
	}
	public String getCounterpartySanctionsOthersMatch() {
		return CounterpartySanctionsOthersMatch;
	}
	public void setCounterpartySanctionsOthersMatch(String counterpartySanctionsOthersMatch) {
		CounterpartySanctionsOthersMatch = counterpartySanctionsOthersMatch;
	}
	public String getCounterpartyCbuaeBblCheckDone() {
		return CounterpartyCbuaeBblCheckDone;
	}
	public void setCounterpartyCbuaeBblCheckDone(String counterpartyCbuaeBblCheckDone) {
		CounterpartyCbuaeBblCheckDone = counterpartyCbuaeBblCheckDone;
	}
	public String getCounterpartyGoogleMediaSearchDone() {
		return CounterpartyGoogleMediaSearchDone;
	}
	public void setCounterpartyGoogleMediaSearchDone(String counterpartyGoogleMediaSearchDone) {
		CounterpartyGoogleMediaSearchDone = counterpartyGoogleMediaSearchDone;
	}
	public String getCounterpartyInternalDenyListScreening() {
		return CounterpartyInternalDenyListScreening;
	}
	public void setCounterpartyInternalDenyListScreening(String counterpartyInternalDenyListScreening) {
		CounterpartyInternalDenyListScreening = counterpartyInternalDenyListScreening;
	}
	public String getCounterpartySuspicionObserved() {
		return CounterpartySuspicionObserved;
	}
	public void setCounterpartySuspicionObserved(String counterpartySuspicionObserved) {
		CounterpartySuspicionObserved = counterpartySuspicionObserved;
	}
	public String getCounterpartySuspicionDetails() {
		return CounterpartySuspicionDetails;
	}
	public void setCounterpartySuspicionDetails(String counterpartySuspicionDetails) {
		CounterpartySuspicionDetails = counterpartySuspicionDetails;
	}
	public String getCounterpartyRedFlagSupportingDocsObtained() {
		return CounterpartyRedFlagSupportingDocsObtained;
	}
	public void setCounterpartyRedFlagSupportingDocsObtained(String counterpartyRedFlagSupportingDocsObtained) {
		CounterpartyRedFlagSupportingDocsObtained = counterpartyRedFlagSupportingDocsObtained;
	}
	public String getCounterpartyRedFlagDetails() {
		return CounterpartyRedFlagDetails;
	}
	public void setCounterpartyRedFlagDetails(String counterpartyRedFlagDetails) {
		CounterpartyRedFlagDetails = counterpartyRedFlagDetails;
	}
	public String getSiteVisitCompleted() {
		return SiteVisitCompleted;
	}
	public void setSiteVisitCompleted(String siteVisitCompleted) {
		SiteVisitCompleted = siteVisitCompleted;
	}
	public String getSiteVisitReportAttached() {
		return SiteVisitReportAttached;
	}
	public void setSiteVisitReportAttached(String siteVisitReportAttached) {
		SiteVisitReportAttached = siteVisitReportAttached;
	}
	public String getAdverseObservationsSiteVisit() {
		return AdverseObservationsSiteVisit;
	}
	public void setAdverseObservationsSiteVisit(String adverseObservationsSiteVisit) {
		AdverseObservationsSiteVisit = adverseObservationsSiteVisit;
	}
	public String getAdverseObservationDetails1() {
		return AdverseObservationDetails1;
	}
	public void setAdverseObservationDetails1(String adverseObservationDetails1) {
		AdverseObservationDetails1 = adverseObservationDetails1;
	}
	public String getAdverseObservationDetails2() {
		return AdverseObservationDetails2;
	}
	public void setAdverseObservationDetails2(String adverseObservationDetails2) {
		AdverseObservationDetails2 = adverseObservationDetails2;
	}
	public String getAdverseObservationDetails3() {
		return AdverseObservationDetails3;
	}
	public void setAdverseObservationDetails3(String adverseObservationDetails3) {
		AdverseObservationDetails3 = adverseObservationDetails3;
	}
	public String getHighRiskIndividualPoa() {
		return HighRiskIndividualPoa;
	}
	public void setHighRiskIndividualPoa(String highRiskIndividualPoa) {
		HighRiskIndividualPoa = highRiskIndividualPoa;
	}
	public String getHighRiskIndividualPoaDetails() {
		return HighRiskIndividualPoaDetails;
	}
	public void setHighRiskIndividualPoaDetails(String highRiskIndividualPoaDetails) {
		HighRiskIndividualPoaDetails = highRiskIndividualPoaDetails;
	}
	public String getHighRiskIndividualRelativePoa() {
		return HighRiskIndividualRelativePoa;
	}
	public void setHighRiskIndividualRelativePoa(String highRiskIndividualRelativePoa) {
		HighRiskIndividualRelativePoa = highRiskIndividualRelativePoa;
	}
	public String getHighRiskIndividualRelativePoaDetails() {
		return HighRiskIndividualRelativePoaDetails;
	}
	public void setHighRiskIndividualRelativePoaDetails(String highRiskIndividualRelativePoaDetails) {
		HighRiskIndividualRelativePoaDetails = highRiskIndividualRelativePoaDetails;
	}
	public String getHighRiskDomesticIndividualPoa() {
		return HighRiskDomesticIndividualPoa;
	}
	public void setHighRiskDomesticIndividualPoa(String highRiskDomesticIndividualPoa) {
		HighRiskDomesticIndividualPoa = highRiskDomesticIndividualPoa;
	}
	public String getHighRiskDomesticIndividualPoaDetails() {
		return HighRiskDomesticIndividualPoaDetails;
	}
	public void setHighRiskDomesticIndividualPoaDetails(String highRiskDomesticIndividualPoaDetails) {
		HighRiskDomesticIndividualPoaDetails = highRiskDomesticIndividualPoaDetails;
	}
	public String getHighRiskIndividualEntityPoa() {
		return HighRiskIndividualEntityPoa;
	}
	public void setHighRiskIndividualEntityPoa(String highRiskIndividualEntityPoa) {
		HighRiskIndividualEntityPoa = highRiskIndividualEntityPoa;
	}
	public String getHighRiskIndividualEntityPoaDetails() {
		return HighRiskIndividualEntityPoaDetails;
	}
	public void setHighRiskIndividualEntityPoaDetails(String highRiskIndividualEntityPoaDetails) {
		HighRiskIndividualEntityPoaDetails = highRiskIndividualEntityPoaDetails;
	}
	public String getAuditedFinancialStatement() {
		return AuditedFinancialStatement;
	}
	public void setAuditedFinancialStatement(String auditedFinancialStatement) {
		AuditedFinancialStatement = auditedFinancialStatement;
	}
	public String getTransactionDetails1() {
		return TransactionDetails1;
	}
	public void setTransactionDetails1(String transactionDetails1) {
		TransactionDetails1 = transactionDetails1;
	}
	public String getTransactionDetails2() {
		return TransactionDetails2;
	}
	public void setTransactionDetails2(String transactionDetails2) {
		TransactionDetails2 = transactionDetails2;
	}
	public String getTransactionDetails3() {
		return TransactionDetails3;
	}
	public void setTransactionDetails3(String transactionDetails3) {
		TransactionDetails3 = transactionDetails3;
	}
	public String getTransactionDetails4() {
		return TransactionDetails4;
	}
	public void setTransactionDetails4(String transactionDetails4) {
		TransactionDetails4 = transactionDetails4;
	}
	public String getTransactionsCommensurate() {
		return TransactionsCommensurate;
	}
	public void setTransactionsCommensurate(String transactionsCommensurate) {
		TransactionsCommensurate = transactionsCommensurate;
	}
	public String getBranchSatisfied() {
		return BranchSatisfied;
	}
	public void setBranchSatisfied(String branchSatisfied) {
		BranchSatisfied = branchSatisfied;
	}
	public String getSupportingDocumentObtained() {
		return SupportingDocumentObtained;
	}
	public void setSupportingDocumentObtained(String supportingDocumentObtained) {
		SupportingDocumentObtained = supportingDocumentObtained;
	}
	public String getCustomerIsPep() {
		return CustomerIsPep;
	}
	public void setCustomerIsPep(String customerIsPep) {
		CustomerIsPep = customerIsPep;
	}
	public String getSeniorManagementApproval() {
		return SeniorManagementApproval;
	}
	public void setSeniorManagementApproval(String seniorManagementApproval) {
		SeniorManagementApproval = seniorManagementApproval;
	}
	public String getRequestingForeignCurrency() {
		return RequestingForeignCurrency;
	}
	public void setRequestingForeignCurrency(String requestingForeignCurrency) {
		RequestingForeignCurrency = requestingForeignCurrency;
	}
	public String getSeniorManagementApprovalCurrency() {
		return SeniorManagementApprovalCurrency;
	}
	public void setSeniorManagementApprovalCurrency(String seniorManagementApprovalCurrency) {
		SeniorManagementApprovalCurrency = seniorManagementApprovalCurrency;
	}
	public String getCashIntensiveBusinessDetail() {
		return CashIntensiveBusinessDetail;
	}
	public void setCashIntensiveBusinessDetail(String cashIntensiveBusinessDetail) {
		CashIntensiveBusinessDetail = cashIntensiveBusinessDetail;
	}
	public String getBusinessActivity1() {
		return BusinessActivity1;
	}
	public void setBusinessActivity1(String businessActivity1) {
		BusinessActivity1 = businessActivity1;
	}
	public String getBusinessActivity2() {
		return BusinessActivity2;
	}
	public void setBusinessActivity2(String businessActivity2) {
		BusinessActivity2 = businessActivity2;
	}
	public String getProductsOffered1() {
		return ProductsOffered1;
	}
	public void setProductsOffered1(String productsOffered1) {
		ProductsOffered1 = productsOffered1;
	}
	public String getProductsOffered2() {
		return ProductsOffered2;
	}
	public void setProductsOffered2(String productsOffered2) {
		ProductsOffered2 = productsOffered2;
	}
	public Double getVolumeDeposit1() {
		return VolumeDeposit1;
	}
	public void setVolumeDeposit1(Double volumeDeposit1) {
		VolumeDeposit1 = volumeDeposit1;
	}
	public Double getVolumeDeposit2() {
		return VolumeDeposit2;
	}
	public void setVolumeDeposit2(Double volumeDeposit2) {
		VolumeDeposit2 = volumeDeposit2;
	}
	public Double getVolumeWithdraw1() {
		return VolumeWithdraw1;
	}
	public void setVolumeWithdraw1(Double volumeWithdraw1) {
		VolumeWithdraw1 = volumeWithdraw1;
	}
	public Double getVolumeWithdraw2() {
		return VolumeWithdraw2;
	}
	public void setVolumeWithdraw2(Double volumeWithdraw2) {
		VolumeWithdraw2 = volumeWithdraw2;
	}
	public Double getNumberDeposit1() {
		return NumberDeposit1;
	}
	public void setNumberDeposit1(Double numberDeposit1) {
		NumberDeposit1 = numberDeposit1;
	}
	public Double getNumberDeposit2() {
		return NumberDeposit2;
	}
	public void setNumberDeposit2(Double numberDeposit2) {
		NumberDeposit2 = numberDeposit2;
	}
	public Double getNumberWithdraw1() {
		return NumberWithdraw1;
	}
	public void setNumberWithdraw1(Double numberWithdraw1) {
		NumberWithdraw1 = numberWithdraw1;
	}
	public Double getNumberWithdraw2() {
		return NumberWithdraw2;
	}
	public void setNumberWithdraw2(Double numberWithdraw2) {
		NumberWithdraw2 = numberWithdraw2;
	}
	public Double getTurnoverDeposit1() {
		return TurnoverDeposit1;
	}
	public void setTurnoverDeposit1(Double turnoverDeposit1) {
		TurnoverDeposit1 = turnoverDeposit1;
	}
	public Double getTurnoverDeposit2() {
		return TurnoverDeposit2;
	}
	public void setTurnoverDeposit2(Double turnoverDeposit2) {
		TurnoverDeposit2 = turnoverDeposit2;
	}
	public Double getTurnoverWithdraw1() {
		return TurnoverWithdraw1;
	}
	public void setTurnoverWithdraw1(Double turnoverWithdraw1) {
		TurnoverWithdraw1 = turnoverWithdraw1;
	}
	public Double getTurnoverWithdraw2() {
		return TurnoverWithdraw2;
	}
	public void setTurnoverWithdraw2(Double turnoverWithdraw2) {
		TurnoverWithdraw2 = turnoverWithdraw2;
	}
	public String getBrokerOrAgent() {
		return BrokerOrAgent;
	}
	public void setBrokerOrAgent(String brokerOrAgent) {
		BrokerOrAgent = brokerOrAgent;
	}
	public String getDealerOfMetals() {
		return DealerOfMetals;
	}
	public void setDealerOfMetals(String dealerOfMetals) {
		DealerOfMetals = dealerOfMetals;
	}
	public String getAuditor() {
		return Auditor;
	}
	public void setAuditor(String auditor) {
		Auditor = auditor;
	}
	public String getLegalConsultant() {
		return LegalConsultant;
	}
	public void setLegalConsultant(String legalConsultant) {
		LegalConsultant = legalConsultant;
	}
	public String getDealsDualGoods() {
		return DealsDualGoods;
	}
	public void setDealsDualGoods(String dealsDualGoods) {
		DealsDualGoods = dealsDualGoods;
	}
	public String getTransOnInterrelated1() {
		return TransOnInterrelated1;
	}
	public void setTransOnInterrelated1(String transOnInterrelated1) {
		TransOnInterrelated1 = transOnInterrelated1;
	}
	public String getTransOnInterrelated2() {
		return TransOnInterrelated2;
	}
	public void setTransOnInterrelated2(String transOnInterrelated2) {
		TransOnInterrelated2 = transOnInterrelated2;
	}
	public String getCustomerRisk() {
		return CustomerRisk;
	}
	public void setCustomerRisk(String customerRisk) {
		CustomerRisk = customerRisk;
	}
	public String getReasonForRisk() {
		return ReasonForRisk;
	}
	public void setReasonForRisk(String reasonForRisk) {
		ReasonForRisk = reasonForRisk;
	}
	public String getDueDiligence() {
		return DueDiligence;
	}
	public void setDueDiligence(String dueDiligence) {
		DueDiligence = dueDiligence;
	}
	public String getBankOfficialsObservation() {
		return BankOfficialsObservation;
	}
	public void setBankOfficialsObservation(String bankOfficialsObservation) {
		BankOfficialsObservation = bankOfficialsObservation;
	}
	public String getBranchHeadObservation() {
		return BranchHeadObservation;
	}
	public void setBranchHeadObservation(String branchHeadObservation) {
		BranchHeadObservation = branchHeadObservation;
	}
	public String getCSuspissionobserved() {
		return CSuspissionobserved;
	}
	public void setCSuspissionobserved(String cSuspissionobserved) {
		CSuspissionobserved = cSuspissionobserved;
	}
	public String getCSuspisionDetail() {
		return CSuspisionDetail;
	}
	public void setCSuspisionDetail(String cSuspisionDetail) {
		CSuspisionDetail = cSuspisionDetail;
	}
	public String getCHighvalueTransaction() {
		return CHighvalueTransaction;
	}
	public void setCHighvalueTransaction(String cHighvalueTransaction) {
		CHighvalueTransaction = cHighvalueTransaction;
	}
	public String getIsCashIntensiveBusiness() {
		return IsCashIntensiveBusiness;
	}
	public void setIsCashIntensiveBusiness(String isCashIntensiveBusiness) {
		IsCashIntensiveBusiness = isCashIntensiveBusiness;
	}
	public String getAccountOpeningOfficerSignature() {
		return AccountOpeningOfficerSignature;
	}
	public void setAccountOpeningOfficerSignature(String accountOpeningOfficerSignature) {
		AccountOpeningOfficerSignature = accountOpeningOfficerSignature;
	}
	public String getAccountOpeningOfficerName() {
		return AccountOpeningOfficerName;
	}
	public void setAccountOpeningOfficerName(String accountOpeningOfficerName) {
		AccountOpeningOfficerName = accountOpeningOfficerName;
	}
	public String getAccountOpeningOfficerDesignation() {
		return AccountOpeningOfficerDesignation;
	}
	public void setAccountOpeningOfficerDesignation(String accountOpeningOfficerDesignation) {
		AccountOpeningOfficerDesignation = accountOpeningOfficerDesignation;
	}
	public Date getAccountOpeningOfficerDate() {
		return AccountOpeningOfficerDate;
	}
	public void setAccountOpeningOfficerDate(Date accountOpeningOfficerDate) {
		AccountOpeningOfficerDate = accountOpeningOfficerDate;
	}
	public String getAccountOpeningOfficerPlace() {
		return AccountOpeningOfficerPlace;
	}
	public void setAccountOpeningOfficerPlace(String accountOpeningOfficerPlace) {
		AccountOpeningOfficerPlace = accountOpeningOfficerPlace;
	}
	public String getBranchOfficialSignature() {
		return BranchOfficialSignature;
	}
	public void setBranchOfficialSignature(String branchOfficialSignature) {
		BranchOfficialSignature = branchOfficialSignature;
	}
	public String getBranchOfficialName() {
		return BranchOfficialName;
	}
	public void setBranchOfficialName(String branchOfficialName) {
		BranchOfficialName = branchOfficialName;
	}
	public String getBranchOfficialDesignation() {
		return BranchOfficialDesignation;
	}
	public void setBranchOfficialDesignation(String branchOfficialDesignation) {
		BranchOfficialDesignation = branchOfficialDesignation;
	}
	public Date getBranchOfficialDate() {
		return BranchOfficialDate;
	}
	public void setBranchOfficialDate(Date branchOfficialDate) {
		BranchOfficialDate = branchOfficialDate;
	}
	public String getBranchOfficialPlace() {
		return BranchOfficialPlace;
	}
	public void setBranchOfficialPlace(String branchOfficialPlace) {
		BranchOfficialPlace = branchOfficialPlace;
	}
	public Character getEntityFlg() {
		return EntityFlg;
	}
	public void setEntityFlg(Character entityFlg) {
		EntityFlg = entityFlg;
	}
	public Character getModifyFlg() {
		return ModifyFlg;
	}
	public void setModifyFlg(Character modifyFlg) {
		ModifyFlg = modifyFlg;
	}
	public Character getDelFlg() {
		return DelFlg;
	}
	public void setDelFlg(Character delFlg) {
		DelFlg = delFlg;
	}
	public String getEntryUser() {
		return EntryUser;
	}
	public void setEntryUser(String entryUser) {
		EntryUser = entryUser;
	}
	public String getModifyUser() {
		return ModifyUser;
	}
	public void setModifyUser(String modifyUser) {
		ModifyUser = modifyUser;
	}
	public String getVerifyUser() {
		return VerifyUser;
	}
	public void setVerifyUser(String verifyUser) {
		VerifyUser = verifyUser;
	}
	public Date getEntryTime() {
		return EntryTime;
	}
	public void setEntryTime(Date entryTime) {
		EntryTime = entryTime;
	}
	public Date getModifyTime() {
		return ModifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		ModifyTime = modifyTime;
	}
	public Date getVerifyTime() {
		return VerifyTime;
	}
	public void setVerifyTime(Date verifyTime) {
		VerifyTime = verifyTime;
	}
	public String getCustomerOperatingBussiness() {
		return CustomerOperatingBussiness;
	}
	public void setCustomerOperatingBussiness(String customerOperatingBussiness) {
		CustomerOperatingBussiness = customerOperatingBussiness;
	}
	public Kyc_Corprate(String companyName, String customerId, String accountNumber, String legalStatus,
			String tradeLicenseNumber, Date tradeLicenseIssueDate, Date tradeLicenseExpiryDate,
			String countryOfEstablishment, String countryOfOperation, String businessActivity, String productsServices,
			String tradeLicense, String memorandumOfAssociation, String shareCertificate,
			String certificateOfIncorporation, String otherDocuments, String governmentTenancyDocument,
			String utilityBill, String flexiDeskAgreement, String coWorkingAgreement, String officeSharingAgreement,
			String otherAddressProof, String otherBusinessProof, String bankAccountStatement,
			String auditedCompanyFinancials, String personalBankAccountStatement, String otherEquivalentDocuments,
			String uboDirPoa1Name, String uboDirPoa1Nationality, Double uboDirPoa1ShareholdingPercent,
			String uboDirPoa1Passport, String uboDirPoa1VisaEid, String uboDirPoa1ResidenceAddress,
			String uboDirPoa1ProofSourceOfIncome, String uboDirPoa2Name, String uboDirPoa2Nationality,
			Double uboDirPoa2ShareholdingPercent, String uboDirPoa2Passport, String uboDirPoa2VisaEid,
			String uboDirPoa2ResidenceAddress, String uboDirPoa2ProofSourceOfIncome, String uboDirPoa3Name,
			String uboDirPoa3Nationality, Double uboDirPoa3ShareholdingPercent, String uboDirPoa3Passport,
			String uboDirPoa3VisaEid, String uboDirPoa3ResidenceAddress, String uboDirPoa3ProofSourceOfIncome,
			String uboDirPoa4Name, String uboDirPoa4Nationality, Double uboDirPoa4ShareholdingPercent,
			String uboDirPoa4Passport, String uboDirPoa4VisaEid, String uboDirPoa4ResidenceAddress,
			String uboDirPoa4ProofSourceOfIncome, String linkedAccountNumber1, Double linkedRelationshipDurationYears1,
			String linkedAccountNumber2, Double linkedRelationshipDurationYears2, String linkedAccountNumber3,
			Double linkedRelationshipDurationYears3, String linkedAccountNumber4,
			Double linkedRelationshipDurationYears4, String linkedAccountNumber5,
			Double linkedRelationshipDurationYears5, String conductOfAccountSatisfactory,
			String highValueTransactionsObserved, String highValueTransactionsDetails, Double currentTurnover,
			Double expectedTurnover, Double expectedDebitTransactions, Double expectedCreditTransactions,
			String expectedTransactionType, Double expectedTransactionVolume, String frequencyOfTransactions,
			String sanctionsMatchUae, String sanctionsMatchUn, String sanctionsMatchOfac, String sanctionsMatchHmt,
			String sanctionsMatchEu, Double counterpartySrNo1, String counterpartyName1, String counterpartyCountry1,
			String counterpartyProductsServices1, Double counterpartySrNo2, String counterpartyName2,
			String counterpartyCountry2, String counterpartyProductsServices2, Double counterpartySrNo3,
			String counterpartyName3, String counterpartyCountry3, String counterpartyProductsServices3,
			Double counterpartySrNo4, String counterpartyName4, String counterpartyCountry4,
			String counterpartyProductsServices4, Double intermediarySrNo1, String intermediaryName1,
			String intermediaryCountry1, String intermediaryName2, String intermediaryCountry2,
			String intermediaryName3, String intermediaryCountry3, String intermediaryName4,
			String intermediaryCountry4, String operatingInHighRiskJurisdiction, String highRiskJurisdictionCountry,
			String transactionCountry1, String transactionCountry2, String transactionCountry3,
			String transactionCountry4, String sanctionsUaeMatch, String sanctionsUnMatch, String sanctionsOfacMatch,
			String sanctionsHmtMatch, String sanctionsEuMatch, String sanctionsOthersMatch, String cbuaeBblCheckDone,
			String googleMediaSearchDone, String internalDenyListNameScreening, String suspicionObserved,
			String suspicionDetails, String redFlagSupportingDocsObtained, String redFlagDetails,
			String uboSanctionsUaeMatch, String uboSanctionsUnMatch, String uboSanctionsOfacMatch,
			String uboSanctionsHmtMatch, String uboSanctionsEuMatch, String uboSanctionsOthersMatch,
			String uboCbuaeBblCheckDone, String uboGoogleMediaSearchDone, String uboInternalDenyListScreening,
			String uboSuspicionObserved, String uboSuspicionDetails, String uboRedFlagSupportingDocsObtained,
			String uboRedFlagDetails, String counterpartySanctionsUaeMatch, String counterpartySanctionsUnMatch,
			String counterpartySanctionsOfacMatch, String counterpartySanctionsHmtMatch,
			String counterpartySanctionsEuMatch, String counterpartySanctionsOthersMatch,
			String counterpartyCbuaeBblCheckDone, String counterpartyGoogleMediaSearchDone,
			String counterpartyInternalDenyListScreening, String counterpartySuspicionObserved,
			String counterpartySuspicionDetails, String counterpartyRedFlagSupportingDocsObtained,
			String counterpartyRedFlagDetails, String siteVisitCompleted, String siteVisitReportAttached,
			String adverseObservationsSiteVisit, String adverseObservationDetails1, String adverseObservationDetails2,
			String adverseObservationDetails3, String highRiskIndividualPoa, String highRiskIndividualPoaDetails,
			String highRiskIndividualRelativePoa, String highRiskIndividualRelativePoaDetails,
			String highRiskDomesticIndividualPoa, String highRiskDomesticIndividualPoaDetails,
			String highRiskIndividualEntityPoa, String highRiskIndividualEntityPoaDetails,
			String auditedFinancialStatement, String transactionDetails1, String transactionDetails2,
			String transactionDetails3, String transactionDetails4, String transactionsCommensurate,
			String branchSatisfied, String supportingDocumentObtained, String customerIsPep,
			String seniorManagementApproval, String requestingForeignCurrency, String seniorManagementApprovalCurrency,
			String cashIntensiveBusinessDetail, String businessActivity1, String businessActivity2,
			String productsOffered1, String productsOffered2, Double volumeDeposit1, Double volumeDeposit2,
			Double volumeWithdraw1, Double volumeWithdraw2, Double numberDeposit1, Double numberDeposit2,
			Double numberWithdraw1, Double numberWithdraw2, Double turnoverDeposit1, Double turnoverDeposit2,
			Double turnoverWithdraw1, Double turnoverWithdraw2, String brokerOrAgent, String dealerOfMetals,
			String auditor, String legalConsultant, String dealsDualGoods, String transOnInterrelated1,
			String transOnInterrelated2, String customerRisk, String reasonForRisk, String dueDiligence,
			String bankOfficialsObservation, String branchHeadObservation, String cSuspissionobserved,
			String cSuspisionDetail, String cHighvalueTransaction, String isCashIntensiveBusiness,
			String accountOpeningOfficerSignature, String accountOpeningOfficerName,
			String accountOpeningOfficerDesignation, Date accountOpeningOfficerDate, String accountOpeningOfficerPlace,
			String branchOfficialSignature, String branchOfficialName, String branchOfficialDesignation,
			Date branchOfficialDate, String branchOfficialPlace, Character entityFlg, Character modifyFlg,
			Character delFlg, String entryUser, String modifyUser, String verifyUser, Date entryTime, Date modifyTime,
			Date verifyTime, String customerOperatingBussiness) {
		super();
		CompanyName = companyName;
		CustomerId = customerId;
		AccountNumber = accountNumber;
		LegalStatus = legalStatus;
		TradeLicenseNumber = tradeLicenseNumber;
		TradeLicenseIssueDate = tradeLicenseIssueDate;
		TradeLicenseExpiryDate = tradeLicenseExpiryDate;
		CountryOfEstablishment = countryOfEstablishment;
		CountryOfOperation = countryOfOperation;
		BusinessActivity = businessActivity;
		ProductsServices = productsServices;
		TradeLicense = tradeLicense;
		MemorandumOfAssociation = memorandumOfAssociation;
		ShareCertificate = shareCertificate;
		CertificateOfIncorporation = certificateOfIncorporation;
		OtherDocuments = otherDocuments;
		GovernmentTenancyDocument = governmentTenancyDocument;
		UtilityBill = utilityBill;
		FlexiDeskAgreement = flexiDeskAgreement;
		CoWorkingAgreement = coWorkingAgreement;
		OfficeSharingAgreement = officeSharingAgreement;
		OtherAddressProof = otherAddressProof;
		OtherBusinessProof = otherBusinessProof;
		BankAccountStatement = bankAccountStatement;
		AuditedCompanyFinancials = auditedCompanyFinancials;
		PersonalBankAccountStatement = personalBankAccountStatement;
		OtherEquivalentDocuments = otherEquivalentDocuments;
		UboDirPoa1Name = uboDirPoa1Name;
		UboDirPoa1Nationality = uboDirPoa1Nationality;
		UboDirPoa1ShareholdingPercent = uboDirPoa1ShareholdingPercent;
		UboDirPoa1Passport = uboDirPoa1Passport;
		UboDirPoa1VisaEid = uboDirPoa1VisaEid;
		UboDirPoa1ResidenceAddress = uboDirPoa1ResidenceAddress;
		UboDirPoa1ProofSourceOfIncome = uboDirPoa1ProofSourceOfIncome;
		UboDirPoa2Name = uboDirPoa2Name;
		UboDirPoa2Nationality = uboDirPoa2Nationality;
		UboDirPoa2ShareholdingPercent = uboDirPoa2ShareholdingPercent;
		UboDirPoa2Passport = uboDirPoa2Passport;
		UboDirPoa2VisaEid = uboDirPoa2VisaEid;
		UboDirPoa2ResidenceAddress = uboDirPoa2ResidenceAddress;
		UboDirPoa2ProofSourceOfIncome = uboDirPoa2ProofSourceOfIncome;
		UboDirPoa3Name = uboDirPoa3Name;
		UboDirPoa3Nationality = uboDirPoa3Nationality;
		UboDirPoa3ShareholdingPercent = uboDirPoa3ShareholdingPercent;
		UboDirPoa3Passport = uboDirPoa3Passport;
		UboDirPoa3VisaEid = uboDirPoa3VisaEid;
		UboDirPoa3ResidenceAddress = uboDirPoa3ResidenceAddress;
		UboDirPoa3ProofSourceOfIncome = uboDirPoa3ProofSourceOfIncome;
		UboDirPoa4Name = uboDirPoa4Name;
		UboDirPoa4Nationality = uboDirPoa4Nationality;
		UboDirPoa4ShareholdingPercent = uboDirPoa4ShareholdingPercent;
		UboDirPoa4Passport = uboDirPoa4Passport;
		UboDirPoa4VisaEid = uboDirPoa4VisaEid;
		UboDirPoa4ResidenceAddress = uboDirPoa4ResidenceAddress;
		UboDirPoa4ProofSourceOfIncome = uboDirPoa4ProofSourceOfIncome;
		LinkedAccountNumber1 = linkedAccountNumber1;
		LinkedRelationshipDurationYears1 = linkedRelationshipDurationYears1;
		LinkedAccountNumber2 = linkedAccountNumber2;
		LinkedRelationshipDurationYears2 = linkedRelationshipDurationYears2;
		LinkedAccountNumber3 = linkedAccountNumber3;
		LinkedRelationshipDurationYears3 = linkedRelationshipDurationYears3;
		LinkedAccountNumber4 = linkedAccountNumber4;
		LinkedRelationshipDurationYears4 = linkedRelationshipDurationYears4;
		LinkedAccountNumber5 = linkedAccountNumber5;
		LinkedRelationshipDurationYears5 = linkedRelationshipDurationYears5;
		ConductOfAccountSatisfactory = conductOfAccountSatisfactory;
		HighValueTransactionsObserved = highValueTransactionsObserved;
		HighValueTransactionsDetails = highValueTransactionsDetails;
		CurrentTurnover = currentTurnover;
		ExpectedTurnover = expectedTurnover;
		ExpectedDebitTransactions = expectedDebitTransactions;
		ExpectedCreditTransactions = expectedCreditTransactions;
		ExpectedTransactionType = expectedTransactionType;
		ExpectedTransactionVolume = expectedTransactionVolume;
		FrequencyOfTransactions = frequencyOfTransactions;
		SanctionsMatchUae = sanctionsMatchUae;
		SanctionsMatchUn = sanctionsMatchUn;
		SanctionsMatchOfac = sanctionsMatchOfac;
		SanctionsMatchHmt = sanctionsMatchHmt;
		SanctionsMatchEu = sanctionsMatchEu;
		CounterpartySrNo1 = counterpartySrNo1;
		CounterpartyName1 = counterpartyName1;
		CounterpartyCountry1 = counterpartyCountry1;
		CounterpartyProductsServices1 = counterpartyProductsServices1;
		CounterpartySrNo2 = counterpartySrNo2;
		CounterpartyName2 = counterpartyName2;
		CounterpartyCountry2 = counterpartyCountry2;
		CounterpartyProductsServices2 = counterpartyProductsServices2;
		CounterpartySrNo3 = counterpartySrNo3;
		CounterpartyName3 = counterpartyName3;
		CounterpartyCountry3 = counterpartyCountry3;
		CounterpartyProductsServices3 = counterpartyProductsServices3;
		CounterpartySrNo4 = counterpartySrNo4;
		CounterpartyName4 = counterpartyName4;
		CounterpartyCountry4 = counterpartyCountry4;
		CounterpartyProductsServices4 = counterpartyProductsServices4;
		IntermediarySrNo1 = intermediarySrNo1;
		IntermediaryName1 = intermediaryName1;
		IntermediaryCountry1 = intermediaryCountry1;
		IntermediaryName2 = intermediaryName2;
		IntermediaryCountry2 = intermediaryCountry2;
		IntermediaryName3 = intermediaryName3;
		IntermediaryCountry3 = intermediaryCountry3;
		IntermediaryName4 = intermediaryName4;
		IntermediaryCountry4 = intermediaryCountry4;
		OperatingInHighRiskJurisdiction = operatingInHighRiskJurisdiction;
		HighRiskJurisdictionCountry = highRiskJurisdictionCountry;
		TransactionCountry1 = transactionCountry1;
		TransactionCountry2 = transactionCountry2;
		TransactionCountry3 = transactionCountry3;
		TransactionCountry4 = transactionCountry4;
		SanctionsUaeMatch = sanctionsUaeMatch;
		SanctionsUnMatch = sanctionsUnMatch;
		SanctionsOfacMatch = sanctionsOfacMatch;
		SanctionsHmtMatch = sanctionsHmtMatch;
		SanctionsEuMatch = sanctionsEuMatch;
		SanctionsOthersMatch = sanctionsOthersMatch;
		CbuaeBblCheckDone = cbuaeBblCheckDone;
		GoogleMediaSearchDone = googleMediaSearchDone;
		InternalDenyListNameScreening = internalDenyListNameScreening;
		SuspicionObserved = suspicionObserved;
		SuspicionDetails = suspicionDetails;
		RedFlagSupportingDocsObtained = redFlagSupportingDocsObtained;
		RedFlagDetails = redFlagDetails;
		UboSanctionsUaeMatch = uboSanctionsUaeMatch;
		UboSanctionsUnMatch = uboSanctionsUnMatch;
		UboSanctionsOfacMatch = uboSanctionsOfacMatch;
		UboSanctionsHmtMatch = uboSanctionsHmtMatch;
		UboSanctionsEuMatch = uboSanctionsEuMatch;
		UboSanctionsOthersMatch = uboSanctionsOthersMatch;
		UboCbuaeBblCheckDone = uboCbuaeBblCheckDone;
		UboGoogleMediaSearchDone = uboGoogleMediaSearchDone;
		UboInternalDenyListScreening = uboInternalDenyListScreening;
		UboSuspicionObserved = uboSuspicionObserved;
		UboSuspicionDetails = uboSuspicionDetails;
		UboRedFlagSupportingDocsObtained = uboRedFlagSupportingDocsObtained;
		UboRedFlagDetails = uboRedFlagDetails;
		CounterpartySanctionsUaeMatch = counterpartySanctionsUaeMatch;
		CounterpartySanctionsUnMatch = counterpartySanctionsUnMatch;
		CounterpartySanctionsOfacMatch = counterpartySanctionsOfacMatch;
		CounterpartySanctionsHmtMatch = counterpartySanctionsHmtMatch;
		CounterpartySanctionsEuMatch = counterpartySanctionsEuMatch;
		CounterpartySanctionsOthersMatch = counterpartySanctionsOthersMatch;
		CounterpartyCbuaeBblCheckDone = counterpartyCbuaeBblCheckDone;
		CounterpartyGoogleMediaSearchDone = counterpartyGoogleMediaSearchDone;
		CounterpartyInternalDenyListScreening = counterpartyInternalDenyListScreening;
		CounterpartySuspicionObserved = counterpartySuspicionObserved;
		CounterpartySuspicionDetails = counterpartySuspicionDetails;
		CounterpartyRedFlagSupportingDocsObtained = counterpartyRedFlagSupportingDocsObtained;
		CounterpartyRedFlagDetails = counterpartyRedFlagDetails;
		SiteVisitCompleted = siteVisitCompleted;
		SiteVisitReportAttached = siteVisitReportAttached;
		AdverseObservationsSiteVisit = adverseObservationsSiteVisit;
		AdverseObservationDetails1 = adverseObservationDetails1;
		AdverseObservationDetails2 = adverseObservationDetails2;
		AdverseObservationDetails3 = adverseObservationDetails3;
		HighRiskIndividualPoa = highRiskIndividualPoa;
		HighRiskIndividualPoaDetails = highRiskIndividualPoaDetails;
		HighRiskIndividualRelativePoa = highRiskIndividualRelativePoa;
		HighRiskIndividualRelativePoaDetails = highRiskIndividualRelativePoaDetails;
		HighRiskDomesticIndividualPoa = highRiskDomesticIndividualPoa;
		HighRiskDomesticIndividualPoaDetails = highRiskDomesticIndividualPoaDetails;
		HighRiskIndividualEntityPoa = highRiskIndividualEntityPoa;
		HighRiskIndividualEntityPoaDetails = highRiskIndividualEntityPoaDetails;
		AuditedFinancialStatement = auditedFinancialStatement;
		TransactionDetails1 = transactionDetails1;
		TransactionDetails2 = transactionDetails2;
		TransactionDetails3 = transactionDetails3;
		TransactionDetails4 = transactionDetails4;
		TransactionsCommensurate = transactionsCommensurate;
		BranchSatisfied = branchSatisfied;
		SupportingDocumentObtained = supportingDocumentObtained;
		CustomerIsPep = customerIsPep;
		SeniorManagementApproval = seniorManagementApproval;
		RequestingForeignCurrency = requestingForeignCurrency;
		SeniorManagementApprovalCurrency = seniorManagementApprovalCurrency;
		CashIntensiveBusinessDetail = cashIntensiveBusinessDetail;
		BusinessActivity1 = businessActivity1;
		BusinessActivity2 = businessActivity2;
		ProductsOffered1 = productsOffered1;
		ProductsOffered2 = productsOffered2;
		VolumeDeposit1 = volumeDeposit1;
		VolumeDeposit2 = volumeDeposit2;
		VolumeWithdraw1 = volumeWithdraw1;
		VolumeWithdraw2 = volumeWithdraw2;
		NumberDeposit1 = numberDeposit1;
		NumberDeposit2 = numberDeposit2;
		NumberWithdraw1 = numberWithdraw1;
		NumberWithdraw2 = numberWithdraw2;
		TurnoverDeposit1 = turnoverDeposit1;
		TurnoverDeposit2 = turnoverDeposit2;
		TurnoverWithdraw1 = turnoverWithdraw1;
		TurnoverWithdraw2 = turnoverWithdraw2;
		BrokerOrAgent = brokerOrAgent;
		DealerOfMetals = dealerOfMetals;
		Auditor = auditor;
		LegalConsultant = legalConsultant;
		DealsDualGoods = dealsDualGoods;
		TransOnInterrelated1 = transOnInterrelated1;
		TransOnInterrelated2 = transOnInterrelated2;
		CustomerRisk = customerRisk;
		ReasonForRisk = reasonForRisk;
		DueDiligence = dueDiligence;
		BankOfficialsObservation = bankOfficialsObservation;
		BranchHeadObservation = branchHeadObservation;
		CSuspissionobserved = cSuspissionobserved;
		CSuspisionDetail = cSuspisionDetail;
		CHighvalueTransaction = cHighvalueTransaction;
		IsCashIntensiveBusiness = isCashIntensiveBusiness;
		AccountOpeningOfficerSignature = accountOpeningOfficerSignature;
		AccountOpeningOfficerName = accountOpeningOfficerName;
		AccountOpeningOfficerDesignation = accountOpeningOfficerDesignation;
		AccountOpeningOfficerDate = accountOpeningOfficerDate;
		AccountOpeningOfficerPlace = accountOpeningOfficerPlace;
		BranchOfficialSignature = branchOfficialSignature;
		BranchOfficialName = branchOfficialName;
		BranchOfficialDesignation = branchOfficialDesignation;
		BranchOfficialDate = branchOfficialDate;
		BranchOfficialPlace = branchOfficialPlace;
		EntityFlg = entityFlg;
		ModifyFlg = modifyFlg;
		DelFlg = delFlg;
		EntryUser = entryUser;
		ModifyUser = modifyUser;
		VerifyUser = verifyUser;
		EntryTime = entryTime;
		ModifyTime = modifyTime;
		VerifyTime = verifyTime;
		CustomerOperatingBussiness = customerOperatingBussiness;
	}
	public Kyc_Corprate() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Kyc_Corprate [CompanyName=" + CompanyName + ", CustomerId=" + CustomerId + ", AccountNumber="
				+ AccountNumber + ", LegalStatus=" + LegalStatus + ", TradeLicenseNumber=" + TradeLicenseNumber
				+ ", TradeLicenseIssueDate=" + TradeLicenseIssueDate + ", TradeLicenseExpiryDate="
				+ TradeLicenseExpiryDate + ", CountryOfEstablishment=" + CountryOfEstablishment
				+ ", CountryOfOperation=" + CountryOfOperation + ", BusinessActivity=" + BusinessActivity
				+ ", ProductsServices=" + ProductsServices + ", TradeLicense=" + TradeLicense
				+ ", MemorandumOfAssociation=" + MemorandumOfAssociation + ", ShareCertificate=" + ShareCertificate
				+ ", CertificateOfIncorporation=" + CertificateOfIncorporation + ", OtherDocuments=" + OtherDocuments
				+ ", GovernmentTenancyDocument=" + GovernmentTenancyDocument + ", UtilityBill=" + UtilityBill
				+ ", FlexiDeskAgreement=" + FlexiDeskAgreement + ", CoWorkingAgreement=" + CoWorkingAgreement
				+ ", OfficeSharingAgreement=" + OfficeSharingAgreement + ", OtherAddressProof=" + OtherAddressProof
				+ ", OtherBusinessProof=" + OtherBusinessProof + ", BankAccountStatement=" + BankAccountStatement
				+ ", AuditedCompanyFinancials=" + AuditedCompanyFinancials + ", PersonalBankAccountStatement="
				+ PersonalBankAccountStatement + ", OtherEquivalentDocuments=" + OtherEquivalentDocuments
				+ ", UboDirPoa1Name=" + UboDirPoa1Name + ", UboDirPoa1Nationality=" + UboDirPoa1Nationality
				+ ", UboDirPoa1ShareholdingPercent=" + UboDirPoa1ShareholdingPercent + ", UboDirPoa1Passport="
				+ UboDirPoa1Passport + ", UboDirPoa1VisaEid=" + UboDirPoa1VisaEid + ", UboDirPoa1ResidenceAddress="
				+ UboDirPoa1ResidenceAddress + ", UboDirPoa1ProofSourceOfIncome=" + UboDirPoa1ProofSourceOfIncome
				+ ", UboDirPoa2Name=" + UboDirPoa2Name + ", UboDirPoa2Nationality=" + UboDirPoa2Nationality
				+ ", UboDirPoa2ShareholdingPercent=" + UboDirPoa2ShareholdingPercent + ", UboDirPoa2Passport="
				+ UboDirPoa2Passport + ", UboDirPoa2VisaEid=" + UboDirPoa2VisaEid + ", UboDirPoa2ResidenceAddress="
				+ UboDirPoa2ResidenceAddress + ", UboDirPoa2ProofSourceOfIncome=" + UboDirPoa2ProofSourceOfIncome
				+ ", UboDirPoa3Name=" + UboDirPoa3Name + ", UboDirPoa3Nationality=" + UboDirPoa3Nationality
				+ ", UboDirPoa3ShareholdingPercent=" + UboDirPoa3ShareholdingPercent + ", UboDirPoa3Passport="
				+ UboDirPoa3Passport + ", UboDirPoa3VisaEid=" + UboDirPoa3VisaEid + ", UboDirPoa3ResidenceAddress="
				+ UboDirPoa3ResidenceAddress + ", UboDirPoa3ProofSourceOfIncome=" + UboDirPoa3ProofSourceOfIncome
				+ ", UboDirPoa4Name=" + UboDirPoa4Name + ", UboDirPoa4Nationality=" + UboDirPoa4Nationality
				+ ", UboDirPoa4ShareholdingPercent=" + UboDirPoa4ShareholdingPercent + ", UboDirPoa4Passport="
				+ UboDirPoa4Passport + ", UboDirPoa4VisaEid=" + UboDirPoa4VisaEid + ", UboDirPoa4ResidenceAddress="
				+ UboDirPoa4ResidenceAddress + ", UboDirPoa4ProofSourceOfIncome=" + UboDirPoa4ProofSourceOfIncome
				+ ", LinkedAccountNumber1=" + LinkedAccountNumber1 + ", LinkedRelationshipDurationYears1="
				+ LinkedRelationshipDurationYears1 + ", LinkedAccountNumber2=" + LinkedAccountNumber2
				+ ", LinkedRelationshipDurationYears2=" + LinkedRelationshipDurationYears2 + ", LinkedAccountNumber3="
				+ LinkedAccountNumber3 + ", LinkedRelationshipDurationYears3=" + LinkedRelationshipDurationYears3
				+ ", LinkedAccountNumber4=" + LinkedAccountNumber4 + ", LinkedRelationshipDurationYears4="
				+ LinkedRelationshipDurationYears4 + ", LinkedAccountNumber5=" + LinkedAccountNumber5
				+ ", LinkedRelationshipDurationYears5=" + LinkedRelationshipDurationYears5
				+ ", ConductOfAccountSatisfactory=" + ConductOfAccountSatisfactory + ", HighValueTransactionsObserved="
				+ HighValueTransactionsObserved + ", HighValueTransactionsDetails=" + HighValueTransactionsDetails
				+ ", CurrentTurnover=" + CurrentTurnover + ", ExpectedTurnover=" + ExpectedTurnover
				+ ", ExpectedDebitTransactions=" + ExpectedDebitTransactions + ", ExpectedCreditTransactions="
				+ ExpectedCreditTransactions + ", ExpectedTransactionType=" + ExpectedTransactionType
				+ ", ExpectedTransactionVolume=" + ExpectedTransactionVolume + ", FrequencyOfTransactions="
				+ FrequencyOfTransactions + ", SanctionsMatchUae=" + SanctionsMatchUae + ", SanctionsMatchUn="
				+ SanctionsMatchUn + ", SanctionsMatchOfac=" + SanctionsMatchOfac + ", SanctionsMatchHmt="
				+ SanctionsMatchHmt + ", SanctionsMatchEu=" + SanctionsMatchEu + ", CounterpartySrNo1="
				+ CounterpartySrNo1 + ", CounterpartyName1=" + CounterpartyName1 + ", CounterpartyCountry1="
				+ CounterpartyCountry1 + ", CounterpartyProductsServices1=" + CounterpartyProductsServices1
				+ ", CounterpartySrNo2=" + CounterpartySrNo2 + ", CounterpartyName2=" + CounterpartyName2
				+ ", CounterpartyCountry2=" + CounterpartyCountry2 + ", CounterpartyProductsServices2="
				+ CounterpartyProductsServices2 + ", CounterpartySrNo3=" + CounterpartySrNo3 + ", CounterpartyName3="
				+ CounterpartyName3 + ", CounterpartyCountry3=" + CounterpartyCountry3
				+ ", CounterpartyProductsServices3=" + CounterpartyProductsServices3 + ", CounterpartySrNo4="
				+ CounterpartySrNo4 + ", CounterpartyName4=" + CounterpartyName4 + ", CounterpartyCountry4="
				+ CounterpartyCountry4 + ", CounterpartyProductsServices4=" + CounterpartyProductsServices4
				+ ", IntermediarySrNo1=" + IntermediarySrNo1 + ", IntermediaryName1=" + IntermediaryName1
				+ ", IntermediaryCountry1=" + IntermediaryCountry1 + ", IntermediaryName2=" + IntermediaryName2
				+ ", IntermediaryCountry2=" + IntermediaryCountry2 + ", IntermediaryName3=" + IntermediaryName3
				+ ", IntermediaryCountry3=" + IntermediaryCountry3 + ", IntermediaryName4=" + IntermediaryName4
				+ ", IntermediaryCountry4=" + IntermediaryCountry4 + ", OperatingInHighRiskJurisdiction="
				+ OperatingInHighRiskJurisdiction + ", HighRiskJurisdictionCountry=" + HighRiskJurisdictionCountry
				+ ", TransactionCountry1=" + TransactionCountry1 + ", TransactionCountry2=" + TransactionCountry2
				+ ", TransactionCountry3=" + TransactionCountry3 + ", TransactionCountry4=" + TransactionCountry4
				+ ", SanctionsUaeMatch=" + SanctionsUaeMatch + ", SanctionsUnMatch=" + SanctionsUnMatch
				+ ", SanctionsOfacMatch=" + SanctionsOfacMatch + ", SanctionsHmtMatch=" + SanctionsHmtMatch
				+ ", SanctionsEuMatch=" + SanctionsEuMatch + ", SanctionsOthersMatch=" + SanctionsOthersMatch
				+ ", CbuaeBblCheckDone=" + CbuaeBblCheckDone + ", GoogleMediaSearchDone=" + GoogleMediaSearchDone
				+ ", InternalDenyListNameScreening=" + InternalDenyListNameScreening + ", SuspicionObserved="
				+ SuspicionObserved + ", SuspicionDetails=" + SuspicionDetails + ", RedFlagSupportingDocsObtained="
				+ RedFlagSupportingDocsObtained + ", RedFlagDetails=" + RedFlagDetails + ", UboSanctionsUaeMatch="
				+ UboSanctionsUaeMatch + ", UboSanctionsUnMatch=" + UboSanctionsUnMatch + ", UboSanctionsOfacMatch="
				+ UboSanctionsOfacMatch + ", UboSanctionsHmtMatch=" + UboSanctionsHmtMatch + ", UboSanctionsEuMatch="
				+ UboSanctionsEuMatch + ", UboSanctionsOthersMatch=" + UboSanctionsOthersMatch
				+ ", UboCbuaeBblCheckDone=" + UboCbuaeBblCheckDone + ", UboGoogleMediaSearchDone="
				+ UboGoogleMediaSearchDone + ", UboInternalDenyListScreening=" + UboInternalDenyListScreening
				+ ", UboSuspicionObserved=" + UboSuspicionObserved + ", UboSuspicionDetails=" + UboSuspicionDetails
				+ ", UboRedFlagSupportingDocsObtained=" + UboRedFlagSupportingDocsObtained + ", UboRedFlagDetails="
				+ UboRedFlagDetails + ", CounterpartySanctionsUaeMatch=" + CounterpartySanctionsUaeMatch
				+ ", CounterpartySanctionsUnMatch=" + CounterpartySanctionsUnMatch + ", CounterpartySanctionsOfacMatch="
				+ CounterpartySanctionsOfacMatch + ", CounterpartySanctionsHmtMatch=" + CounterpartySanctionsHmtMatch
				+ ", CounterpartySanctionsEuMatch=" + CounterpartySanctionsEuMatch
				+ ", CounterpartySanctionsOthersMatch=" + CounterpartySanctionsOthersMatch
				+ ", CounterpartyCbuaeBblCheckDone=" + CounterpartyCbuaeBblCheckDone
				+ ", CounterpartyGoogleMediaSearchDone=" + CounterpartyGoogleMediaSearchDone
				+ ", CounterpartyInternalDenyListScreening=" + CounterpartyInternalDenyListScreening
				+ ", CounterpartySuspicionObserved=" + CounterpartySuspicionObserved + ", CounterpartySuspicionDetails="
				+ CounterpartySuspicionDetails + ", CounterpartyRedFlagSupportingDocsObtained="
				+ CounterpartyRedFlagSupportingDocsObtained + ", CounterpartyRedFlagDetails="
				+ CounterpartyRedFlagDetails + ", SiteVisitCompleted=" + SiteVisitCompleted
				+ ", SiteVisitReportAttached=" + SiteVisitReportAttached + ", AdverseObservationsSiteVisit="
				+ AdverseObservationsSiteVisit + ", AdverseObservationDetails1=" + AdverseObservationDetails1
				+ ", AdverseObservationDetails2=" + AdverseObservationDetails2 + ", AdverseObservationDetails3="
				+ AdverseObservationDetails3 + ", HighRiskIndividualPoa=" + HighRiskIndividualPoa
				+ ", HighRiskIndividualPoaDetails=" + HighRiskIndividualPoaDetails + ", HighRiskIndividualRelativePoa="
				+ HighRiskIndividualRelativePoa + ", HighRiskIndividualRelativePoaDetails="
				+ HighRiskIndividualRelativePoaDetails + ", HighRiskDomesticIndividualPoa="
				+ HighRiskDomesticIndividualPoa + ", HighRiskDomesticIndividualPoaDetails="
				+ HighRiskDomesticIndividualPoaDetails + ", HighRiskIndividualEntityPoa=" + HighRiskIndividualEntityPoa
				+ ", HighRiskIndividualEntityPoaDetails=" + HighRiskIndividualEntityPoaDetails
				+ ", AuditedFinancialStatement=" + AuditedFinancialStatement + ", TransactionDetails1="
				+ TransactionDetails1 + ", TransactionDetails2=" + TransactionDetails2 + ", TransactionDetails3="
				+ TransactionDetails3 + ", TransactionDetails4=" + TransactionDetails4 + ", TransactionsCommensurate="
				+ TransactionsCommensurate + ", BranchSatisfied=" + BranchSatisfied + ", SupportingDocumentObtained="
				+ SupportingDocumentObtained + ", CustomerIsPep=" + CustomerIsPep + ", SeniorManagementApproval="
				+ SeniorManagementApproval + ", RequestingForeignCurrency=" + RequestingForeignCurrency
				+ ", SeniorManagementApprovalCurrency=" + SeniorManagementApprovalCurrency
				+ ", CashIntensiveBusinessDetail=" + CashIntensiveBusinessDetail + ", BusinessActivity1="
				+ BusinessActivity1 + ", BusinessActivity2=" + BusinessActivity2 + ", ProductsOffered1="
				+ ProductsOffered1 + ", ProductsOffered2=" + ProductsOffered2 + ", VolumeDeposit1=" + VolumeDeposit1
				+ ", VolumeDeposit2=" + VolumeDeposit2 + ", VolumeWithdraw1=" + VolumeWithdraw1 + ", VolumeWithdraw2="
				+ VolumeWithdraw2 + ", NumberDeposit1=" + NumberDeposit1 + ", NumberDeposit2=" + NumberDeposit2
				+ ", NumberWithdraw1=" + NumberWithdraw1 + ", NumberWithdraw2=" + NumberWithdraw2
				+ ", TurnoverDeposit1=" + TurnoverDeposit1 + ", TurnoverDeposit2=" + TurnoverDeposit2
				+ ", TurnoverWithdraw1=" + TurnoverWithdraw1 + ", TurnoverWithdraw2=" + TurnoverWithdraw2
				+ ", BrokerOrAgent=" + BrokerOrAgent + ", DealerOfMetals=" + DealerOfMetals + ", Auditor=" + Auditor
				+ ", LegalConsultant=" + LegalConsultant + ", DealsDualGoods=" + DealsDualGoods
				+ ", TransOnInterrelated1=" + TransOnInterrelated1 + ", TransOnInterrelated2=" + TransOnInterrelated2
				+ ", CustomerRisk=" + CustomerRisk + ", ReasonForRisk=" + ReasonForRisk + ", DueDiligence="
				+ DueDiligence + ", BankOfficialsObservation=" + BankOfficialsObservation + ", BranchHeadObservation="
				+ BranchHeadObservation + ", CSuspissionobserved=" + CSuspissionobserved + ", CSuspisionDetail="
				+ CSuspisionDetail + ", CHighvalueTransaction=" + CHighvalueTransaction + ", IsCashIntensiveBusiness="
				+ IsCashIntensiveBusiness + ", AccountOpeningOfficerSignature=" + AccountOpeningOfficerSignature
				+ ", AccountOpeningOfficerName=" + AccountOpeningOfficerName + ", AccountOpeningOfficerDesignation="
				+ AccountOpeningOfficerDesignation + ", AccountOpeningOfficerDate=" + AccountOpeningOfficerDate
				+ ", AccountOpeningOfficerPlace=" + AccountOpeningOfficerPlace + ", BranchOfficialSignature="
				+ BranchOfficialSignature + ", BranchOfficialName=" + BranchOfficialName
				+ ", BranchOfficialDesignation=" + BranchOfficialDesignation + ", BranchOfficialDate="
				+ BranchOfficialDate + ", BranchOfficialPlace=" + BranchOfficialPlace + ", EntityFlg=" + EntityFlg
				+ ", ModifyFlg=" + ModifyFlg + ", DelFlg=" + DelFlg + ", EntryUser=" + EntryUser + ", ModifyUser="
				+ ModifyUser + ", VerifyUser=" + VerifyUser + ", EntryTime=" + EntryTime + ", ModifyTime=" + ModifyTime
				+ ", VerifyTime=" + VerifyTime + ", CustomerOperatingBussiness=" + CustomerOperatingBussiness + "]";
	}
	
	
	
	
}