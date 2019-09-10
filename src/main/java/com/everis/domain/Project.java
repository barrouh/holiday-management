package com.everis.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Project")
public class Project implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "projectid")
	private String projectId;

	@Column(name = "projectname")
	private String projectName;

	@Column(name = "description")
	private String description;

	public Project() {
	}

	public Project(String projectId, String projectName, String description) {
		this.projectId = projectId;
		this.projectName = projectName;
		this.description = description;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}