package com.bmp.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bmp.backend.entities.User;

@CrossOrigin(origins = "https://localhost:3000")
@RestController
public class LoginController 
{
	@Autowired
	LoginService loginservice;
	
	@PostMapping("/login")
	public User checkLogin(@RequestBody User lcheck)
	{
		return loginservice.getLogin(lcheck.getEmail(), lcheck.getPassword());
		
	}
	

}
