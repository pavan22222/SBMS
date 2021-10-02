package com.vrnda.comp;

public class House {
	private Paint paint;
	
	public void setPaint(Paint paint) {
		this.paint = paint;
	}

	public String build(String colour) {
		String result=paint.paint(colour);
		return "Your House is under construction and for Painting we are using "+result; 
	}
}
