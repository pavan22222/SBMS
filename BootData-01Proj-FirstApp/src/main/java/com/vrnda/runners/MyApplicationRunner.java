package com.vrnda.runners;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.vrnda.entity.Mobile;
import com.vrnda.service.MobileService;
@Component
public class MyApplicationRunner implements ApplicationRunner{
	@Autowired
	private MobileService service;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		//System.out.println(service.saveMobile(new Mobile(null,"Redmi","Note 5 Pro",15000.0f,LocalDate.now())));
		System.out.println(service.getMobile(14l));
	}

}
