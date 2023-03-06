package com.example.spmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView user() {
		ModelAndView mav = new ModelAndView("user/index");
		return mav;
	}

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public ModelAndView product() {
		ModelAndView mav = new ModelAndView("product/index");
		return mav;
	}
}
