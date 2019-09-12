package com.everis.web;


import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	public ModelAndView login(HttpServletRequest request, @RequestParam(required = true) String username,
			@RequestParam(required = true) String password) {
		printRequest(request);
		HttpSession session = request.getSession();
		UserApp userApp = new UserApp(true);
		Employee employee = holidayManagementService.logInEmployee(username, password);
		if (employee != null) {
			userApp = new UserApp(employee, true);
		}
		session.setAttribute("userApp", userApp);
		return new ModelAndView("redirect:/");
	}
	
}