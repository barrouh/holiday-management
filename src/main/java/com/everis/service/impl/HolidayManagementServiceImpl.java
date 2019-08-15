package com.everis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everis.domain.Employee;
import com.everis.domain.Holiday;
import com.everis.domain.Project;
import com.everis.dao.EmployeeDao;
import com.everis.dao.HolidayDao;
import com.everis.dao.HolidayManagementDao;
import com.everis.dao.ProjectDao;
import com.everis.dao.impl.HolidayManagementDaoImpl;
import com.everis.service.HolidayManagementService;

/**
 * 
 * @author barrouh
 *
 */
@Service
public class HolidayManagementServiceImpl implements HolidayManagementService, HolidayManagementDao, ProjectDao, HolidayDao, EmployeeDao {

	@Autowired
	private HolidayManagementDaoImpl holidayManagementDao;

	@Override
	@Transactional 
	public int addEmployee(Employee employee) {
		return holidayManagementDao.addEmployee(employee);
	}

	@Override
	@Transactional 
	public int updateEmployee(Employee employee) {
		return holidayManagementDao.updateEmployee(employee);
	}

	@Override
	@Transactional 
	public Employee getEmployeeById(Integer idemployee) {
		return holidayManagementDao.getEmployeeById(idemployee);
	}

	@Override
	@Transactional 
	public List<Employee> getAllEmployees() {
		return holidayManagementDao.getAllEmployees();
	}

	@Override
	@Transactional 
	public int deleteEmployee(String employeeId) {
		return holidayManagementDao.deleteEmployee(employeeId);
	}

	@Override
	@Transactional 
	public int addHoliday(Holiday holiday) {
		return holidayManagementDao.addHoliday(holiday);
	}

	@Override
	@Transactional 
	public int updateHoliday(Holiday holiday) {
		return holidayManagementDao.updateHoliday(holiday);
	}

	@Override
	@Transactional 
	public Holiday getHolidayById(String holidayId) {
		return holidayManagementDao.getHolidayById(holidayId);
	}

	@Override
	@Transactional 
	public List<Holiday> getAllHolidays() {
		return holidayManagementDao.getAllHolidays();
	}

	@Override
	@Transactional 
	public int deleteHoliday(String holidayId) {
		return holidayManagementDao.deleteHoliday(holidayId);
	}

	@Override
	@Transactional 
	public int addProject(Project project) {
		return holidayManagementDao.addProject(project);
	}

	@Override
	@Transactional 
	public int updateProject(Project project) {
		return holidayManagementDao.updateProject(project);
	}

	@Override
	@Transactional 
	public Project getProjectById(String projectId) {
		return holidayManagementDao.getProjectById(projectId);
	}

	@Override
	@Transactional 
	public List<Project> getAllProjects() {
		return holidayManagementDao.getAllProjects();
	}

	@Override
	@Transactional 
	public int deleteProject(String projectId) {
		return holidayManagementDao.deleteProject(projectId);
	}

	@Override
	@Transactional 
	public Employee logInEmployee(String username, String password) {
		return holidayManagementDao.logInEmployee(username, password);
	}
}
