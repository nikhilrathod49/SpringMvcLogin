package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.model.User;

@Controller  // Responsible for handling incoming HTTP / HTTPS requests 
public class HomeController {

	@Autowired
	ValidateStudentService validateStudentService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home( Model model) {
		return "home";
	}

	@RequestMapping(value = "/validateUser", method = RequestMethod.POST)
	public String user(@Validated User user, Model model) {
	boolean  validation =	validateStudentService.validateStudent(user);
	if(validation) {
		
		List<String> students = new ArrayList<>();
		students.add("Nitin");
		students.add("sachin");
		students.add("pritam");
		students.add("Ganesh");
		model.addAttribute("studentList", students);
		return "student";
	}else {
		
		model.addAttribute("message", "Incorrect Password");
		return "home";
	}
		
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String student(Model model) {
		System.out.println("student Page Requested");
		model.addAttribute("student", "student details");
		return "student";
	}
}
