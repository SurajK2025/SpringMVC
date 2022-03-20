package com.controller;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Data;

@Controller
public class MyController {

	@Autowired
	ServletContext context;
	
	@RequestMapping("/")
	public ModelAndView landingPage() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("msg", "Welcome");
		return mv;
	}
	
	@RequestMapping(value = "/addUser")
	public ModelAndView addUserPage() {
		ModelAndView mv = new ModelAndView("addUserPage");
		return mv;
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public ModelAndView userAddedMsg(@ModelAttribute("emp") Data data) {
		ModelAndView mv = new ModelAndView("index");
		List<Data> list = (List<Data>) context.getAttribute("list");
		list.add(data);
		mv.addObject("msg", "User Added");
		return mv;
	}
	
	@RequestMapping(value = "/exstUser")
	public ModelAndView existUsersPage() {
		ModelAndView mv = new ModelAndView("existUsersPage");
		List<Data> list = (List<Data>) context.getAttribute("list");
		mv.addObject("Users", list);
		return mv;
	}
}
