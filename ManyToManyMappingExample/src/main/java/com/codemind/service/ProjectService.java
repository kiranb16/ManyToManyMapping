package com.codemind.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codemind.model.Project;
import com.codemind.repository.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

	public Project saveProject(Project project) {
		// TODO Auto-generated method stub
		return projectRepository.save(project);
	}

	public List<Project> getAllProject() {
		// TODO Auto-generated method stub
		return projectRepository.findAll();
	}
}
