package com.vrnda.factory;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.vrnda.comp.Mobile;
import com.vrnda.comp.SIM;

public class MobileFactory {
	private static Mobile mobile;
	private static Properties properties=new Properties();
	
	static {
		try {
			FileInputStream fis=new FileInputStream("src/main/java/com/vrnda/commons/dependent.properties");
			properties.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("MobileFactory Static Block");
	}
	
	public static Mobile createMobile() throws Exception { 
		SIM sim=null;
		mobile=new Mobile();
		Class cls=Class.forName(properties.getProperty("dependent.className"));
		Constructor[] con=cls.getDeclaredConstructors();
		sim=(SIM) con[0].newInstance();
		mobile.setSim(sim);
		return mobile;
	}
	

}
