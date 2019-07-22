package com.everis.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idemployee")
	private Integer idEmployee;

	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "mailAdress")
	private String mailAdress;

	@Column(name = "grade")
	private String grade;

	@ManyToOne
	@JoinColumn(name = "idProject")
	private Project project;

	@ManyToOne
	@JoinColumn(name = "idsupervisor")
	private Employee supervisor;

	@Column(name = "initialBalance")
	private float initialBalance;

	@Column(name = "currentBalance")
	private float currentBalance;

	@OneToMany(targetEntity = Holiday.class, mappedBy = "employee", fetch = FetchType.LAZY)
	private List<Holiday> holidays;

	public Employee() {

	}

	public Employee(Integer idEmployee, String username, String password, String firstName, String lastName,
			String mailAdress, String grade, Project project, Employee supervisor, float initialBalance,
			float currentBalance, List<Holiday> holidays) {
		this.idEmployee = idEmployee;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mailAdress = mailAdress;
		this.grade = grade;
		this.project = project;
		this.supervisor = supervisor;
		this.initialBalance = initialBalance;
		this.currentBalance = currentBalance;
		this.holidays = holidays;
	}

	public Integer getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(Integer idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMailAdress() {
		return mailAdress;
	}

	public void setMailAdress(String mailAdress) {
		this.mailAdress = mailAdress;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Employee getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Employee supervisor) {
		this.supervisor = supervisor;
	}

	public float getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(float initialBalance) {
		this.initialBalance = initialBalance;
	}

	public float getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(float currentBalance) {
		this.currentBalance = currentBalance;
	}

	public List<Holiday> getHolidays() {
		return holidays;
	}

	public void setHolidays(List<Holiday> holidays) {
		this.holidays = holidays;
	}

}
