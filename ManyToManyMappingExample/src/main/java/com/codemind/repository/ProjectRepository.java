package com.codemind.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codemind.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
