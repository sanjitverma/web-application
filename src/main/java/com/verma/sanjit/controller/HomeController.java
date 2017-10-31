package com.verma.sanjit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import vo.Student;

@Controller
@RequestMapping(value="/home")
public class HomeController {

	
	@RequestMapping(value= {"/","/welcome**"}, method=RequestMethod.GET)
	public ModelAndView greeting() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is welcome page!");
		model.setViewName("hello");
		return model;
	}
	
	@RequestMapping(value= {"/admin**"}, method=RequestMethod.GET)
	public ModelAndView greetingAdmin() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is protected page!");
		model.setViewName("admin");
		return model;
	}
	
	
	@RequestMapping(value="/default",method=RequestMethod.GET,
			consumes="application/json", produces="application/json")
	@ResponseBody
	public Student getStudent() {
		Student student = new Student();
		student.setId(1);
		student.setName("Rajesh");
		return student;
	}
	
}
