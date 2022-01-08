package com.vrnda.service;

import java.util.List;

import com.vrnda.entity.Mobile;

public interface MobileService {
	List<Mobile> findAllBySorting(boolean ascd,String... properties);
	List<Mobile> findAllByPaging(int page,int size);
	List<Mobile> findAllByPagingWithSorting(int page,int size,boolean ace,String... properties);
}
