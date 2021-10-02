package com.vrnda.beans;

public class Remote{
	
	private TV tv;
	
	Remote(){
		System.out.println("Remote 0-param");
	}
	
	
	public Remote(TV tv) {
		System.out.println("Remote 1-param Constructor");
		this.tv = tv;
	}


	@Override
	public String toString() {
		return "I am Remote toString()";
	}
}
