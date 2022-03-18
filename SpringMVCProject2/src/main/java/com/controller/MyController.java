package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Data;

@Controller
public class MyController {

	@RequestMapping("/")
	public ModelAndView landingPage() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public ModelAndView addUserPage() {
		ModelAndView mv = new ModelAndView("addUserPage");
		return mv;
	}
	
	@RequestMapping(value = "/existUsers", method = RequestMethod.POST)
	public ModelAndView existUsersPage(@ModelAttribute("emp") Data data) {
		ModelAndView mv = new ModelAndView("existUsersPage");
		return mv;
	}
}
