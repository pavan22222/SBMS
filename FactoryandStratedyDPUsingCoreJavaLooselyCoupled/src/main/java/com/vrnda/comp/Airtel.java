package com.vrnda.comp;

public class Airtel implements SIM{
	
	
	public Airtel() {
		System.out.println("Airtel 0-param");
	}

	@Override
	public String talk(String name) {
		return "Your Calling to "+name+" from Airtel";
	}

}
