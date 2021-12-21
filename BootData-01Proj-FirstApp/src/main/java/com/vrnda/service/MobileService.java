package com.vrnda.service;

import com.vrnda.entity.Mobile;

public interface MobileService {
	public String saveMobile(Mobile mobile);
	public Mobile getMobile(Long id);
}
