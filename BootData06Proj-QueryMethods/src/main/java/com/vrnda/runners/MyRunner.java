package com.vrnda.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vrnda.entity.Employee;
import com.vrnda.service.EmployeeService;
@Component
public class MyRunner implements CommandLineRunner{
	@Autowired
	private EmployeeService service;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(service.saveEmployee(new Employee(null, "Ramesh", 26, 78000, null, "Team Leader", null, null, null)));
		System.out.println(".............................................");
	}

}
