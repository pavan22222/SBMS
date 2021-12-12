package com.vrnda.beans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component("cpu")
@Data
public class CPU {
	private Double price=20000d;
}
