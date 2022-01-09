package com.vrnda.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrnda.entity.Employee;
import com.vrnda.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public Employee getEmployeeByName(String name) {
		//return repository.findDistinctByName(name);
		//return repository.findByName(name);
		//return repository.findByNameIs(name);
		return repository.findByNameEquals(name);
	}

	@Override
	public List<Employee> findByNameStartingWith(String name) {
		return repository.findByNameStartingWith(name);
	}

	@Override
	public List<Employee> findByNameEndingWith(String name) {
		return repository.findByNameEndingWith(name);
	}

	@Override
	public List<Employee> findByNameContaining(String name) {
		return repository.findByNameContaining(name);
	}

	@Override
	public List<Employee> findByNameEqualsIgnoreCase(String name) {
		return repository.findByNameEqualsIgnoreCase(name);
	}

	@Override
	public List<Employee> findByNameContainingIgnoreCase(String name) {
		return repository.findByNameContainingIgnoreCase(name);
	}

	@Override
	public List<Employee> findByNameLike(String name) {
		return repository.findByNameLike(name);
	}

	@Override
	public List<Employee> findByNameNotLike(String name) {
		return repository.findByNameNotLike(name);
	}

	@Override
	public List<Employee> findByDojGreaterThanEqualOrAgeLessThanEqual(Date date, Integer age) {
		return repository.findByDojGreaterThanEqualOrAgeLessThanEqual(date,age) ;
	}

	@Override
	public List<Employee> findByIdGreaterThanEqualAndSalaryBetween(Integer id,Float lowRangeValue,Float hignRangeValue){
		return repository.findByIdGreaterThanEqualAndSalaryBetween(id, lowRangeValue, hignRangeValue);
	}

	@Override
	public List<Employee> findBySalaryIn(List list) {
		return repository.findBySalaryIn(list);
	}
	
}
