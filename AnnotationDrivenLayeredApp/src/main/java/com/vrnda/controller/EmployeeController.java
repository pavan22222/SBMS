package com.vrnda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.vrnda.beans.Employee;
import com.vrnda.service.EmployeeService;
@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	public String insertEmployee(Employee emp) {
		return service.saveEmployee(emp);
	}
	
}
