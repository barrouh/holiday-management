package com.everis.domain;

/**
 * @author barrouh
 */
public class UserApp implements java.io.Serializable{

	private static final long serialVersionUID = 1L;

	private Employee employee;
	
	private boolean logged = false;
	
	private boolean hasSupervisorAccess = false;
	
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
		if(employee.getGrade().equals(EmployeeGrade.SUPERVISOR.name())) {
			hasSupervisorAccess = true;
		}
	}

	public boolean isLogged() {
		return logged;
	}

	public void setLogged(boolean logged) {
		this.logged = logged;
	}

	public boolean isHasSupervisorAccess() {
		return hasSupervisorAccess;
	}

	public void setHasSupervisorAccess(boolean hasSupervisorAccess) {
		this.hasSupervisorAccess = hasSupervisorAccess;
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