


package com.codemind.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="EmployeeTable")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
     @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String empName;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Employee_project_Table",joinColumns = @JoinColumn(name="employee_id"),
	           inverseJoinColumns = @JoinColumn(name="project_id"))
			
	private Set<Project> projects= new HashSet<>();
	
	
}
