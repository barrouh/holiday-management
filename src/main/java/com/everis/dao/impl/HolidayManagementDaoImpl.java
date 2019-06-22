package com.everis.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.everis.dao.EmployeeDao;
import com.everis.dao.HolidayDao;
import com.everis.dao.HolidayManagementDao;
import com.everis.dao.ProjectDao;
import com.everis.domain.Employee;
import com.everis.domain.Holiday;
import com.everis.domain.Project;

/**
 * 
 * @author barrouh
 *
 */
@Repository
public class HolidayManagementDaoImpl implements HolidayManagementDao, ProjectDao, HolidayDao, EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() throws HibernateException {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public int addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee getEmployeeById(String employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteEmployee(String employeeId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addHoliday(Holiday holiday) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateHoliday(Holiday holiday) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Holiday getHolidayById(String holidayId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Holiday> getAllHolidays() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteHoliday(String holidayId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addProject(Project project) {
		getSession().save(project);
		return 0;
	}

	@Override
	public int updateProject(Project project) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Project getProjectById(String projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> getAllProjects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteProject(String projectId) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}