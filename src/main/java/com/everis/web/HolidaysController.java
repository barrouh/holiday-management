package com.everis.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.everis.domain.Employee;
import com.everis.domain.Holiday;
import com.everis.domain.HolidayStatus;
import com.everis.domain.UserApp;
import com.everis.service.impl.HolidayManagementServiceImpl;

@Controller
public class HolidaysController {

	@Autowired
	private HolidayManagementServiceImpl holidayManagementService;

	private static final Logger LOGGER = LogManager.getLogger(MainController.class);

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	public void printRequest(HttpServletRequest request) {
		LOGGER.info("Receiving request from client with IP address: " + Tools.getClientIpAddr(request));
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

	@PostMapping(value = "/requestHoliday", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ModelAndView requestHoliday(HttpServletRequest request, String startDate, String endDate, String duration)
			throws ParseException {
		printRequest(request);

		Employee employee = ((UserApp) request.getSession().getAttribute("userApp")).getEmployee();
		Date startDateC = sdf.parse(startDate);
		Date endDateC = sdf.parse(endDate);
		float durationC = Float.parseFloat(duration);

		Holiday holiday = new Holiday();
		holiday.setRefHoliday("HOLIDAY" + new Date().getTime());
		holiday.setDateRequest(new Date());
		holiday.setStartDate(startDateC);
		holiday.setEndDate(endDateC);
		holiday.setDuration(durationC);
		holiday.setEmployee(employee);
		holiday.setStatus(HolidayStatus.PENDING.getValue());

		holidayManagementService.addHoliday(holiday);
		ModelAndView model = new ModelAndView();
		model.setViewName("redirect:/holidays");
		return model;
	}

	@GetMapping("/holidayActions")
	public ModelAndView holidayActions(HttpServletRequest request, String approve, String reject) {
		printRequest(request);
		if (approve != null) {
			Holiday holiday = holidayManagementService.getHolidayByRef(approve);
			holiday.setStatus(HolidayStatus.APPROVED.getValue());
			holidayManagementService.updateHoliday(holiday);
		} else if (reject != null) {
			Holiday holiday = holidayManagementService.getHolidayByRef(reject);
			holiday.setStatus(HolidayStatus.REJECTED.getValue());
			holidayManagementService.updateHoliday(holiday);
		}

		ModelAndView model = new ModelAndView();
		model.setViewName("redirect:/holidays");
		return model;
	}

}