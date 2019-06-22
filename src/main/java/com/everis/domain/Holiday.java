package com.everis.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Holiday")
public class Holiday implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "idHoliday")
	private Integer idHoliday;

	@Column(name = "refHoliday")
	private String refHoliday;

	@Column(name = "dateRequest")
	private Date dateRequest;

	@Column(name = "startDate")
	private Date startDate;

	@Column(name = "endDate")
	private Date endDate;

	@Column(name = "duration")
	private float duration;

	@ManyToOne
	@JoinColumn(name = "idEmployee")
	private Employee employee;

	@Column(name = "status")
	private String status;

	@Column(name = "comment")
	private String comment;

	public Holiday() {
	}

	public Holiday(Integer idHoliday, String refHoliday, Date dateRequest, Date startDate, Date endDate, float duration,
			Employee employee, String status, String comment) {
		super();
		this.idHoliday = idHoliday;
		this.refHoliday = refHoliday;
		this.dateRequest = dateRequest;
		this.startDate = startDate;
		this.endDate = endDate;
		this.duration = duration;
		this.employee = employee;
		this.status = status;
		this.comment = comment;
	}

	public Integer getIdHoliday() {
		return idHoliday;
	}

	public void setIdHoliday(Integer idHoliday) {
		this.idHoliday = idHoliday;
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

}
