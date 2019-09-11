package com.everis.web;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.everis.domain.EmployeeGrade;
import com.everis.service.impl.HolidayManagementServiceImpl;

@Controller
public class EmployeesController {
	
	@Autowired
	private HolidayManagementServiceImpl holidayManagementService;
	
	private static final Logger LOGGER = LogManager.getLogger(MainController.class);
	
	
	
	public void printRequest(HttpServletRequest request) {
		LOGGER.info("Receiving request from client with IP address: " + Tools.getClientIpAddr(request));
	}
	
	@GetMapping("/employees")
	public ModelAndView employees(HttpServletRequest request) {
		printRequest(request);
		ModelAndView model = new ModelAndView();
		model.addObject("employers", holidayManagementService.getAllEmployees());
		model.setViewName("views/employee/employees");
		return model;
	}
	
	@GetMapping("/addEmployee")
	public ModelAndView addEmployee(HttpServletRequest request) {
		printRequest(request);
		ModelAndView model = new ModelAndView();
		model.addObject("projects", holidayManagementService.getAllProjects());
		model.addObject("supervisors", holidayManagementService.getEmployeesByGrade(EmployeeGrade.SUPERVISOR));
		model.addObject("grads", Arrays.asList(EmployeeGrade.values()));
		model.setViewName("views/employee/addEmployee");
		return model;
	}
	
	@PostMapping(value = "/addEmployee" ,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ModelAndView addEmployeePost(HttpServletRequest request, String fNmae, String lName, String username, String email, String grade, String project, String supervisor, String initialDays) {
		printRequest(request);
		
		ModelAndView model = new ModelAndView();
		model.setViewName("redirect:/employees");
		return model;
	}
	
	@GetMapping("/editEmployee")
	public ModelAndView editEmployee(HttpServletRequest request , @RequestParam(required = true) Integer employeeId) {
		printRequest(request);
		ModelAndView model = new ModelAndView();
		model.addObject("updatedEmployee",holidayManagementService.getEmployeeById(employeeId));
		model.setViewName("views/employee/editEmployee");
		return model;
	}
	

}
