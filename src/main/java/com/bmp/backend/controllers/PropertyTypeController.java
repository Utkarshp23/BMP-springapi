package com.bmp.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmp.backend.entities.PropertyType;
import com.bmp.backend.services.PropertyTypeService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PropertyTypeController {
	
	@Autowired
	PropertyTypeService proptypeservice;
	
	@GetMapping("/getproptype")
	public List<PropertyType> getproprty()
	{
		return proptypeservice.getAllProType();
	}

}
