package com.everis.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;
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
		epo.setProjectId("EPO_PGP");
		epo.setProjectName("EPO");
		epo.setDescription("PREG, PLEG, PIP5");
		holidayManagementService.addProject(epo);
	}

	@Test
	public void updateProjectTest() {
		Project epo = holidayManagementService.getProjectById("TEST");
		epo.setDescription("This is TEST project");
		holidayManagementService.updateProject(epo);
		epo = holidayManagementService.getProjectById("TEST");
		assertEquals("This is TEST project", epo.getDescription());
	}

	@Test
	public void getProjectByIdTest() {
		Project epo = holidayManagementService.getProjectById("TEST");
		assertNotNull(epo);
	}

	@Test
	public void getAllProjectsTest() {
		List<Project> projects = holidayManagementService.getAllProjects();
		assertNotEquals(0, projects.size());
	}

	@Test
	public void deleteProjectTest() {
		holidayManagementService.deleteProject("TEST2");
	}

	@Test
	public void addEmployeeTest() {
		Employee empl = new Employee();
		empl.setEmployeeId(415545);
		empl.setUsername("mbr");
		empl.setPassword("testpass");
		empl.setFirstName("mohamed");
		empl.setLastName("barrouh");
		empl.setMailAdress("m@barrouh.com");
		empl.setProject(holidayManagementService.getProjectById("TEST"));
		empl.setGrade("developer");
		empl.setInitialBalance(18);
		empl.setCurrentBalance(18);
		holidayManagementService.addEmployee(empl);
	}

	@Test
	public void updateEmployeeTest() {
		Employee empl = holidayManagementService.getEmployeeById(1214);
		empl.setLastName("barrouhh");
		holidayManagementService.updateEmployee(empl);
	}

	@Test
	public void getEmployeeByIdTest() {
		Employee empl = holidayManagementService.getEmployeeById(1214);
		assertNotNull(empl);
	}

	@Test
	public void getAllEmployeesTest() {
		List<Employee> empls = holidayManagementService.getAllEmployees();
		assertNotEquals(0, empls.size());
	}

	@Test
	public void deleteEmployeeTest() {
		holidayManagementService.deleteEmployee(1215);
	}

	@Test
	public void addHolidayTest() {
		Holiday hld = new Holiday();
		hld.setRefHoliday("BRH");
		hld.setDateRequest(new Date());
		hld.setStartDate(new Date());
		hld.setEndDate(new Date());
		hld.setDuration(1);
		hld.setEmployee(holidayManagementService.getEmployeeById(1214));
		hld.setComment("summer holidays");
		hld.setStatus("NEW");
		holidayManagementService.addHoliday(hld);
	}

	@Test
	public void updateHolidayTest() {
		Holiday hld = holidayManagementService.getHolidayByRef("BRH2");
		hld.setDuration(10);
		holidayManagementService.updateHoliday(hld);
		hld = holidayManagementService.getHolidayByRef("BRH2");
		assertNotEquals(10, hld.getDuration());
	}

	@Test
	public void getHolidayByIdTest() {
		Holiday hld = holidayManagementService.getHolidayByRef("BRH1");
		assertNotNull(hld);
	}

	@Test
	public void getAllHolidaysTest() {
		List<Holiday> holidays = holidayManagementService.getAllHolidays();
		assertNotEquals(0, holidays.size());
	}

	@Test
	public void deleteHolidayTest() {
		holidayManagementService.deleteHoliday("BRH2");
	}

}