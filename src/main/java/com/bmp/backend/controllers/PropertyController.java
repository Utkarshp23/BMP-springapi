package com.bmp.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bmp.backend.entities.Property;
import com.bmp.backend.services.PropertyService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PropertyController 
{
	
	@Autowired
    PropertyService propService;
	
	@GetMapping("/getproperty")
    public List<Property> getProperty()
    {
        return propService.getProperty();
    }
	
	@PostMapping("/addproperty")
    public Property addProperty(@RequestBody Property p)
    {
        return propService.addProperty(p);
    }
	
	@PostMapping("/deleteproperty")
    public int delProperty(@RequestBody Property p)
    {
        return propService.delProperty(p.getPid());
    }

}
