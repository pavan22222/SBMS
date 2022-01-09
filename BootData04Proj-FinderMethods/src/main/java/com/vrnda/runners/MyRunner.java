package com.vrnda.runners;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vrnda.entity.Employee;
import com.vrnda.service.EmployeeService;
@Component
public class MyRunner implements CommandLineRunner{
	@Autowired
	private EmployeeService service;
	
	@Override
	public void run(String... args) throws Exception {
		Employee emp=service.getEmployeeByName("Mahesh");
		System.out.println(emp+"\n.............................................");
		
		List<Employee> list=service.findByNameStartingWith("Ma");
		list.forEach(System.out::println);
		
		System.out.println(".............................................");		
		List<Employee> list1=service.findByNameEndingWith("ti");
		list1.forEach(System.out::println);
		
		System.out.println(".............................................");
		
		List<Employee> list2=service.findByNameContaining("an");
		list2.forEach(System.out::println);
		
		System.out.println(".............................................");
		
		List<Employee> list3=service.findByNameContainingIgnoreCase("AN");
		list3.forEach(System.out::println);
		
		System.out.println(".............................................");
		
		List<Employee> list4=service.findByNameEqualsIgnoreCase("MAHESH");
		list4.forEach(System.out::println);
		
		System.out.println(".............................................");
		
		//List<Employee> list5=service.findByNameLike("______");
		List<Employee> list5=service.findByNameLike("%an%");
		list5.forEach(System.out::println);	
		
		System.out.println(".............................................");
		List<Employee> list6=service.findByNameLike("%an%");
		list6.forEach(System.out::println);	
		
		System.out.println(".............................................");
		List<Employee> list7=service.findByDojGreaterThanEqualOrAgeLessThanEqual(new Date("2021/01/01"),23);
		list7.forEach(System.out::println);	
		
		System.out.println(".............................................");
		List<Employee> list8=service.findByIdGreaterThanEqualAndSalaryBetween(45,25000f,100000f);
		list8.forEach(System.out::println);	
		
		System.out.println(".............................................");
		List<Employee> list9=service.findBySalaryIn(List.of(27000f,26000f));
		list9.forEach(System.out::println);	
	}

}
