package com.everis.domain;

/**
 * @author barrouh
 */
public class UserApp implements java.io.Serializable{

	private static final long serialVersionUID = 1L;

	private Employee employee;
	
	private boolean logged = false;
	
	private boolean loggingFailed = false;
	
	public UserApp() {
	}
	
	public UserApp(boolean loggingFailed) {
		this.loggingFailed = loggingFailed;
	}

	public UserApp(Employee employee, boolean logged) {
		this.logged = logged;
		this.employee = employee;
		this.loggingFailed = false;
	}

	public boolean isLogged() {
		return logged;
	}

	public void setLogged(boolean logged) {
		this.logged = logged;
	}

	public boolean isLoggingFailed() {
		return loggingFailed;
	}

	public void setLoggingFailed(boolean loggingFailed) {
		this.loggingFailed = loggingFailed;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}