package com.vrnda.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WishMessageGenerator {
	
	
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator 0-Param Constructor");
	}

	@Autowired
	private LocalDateTime date;
	
	public String getWishMessage(String user) {
		String msg=null;
		Integer hour=date.getHour();
		if(hour < 12)
			msg="Good Morning";
		else if(hour < 16)
			msg="Good AfterNoon";
		else if(hour < 12)
			msg="Good Evening";
		else 
			msg="Good Night";
		return msg+"::"+user;
		
	}
}
