package com.vrnda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrnda.entity.Employee;
import com.vrnda.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository repository;

	@Override
	public String saveEmployee(Employee emp) {
		return "Record Saved With "+repository.save(emp).getId();
	}

	
	
	
}
