package com.everis.dao;

import java.util.List;

import com.everis.domain.Project;

/**
 * 
 * @author barrouh
 *
 */
public interface ProjectDao {

	void addProject(Project project);

	void updateProject(Project project);

	Project getProjectById(String projectId);

	List<Project> getAllProjects();

	void deleteProject(String projectId);

}