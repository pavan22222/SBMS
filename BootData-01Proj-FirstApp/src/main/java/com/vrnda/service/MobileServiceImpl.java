package com.vrnda.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrnda.entity.Mobile;
import com.vrnda.repository.MobileRepository;
@Service
public class MobileServiceImpl implements MobileService {
	
	@Autowired
	private MobileRepository repository;
	
	@Override
	public String saveMobile(Mobile mobile) {
		System.out.println("Before Saving Mobile is::"+mobile);
		Mobile mob= repository.save(mobile);
		System.out.println("After Saving Mobile is::"+mobile);
		return "Record Saved With Id::"+mob.getImeNo();
	}

	@Override
	public Mobile getMobile(Long id) {
		Optional<Mobile> opt=repository.findById(id);
		return opt.isPresent()?opt.get():null;
	}

}
