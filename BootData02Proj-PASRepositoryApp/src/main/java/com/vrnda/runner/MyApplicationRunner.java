package com.vrnda.runner;

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
		/* List<Mobile> list=service.findAllBySorting(false, "companyName");
		 * list.forEach(System.out::println); */
		/* List<Mobile> list=service.findAllByPaging(1, 2);
		 * list.forEach(System.out::println); */
		List<Mobile> list=service.findAllByPagingWithSorting(0, 4,true,"companyName");
		list.forEach(System.out::println);
	}

}
