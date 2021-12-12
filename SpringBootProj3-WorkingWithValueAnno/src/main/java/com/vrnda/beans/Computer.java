package com.vrnda.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@PropertySource("config.properties")
public class Computer {
	
	//@Autowired
	@Value("#{cpu}")
	private CPU cpu;
	@Value("${brand}")
	private String brand;
	@Value("${Path}")
	private String path;
	@Value("${os.name}")
	private String osName;
	@Value("#{cpu.price}")
	private Double price;
	
	
}
