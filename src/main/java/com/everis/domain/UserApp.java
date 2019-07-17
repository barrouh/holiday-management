package com.everis.domain;

/**
 * @author barrouh
 */
public class UserApp implements java.io.Serializable{

	private static final long serialVersionUID = 1L;

	private Employee employee;
	
	private boolean logged = false;
	
	public UserApp() {
	}

	public UserApp(Employee employee, boolean logged) {
		this.logged = logged;
		this.employee = employee;
	}

	public boolean isLogged() {
		return logged;
	}

	public void setLogged(boolean logged) {
		this.logged = logged;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}