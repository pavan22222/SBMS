package com.vrnda.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vrnda.service.EmployeeService;
import com.vrnda.view.ResultView1;
import com.vrnda.view.ResultView2;
import com.vrnda.view.ResultView3;
@Component
public class MyRunner implements CommandLineRunner{
	@Autowired
	private EmployeeService service;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(".............................................");
		List<ResultView1> list1=service.findDistinctByName("Mahesh",ResultView1.class);
		list1.forEach(obj->{
			System.out.println(obj.getId());
		});	
		
		System.out.println(".............................................");
		
		List<ResultView2> list2=service.findDistinctByName("Mahesh",ResultView2.class);
		list2.forEach(obj->{
			System.out.println(obj.getId()+"..."+obj.getName());
		});	
		
		System.out.println(".............................................");
		
		List<ResultView3> list3=service.findDistinctByName("Mahesh",ResultView3.class);
		list3.forEach(obj->{
			System.out.println(obj.getId()+"..."+obj.getName()+"..."+obj.getSalary());
		});	
	}

}
