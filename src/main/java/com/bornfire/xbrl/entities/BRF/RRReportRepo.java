package com.bornfire.xbrl.entities.BRF;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RRReportRepo extends JpaRepository<RRReport, Integer> {

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'RR' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportList();

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'BASEL' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportListBASEL();

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'HY1' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportListhalfyearly1();

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'HY2' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportListhalfyearly2();

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'M1' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportListmonthly1();

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'M2' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportListmonthly2();

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'M3' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportListmonthly3();

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'Q1' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportListquarterly1();

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'Q2' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportListquarterly2();

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'Y' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportListyearly();

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'MR1' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportLISTMARKETRISK1();

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'MR3' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportLISTMARKETRISK3();

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'MR2' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportLISTMARKETRISK2();

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'MR4' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportLISTMARKETRISK4();

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'MR5' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportLISTMARKETRISK5();

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'MR6' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportLISTMARKETRISK6();

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'MR7' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportLISTMARKETRISK7();

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'MR8' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportLISTMARKETRISK8();

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'MR9' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportLISTMARKETRISK9();

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'CR1' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportLISTCREDITRISK1();

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'CR3' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportLISTCREDITRISK3();

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'CR2' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportLISTCREDITRISK2();

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'CR4' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportLISTCREDITRISK4();

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'SR1' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportLISTSettlementRISK();

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'CV1' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportLISTCreditValuation();

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'EIF' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportLISTEquityInvestment();

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'OR1' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportLISTOPERATIONALRISK();

	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'CAR' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportLISTCapitalAdequacy();
}
