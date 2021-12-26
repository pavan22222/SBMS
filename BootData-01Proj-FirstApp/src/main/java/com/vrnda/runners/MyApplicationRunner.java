package com.vrnda.runners;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.vrnda.entity.Mobile;
import com.vrnda.service.MobileService;
@Component
public class MyApplicationRunner implements ApplicationRunner{
	@Autowired
	private MobileService service;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		/* //save(Object obj) call System.out.println(service.saveMobile(new
		 * Mobile(null,"Realme","%s",12000.0f,LocalDate.now()))); //count() call
		 * System.out.println("Count of Mobiles are::"+service.getCountOfMobiles());
		 * //isExistsById() call
		 * System.out.println("Is Mobile Exists By Id 11::"+service.checkMobileId(11l));
		 * //findAll() Iterable<Mobile> iterable=service.findAll(); //Enhanced For Loop
		 * for(Mobile mobile:iterable) { System.out.println(mobile); }
		 * System.out.println(
		 * "............................................................"); //forEach
		 * Method iterable.forEach(mobile->System.out.println(mobile));
		 * System.out.println(
		 * "............................................................"); //forEach
		 * method with static method reference iterable.forEach(System.out::println);
		 * System.out.println(
		 * "............................................................"); //stream
		 * forEach Method Arrays.asList(iterable).stream().forEach(System.out::println);
		 * //findAllById System.out.println(
		 * "............................................................");
		 * //List<Mobile> list=service.findAllById(List.of(11l,12l,13l)); List<Mobile>
		 * list=service.findAllById(Arrays.asList(11l,12l,13l));
		 * list.forEach(System.out::println); //findById() System.out.println(
		 * "............................................................");
		 * System.out.println(service.getMobileById(14l)); 
	    
	    System.out.println("............................................................");
	    Optional<Mobile> opt=service.findMobileById(124l);
	    if(opt.isPresent())
	    	System.out.println("Mobile 124 Record is"+opt.get());
	    else
	    	System.out.println("Record Not FOund"); */
		//saveAll()
		System.out.println(service.saveAll(List.of(new Mobile(null, "Oppo","ZSERER", 12000.0f,  LocalDate.now()), new Mobile(null, "Vivo","10s", 18000.0f,  LocalDate.now()))));
	}

}
