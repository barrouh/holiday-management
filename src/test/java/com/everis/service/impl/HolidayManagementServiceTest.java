package com.everis.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
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
		assertEquals(0,holidayManagementService.addProject(epo));
		
	}

	@Test
	public void updateProjectTest() {
		Project epo = holidayManagementService.getProjectById("EPO_PGP");
		epo.setDescription("Europein patet office");
		assertEquals(0,holidayManagementService.updateProject(epo));
	}

	@Test
	public void getProjectByIdTest() {
		Project epo = holidayManagementService.getProjectById("EPO_PGP");
		assertNotNull(epo);
	}

	@Test
	public void getAllProjectsTest() {
		List<Project> projects = holidayManagementService.getAllProjects();
		assertNotEquals(0, projects.size());
	}

	@Test
	public void deleteProjectTest() {
		
		assertEquals(0,holidayManagementService.deleteProject("EPO_PGP"));
		
	}
	
	@Test
	public void addEmployeeTest() {
		Employee empl = new Employee();
		empl.setIdEmployee(1);
		empl.setUsername("1");
		empl.setFirstName("mohamed");
		empl.setLastName("barrouh");
		
		assertEquals(0, holidayManagementService.addEmployee(empl));
	}

	@Test
	public void updateEmployeeTest() {
		Employee empl = holidayManagementService.getEmployeeById("1");
		empl.setLastName("barrouhh");
		assertEquals(0,holidayManagementService.updateEmployee(empl));
	}

	@Test
	public void getEmployeeByIdTest() {
		Employee empl = holidayManagementService.getEmployeeById("1");
		assertNotNull(empl);
		
	}

	@Test
	public void getAllEmployeesTest() {
		
		List<Employee> empls = holidayManagementService.getAllEmployees();
		assertNotEquals(0,empls.size());
		
	}

	@Test
	public void deleteEmployeeTest() {
		assertEquals(0,holidayManagementService.deleteEmployee("1"));
	}

	@Test
	public void addHolidayTest() {
		
		Holiday hld = new Holiday();
		hld.setIdHoliday(1);
		hld.setComment("summer holidays");
		
		assertEquals(0,holidayManagementService.addHoliday(hld));
			}

	@Test
	public void updateHolidayTest() {
		Holiday hld = holidayManagementService.getHolidayById("1");
		hld.setDuration(10);
		
		assertEquals(0,holidayManagementService.updateHoliday(hld));
	}

	@Test
	public void getHolidayByIdTest() {
		Holiday hld = holidayManagementService.getHolidayById("1");
		assertNotNull(hld);
	}

	@Test
	public void getAllHolidaysTest() {
		
		List<Holiday> holidays = holidayManagementService.getAllHolidays();
		
		 assertNotEquals(0,holidays.size());
	}

	@Test
	public void deleteHolidayTest() {
		 assertEquals(0,holidayManagementService.deleteHoliday("1"));
	}

}