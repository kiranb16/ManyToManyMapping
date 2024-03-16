package com.codemind.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codemind.model.Employee;
import com.codemind.model.Project;
import com.codemind.repository.EmployeeRepository;
import com.codemind.repository.ProjectRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ProjectRepository projectRepository;
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
		
	}

	public Object findById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> findAllById() {
		
			return employeeRepository.findAll();
		}

	public Employee assignedProject(int empId, int pId) {
		 Set<Project> projectset=null;
		Employee employee= employeeRepository.findById(empId).get();
		Project project= projectRepository.findById(pId).get();
		 projectset=employee.getProjects();
		 projectset.add(project);
		 employee.setProjects(projectset);
		return employeeRepository.save(employee); 
	}
		
	}














