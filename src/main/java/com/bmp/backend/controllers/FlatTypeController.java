package com.bmp.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmp.backend.entities.FlatType;
import com.bmp.backend.services.FlatTypeService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class FlatTypeController {
	
	@Autowired
	FlatTypeService flattypeservice;
	
	@GetMapping("/getflattype")
	public List<FlatType> getproprty()
	{
		
		return flattypeservice.getAllFlatType();
	}

}
