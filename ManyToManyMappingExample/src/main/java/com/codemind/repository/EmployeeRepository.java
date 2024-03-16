package com.codemind.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.codemind.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

	@Query(value = " select * from Employee where empId=?1 ", nativeQuery = true )
	List<Employee> findAllById(Integer empId);

}
