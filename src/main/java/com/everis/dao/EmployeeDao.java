package com.everis.dao;

import java.util.List;

import com.everis.domain.Employee;

/**
 * 
 * @author barrouh
 *
 */
public interface EmployeeDao {

	void addEmployee(Employee employee);

	void updateEmployee(Employee employee);

	Employee getEmployeeById(Integer employeeId);
	
	List<Employee> getAllEmployees();

	void deleteEmployee(Integer employeeId);

}
