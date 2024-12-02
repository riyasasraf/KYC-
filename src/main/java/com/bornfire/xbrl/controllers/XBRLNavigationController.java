package com.bornfire.xbrl.controllers;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.mail.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.InputStreamResource;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.bornfire.xbrl.entities.AlertManagementEntity;
import com.bornfire.xbrl.entities.BankMaster;
import com.bornfire.xbrl.entities.CustomRepDownloadRep;
import com.bornfire.xbrl.entities.CustomReportsParmsRepo;
import com.bornfire.xbrl.entities.GenRefCodeMast;
import com.bornfire.xbrl.entities.KYC_I;
import com.bornfire.xbrl.entities.Kyc_Corprate;
import com.bornfire.xbrl.entities.Kyc_Corprate_Repo;
import com.bornfire.xbrl.entities.Kyc_Repo;
import com.bornfire.xbrl.entities.UserProfile;
import com.bornfire.xbrl.entities.BRF.RRReportRepo;
import com.bornfire.xbrl.services.AlertManagementServices;
import com.bornfire.xbrl.services.BankServices;
//import com.bornfire.xbrl.services.CustomRepGeneratorServices;
//import com.bornfire.xbrl.services.CustomRepParamServices;
import com.bornfire.xbrl.services.EtlServices;
import com.bornfire.xbrl.services.GlSubHeadConfigService;
import com.bornfire.xbrl.services.Kyc_individual_service;
import com.bornfire.xbrl.services.LoginServices;
import com.bornfire.xbrl.services.ReferenceCodeConfigure;
import com.bornfire.xbrl.services.ReportCodeMappingService;
import com.bornfire.xbrl.services.ReportServices;
import com.bornfire.xbrl.services.ReportServices.ReportTitle;

import net.sf.jasperreports.engine.JRException;

@Controller
@ConfigurationProperties("default")
public class XBRLNavigationController {

	private static final Logger logger = LoggerFactory.getLogger(XBRLNavigationController.class);

	@Autowired
	LoginServices loginServices;

	@Autowired
	ReportServices reportServices;

	@Autowired
	ReferenceCodeConfigure referenceCodeConfigure;

	@Autowired
	BankServices bankServices;

	@Autowired
	ReportCodeMappingService reportCodeMappingService;

	@Autowired
	EtlServices etlServices;

	@Autowired
	GlSubHeadConfigService glSubHeadConfigService;

	@Autowired
	AlertManagementServices alertservices;

	@Autowired
	CustomReportsParmsRepo custReportsParmsRepo;

	@Autowired
	CustomReportsParmsRepo customReportsParmsRepo;

	@Autowired
	CustomRepDownloadRep customRepDownloadRep;

	@Autowired
	RRReportRepo rrReportlist;

	private String pagesize;

	public String getPagesize() {
		return pagesize;
	}

	public void setPagesize(String pagesize) {
		this.pagesize = pagesize;
	}

	@RequestMapping(value = "/", method = { RequestMethod.GET, RequestMethod.POST })
	public String getdashboard(Model md, HttpServletRequest req) {

		String domainid = (String) req.getSession().getAttribute("DOMAINID");

		String userid = (String) req.getSession().getAttribute("USERID");
		md.addAttribute("menu", "Dashboard");
		md.addAttribute("checkpassExpiry", loginServices.checkpassexpirty(userid));
		md.addAttribute("checkAcctExpiry", loginServices.checkAcctexpirty(userid));
		md.addAttribute("changepassword", loginServices.checkPasswordChangeReq(userid));

		int completed = 0;
		int uncompleted = 0;

		List<ReportTitle> ls = reportServices.getDashBoardRepList(domainid);

		for (ReportTitle var : ls) {
			if (var.getCompletedFlg().equals('Y')) {
				completed++;
			} else {
				uncompleted++;
			}
		}

		md.addAttribute("reportList", ls);
		md.addAttribute("completed", completed);
		md.addAttribute("uncompleted", uncompleted);
		md.addAttribute("menu", "Dashboard");
		return "XBRLDashboard";
	}

