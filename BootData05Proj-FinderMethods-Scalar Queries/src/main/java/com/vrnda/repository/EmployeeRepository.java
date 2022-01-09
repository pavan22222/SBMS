package com.vrnda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vrnda.entity.Employee;
import com.vrnda.view.ResultView;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	public <T extends ResultView> List<T> findDistinctByName(String name,Class<T> clazz);
	
}
