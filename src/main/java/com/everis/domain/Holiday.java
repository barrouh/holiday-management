package com.everis.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Holiday")
public class Holiday implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "refholiday")
	private String refHoliday;

	@Column(name = "daterequest")
	private Date dateRequest;

	@Column(name = "startdate")
	private Date startDate;

	@Column(name = "enddate")
	private Date endDate;

	@Column(name = "duration")
	private float duration;

	@ManyToOne
	@JoinColumn(name = "employeeid")
	private Employee employee;

	@Column(name = "status")
	private String status;

	@Column(name = "comment")
	private String comment;
	
	@Column(name = "type")
	private String type;

	public Holiday() {
	}

	public Holiday(String refHoliday, Date dateRequest, Date startDate, Date endDate, float duration, Employee employee) {
		this.refHoliday = refHoliday;
		this.dateRequest = dateRequest;
		this.startDate = startDate;
		this.endDate = endDate;
		this.duration = duration;
		this.employee = employee;
	}

	public String getRefHoliday() {
		return refHoliday;
	}

	public void setRefHoliday(String refHoliday) {
		this.refHoliday = refHoliday;
	}

	public Date getDateRequest() {
		return dateRequest;
	}

	public void setDateRequest(Date dateRequest) {
		this.dateRequest = dateRequest;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
