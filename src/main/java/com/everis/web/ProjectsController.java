package com.everis.web;

import javax.servlet.http.HttpServletRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import com.everis.domain.Project;
import com.everis.service.impl.HolidayManagementServiceImpl;


@Controller
public class ProjectsController {

	
	@Autowired
	private HolidayManagementServiceImpl holidayManagementService;
	
	private static final Logger LOGGER = LogManager.getLogger(MainController.class);
	
	
	
	public void printRequest(HttpServletRequest request) {
		LOGGER.info("Receiving request from client with IP address: " + Tools.getClientIpAddr(request));
	}
	
	@GetMapping("/projects")
	public ModelAndView projects(HttpServletRequest request) {
		printRequest(request);
		ModelAndView model = new ModelAndView();
		model.addObject("projects", holidayManagementService.getAllProjects());
		model.setViewName("views/project/projects");
		return model;
	}
	
	@GetMapping("/addProject")
	public ModelAndView addProjectPost(HttpServletRequest request) {
		printRequest(request);
		ModelAndView model = new ModelAndView();
		model.setViewName("views/project/addProject");
		return model;
	}
	
	@PostMapping(value = "/addProject" ,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ModelAndView addProjectPost(HttpServletRequest request , String projectId, String projectName, String projectDescription) {
		printRequest(request);
		ModelAndView model = new ModelAndView();
		Project project = new Project();
		project.setProjectId(projectId);
		project.setProjectName(projectName);
		project.setDescription(projectDescription);
		holidayManagementService.addProject(project);
		model.setViewName("redirect:/projects");
		return model;
	}
	
	@GetMapping("/editProject")
	public ModelAndView editProject(HttpServletRequest request , @RequestParam(required = true) String projectId) {
		printRequest(request);
		ModelAndView model = new ModelAndView();
		model.addObject("updatedProject",holidayManagementService.getProjectById(projectId));
		model.setViewName("views/project/editProject");
		return model;
	}
	
	@PostMapping(value = "/editProject" ,consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ModelAndView editProjectPost(HttpServletRequest request ,String oldProjectId, String projectId, String projectName, String projectDescription) {
		printRequest(request);
		ModelAndView model = new ModelAndView();
		Project project = holidayManagementService.getProjectById(oldProjectId);
		project.setProjectId(projectId);
		project.setProjectName(projectName);
		project.setDescription(projectDescription);
		holidayManagementService.updateProject(project);
		model.setViewName("redirect:/projects");
		return model;
	}
	
	@GetMapping("/deleteProject")
	public ModelAndView deleteProject(HttpServletRequest request , @RequestParam(required = true) String projectId) {
		printRequest(request);
		ModelAndView model = new ModelAndView();
		holidayManagementService.deleteProject(projectId);;
		model.setViewName("redirect:/projects");
		return model;
	}
	
}
