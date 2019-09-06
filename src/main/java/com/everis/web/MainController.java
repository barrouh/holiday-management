package com.everis.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
import com.everis.domain.Holiday;
import com.everis.domain.HolidayStatus;
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
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
	
	public void printRequest(HttpServletRequest request) {
		LOGGER.info("Receiving request from client with IP address: " + Tools.getClientIpAddr(request));
	}
	
	@GetMapping("/")
	@PostMapping("/")
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
	
	@GetMapping("/addEmployee")
	public ModelAndView addEmployee(HttpServletRequest request) {
		printRequest(request);
		ModelAndView model = new ModelAndView();
		model.setViewName("views/employee/addEmployee");
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
	
	@GetMapping("/holidays")
	public ModelAndView holidays(HttpServletRequest request) {
		printRequest(request);
		ModelAndView model = new ModelAndView();
		model.addObject("holidays", holidayManagementService.getAllHolidays());
		model.setViewName("views/holiday/holidays");
		return model;
	}
	
	@GetMapping("/requestHoliday")
	public ModelAndView requestHoliday(HttpServletRequest request) {
		printRequest(request);
		ModelAndView model = new ModelAndView();
		model.setViewName("views/holiday/requestHoliday");
		return model;
	}
	
	@PostMapping(value="/requestHoliday",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ModelAndView requestHoliday(HttpServletRequest request, String startDate, String endDate, String duration) throws ParseException {
		printRequest(request);
		
		Employee employee = ((UserApp)request.getSession().getAttribute("userApp")).getEmployee();
		Date startDateC = sdf.parse(startDate);
		Date endDateC = sdf.parse(endDate);
		float durationC = Float.parseFloat(duration);
		
		Holiday holiday = new Holiday();
		holiday.setRefHoliday("HOLIDAY"+new Date().getTime());
		holiday.setDateRequest(new Date());
		holiday.setStartDate(startDateC);
		holiday.setEndDate(endDateC);
		holiday.setDuration(durationC);
		holiday.setEmployee(employee);
		holiday.setStatus(HolidayStatus.PENDING.getValue());
		
		holidayManagementService.addHoliday(holiday);
		ModelAndView model = new ModelAndView();
		model.setViewName("views/holiday/holidays");
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