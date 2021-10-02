package com.vrnda.comp;

import java.math.BigDecimal;

public class Mobile {
	
	private SIM sim;
	
	

	public Mobile() {
		System.out.println("Mobile 0-param");
	}

	public SIM getSim() {
		return sim;
	}

	public void setSim(SIM sim) {
		this.sim = sim;
	}
	
	public String call(BigDecimal mobileNo,String name) {
		String result=this.sim.talk(name);
		return result+" on "+mobileNo;
	}
	
	
}
