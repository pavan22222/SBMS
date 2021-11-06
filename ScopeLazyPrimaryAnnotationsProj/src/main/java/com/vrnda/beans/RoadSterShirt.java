package com.vrnda.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("rsShirt")
@Scope("prototype")
@Primary
public class RoadSterShirt implements Shirt{
	
	
	public RoadSterShirt() {
	System.out.println("RoadSterShirt 0-Param Constructor");
	}

	@Override
	public String shirt() {
		return "You Weared RoadSterShirt Shirt";
	}

}