	@RequestMapping(value = "Dashboard", method = { RequestMethod.GET, RequestMethod.POST })
	public String dashboard(Model md, HttpServletRequest req) {

		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		String userid = (String) req.getSession().getAttribute("USERID");

		md.addAttribute("changepassword", loginServices.checkPasswordChangeReq(userid));
		md.addAttribute("checkpassExpiry", loginServices.checkpassexpirty(userid));
		md.addAttribute("checkAcctExpiry", loginServices.checkAcctexpirty(userid));
		int completed = 0;
		int uncompleted = 0;

		List<ReportTitle> ls = reportServices.getDashBoardRepList(domainid);

		for (ReportTitle var : ls) {
			if (var.getCompletedFlg().equals('Y')) {
				completed++;
			} else {
				uncompleted++;
			}
		}

		md.addAttribute("reportList", ls);
		md.addAttribute("completed", completed);
		md.addAttribute("uncompleted", uncompleted);
		md.addAttribute("menu", "Dashboard");
		return "XBRLDashboard";
	}

	@RequestMapping(value = "UserProfile", method = { RequestMethod.GET, RequestMethod.POST })
	public String userprofile(@RequestParam(required = false) String formmode,
			@RequestParam(required = false) String userid,
			@RequestParam(value = "page", required = false) Optional<Integer> page,
			@RequestParam(value = "size", required = false) Optional<Integer> size, Model md, HttpServletRequest req) {

		int currentPage = page.orElse(0);
		int pageSize = size.orElse(Integer.parseInt(pagesize));

		String loginuserid = (String) req.getSession().getAttribute("USERID");
		// Logging Navigation
		loginServices.SessionLogging("USERPROFILE", "M2", req.getSession().getId(), loginuserid, req.getRemoteAddr(),
				"ACTIVE");

		md.addAttribute("menu", "UserProfile"); // To highlight the menu

		if (formmode == null || formmode.equals("list")) {

			md.addAttribute("formmode", "list"); // to set which form - valid values are "edit" , "add" & "list"
			md.addAttribute("userProfiles", loginServices.getUsersList());

		} else if (formmode.equals("edit")) {

			md.addAttribute("formmode", formmode);
			md.addAttribute("domains", reportServices.getDomainList());
			md.addAttribute("userProfile", loginServices.getUser(userid));

		} else {

			md.addAttribute("formmode", formmode);
			md.addAttribute("domains", reportServices.getDomainList());
			md.addAttribute("FinUserProfiles", loginServices.getFinUsersList());
			md.addAttribute("userProfile", loginServices.getUser(""));

		}

		return "XBRLUserprofile";
	}

	@RequestMapping(value = "BankMaster", method = RequestMethod.GET)
	public String bankmaster(Model md, HttpServletRequest req) {
		// Logging Navigation
		// System.out.print("fgdfh");
		String userid = (String) req.getSession().getAttribute("USERID");

		loginServices.SessionLogging("BANKMAST", "M3", req.getSession().getId(), userid, req.getRemoteAddr(), "ACTIVE");

		md.addAttribute("bankdata", bankServices.getBankData());
		md.addAttribute("singledetail", new BankMaster());
		md.addAttribute("menu", "BankMaster");

		return "XBRLBankMaster";
	}

	@RequestMapping(value = "EtlMonitor", method = RequestMethod.GET)
	public String etlMonitor(Model md, HttpServletRequest req) {
		// Logging Navigation

		String userid = (String) req.getSession().getAttribute("USERID");

		// loginServices.SessionLogging("", "M3", req.getSession().getId(), userid,
		// req.getRemoteAddr(), "ACTIVE");

		md.addAttribute("EtlError", etlServices.getEtlError());
		md.addAttribute("EtlStatus", etlServices.getEtlStatus());
		md.addAttribute("menu", "EtlMonitor");

		return "XBRLEtlMonitor";
	}

