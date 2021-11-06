package com.vrnda.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("laptop")
@PropertySource("com/vrnda/commons/application.properties")
public class Laptop {
	@Value("${companyName}")
	private String companyName;
	@Value("${version}")
	private String version;
	
	public Laptop() {
		System.out.println("Laptop 0-Param Constructor");
	}
	public String start() {
		System.out.println("Laptop.start()");
		return companyName +" Laptop and the version is::"+version;
	}
}
