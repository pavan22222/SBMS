package com.vrnda.replacer;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.support.MethodReplacer;

public class CalculateTotalAmountReplacer implements MethodReplacer{

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("CalculateTotalAmountReplacer.reimplement()");
		Double total=0d;
		for(Double price:(Double[])args[1]) {
			total=total+price;
		}
		Double discount=(20d/100d)*total;
		return "Your Items are "+Arrays.toString((String[])args[0])+" amount is "
				+total+" coupon discount is "+discount+" price is "+(total-discount);
	}

}