	@RequestMapping(value = "GlSubHead", method = RequestMethod.GET)
	public ModelAndView glSubHead(Model md, HttpServletRequest req,
			@RequestParam(value = "page", required = false) Optional<Integer> page,
			@RequestParam(value = "size", required = false) Optional<Integer> size) {
		String userid = (String) req.getSession().getAttribute("USERID");

		int currentPage = page.orElse(0);
		int pageSize = size.orElse(Integer.parseInt(pagesize));

		logger.info("xbrlnavigationcontroller -> glSubHead()");

		md.addAttribute("menu", "GlSubHead");
		md.addAttribute("displaymode", "detail");
		ModelAndView mv = glSubHeadConfigService.getGlSubHeadMeta(PageRequest.of(currentPage, pageSize));
		// md.addAttribute("singledetail", new BankMaster());

		return mv;
	}

	@RequestMapping(value = "BranchMaster", method = RequestMethod.GET)
	public String branchMaster(Model md, HttpServletRequest req) {

		String userid = (String) req.getSession().getAttribute("USERID");
		// Logging Navigation
		loginServices.SessionLogging("BRANCHMAST", "M3", req.getSession().getId(), userid, req.getRemoteAddr(),
				"ACTIVE");

		md.addAttribute("branchList", bankServices.getBranchList());

		md.addAttribute("menu", "BranchMaster");

		return "XBRLBranchMaster";
	}

	@RequestMapping(value = "ReferenceCode", method = RequestMethod.GET)
	public String refcode(Model md, HttpServletRequest req) {

		String userid = (String) req.getSession().getAttribute("USERID");

		// Logging Navigation
		loginServices.SessionLogging("REFCODE", "M6", req.getSession().getId(), userid, req.getRemoteAddr(), "ACTIVE");

		md.addAttribute("menu", "ReferenceCode");
		md.addAttribute("refCodeTypeList", referenceCodeConfigure.genRefCodeDescList());
		md.addAttribute("referdetail", new GenRefCodeMast());
		return "XBRLRefCodeConfig";
	}

	@RequestMapping(value = "ReportCode", method = RequestMethod.GET)
	public String repcode(Model md, HttpServletRequest req) {

		String userid = (String) req.getSession().getAttribute("USERID");
		// Logging Navigation
		loginServices.SessionLogging("REPCODE", "M7", req.getSession().getId(), userid, req.getRemoteAddr(), "ACTIVE");

		md.addAttribute("menu", "ReportCode");
		return "XBRLRepCodeConfig";
	}

	@RequestMapping(value = "ReportCodeMaintain", method = RequestMethod.GET)
	public String repmain(Model md, HttpServletRequest req, @RequestParam(required = false) String dtltype,
			@RequestParam(value = "page", required = false) Optional<Integer> page,
			@RequestParam(value = "size", required = false) Optional<Integer> size,
			@RequestParam(required = false) String acctnum) {

		int currentPage = page.orElse(0);
		int pageSize = size.orElse(Integer.parseInt(pagesize));

		String userid = (String) req.getSession().getAttribute("USERID");
		// Logging Navigation
		loginServices.SessionLogging("REPCODE", "M7", req.getSession().getId(), userid, req.getRemoteAddr(), "ACTIVE");

		md.addAttribute("menu", "ReportCodeMaintain");

		if (dtltype == null) {

			md.addAttribute("repcodelist",
					reportCodeMappingService.getRepCodeMapLists(PageRequest.of(currentPage, pageSize)));
			return "XBRLRepCodeMain";

		} else if (dtltype.equals("page")) {

			md.addAttribute("repcodelist",
					reportCodeMappingService.getRepCodeMapLists(PageRequest.of(currentPage, pageSize)));
			return "XBRLRepCodeMain :: repcodeconfig";

		} else {

			md.addAttribute("repcodelist",
					reportCodeMappingService.getSearchResult(acctnum, PageRequest.of(currentPage, pageSize)));
			return "XBRLRepCodeMain :: repcodeconfig";
		}

	}

