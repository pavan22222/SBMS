package com.vrnda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.vrnda.dto.Employee;
import com.vrnda.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	public  List<Employee> getEmployees(){
		List<Employee> listEmps=null;
		try {
			listEmps=service.fetchEmployees();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listEmps;
	}
}
