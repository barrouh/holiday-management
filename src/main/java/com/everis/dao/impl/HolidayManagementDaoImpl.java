package com.everis.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

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

/**
 * 
 * @author barrouh
 *
 */
@Repository
public class HolidayManagementDaoImpl implements HolidayManagementDao, ProjectDao, HolidayDao, EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void addEmployee(Employee employee) {
		getSession().save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		getSession().update(employee);
	}

	@Override
	public Employee getEmployeeById(Integer employeeId) {
		return getSession().get(Employee.class, employeeId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		Query<Employee> queryResult = getSession().createQuery("from Employee", Employee.class);
		return queryResult.list();
	}

	@Override
	public void deleteEmployee(Integer employeeId) {
		getSession().delete(getEmployeeById(employeeId));
	}

	@Override
	public void addHoliday(Holiday holiday) {
		getSession().save(holiday);
	}

	@Override
	public void updateHoliday(Holiday holiday) {
		getSession().update(holiday);
	}

	@Override
	public Holiday getHolidayById(Integer holidayId) {
		return getSession().get(Holiday.class, holidayId);
	}

	@Override
	public List<Holiday> getAllHolidays() {
		Query<Holiday> queryResult = getSession().createQuery("from Holiday", Holiday.class);
		return queryResult.list();
	}

	@Override
	public void deleteHoliday(Integer holidayId) {
		getSession().delete(getHolidayById(holidayId));
	}

	@Override
	public void addProject(Project project) {
		getSession().save(project);
	}

	@Override
	public void updateProject(Project project) {
		getSession().update(project);
	}

	@Override
	public Project getProjectById(String projectId) {
		return getSession().get(Project.class, projectId);
	}

	@Override
	public List<Project> getAllProjects() {
		Query<Project> queryResult = getSession().createQuery("from Project", Project.class);
		return queryResult.list();
	}

	@Override
	public void deleteProject(String projectId) {
		getSession().delete(getProjectById(projectId));
	}

	@Override
	public Employee logInEmployee(String username, String password) {
		CriteriaBuilder builder = getSession().getCriteriaBuilder();
		CriteriaQuery<Employee> query = builder.createQuery(Employee.class);
		Root<Employee> root = query.from(Employee.class);
		query.select(root).where(builder.equal(root.get("username"), username));
		query.select(root).where(builder.equal(root.get("password"), password));
		Query<Employee> q = getSession().createQuery(query);
		if (!q.list().isEmpty()) {
			return q.getSingleResult();
		} else {
			return null;
		}
	}

}