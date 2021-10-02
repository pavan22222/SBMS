package com.vrnda.dao;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Employee {
	private Integer id; 
	private String name; 
	private Integer age; 
	private Float salary; 
	private Date doj;
	
	private Employee() {
		System.out.println("Employee 0-param Constructor");
	}

	public Employee(Integer id, String name, Integer age, Float salary, Date doj) {
		System.out.println("Employee 4-param Constructor");
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.doj = doj;
	}
	
	
	
	

}
