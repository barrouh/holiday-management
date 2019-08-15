package com.everis.dao;

import java.util.List;

import com.everis.domain.Employee;

/**
 * 
 * @author barrouh
 *
 */
public interface EmployeeDao {

	int addEmployee(Employee employee);

	int updateEmployee(Employee employee);

	Employee getEmployeeById(Integer employeeId);
	
	List<Employee> getAllEmployees();

	int deleteEmployee(String employeeId);

}
