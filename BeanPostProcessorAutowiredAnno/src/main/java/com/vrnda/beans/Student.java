package com.vrnda.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	@Autowired
	private Date doj;

	@Override
	public String toString() {
		return "Student [doj=" + doj + "]";
	}
	
	
}
