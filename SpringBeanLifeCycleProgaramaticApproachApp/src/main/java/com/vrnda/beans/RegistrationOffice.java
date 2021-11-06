package com.vrnda.beans;

import java.util.Random;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class RegistrationOffice implements InitializingBean,DisposableBean{
	private Long registrationId;
	private String name;
	private String addrs;
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
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("RegistrationOffice.afterPropertiesSet()");
		if(drivingLicense == null)
			throw new IllegalArgumentException("Driving LIcense Must be required");
		this.registrationId = (long) new Random().nextInt(10000);
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("RegistrationOffice.destroy()");
		
	}
	
	
	
	
}
