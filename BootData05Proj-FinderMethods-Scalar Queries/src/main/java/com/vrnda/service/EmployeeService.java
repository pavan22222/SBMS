package com.vrnda.service;

import java.util.List;

import com.vrnda.view.ResultView;

public interface EmployeeService {
	
	public <T extends ResultView> List<T> findDistinctByName(String name,Class<T> clazz);
	
}
