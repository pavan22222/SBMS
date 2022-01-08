package com.vrnda.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.vrnda.entity.Mobile;
import com.vrnda.service.MobileService;


@Component
public class MyApplicationRunner  implements ApplicationRunner{
	
	@Autowired
	private MobileService service;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		/*
		 * List<Long> list=new ArrayList<Long>(); list.add(1l); list.add(null);
		 * System.out.println(service.removeAllByIds(list));
		 */
		//List<Mobile> list=service.retrieveAllByIds(Arrays.asList(1l,2l,3l,4l));
		/*
		 * List<Mobile> list=service.retrieveByExampleObject(new Mobile()); if(list !=
		 * null && list.size() >0) { list.forEach(System.out::println); }
		 */
		Mobile mobile=service.getMobileById(2l);
		System.out.println(mobile.getClass().getName());
		System.out.println(mobile.getCompanyName());
		System.out.println(mobile.getClass().getName());
	}

}
