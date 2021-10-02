package com.vrnda.test;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import com.vrnda.dao.Customer;
import com.vrnda.dao.Employee;
import com.vrnda.dao.FactoryClass;



public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException, SecurityException {
//		Employee emp=(Employee)FactoryClass.getPerson("emp");
//		System.out.println(emp);
		Employee emp=FactoryClass.getPerson(Employee.class);
		System.out.println(emp);
	}

}
