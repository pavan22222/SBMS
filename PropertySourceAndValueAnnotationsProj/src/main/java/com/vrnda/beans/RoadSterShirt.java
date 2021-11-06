package com.vrnda.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("rsShirt")
@Scope("prototype")
@Primary
//@PropertySource("com/vrnda/commons/info.properties")
public class RoadSterShirt implements Shirt{
	
	@Value("${name}")
	private String name;
	@Value("${age}")
	private Integer age;
	
	
	public RoadSterShirt() {
	System.out.println("RoadSterShirt 0-Param Constructor");
	}

	@Override
	public String shirt() {
		return "You Weared RoadSterShirt Shirt"+name+" "+age;
	}

}
