package com.everis.dao.impl;


import java.util.List;

import org.apache.catalina.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.everis.dao.EmployeeDao;
import com.everis.dao.HolidayDao;
import com.everis.dao.HolidayManagementDao;
import com.everis.dao.ProjectDao;
import com.everis.domain.Employee;
import com.everis.domain.Holiday;
import com.everis.domain.Project;
import com.fasterxml.classmate.AnnotationConfiguration;

/**
 * 
 * @author barrouh
 * @param <employee>
 *
 */
@Repository
public class HolidayManagementDaoImpl<employee> implements HolidayManagementDao, ProjectDao, HolidayDao, EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() throws HibernateException {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public int addEmployee(Employee employee) {
		getSession().save(employee);
		return 0;
	}

	@Override
	public int updateEmployee(Employee employee) {
		getSession().update(employee);
		return 0;
	}

	@Override
	public Employee getEmployeeById(String employeeId) {

		Employee employee = (Employee) getSession().getIdentifier(employeeId);
		
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		  Query <Employee> queryResult = getSession().createQuery("from Employee",Employee.class);
		     
		  
		return queryResult.list();
	}

	@Override
	public int deleteEmployee(String employeeId) {
		getSession().delete(employeeId);
		return 0;
	}

	@Override
	public int addHoliday(Holiday holiday) {
		getSession().save(holiday);
		return 0;
	}

	@Override
	public int updateHoliday(Holiday holiday) {
		getSession().update(holiday);
		return 0;
	}

	@Override
	public Holiday getHolidayById(String holidayId) {
		Holiday holiday = (Holiday) getSession().getIdentifier(holidayId);
		return holiday;
	}

	@Override
	public List<Holiday> getAllHolidays() {
		 Query <Holiday> queryResult = getSession().createQuery("from Holiday",Holiday.class);
	    
			return queryResult.list();
	}

	@Override
	public int deleteHoliday(String holidayId) {
		getSession().delete(holidayId);
		return 0;
	}

	@Override
	public int addProject(Project project) {
		getSession().save(project);
		return 0;
	}

	@Override
	public int updateProject(Project project) {
		getSession().update(project);	
		return 0;
	}

	@Override
	public Project getProjectById(String projectId) {
		
		Project project = (Project) getSession().getIdentifier(projectId);
		return project;
	}

	@Override
	public List<Project> getAllProjects() {
		Query <Project> queryResult = getSession().createQuery("from Project",Project.class);
	    
		return queryResult.list();
		
	}

	@Override
	public int deleteProject(String projectId) {
		getSession().delete(projectId);
		return 0;
	}
	
}