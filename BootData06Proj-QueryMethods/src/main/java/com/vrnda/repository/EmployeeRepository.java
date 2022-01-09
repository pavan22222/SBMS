package com.vrnda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vrnda.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	
}
