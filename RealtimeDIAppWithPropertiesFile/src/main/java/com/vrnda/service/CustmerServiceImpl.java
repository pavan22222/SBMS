package com.vrnda.service;

import java.util.Arrays;

import com.vrnda.bo.CustmerBO;
import com.vrnda.dao.CustmerRepository;
import com.vrnda.dto.CustmerDTO;

public class CustmerServiceImpl implements CustmerService {
	
	private CustmerRepository repository;
	
	public CustmerServiceImpl(CustmerRepository repository) {
		System.out.println("CustmerServiceImpl 1-Param COnstructor");
		this.repository = repository;
	}

	@Override
	public Integer saveCustmer(CustmerDTO dto) throws Exception {
		CustmerBO bo=new CustmerBO();
		Float price=0f;
		//Calculating Price For Items
		System.out.println(Arrays.toString(dto.getItems()));
		for(int i=0;i<dto.getItems().length;i++) {
			price+=40.0f;
		}
		//Applying Discount of 10 %
		price=price - 10/price*100;
		bo.setName(dto.getName());
		bo.setAmount(price);
		return repository.insertCustmer(bo);
	}

}
