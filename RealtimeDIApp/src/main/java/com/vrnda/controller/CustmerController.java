package com.vrnda.controller;

import com.vrnda.dto.CustmerDTO;
import com.vrnda.service.CustmerService;
import com.vrnda.vo.CustmerVO;

public class CustmerController {
	private CustmerService service;

	public CustmerController(CustmerService service) {
		System.out.println("CustmerController 1-Patam Constructor");
		this.service = service;
	}
	
	public String processCustmer(CustmerVO vo) {
		Integer retVal=0;;
		CustmerDTO dto=new CustmerDTO();
		dto.setName(vo.getName());
		dto.setItems(vo.getItems());
		try {
			retVal= service.saveCustmer(dto);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return retVal == 1 ?"Record Saved":"Record Not Saved";
	}
}
