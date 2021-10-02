package com.vrnda.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

import com.vrnda.dao.Employee;
import com.vrnda.dao.Test;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException, SecurityException {
		Class cls=Class.forName("com.vrnda.dao.Test");
		Method[] method=cls.getDeclaredMethods();
		System.out.println(cls.isInterface());
		Test t=(Test) cls.newInstance();
		for(int i=0;i<method.length;i++) {
			if(method[i].getName().equals("method1")) {
				method[i].invoke(t, 1);
			} else {
				method[i].setAccessible(true);
				method[i].invoke(t);
			}
		}
		
		Field field=cls.getDeclaredField("name");
		field.setAccessible(true);
		field.set(t, "Pavan");
		System.out.println("......................\n"+field.get(t));
		
		
		Class cls1=Class.forName("com.vrnda.dao.Employee");
		Constructor[] con= cls1.getDeclaredConstructors();
		con[1].setAccessible(true);
		Employee emp=(Employee) con[1].newInstance();
		Object obj=con[0].newInstance(1,"Pavan Janapati",23,60000.0f,new Date("2021/12/12"));
		System.out.println(emp+"............."+obj);
	}

}
