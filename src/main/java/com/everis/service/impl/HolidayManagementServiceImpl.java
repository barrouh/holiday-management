package com.everis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everis.domain.Employee;
import com.everis.domain.EmployeeGrade;
import com.everis.domain.Holiday;
import com.everis.domain.HolidayStatus;
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
	public void addEmployee(Employee employee) {
		holidayManagementDao.addEmployee(employee);
	}

	@Override
	@Transactional
	public void updateEmployee(Employee employee) {
		holidayManagementDao.updateEmployee(employee);
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
	public void deleteEmployee(Integer employeeId) {
		holidayManagementDao.deleteEmployee(employeeId);
	}

	@Override
	@Transactional
	public void addHoliday(Holiday holiday) {
		holidayManagementDao.addHoliday(holiday);
	}

	@Override
	@Transactional
	public void updateHoliday(Holiday holiday) {
		holidayManagementDao.updateHoliday(holiday);
	}

	@Override
	@Transactional
	public Holiday getHolidayByRef(String holidayRef) {
		return holidayManagementDao.getHolidayByRef(holidayRef);
	}

	@Override
	@Transactional
	public List<Holiday> getAllHolidays() {
		return holidayManagementDao.getAllHolidays();
	}

	@Override
	@Transactional
	public void deleteHoliday(String holidayRef) {
		holidayManagementDao.deleteHoliday(holidayRef);
	}

	@Override
	@Transactional
	public void addProject(Project project) {
		holidayManagementDao.addProject(project);
	}

	@Override
	@Transactional
	public void updateProject(Project project) {
		holidayManagementDao.updateProject(project);
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
	public void deleteProject(String projectId) {
		holidayManagementDao.deleteProject(projectId);
	}

	@Override
	@Transactional
	public Employee logInEmployee(String username, String password) {
		return holidayManagementDao.logInEmployee(username, password);
	}

	@Override
	@Transactional
	public List<Employee> getEmployeesByGrade(EmployeeGrade grade) {
		return holidayManagementDao.getEmployeesByGrade(grade);
	}

	@Override
	@Transactional
	public List<Holiday> getHolidaysByStatus(HolidayStatus holidayStatus) {
		return holidayManagementDao.getHolidaysByStatus(holidayStatus);
	}
}
