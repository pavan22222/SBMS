package com.vrnda.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dnmxShirt")
@Scope("singleton")
@Lazy(value = false)
public class DnmxShirt implements Shirt{
	
	@Value("${name}")
	private String name;
	@Value("${age}")
	private Integer age;
	
	public DnmxShirt() {
		System.out.println("DnmxShirt 0-Param Constructor");
	}

	@Override
	public String shirt() {
		return "You Weared DnmxShirt Shirt"+" "+name+" "+age;
	}

}
