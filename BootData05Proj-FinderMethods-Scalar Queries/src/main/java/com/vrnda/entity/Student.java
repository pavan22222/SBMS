package com.vrnda.entity;

public class Student extends Person{

	public Student(Integer id) {
		System.out.println("Student 1-Param Constructor"+id);
	}
	
	public Student() {
		System.out.println("Student Constructor");
	}
	
}
