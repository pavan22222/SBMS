package com.vrnda.service;

import java.util.List;
import java.util.Optional;

import com.vrnda.entity.Mobile;

public interface MobileService {
	String saveMobile(Mobile mobile);
	Mobile getMobileById(Long id);
	Long getCountOfMobiles();
	Boolean checkMobileId(Long id);
	Iterable<Mobile> findAll();
	List<Mobile> findAllById(List<Long> ids);
	Optional<Mobile> findMobileById(Long id);
	String saveAll(List<Mobile> list);
}
