package com.everis.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

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
@ContextConfiguration(locations = { "classpath:app-context.xml" })
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
		assertEquals(0, holidayManagementService.addProject(epo));
			}

	@Test
	public void updateProjectTest() {
		Project epo = holidayManagementService.getProjectById("EPO_PGP");
		epo.setDescription("Europian patent office");
		assertEquals(0, holidayManagementService.updateProject(epo));
			}

	@Test
	public void getProjectByIdTest() {
		Project epo = holidayManagementService.getProjectById("EPO_PGP");
		assertNotNull(epo);
			}

	@Test
	public void getAllProjectsTest() {

		List<Project> projects = holidayManagementService.getAllProjects();
		assertNotNull(projects);
			}

	@Test
	public void deleteProjectTest() {

		assertEquals(0, holidayManagementService.deleteProject("EPO_PGP"));
		// holidayManagementService.deleteProject(projectId);
	}

	@Test
	public void addEmployeeTest() {

		// holidayManagementService.addEmployee(employee);
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
		// holidayManagementService.deleteEmployee(employeeId);
	}

	@Test
	public void addHolidayTest() {
		// holidayManagementService.addHoliday(holiday);
	}

	@Test
	public void updateHolidayTest() {
		// holidayManagementService.updateHoliday(holiday);
	}

	@Test
	public void getHolidayByIdTest() {
		// holidayManagementService.getHolidayById(holidayId);
	}

	@Test
	public void getAllHolidaysTest() {
		// holidayManagementService.getAllHolidays();
	}

	@Test
	public void deleteHolidayTest() {
		// holidayManagementService.deleteHoliday(holidayId);
	}

}