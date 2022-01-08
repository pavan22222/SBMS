package com.vrnda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.vrnda.entity.Mobile;
import com.vrnda.repository.MobileRepository;

@Service
public class MobileServiceImpl implements  MobileService{
	
	@Autowired
	private MobileRepository repository;

	@Override
	public String removeAllByIds(List<Long> ids) {
		repository.deleteAllByIdInBatch(ids);
		return ids+"Records are Deleted";
	}

	@Override
	public List<Mobile> retrieveAllByIds(List<Long> ids) {
		return repository.findAllById(ids);
		
	}

	@Override
	public List<Mobile> retrieveByExampleObject(Mobile mobile) {
		return repository.findAll(Example.of(mobile),Sort.by(Direction.ASC, "companyName"));
	}

	@Override
	public Mobile getMobileById(Long id) {
		return repository.getById(id);
	}
	
	
	
}
