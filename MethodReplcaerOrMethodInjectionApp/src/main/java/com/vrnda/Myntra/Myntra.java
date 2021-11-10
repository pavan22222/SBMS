package com.vrnda.Myntra;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;

public class Myntra {
	@Value("${name}")
	private String name;
	public String calTotalAmount(String[] items,Double[] prices) {
		System.out.println("Myntra.calTotalAmount() "+name);
		Double total=0d;
		for(Double price:prices) {
			total=total+price;
		}
		return "Your Items are "+Arrays.toString(items)+" total amount is"+total;
	}
}