	@RequestMapping(value = "ReportCodeMaintain2", method = RequestMethod.GET)
	public String repmain2(Model md, HttpServletRequest req, @RequestParam(required = false) String dtltype,
			@RequestParam(value = "page", required = false) Optional<Integer> page,
			@RequestParam(value = "size", required = false) Optional<Integer> size,
			@RequestParam(required = false) String acctnum) {

		int currentPage = page.orElse(0);
		int pageSize = size.orElse(Integer.parseInt(pagesize));

		String userid = (String) req.getSession().getAttribute("USERID");
		// Logging Navigation
		loginServices.SessionLogging("REPCODE", "M7", req.getSession().getId(), userid, req.getRemoteAddr(), "ACTIVE");

		md.addAttribute("menu", "ReportCodeMaintain2");

		if (dtltype == null) {

			md.addAttribute("repcodelist",
					reportCodeMappingService.getRepCodeMapLists(PageRequest.of(currentPage, pageSize)));
			return "XBRLRepCodeMain2";

		} else if (dtltype.equals("page")) {

			md.addAttribute("repcodelist",
					reportCodeMappingService.getRepCodeMapLists(PageRequest.of(currentPage, pageSize)));
			return "XBRLRepCodeMain2 :: repcodeconfig";

		} else {

			md.addAttribute("repcodelist",
					reportCodeMappingService.getSearchResult(acctnum, PageRequest.of(currentPage, pageSize)));
			return "XBRLRepCodeMain2 :: repcodeconfig";
		}

	}

	@RequestMapping(value = "ReportMaster", method = RequestMethod.GET)
	public String reportMaster(Model md, HttpServletRequest req) {

		String userid = (String) req.getSession().getAttribute("USERID");
		// Logging Navigation
		loginServices.SessionLogging("REPORTMAST", "M5", req.getSession().getId(), userid, req.getRemoteAddr(),
				"ACTIVE");

		md.addAttribute("menu", "ReportMaster");
		md.addAttribute("reportList", reportServices.getReportsMaster());
		return "XBRLReportMaster";
	}

	@RequestMapping(value = "Audit", method = RequestMethod.GET)
	public String audit(Model md, HttpServletRequest req) {

		String userid = (String) req.getSession().getAttribute("USERID");
		// Logging Navigation
		loginServices.SessionLogging("AUDIT", "M11", req.getSession().getId(), userid, req.getRemoteAddr(), "ACTIVE");

		LocalDateTime localDateTime = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

		md.addAttribute("menu", "Audit");
		md.addAttribute("auditlogs", reportServices.getAuditLog(
				Date.from(localDateTime.plusDays(-5).atZone(ZoneId.systemDefault()).toInstant()), new Date()));
		return "XBRLAudit";
	}

	@RequestMapping(value = "Userlog", method = RequestMethod.GET)
	public String userlog(Model md, HttpServletRequest req) {

		String userid = (String) req.getSession().getAttribute("USERID");
		// Logging Navigation
		loginServices.SessionLogging("USERLOG", "M4", req.getSession().getId(), userid, req.getRemoteAddr(), "ACTIVE");

		LocalDateTime localDateTime = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

		md.addAttribute("menu", "Userlog");
		md.addAttribute("userlog", loginServices.getUserLog(
				Date.from(localDateTime.plusDays(-5).atZone(ZoneId.systemDefault()).toInstant()), new Date()));

		return "XBRLUserLogs";
	}

	@RequestMapping(value = "XBRLReports", method = RequestMethod.GET)
	public String xbrlrep(Model md, HttpServletRequest req) {

		md.addAttribute("menu", "XBRLReports");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");

		md.addAttribute("reportlist", reportServices.getReportsList(domainid));
		return "XBRLReports";
	}

	@RequestMapping(value = "XBRLFileUpload", method = RequestMethod.GET)
	public String xbrlFileUpload(Model md, HttpServletRequest req) {

		String userid = (String) req.getSession().getAttribute("USERID");
		// Logging Navigation
		loginServices.SessionLogging("FILEUPLOAD", "M10", req.getSession().getId(), userid, req.getRemoteAddr(),
				"ACTIVE");

		md.addAttribute("menu", "XBRLFileUpload");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");

		md.addAttribute("reportlist", reportServices.getFileUploadList());
		return "XBRLFileUpload";
	}

