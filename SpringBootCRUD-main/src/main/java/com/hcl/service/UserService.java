package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.entity.User;
import com.hcl.repository.IUser;

@Service
public class UserService {
	@Autowired
	IUser UserRepo;

	
	public String addUser(User u) {
		try {
		UserRepo.save(u);
		return "saved successfully";
		}
		catch(Exception e)
		{
			return "some error occured";
		}
		
	}
	
	
	
	public List<User> getAllUser(){
		return UserRepo.findAll();
	}



	public User loginUser(String username,String password) {
		User u = UserRepo.findByUsername(username);
		if(u != null && u.getUsername() != null)
		{
			if(u.getPassword().equals(password)){
				return u;
			}else
				return new User();
		}
		else
			return new User();
			
			}
	}
	
