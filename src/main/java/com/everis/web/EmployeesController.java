package com.everis.web;

import java.util.Arrays;
import java.util.Date;

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

import com.everis.domain.Employee;
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

	@PostMapping(value = "/addEmployee", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ModelAndView addEmployeePost(HttpServletRequest request, String firstname, String lastname, String username,
			String addressmail, String grade, String project, Integer supervisor, float initialdays) {
		printRequest(request);
		Employee empl = new Employee();

		Integer idemployee = (int) (new Date().getTime() / 1000);
		empl.setEmployeeId(idemployee);
		empl.setUsername(username);
		empl.setPassword(Tools.generatePassword(firstname + lastname));
		empl.setFirstName(firstname);
		empl.setLastName(lastname);
		empl.setMailAdress(addressmail);
		empl.setGrade(grade);
		empl.setProject(holidayManagementService.getProjectById(project));
		empl.setSupervisor(holidayManagementService.getEmployeeById(supervisor));

		empl.setInitialBalance(initialdays);
		empl.setCurrentBalance(initialdays);
		holidayManagementService.addEmployee(empl);

		ModelAndView model = new ModelAndView();
		model.setViewName("redirect:/employees");
		return model;
	}

	@GetMapping("/editEmployee")
	public ModelAndView editEmployee(HttpServletRequest request, @RequestParam(required = true) Integer employeeId) {
		printRequest(request);
		ModelAndView model = new ModelAndView();
		model.addObject("updatedEmployee", holidayManagementService.getEmployeeById(employeeId));
		model.addObject("supervisors", holidayManagementService.getEmployeesByGrade(EmployeeGrade.SUPERVISOR));
		model.addObject("projects", holidayManagementService.getAllProjects());
		model.setViewName("views/employee/editEmployee");
		return model;
	}

	@PostMapping(value = "/editEmployee", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ModelAndView editEmployee(HttpServletRequest request, Integer employeeId, String firstname, String lastname,
			String username, String password, String addressmail, Integer supervisor, String grade, String project,
			float initialdays, float availabledays) {
		printRequest(request);
		ModelAndView model = new ModelAndView();

		Employee empl = holidayManagementService.getEmployeeById(employeeId);
		empl.setPassword(password);
		empl.setFirstName(firstname);
		empl.setUsername(username);
		empl.setLastName(lastname);
		empl.setMailAdress(addressmail);
		empl.setGrade(grade);
		empl.setProject(holidayManagementService.getProjectById(project));
		empl.setSupervisor(holidayManagementService.getEmployeeById(supervisor));
		empl.setInitialBalance(initialdays);
		empl.setCurrentBalance(availabledays);
		holidayManagementService.updateEmployee(empl);

		model.setViewName("redirect:/employees");
		return model;
	}
	
	@PostMapping(value = "/saveSettings", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ModelAndView saveSettings(HttpServletRequest request, Boolean notifications) {
		printRequest(request);
		ModelAndView model = new ModelAndView();
		Employee employee = Tools.getCurrentEmployee(request);
		if(notifications==null) {
			employee.setNotifications(false);
		}else {
			employee.setNotifications(notifications);
		}
		holidayManagementService.updateEmployee(employee);
		model.setViewName("redirect:/");
		return model;
	}
	
}