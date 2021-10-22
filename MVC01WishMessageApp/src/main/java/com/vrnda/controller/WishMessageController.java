package com.vrnda.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishMessageController extends AbstractController{

	public WishMessageController() {
		System.out.println("WishMessageController 0-param constructor");
	}
	
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("WishMessageController.handleRequestInternal()");
		return new ModelAndView("home");
	}


}
