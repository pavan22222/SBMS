package com.vrnda.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Employee {
	
	private Integer id;
	private String name;
	private Integer age;
	private Double salary;
	private LocalDateTime doj;
	private Integer dno;
}
