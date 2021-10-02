package com.vrnda.comp;

public class AsianPaints implements Paint{

	public AsianPaints() {
		System.out.println("AsianPaints 0-param");
	}

	@Override
	public String paint(String colour) {
		return "Asian Paints having colour "+colour;
	}
	
	
	
	
}
