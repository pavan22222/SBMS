package com.vrnda.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.vrnda.controller.CustmerController;
import com.vrnda.vo.CustmerVO;

public class RealtimeDITest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/vrnda/cfgs/applicationContext.xml");
		CustmerController controller=factory.getBean("controller", CustmerController.class);
		CustmerVO vo=new CustmerVO();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Name");
		vo.setName(scn.next());
		scn.nextLine();
		System.out.println("Enter Items with Space Separator");
		vo.setItems(scn.nextLine().split(" "));
		System.out.println(controller.processCustmer(vo));
		

	}

}
