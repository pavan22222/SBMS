package com.vrnda.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties("emp.info")
public class Employee {
	private Integer id;
	private String name;
	private Double salary;
	private Long[] pNos;
	private Set<String> hobbies;
	private List<String> favColors;
	private Map<String,Double> marks;
	private CPU cpu;
	
	public void setId(Integer id) {
		System.out.println(this.id);
		this.id=id;
	}
	
}
