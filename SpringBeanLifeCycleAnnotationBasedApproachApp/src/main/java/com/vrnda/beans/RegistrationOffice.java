package com.vrnda.beans;

import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//@Component
//@PropertySource("com/vrnda/commons/application.properties")
public class RegistrationOffice implements InitializingBean,DisposableBean{
	
	private Long registrationId;
	//@Value("${name}")
	private String name;
	//@Value("${addrs}")
	private String addrs;
	//@Value("${drivingLicense}")
	private Long drivingLicense;
	
	
	
	public RegistrationOffice() {
		System.out.println("RegistrationOffice 0-Param Constructor");
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public void setDrivingLicense(Long drivingLicense) {
		this.drivingLicense = drivingLicense;
	}
	
	public String register(String vehicleType) {
		return "your "+vehicleType+" is registered with registerId "+registrationId+" on name "+name+" with the addrs "+addrs;
	}
	
	public void setRegistrationId(Long registrationId) {
		this.registrationId = registrationId;
	}
	@PostConstruct
	public void myInit() {
		System.out.println("RegistrationOffice.myInit()");
		if(drivingLicense == null)
			throw new IllegalArgumentException("Driving LIcense Must be required");
		this.registrationId = (long) new Random().nextInt(10000);
	}
	
	@PreDestroy
	public void myDestroy() {
		System.out.println("RegistrationOffice.myDestroy()");

	}
	
	public void customInit() {
		System.out.println("RegistrationOffice.customInit()");
		if(drivingLicense == null)
			throw new IllegalArgumentException("Driving LIcense Must be required");
		this.registrationId = (long) new Random().nextInt(10000);
	}
	
	public void customDestroy() {
		System.out.println("RegistrationOffice.customDestroy()");

	}
	@Override
	public void destroy() throws Exception {
		System.out.println("RegistrationOffice.destroy()");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("RegistrationOffice.afterPropertiesSet()");
		
	}
	
	
	
	
}
