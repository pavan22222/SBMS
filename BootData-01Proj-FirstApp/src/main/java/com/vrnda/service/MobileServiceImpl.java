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
		return repository.findById(id).orElse(new Mobile());
		//return opt.isPresent()?opt.get():null;
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

	@Override
	public String updateMobileById(Long imeNo, String companyName, Float price) {
		if(repository.existsById(imeNo)) {
			Mobile mobile=new Mobile();
			mobile.setImeNo(imeNo);
			mobile.setCompanyName(companyName);
			mobile.setPrice(price);
			return repository.save(mobile).getImeNo()+" Record is Updated";
		}
		
		return "Invalid IME No";
	}

	@Override
	public String updateMobileByObject(Mobile mobile) {
		if(repository.existsById(mobile.getImeNo())) {
			return repository.save(mobile).getImeNo() +" is Updated";
		}
		return "Object Not Found to Update";
	}

	@Override
	public String deleteById(Long imeNo) {
		if(repository.findById(imeNo).isPresent()) {
			repository.deleteById(imeNo);
			return imeNo+ " Record is Deleted";
		}
		return "Invalid Id";
	}

	@Override
	public String deleteByObject(Mobile mobile) {
		if(repository.findById(mobile.getImeNo()).isPresent()) {
			repository.delete(mobile);
			return mobile.getImeNo()+ " Record is Deleted";
		}
		return "Invalid Object";
	}
	
	@Override
	public String delete(Mobile mobile) {
		repository.delete(mobile);
		return mobile.getImeNo() + " Record is Deleted";
	}

	@Override
	public String deleteAllMovies() {
		repository.deleteAll();
		return "All Movies were deleted";
	}

	@Override
	public String deleteAllByIds(List<Long> ids) {
		repository.deleteAllById(ids);
		return ids+" Records are Deleted";
	}

	@Override
	public String deleteAllByMovies(List<Mobile> mobiles) {
		for(Mobile mobile:mobiles) {
			if(repository.existsById(mobile.getImeNo())) {
				
			}else {
				return "Invaild Id Contains in the Given Mobiles";
			}
		}	
		repository.deleteAll(mobiles);
		mobiles.forEach(mobile->System.out.print(mobile.getImeNo()));
		return " Records are Deleted";
	}

}
