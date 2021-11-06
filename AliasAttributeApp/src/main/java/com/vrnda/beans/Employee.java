package com.vrnda.beans;

public class Employee {
	private String name;
	private Integer id;
	public Employee() {
		System.out.println("Employees 0-Param COnstructor");
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	
}
