package com.vrnda;

import java.beans.PropertyVetoException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.vrnda.controller.EmployeeController;

@SpringBootApplication
public class SpringBootProj6WorkingWithProfilesApplication {

	
	@Bean
	@Profile("uat")
	public ComboPooledDataSource getDataSource() throws PropertyVetoException {
		System.out.println("SpringBootProj6WorkingWithProfilesApplication.getDataSource()");
		ComboPooledDataSource cpds=new ComboPooledDataSource();
		cpds.setDriverClass("oracle.jdbc.driver.OracleDriver");
		cpds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		cpds.setUser("System");
		cpds.setPassword("Pavan");
		return cpds;
	}
	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootProj6WorkingWithProfilesApplication.class, args);
		EmployeeController controller=ctx.getBean("employeeController",EmployeeController.class);
		System.out.println(controller.getEmployees());
	}

}
