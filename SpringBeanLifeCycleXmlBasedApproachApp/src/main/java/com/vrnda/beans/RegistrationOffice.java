package com.vrnda.beans;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class RegistrationOffice {
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
	
	
	public void myInit() {
		System.out.println("RegistrationOffice.myInit()");
		if(registrationId == null)
			registrationId=new Random().nextLong();
		if(drivingLicense == null)
			throw new IllegalAccessError("Driving License Must be Required.");
	}
	
	public void myDestroy() {
		System.out.println("RegistrationOffice.myDestroy()");
		drivingLicense = null;
		name=null;
		registrationId=null;
		addrs=null;
	}
	
	public void myInit(Integer id) {
		System.out.println("RegistrationOffice.myInit(-)");
		if(registrationId == null)
			registrationId=new Random().nextLong();
		if(drivingLicense == null)
			throw new IllegalAccessError("Driving License Must be Required.");
	}
	
	
}
