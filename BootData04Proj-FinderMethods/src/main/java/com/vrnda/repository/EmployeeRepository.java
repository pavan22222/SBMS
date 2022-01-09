package com.vrnda.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vrnda.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	public Employee findDistinctByName(String name);
	public Employee findByName(String name);
	public Employee findByNameIs(String name);
	public Employee findByNameEquals(String name);
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
