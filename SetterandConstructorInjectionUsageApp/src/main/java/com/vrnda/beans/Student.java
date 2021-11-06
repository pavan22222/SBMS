package com.vrnda.beans;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
@NoArgsConstructor
public class Student {
	@NonNull
	private Integer id;
	@NonNull
	private String name;
	@NonNull
	private Float fee;
	private String addr;
	@Setter
	private Integer standard;
	
	public void setAddress(String address) {
		System.out.println("Student.setAddress()");
		this.addr=address;
	}
	
	
	
	
}
