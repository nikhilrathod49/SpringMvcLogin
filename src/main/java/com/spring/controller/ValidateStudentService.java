package com.spring.controller;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.spring.model.User;

@Service
public class ValidateStudentService {

	// Dummy values of UserName and Password
	static HashMap<String, String> studentUserNamePasswordMap = new HashMap<>();

	public ValidateStudentService() {
		studentUserNamePasswordMap.put("nikhil", "abc");
		studentUserNamePasswordMap.put("Sachin", "abc");
		studentUserNamePasswordMap.put("nitin", "abc");
	}

	public boolean validateStudent(User user) {
		String password = studentUserNamePasswordMap.get(user.getUserName());
		if (password != null) {
			if (user.getPassword().equals(password)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
