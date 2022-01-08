package com.vrnda.service;

import java.util.List;

import com.vrnda.entity.Mobile;

public interface MobileService {
	String removeAllByIds(List<Long> ids);
	List<Mobile> retrieveAllByIds(List<Long> ids);
	List<Mobile> retrieveByExampleObject(Mobile mobile);
	Mobile getMobileById(Long id);
}
