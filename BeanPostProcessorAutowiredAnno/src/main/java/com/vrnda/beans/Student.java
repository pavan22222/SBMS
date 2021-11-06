package com.vrnda.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	@Autowired(required = false)
	@Qualifier("doj")
	private Date dateOfJoining;

	@Override
	public String toString() {
		return "Student [doj=" + dateOfJoining + "]";
	}
	
	
}