	@RequestMapping(value = "XBRLArchives", method = RequestMethod.GET)
	public String xbrlarch(Model md, HttpServletRequest req) {

		String userid = (String) req.getSession().getAttribute("USERID");

		// Logging Navigation
		loginServices.SessionLogging("ARCHREPORTS", "M9", req.getSession().getId(), userid, req.getRemoteAddr(),
				"ACTIVE");

		md.addAttribute("menu", "XBRLArchives");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");

		md.addAttribute("reportlist", reportServices.getArchReportsList(domainid));

		return "XBRLArchive";
	}

	@RequestMapping(value = "MISReports", method = RequestMethod.GET)
	public String xbrlMISReports(Model md, HttpServletRequest req) {

		String userid = (String) req.getSession().getAttribute("USERID");

		// Logging Navigation
		loginServices.SessionLogging("MISREPORTS", "M12", req.getSession().getId(), userid, req.getRemoteAddr(),
				"ACTIVE");

		md.addAttribute("menu", "MISReports");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");

		md.addAttribute("reportlist", reportServices.getMISReportsList(domainid));

		return "XBRLMISReports";
	}

	@RequestMapping(value = "Finuserdata", method = RequestMethod.GET)
	public ModelAndView Finuserdata(@RequestParam String userid) {
		ModelAndView mv = new ModelAndView("XBRLUserprofile::finuserapply");
		mv.addObject("formmode", "add");
		mv.addObject("userProfile", loginServices.getFinUser(userid));
		return mv;

	}

	@RequestMapping(value = "createUser", method = RequestMethod.POST)
	@ResponseBody
	public String createUser(@RequestParam("formmode") String formmode, @ModelAttribute UserProfile userprofile,
			Model md, HttpServletRequest rq) {
		String userid = (String) rq.getSession().getAttribute("USERID");
		String msg = loginServices.addUser(userprofile, formmode, userid);

		return msg;

	}

	@RequestMapping(value = "verifyUser", method = RequestMethod.POST)
	@ResponseBody
	public String verifyUser(@ModelAttribute UserProfile userprofile, Model md, HttpServletRequest rq) {
		String userid = (String) rq.getSession().getAttribute("USERID");
		String msg = loginServices.verifyUser(userprofile, userid);

		return msg;

	}

	@RequestMapping(value = "passwordReset", method = RequestMethod.POST)
	@ResponseBody
	public String passwordReset(@ModelAttribute UserProfile userprofile, Model md, HttpServletRequest rq) {
		String userid = (String) rq.getSession().getAttribute("USERID");
		String msg = loginServices.passwordReset(userprofile, userid);

		return msg;

	}

	@RequestMapping(value = "changePassword", method = RequestMethod.POST)
	@ResponseBody
	public String changePassword(@RequestParam("oldpass") String oldpass, @RequestParam("newpass") String newpass,
			Model md, HttpServletRequest rq) {
		String userid = (String) rq.getSession().getAttribute("USERID");
		String msg = loginServices.changePassword(oldpass, newpass, userid);

		return msg;

	}

	@RequestMapping(value = "updateValidity", method = RequestMethod.POST)
	@ResponseBody
	public String updateValidity(@RequestParam("reportid") String reportid, String valid, HttpServletRequest rq) {

		String userid = (String) rq.getSession().getAttribute("USERID");

		return reportServices.updateValidity(reportid, valid, userid);

	}

