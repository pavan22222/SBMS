package com.vrnda.beans;

public class TV{
	private Remote remote;
	
	public void setRemote(Remote remote) {
		System.out.println("TV.setRemote()");
		this.remote = remote;
	}

	TV(){
		System.out.println("TV 0-param");
	}
	
	@Override
	public String toString() {
		return "I am TV toString()";
	}
}
