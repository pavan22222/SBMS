package com.vrnda.beans;

import lombok.Data;

@Data
public class Laptop {
	private String companyName;
	private String version;
	
	public Laptop() {
		System.out.println("Laptop 0-Param Constructor");
	}
	public String start() {
		System.out.println("Laptop.start()");
		return companyName +" Laptop and the version is::"+version;
	}
}
