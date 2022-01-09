package com.vrnda.test;

import java.util.Date;

import com.vrnda.entity.Employee;
import com.vrnda.entity.Person;
import com.vrnda.entity.Student;

public class Test {

	public static void main(String[] args) throws Exception{
		System.out.println(new Test().showDetails(Employee.class));
		System.out.println(new Test().showDetails(Student.class));
		//System.out.println(new Test().showDetails(Date.class));
	}
	
	public <T extends Person> T showDetails(Class<T> clazz) throws Exception {
		//return (T) clazz.getDeclaredConstructor(new Class[] {}).newInstance();
		return (T) clazz.getDeclaredConstructor(null).newInstance();
	}

}
