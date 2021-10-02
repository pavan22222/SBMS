package com.vrnda.dao;

public class FactoryClass{
	
	public static Object getPerson(String person) {
		if(person.equals("emp"))
			return new Employee();
		else if(person.equals("cust"))
			return new Customer();
		else 
			throw new IllegalArgumentException(); 
	}
	
	public static <T extends Person> T getPerson(Class<T> clazz) throws InstantiationException, IllegalAccessException {
		return clazz.newInstance();
	}
}
