package com.vrnda.service;

import java.util.Date;
import java.util.List;

import com.vrnda.entity.Employee;

public interface EmployeeService {
	
	public Employee getEmployeeByName(String name);
	public List<Employee> findByNameStartingWith(String name);
	public List<Employee> findByNameEndingWith(String name);
	public List<Employee> findByNameContaining(String name);
	public List<Employee> findByNameEqualsIgnoreCase(String name);
	public List<Employee> findByNameContainingIgnoreCase(String name);
	public List<Employee> findByNameLike(String name);
	public List<Employee> findByNameNotLike(String name);
	public List<Employee> findByDojGreaterThanEqualOrAgeLessThanEqual(Date date,Integer age);
	public List<Employee> findByIdGreaterThanEqualAndSalaryBetween(Integer id,Float lowRangeValue,Float hignRangeValue);
	public List<Employee> findBySalaryIn(List list);
}
