package com.vrnda.beans;

import java.util.Arrays;

import lombok.Data;

@Data
public abstract class Employee{
	private Integer id;
	private String name;
	
	public Employee() {
		System.out.println("Employee 0-Param Constructor"+Arrays.toString(this.getClass().getDeclaredMethods()));
	}
	
	public void work() {
		System.out.println("Employee.work()");
		Laptop latp=getLaptop();
		System.out.println("Employee is Working with "+latp.start());
	}
	
	public void eat() {
		System.out.println("Employee.eat()");
	}
	
	public void play() {
		System.out.println("Employee.play()");
	}

	public abstract Laptop getLaptop();
}
