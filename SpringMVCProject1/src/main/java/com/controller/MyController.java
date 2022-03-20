package com.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;

@Controller
public class MyController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView loginPage() {
		ModelAndView mv = new ModelAndView("loginForm");
		mv.addObject("userform", new User());
		return mv;
	}
	
	@RequestMapping(value="/loginSuccess", method=RequestMethod.POST)
	public ModelAndView loginSuccessPage(@Valid @ModelAttribute("userform") User user, BindingResult result) {
		if(result.hasErrors()) {
			ModelAndView mv = new ModelAndView("loginForm");
			return mv;
		}
		else {
			ModelAndView mv = new ModelAndView("successLogin");
			return mv;
		}
	}
}
