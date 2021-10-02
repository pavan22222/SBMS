package com.vrnda.test;

import java.math.BigDecimal;

import com.vrnda.comp.Mobile;
import com.vrnda.factory.MobileFactory;

public class MobileFactoryTest {

	public static void main(String[] args) throws Exception {
		Mobile mobile=MobileFactory.createMobile();
		String rersult=mobile.call(BigDecimal.valueOf(8374293058l), "Lakshmi");
		System.out.println(rersult);
	}

}
