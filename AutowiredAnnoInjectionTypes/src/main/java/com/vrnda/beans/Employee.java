package com.vrnda.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	@Qualifier("dt1")
	private Date date;
	
	
	public Employee() {
		System.out.println("Employee 0-Param Constructor");
	}

	@Autowired
	public Employee(@Qualifier("dt2") Date date) {
		System.out.println("Employee 1-Param Constructor");
		this.date=date;
	}

	public Date getDate() {
		return date;
	}
	
	@Autowired
	public void setDate(@Qualifier("dt3") Date date) {
		System.out.println("Employee.setDate()");
		this.date = date;
	}
	
	@Autowired
	public void getObj(@Qualifier("dt4") Date date) {
		System.out.println("Employee.getObj()");
		this.date = date;
	}
	
	
}