	@RequestMapping(value = "userLogs/Download", method = RequestMethod.GET)
	@ResponseBody
	public InputStreamResource UserDownload(HttpServletResponse response, @RequestParam String fromdate,
			@RequestParam String todate) throws IOException, SQLException {
		response.setContentType("application/octet-stream");

		InputStreamResource resource = null;

		try {
			Date fromdate2 = new SimpleDateFormat("dd-MM-yyyy").parse(fromdate);
			Date todate2 = new SimpleDateFormat("dd-MM-yyyy").parse(todate);
			File repfile = loginServices.getUserLogFile(fromdate2, todate2);
			response.setHeader("Content-Disposition", "attachment; filename=" + repfile.getName());
			resource = new InputStreamResource(new FileInputStream(repfile));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resource;
	}

	@RequestMapping(value = "auditLogs/Download", method = RequestMethod.GET)
	@ResponseBody
	public InputStreamResource auditDownload(HttpServletResponse response, @RequestParam String fromdate,
			@RequestParam String todate) throws IOException, SQLException {
		response.setContentType("application/octet-stream");

		InputStreamResource resource = null;

		try {
			Date fromdate2 = new SimpleDateFormat("dd-MM-yyyy").parse(fromdate);
			Date todate2 = new SimpleDateFormat("dd-MM-yyyy").parse(todate);
			File repfile = reportServices.getAuditLogFile(fromdate2, todate2);
			response.setHeader("Content-Disposition", "attachment; filename=" + repfile.getName());
			resource = new InputStreamResource(new FileInputStream(repfile));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resource;
	}

	@RequestMapping(value = "repCodeMain/Download", method = RequestMethod.GET)
	@ResponseBody
	public InputStreamResource repCodeMainDownload(HttpServletResponse response, @RequestParam String function)
			throws IOException, SQLException {

		response.setContentType("application/octet-stream");

		logger.info("Function Selected--->>>" + function);

		InputStreamResource resource = null;

		try {

			File repfile = reportCodeMappingService.getDownloadFile(function);
			response.setHeader("Content-Disposition", "attachment; filename=" + repfile.getName());
			resource = new InputStreamResource(new FileInputStream(repfile));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resource;
	}

	@RequestMapping(value = "logoutUpdate", method = RequestMethod.POST)
	@ResponseBody
	public String logoutUpdate(HttpServletRequest req) {

		String msg;

		String userid = (String) req.getSession().getAttribute("USERID");

		try {
			logger.info("Updating Logout");
			loginServices.SessionLogging("LOGOUT", "M0", req.getSession().getId(), userid, req.getRemoteAddr(),
					"IN-ACTIVE");
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "failed";
		}
		return msg;
	}

	@PostMapping("repCodeMain/Upload")
	@ResponseBody
	public String FileUpload(@RequestParam("file") MultipartFile file, HttpServletRequest rq)
			throws IOException, SQLException {

		String msg = "";

		String userid = (String) rq.getSession().getAttribute("USERID");
		msg = reportCodeMappingService.processUploadFiles(file, userid);

		return msg;
	}

	@RequestMapping(value = "CustomRepGen", method = { RequestMethod.GET, RequestMethod.POST })
	public String CustomRepGen(@RequestParam(required = false) String formmode,
			@RequestParam(required = false) String userid, @RequestParam(required = false) Optional<Integer> page,
			@RequestParam(value = "size", required = false) Optional<Integer> size, Model md, HttpServletRequest req) {

		int currentPage = page.orElse(0);
		int pageSize = size.orElse(Integer.parseInt(pagesize));
		String userid1 = (String) req.getSession().getAttribute("USERID");

		System.out.println("page" + currentPage);
		System.out.println("page" + pageSize);
		String roleId = (String) req.getSession().getAttribute("ROLEID");
		// md.addAttribute("AMLRoleMenu", AccessRoleService.getRoleMenu(roleId));
		if (formmode == null || formmode.equals("list")) {
			md.addAttribute("menu", "Report Generator");
			md.addAttribute("userProfile", loginServices.getUser(userid1));
			md.addAttribute("formmode", "list"); // to set which form - valid values are "edit" , "add" & "list"
			md.addAttribute("repParameter", custReportsParmsRepo.findAllCustom());
		}

		return "CustomRepGeneration";
	}

	@RequestMapping(value = "CustomRepDown", method = { RequestMethod.GET, RequestMethod.POST })
	public String CustomRepDown(@RequestParam(required = false) String formmode,
			@RequestParam(required = false) String userid, @RequestParam(required = false) Optional<Integer> page,
			@RequestParam(value = "size", required = false) Optional<Integer> size, Model md, HttpServletRequest req) {

		int currentPage = page.orElse(0);
		int pageSize = size.orElse(Integer.parseInt(pagesize));
		String userid1 = (String) req.getSession().getAttribute("USERID");

		System.out.println("page" + currentPage);
		System.out.println("page" + pageSize);
		String roleId = (String) req.getSession().getAttribute("ROLEID");
		// md.addAttribute("AMLRoleMenu", AccessRoleService.getRoleMenu(roleId));
		if (formmode == null || formmode.equals("list")) {
			md.addAttribute("menu", "Report Generator");
			md.addAttribute("userProfile", loginServices.getUser(userid1));
			md.addAttribute("formmode", "list"); // to set which form - valid values are "edit" , "add" & "list"
			md.addAttribute("repParameter", customRepDownloadRep.findAllCustom(PageRequest.of(currentPage, pageSize)));
		}

		return "CustomRepDownload";
	}

	/********************************** rbs ***********/
	@RequestMapping(value = "RBSMRReportGeneration", method = { RequestMethod.GET, RequestMethod.POST })
	public String RBSMRReportGeneration(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");
		md.addAttribute("reportvalue", "Market Risk Generation");
		md.addAttribute("reportid", "MRReportGeneration");
		md.addAttribute("menu", "Market Risk Generation");
		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");

		return "RBSReportGeneration";

	}

	@RequestMapping(value = "RBSCONTACT", method = RequestMethod.GET)
	public ModelAndView RBSCONTACTDETAIL(Model md, HttpServletRequest req,
			@RequestParam(value = "page", required = false) Optional<Integer> page,
			@RequestParam(value = "size", required = false) Optional<Integer> size) {
		String userid = (String) req.getSession().getAttribute("USERID");

		int currentPage = page.orElse(0);
		int pageSize = size.orElse(Integer.parseInt(pagesize));

		logger.info("xbrlnavigationcontroller -> glSubHead()");

		md.addAttribute("menu", "GlSubHead");
		md.addAttribute("displaymode", "detail");
		md.addAttribute("menu", "BBRF CONTACT DETAIL");
		ModelAndView mv = glSubHeadConfigService.RBSCONTACTLIST(PageRequest.of(currentPage, pageSize));
		// md.addAttribute("singledetail", new BankMaster());

		return mv;
	}

	@RequestMapping(value = "createAlert", method = RequestMethod.POST)
	@ResponseBody
	public String createRule(@RequestParam("formmode") String formmode,
			@ModelAttribute AlertManagementEntity alertparam, Model md, HttpServletRequest rq) {
		String userid = (String) rq.getSession().getAttribute("USERID");

		String msg = alertservices.addAlert(alertparam, formmode, userid);

		return msg;

	}

	/*************************** RR REPORTS **************************************/

	@RequestMapping(value = "rrreports", method = { RequestMethod.GET, RequestMethod.POST })
	public String RRReports(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");

		// md.addAttribute("reportvalue", "RBS Reports");
		// md.addAttribute("reportid", "RBSReports");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");
		md.addAttribute("menu", "RR Report");

		md.addAttribute("reportlist", rrReportlist.getReportList());
		// md.addAttribute("reportlist", rrReportlist.getReportListBASEL());

		return "RR/RRReports";
	}

	@RequestMapping(value = "rrreports1", method = { RequestMethod.GET, RequestMethod.POST })
	public String RRReportsBASEL(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");

		// md.addAttribute("reportvalue", "RBS Reports");
		// md.addAttribute("reportid", "RBSReports");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");
		md.addAttribute("menu", "RR Report");

		// md.addAttribute("reportlist", rrReportlist.getReportList());
		md.addAttribute("reportlist", rrReportlist.getReportListBASEL());

		return "RR/RRReports";
	}

	@RequestMapping(value = "monthly1", method = { RequestMethod.GET, RequestMethod.POST })
	public String monthly1(Model md, HttpServletRequest req) {
		String roleId = (String) req.getSession().getAttribute("ROLEID");

		// md.addAttribute("reportvalue", "RBS Reports");
		// md.addAttribute("reportid", "RBSReports");

		String domainid = (String) req.getSession().getAttribute("DOMAINID");
		md.addAttribute("reportsflag", "reportsflag");
		md.addAttribute("menu", "Monthly 1 -RR Report");

		// md.addAttribute("reportlist", rrReportlist.getReportList());
		md.addAttribute("reportlist", rrReportlist.getReportListmonthly1());

		return "RR/RRReports";
	}

	@Autowired
	Kyc_Repo kyc_repo;
	@Autowired
	Kyc_Corprate_Repo kyc_corporate_repo;
	@Autowired
	Kyc_individual_service kyc_individual_service;
	@Autowired
	com.bornfire.xbrl.services.Kyc_Corprate_service Kyc_Corprate_service;

	@RequestMapping(value = "kyc", method = { RequestMethod.GET, RequestMethod.POST })
	public String KYCHome(@RequestParam(required = false) String formmode, Model md) {

		if ("individual".equals(formmode)) {

			List<Object[]> results = kyc_repo.Getlist();

			md.addAttribute("reportlist", results);
		}

		else if ("corporate".equals(formmode)) {
			List<Object[]> corporate = kyc_corporate_repo.Getlist();

			md.addAttribute("kycData", corporate);
		}

		md.addAttribute("formmode", formmode);
		return "KYC_Home";
	}

	@RequestMapping(value = "/kyc/individual", method = { RequestMethod.GET, RequestMethod.POST })
	public String kycIndividual(@RequestParam(required = false) String formmode,
			@RequestParam(required = false) String custid, @ModelAttribute KYC_I data, Model model)
			throws FileNotFoundException, JRException, SQLException {

		if ("submit".equals(formmode)) {

			kyc_individual_service.updateKycData(custid, data);

		} else if ("verified".equals(formmode)) {

			kyc_individual_service.verified(custid);
		} else if ("download".equals(formmode)) {
			System.out.println(custid);
			kyc_individual_service.GrtPdf(custid);
		}

		List<KYC_I> user_data = kyc_repo.GetUser(custid);

		model.addAttribute("user_data", user_data);
		model.addAttribute("formmode", formmode);

		return "kyc_individual";
	}

	@RequestMapping(value = "/kyc/corporate", method = { RequestMethod.GET, RequestMethod.POST })
	public String kyccorporate(@RequestParam(required = false) String formmode,@RequestParam(required = false) String uae,
			@RequestParam(required = false) String custid, @ModelAttribute Kyc_Corprate data, Model model)
			throws FileNotFoundException, JRException, SQLException {

		if ("submit".equals(formmode)) {
	
			Kyc_Corprate_service.updateKycData(custid, data);


		} else if ("verified".equals(formmode)) {

			Kyc_Corprate_service.verified(custid);
		} else if ("download".equals(formmode)) {
	
			Kyc_Corprate_service.GrtPdf(custid);
		}

		List<Kyc_Corprate> user_data = kyc_corporate_repo.GetUser(custid);

		model.addAttribute("user_data", user_data);
		model.addAttribute("formmode", formmode);

		return "kyc_corporate";
	}

	@RequestMapping(value = "kyc/corporate/download", method = RequestMethod.GET)

	@ResponseBody
	public ResponseEntity<InputStreamResource> corporateDownload(HttpServletResponse response,

			@RequestParam(required = false) String custid) throws IOException, SQLException {

		try {

			File repfile = Kyc_Corprate_service.GrtPdf(custid);

			System.out.println("Generated file: " + repfile.getName());

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			headers.setContentDispositionFormData("attachment", repfile.getName());

			InputStreamResource resource = new InputStreamResource(new FileInputStream(repfile));

			return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_OCTET_STREAM)
					.contentLength(repfile.length()).body(resource);
		} catch (IOException | SQLException | JRException e) {
			logger.error("Error occurred while processing the file download: " + e.getMessage(), e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

	@RequestMapping(value = "kyc/individual/download", method = RequestMethod.GET)

	@ResponseBody
	public ResponseEntity<InputStreamResource> individualDownload(HttpServletResponse response,

			@RequestParam(required = false) String custid) throws IOException, SQLException {

		try {
			System.out.println("Customer ID: " + custid);

			File repfile = kyc_individual_service.GrtPdf(custid);

			System.out.println("Generated file: " + repfile.getName());

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			headers.setContentDispositionFormData("attachment", repfile.getName());

			InputStreamResource resource = new InputStreamResource(new FileInputStream(repfile));

			return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_OCTET_STREAM)
					.contentLength(repfile.length()).body(resource);
		} catch (IOException | SQLException | JRException e) {
			logger.error("Error occurred while processing the file download: " + e.getMessage(), e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

}
