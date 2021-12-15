package com.vrnda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vrnda.interfaces.ArithmeticOperation;

@SpringBootApplication
public class SpringBootProj11WorkingWithLambdaExpressionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProj11WorkingWithLambdaExpressionApplication.class, args);
//		ArithmeticOperation aop=(int a,int b)->{
//			return a+b;
//		};
		
//		ArithmeticOperation aop=(int a,int b)->a+b;
		ArithmeticOperation aop=(a,b)->a+b;
		System.out.println(aop.add(112, 88));
	}

}
