package com.vrnda.beans;

/**
 * @author Pavan
 *
 */
public class Employee {
	
	private Network nw;
	
	public Employee() {
		System.out.println("Employee 0-Param Constructor");	
	}
	
	public void setNetwork(Network nw) {
		System.out.println("Employee.setNw()");
		this.nw=nw;
	}
	
	
	
}
