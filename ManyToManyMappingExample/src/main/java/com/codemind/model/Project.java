package com.codemind.model;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ProjectTable")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Project {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int pId;
	private String pName;
	@JsonIgnore
	@ManyToMany(mappedBy = "projects")
	private Set<Employee> employees = new HashSet<>();

}
