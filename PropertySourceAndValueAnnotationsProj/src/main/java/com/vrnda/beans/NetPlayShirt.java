package com.vrnda.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("npShirt")
@Scope("prototype")
public class NetPlayShirt implements Shirt{
	
	public NetPlayShirt() {
		System.out.println("NetPlayShirt 0-Param Constructor");
	}

	@Override
	public String shirt() {
		return "You Weared NetPlay Shirt";
	}

}
