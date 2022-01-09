package com.vrnda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrnda.repository.EmployeeRepository;
import com.vrnda.view.ResultView;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository repository;

	@Override
	public <T extends ResultView> List<T> findDistinctByName(String name,Class<T> clazz) {
		return repository.findDistinctByName(name,clazz);
	}
	
	
}
