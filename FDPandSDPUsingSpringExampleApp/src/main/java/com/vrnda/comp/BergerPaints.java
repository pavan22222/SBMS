package com.vrnda.comp;

public class BergerPaints implements Paint{

	public BergerPaints() {
		System.out.println("BergerPaints 0-param");
	}

	@Override
	public String paint(String colour) {
		return "Berger Paints having colour "+colour;
	}
	
	
	
	
}
