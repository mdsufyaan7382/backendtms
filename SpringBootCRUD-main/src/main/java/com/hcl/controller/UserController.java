package com.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.entity.User;
import com.hcl.service.UserService;


@RestController
public class UserController {
	@Autowired
	private UserService s1;
	
	
	
	@PostMapping("/signUp")

	public String registration(@RequestBody User u) {
		try {
			String response = s1.addUser(u);
			return response;
		} catch (Exception e) {
			return "false";

		}
	}
	
	@PostMapping("/loginUser")
	
	public User login(@RequestBody String username,String password) {
		
		return s1.loginUser(username, password);
		
	}

	@GetMapping("/getUser")
	public List<User> listOfUser() {
		return s1.getAllUser();
	}
}
