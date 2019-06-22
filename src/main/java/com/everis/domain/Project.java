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
	@Column(name = "idProject")
	private String idProject;

	@Column(name = "projectname")
	private String projectName;

	@Column(name = "description")
	private String description;

	public Project() {
	}

	public Project(String idProject, String projectName, String description) {
		this.idProject = idProject;
		this.projectName = projectName;
		this.description = description;
	}

	public String getIdProject() {
		return idProject;
	}

	public void setIdProject(String idProject) {
		this.idProject = idProject;
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