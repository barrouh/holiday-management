package com.everis.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	static final Logger LOGGER = LogManager.getLogger(MainController.class);

	@GetMapping("/")
	public ModelAndView homePage(HttpServletRequest request) {
		LOGGER.info("Receiving request from client with ip address : " + Tools.getClientIpAddr(request));
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		return model;
	}

}
