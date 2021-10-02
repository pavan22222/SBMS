package com.vrnda.comp;

public class BritishPaints implements Paint{

	public BritishPaints() {
		System.out.println("BritishPaints 0-param");
	}

	@Override
	public String paint(String colour) {
		return "British Paints having colour "+colour;
	}
	
	
	
	
}
