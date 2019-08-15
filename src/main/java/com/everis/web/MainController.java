package com.everis.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.everis.domain.Employee;
import com.everis.domain.UserApp;
import com.everis.service.impl.HolidayManagementServiceImpl;

/**
 * 
 * @author barrouh
 *
 */

@Controller
public class MainController {
	
	@Autowired
	private HolidayManagementServiceImpl holidayManagementService;
	
	private static final Logger LOGGER = LogManager.getLogger(MainController.class);
	
	private static final String MAIN_VIEW_NAME = "index";
	
	public void printRequest(HttpServletRequest request) {
		LOGGER.info("Receiving request from client with IP address: " + Tools.getClientIpAddr(request));
	}

	@RequestMapping(value = "/", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView homePage(HttpServletRequest request) {
		printRequest(request);
		ModelAndView model = new ModelAndView();
		model.setViewName(MAIN_VIEW_NAME);
		return model;
	}
	
	@GetMapping("/login")
	public ModelAndView login(HttpServletRequest request) {
		printRequest(request);
		HttpSession session = request.getSession(); 	
		session.setAttribute("userApp", new UserApp());
		ModelAndView model = new ModelAndView();
		model.setViewName(MAIN_VIEW_NAME);
		return model;
	}
	
	@GetMapping("/logout")
	public ModelAndView logout(HttpServletRequest request) {
		printRequest(request);
		HttpSession session = request.getSession(); 
		session.invalidate();
		return new ModelAndView("redirect:/");
	}

	
	@PostMapping("/login")
	public ModelAndView login(HttpServletRequest request, @RequestParam(required = true) String username, @RequestParam(required = true) String password) {
		printRequest(request);
		HttpSession session = request.getSession(); 	
		UserApp userApp = new UserApp(true);
		Employee employee = holidayManagementService.logInEmployee(username, password);
		if(employee != null) {
			userApp = new UserApp(employee,true);
		}
		session.setAttribute("userApp", userApp);
		return new ModelAndView("redirect:/");
	}
	
	@GetMapping("/projects")
	public ModelAndView projects(HttpServletRequest request) {
		printRequest(request);
		ModelAndView model = new ModelAndView();
		model.addObject("projects", holidayManagementService.getAllProjects());
		model.setViewName("views/project/projects");
		return model;
	}
	
	@GetMapping("/editProject")
	public ModelAndView editProject(HttpServletRequest request , @RequestParam(required = true) String idproject) {

		printRequest(request);
		ModelAndView model = new ModelAndView();
		model.addObject("updatedProject",holidayManagementService.getProjectById(idproject));
		model.setViewName("views/project/editProject");
		return model;
	}
	
	@GetMapping("/employers")
	public ModelAndView employees(HttpServletRequest request) {
		printRequest(request);
		ModelAndView model = new ModelAndView();
		model.addObject("employers", holidayManagementService.getAllEmployees());
		model.setViewName("views/employee/employees");
		return model;
	}
	
	@GetMapping("/editEmployee")
	public ModelAndView editEmployee(HttpServletRequest request , @RequestParam(required = true) Integer idemployee) {

		printRequest(request);
		ModelAndView model = new ModelAndView();
		model.addObject("updatedEmployee",holidayManagementService.getEmployeeById(idemployee));
		model.setViewName("views/employee/editEmployee");
		return model;
	}

	
	@GetMapping("/employers/holidays")
	public ModelAndView holidaysByEmployee(HttpServletRequest request, @RequestParam(required = true) String idEmployee) {
		printRequest(request);
		
		ModelAndView model = new ModelAndView();
		model.setViewName(MAIN_VIEW_NAME);
		return model; 
	}
	
	@GetMapping("/project/holidays")
	public ModelAndView holidaysByProject(HttpServletRequest request, @RequestParam(required = true) String idProject) {
		printRequest(request);
		ModelAndView model = new ModelAndView();
		model.setViewName(MAIN_VIEW_NAME);
		return model;
	}

}
