package com.vrnda.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime ldt;
	
	public String generateWishMessage(String name) {
		Integer hour=ldt.getHour();
		String wishMsg=null;
		if(hour < 12)
			wishMsg="Good Morning";
		else if(hour <16)
			wishMsg="Good Afternoon";
		else if(hour <20)
			wishMsg="Good Evening";
		else
			wishMsg="Good Night";
		return wishMsg+" "+name;
	}
}
