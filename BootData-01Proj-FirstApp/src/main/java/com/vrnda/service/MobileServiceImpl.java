package com.vrnda.service;

import java.util.ArrayList;
import java.util.List;
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
	public Mobile getMobileById(Long id) {
		Optional<Mobile> opt=repository.findById(id);
		return opt.isPresent()?opt.get():null;
	}

	@Override
	public Long getCountOfMobiles() {
		return repository.count();
	}

	@Override
	public Boolean checkMobileId(Long id) {
		return repository.existsById(id);
	}

	@Override
	public Iterable<Mobile> findAll() {
		 return repository.findAll();
	}

	@Override
	public List<Mobile> findAllById(List<Long> ids) {
		return (List<Mobile>) repository.findAllById(ids);
	}

	@Override
	public Optional<Mobile> findMobileById(Long id) {
		Optional<Mobile> opt=repository.findById(id);
		return opt.isPresent()?opt:Optional.empty();
	}
	
	@Override
	public String saveAll(List<Mobile> list) {
		Iterable<Mobile> iterable=repository.saveAll(list);
		List<Long> listofIdentities=new ArrayList<Long>();
		if(iterable !=null && ((List<Mobile>)iterable).size() > 0) {
			iterable.forEach(mobile->listofIdentities.add(mobile.getImeNo()));
		}
		return listofIdentities.toString();
	}

}
