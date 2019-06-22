package com.everis.dao;

import java.util.List;

import com.everis.domain.Project;

/**
 * 
 * @author barrouh
 *
 */
public interface ProjectDao {

	int addProject(Project project);

	int updateProject(Project project);

	Project getProjectById(String projectId);

	List<Project> getAllProjects();

	int deleteProject(String projectId);

}