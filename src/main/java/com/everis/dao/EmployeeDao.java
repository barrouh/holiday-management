package com.everis.dao;

import java.util.List;

import com.everis.domain.Employee;
import com.everis.domain.EmployeeGrade;

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
	
	List<Employee> getEmployeesByGrade(EmployeeGrade grade);

	void deleteEmployee(Integer employeeId);
	
	

}
