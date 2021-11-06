package com.vrnda.repository;

import com.vrnda.beans.Employee;

public interface EmployeeRepository {
	Integer insertEmployee(Employee emp)throws Exception;
}
