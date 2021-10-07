package com.vrnda.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CustmerDTO {
	
	private String cid;
	private String name;
	private String[] items;
	private Float price;
	private Integer discount;
	
}
