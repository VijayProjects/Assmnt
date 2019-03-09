package com.ri.gov.ies.admin.controller;

import static org.hamcrest.CoreMatchers.is;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ri.gov.ies.admin.cw.model.CaseWorkerModel;
import com.ri.gov.ies.admin.service.AdminService;
import com.ri.gov.ies.constant.AppConstant;
import com.ri.gov.ies.properties.ApplicationProperties;

/**
 * For Admin request processing and response delivering
 * 
 * @author prabh
 * 
 */
@Controller
public class AdminController {

	private static Logger logger = LoggerFactory.getLogger(AdminController.class);

	@Autowired(required = true)
	private AdminService adminService;

	@Autowired(required = true)
	private ApplicationProperties prop;

	/**
	 * For registering case worker
	 * 
	 * @param model
	 * @return Stirng
	 * 
	 */
	@RequestMapping(path = "/cwReg", method = RequestMethod.GET)
	public String cwRegForm(Model model) {
		logger.debug("AdminController::cwRegForm() started");
		// create empty CaseWorkerModel class obj and set it to model attribute
		CaseWorkerModel cwModel = new CaseWorkerModel();
		model.addAttribute("cwModel", cwModel);
		logger.debug("AdminController::cwRegForm() ended");
		logger.info("case worker registration form created successfully");
		return "cwReg";
	}

	@RequestMapping(path = "/cwReg", method = RequestMethod.POST)
	public String cwReg(@ModelAttribute(name = "cwModel") CaseWorkerModel cwModel, Model model) {
		// invoke method of service class
		boolean isRegistered = adminService.registerCaseWorker(cwModel);
		Map<String, String> map=prop.getApplication();
		if(isRegistered)
			model.addAttribute("cw_reg_msg", map.get(AppConstant.CW_SUCCESS_MGS));
		else
			model.addAttribute("cw_reg_msg", map.get(AppConstant.CW_FAILURE_MGS));
		return "cwReg";
	}
}
