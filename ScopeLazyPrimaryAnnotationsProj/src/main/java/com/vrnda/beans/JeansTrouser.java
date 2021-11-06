package com.vrnda.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("jeans")
public class JeansTrouser {
	@Autowired
	private Shirt shirt;

	public JeansTrouser() {
		System.out.println("JeansTrouser 0-Param Constructor");
	}

	public String wear() {
		return shirt.shirt();
	}
}
