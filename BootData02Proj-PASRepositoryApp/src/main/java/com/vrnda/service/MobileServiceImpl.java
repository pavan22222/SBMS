package com.vrnda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
	public List<Mobile> findAllBySorting(boolean ascd, String... properties) {
		Sort sort=Sort.by(ascd?Direction.ASC:Direction.DESC, properties);
		return (List<Mobile>) repository.findAll(sort);
	}
	
	public List<Mobile> findAllByPaging(int page,int size){
		Pageable pageable=PageRequest.of(page, size);
		Page pageObject=repository.findAll(pageable);
		return !pageObject.isEmpty()?pageObject.getContent():null;
	}

	@Override
	public List<Mobile> findAllByPagingWithSorting(int page, int size,boolean asc,String... properties) {
		Pageable pageable=PageRequest.of(page, size,Sort.by(asc?Direction.ASC:Direction.DESC, properties));
		Page pageObject=repository.findAll(pageable);
		System.out.println("Content::"+pageObject.getContent());
		System.out.println("Current Page::"+pageObject.getNumber());
		System.out.println("Total Pages::"+pageObject.getTotalPages());
		System.out.println("Is First Page::"+pageObject.isFirst());
		System.out.println("Is Last Page::"+pageObject.isLast());
		return !pageObject.isEmpty()?pageObject.getContent():null;
	}
	
}
