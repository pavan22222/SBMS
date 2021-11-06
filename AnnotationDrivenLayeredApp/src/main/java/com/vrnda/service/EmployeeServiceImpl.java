package com.vrnda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.vrnda.beans.Employee;
import com.vrnda.repository.EmployeeRepository;

@Service
@PropertySource("com/vrnda/commons/jdbc.properties")
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	@Qualifier("dependent")
	private EmployeeRepository repository;
	
	@Override
	public String saveEmployee(Employee emp) {
		String retVal;
		try {
			repository.insertEmployee(emp);
			retVal="Employee Saved Successfully";
		} catch (Exception e) {
			e.printStackTrace();
			retVal="Employee Not Saved Internal Problem";
		}
		return retVal;
	}
	

}
