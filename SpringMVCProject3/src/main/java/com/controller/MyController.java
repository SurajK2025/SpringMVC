package com.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.TodoDao;
import com.entities.Todo;


@Controller
public class MyController {
	@Autowired
	ServletContext context;
	
	@Autowired
	TodoDao todoDao;
	
	@RequestMapping(value="/")
	public ModelAndView homePage() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("msg", "Welcome");
		return mv;
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public ModelAndView userAddedMsg(@ModelAttribute("emp") Todo todo) {
		ModelAndView mv = new ModelAndView("index");
		//List<Todo> list = (List<Todo>) context.getAttribute("list");
		//list.add(todo);
		todo.setTodoDate(new Date());
		this.todoDao.save(todo);
		mv.addObject("msg", "User Added");
		return mv;
	}
	
	@RequestMapping(value="/addUser")
	public ModelAndView addUserPage() {
		ModelAndView mv = new ModelAndView("addUserPage");
		mv.addObject("msg", "Welcome");
		return mv;
	}
	
	@RequestMapping(value="/exstUser", method = RequestMethod.GET)
	public ModelAndView existUserPage() {
		ModelAndView mv = new ModelAndView("existUsersPage");
		//List<Todo> list = (List<Todo>) context.getAttribute("list");
		//mv.addObject("Users", list);
		List<Todo> list = this.todoDao.getAll();
		mv.addObject("Users", list);
		return mv;
	}
}
