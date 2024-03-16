package com.codemind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.codemind.model.Employee;
import com.codemind.repository.EmployeeRepository;
import com.codemind.repository.ProjectRepository;
import com.codemind.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	

	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee){
		return employeeService.saveEmployee(employee);
		
		
	}
	
	@GetMapping("/findall")
	public List<Employee> getEmployeeById() {
		return employeeService.findAllById();
		 
	}
	
	@PutMapping("/{empId}/project/{pId}")
	
	public Employee assignedProject(@PathVariable int empId, @PathVariable int pId) {
		return employeeService.assignedProject(empId, pId);
	}
}













