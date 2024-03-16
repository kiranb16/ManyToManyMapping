package com.codemind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codemind.model.Project;
import com.codemind.service.ProjectService;

@RestController
public class ProjectController {
@Autowired
private ProjectService projectService;

@PostMapping("/saveProject")
public Project  saveProject(@RequestBody Project project) {
	return projectService.saveProject(project);
}
@GetMapping("/findAllProject")
public List<Project> getAll(){
	return projectService.getAllProject();
}
}
