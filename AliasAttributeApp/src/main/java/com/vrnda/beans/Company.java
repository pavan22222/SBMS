package com.vrnda.beans;

import java.util.List;

public class Company {
	private List<Employee> empList=null;

	public Company(List<Employee> empList) {
		System.out.println("Company 1-Param COnstructor");
		this.empList = empList;
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	
	
	
}
