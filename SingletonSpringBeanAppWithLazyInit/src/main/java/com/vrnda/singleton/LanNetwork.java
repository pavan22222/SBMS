package com.vrnda.singleton;

public class LanNetwork {
	private static LanNetwork lanNetwork=null;
	
	private LanNetwork() {
		System.out.println("LanNetwork 0-param");
	}
	
	public static LanNetwork getInstance() {
		if(lanNetwork == null) 
			lanNetwork=new LanNetwork();
		return lanNetwork;
	}
	
}
