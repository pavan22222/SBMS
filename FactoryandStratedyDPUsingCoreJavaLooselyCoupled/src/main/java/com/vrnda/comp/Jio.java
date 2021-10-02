package com.vrnda.comp;

public class Jio implements SIM{
	
	
	public Jio() {
		System.out.println("Jio 0-param");
	}

	@Override
	public String talk(String name) {
		return "Your Calling to "+name+" from JIO";
	}

}
