package com.everis.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.everis.domain.Employee;
import com.everis.domain.Holiday;
import com.everis.domain.Project;

/**
 * 
 * @author barrouh
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:app-context.xml"})
public class HolidayManagementServiceTest {
	
	@Autowired
	private HolidayManagementServiceImpl holidayManagementService;
	
	static final Logger LOGGER = LogManager.getLogger(HolidayManagementServiceTest.class);
	
	@Test
	public void addProjectTest() {
		Project epo = new Project();
		epo.setIdProject("EPO_PGP");
		epo.setProjectName("EPO");
		epo.setDescription("PREG, PLEG, PIP5");
		holidayManagementService.addProject(epo);
	}

	@Test
	public void updateProjectTest() {
		 //holidayManagementService.updateProject(project);
	}

	@Test
	public void getProjectByIdTest() {
		 //holidayManagementService.getProjectById(projectId);
	}

	@Test
	public void getAllProjectsTest() {
		 //holidayManagementService.getAllProjects();
	}

	@Test
	public void deleteProjectTest() {
		 //holidayManagementService.deleteProject(projectId);
	}
	
	@Test
	public void addEmployeeTest() {
		 //holidayManagementService.addEmployee(employee);
	}

	@Test
	public void updateEmployeeTest() {
		// holidayManagementService.updateEmployee(employee);
	}

	@Test
	public void getEmployeeByIdTest() {
		// holidayManagementService.getEmployeeById(employeeId);
	}

	@Test
	public void getAllEmployeesTest() {
		// holidayManagementService.getAllEmployees();
	}

	@Test
	public void deleteEmployeeTest() {
		 //holidayManagementService.deleteEmployee(employeeId);
	}

	@Test
	public void addHolidayTest() {
		 //holidayManagementService.addHoliday(holiday);
	}

	@Test
	public void updateHolidayTest() {
		//holidayManagementService.updateHoliday(holiday);
	}

	@Test
	public void getHolidayByIdTest() {
		 //holidayManagementService.getHolidayById(holidayId);
	}

	@Test
	public void getAllHolidaysTest() {
		 //holidayManagementService.getAllHolidays();
	}

	@Test
	public void deleteHolidayTest() {
		 //holidayManagementService.deleteHoliday(holidayId);
	}

}