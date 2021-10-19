package com.vrnda.beans;

public class Company {
	private static Company INSTANCE=null;
	
	private Company() {
		System.out.println("Company 0-Param Private Constructor");
	}
	
	public static Company getInstance() {
		if(INSTANCE == null) 
			INSTANCE=new Company();
		return INSTANCE;
	}

}
