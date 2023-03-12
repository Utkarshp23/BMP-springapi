package com.bmp.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/getpropertybyid/{userId}")
    public List<Property> getPropertyById(@PathVariable int userId)
    {
        System.out.println("uid:"+userId);
        return propService.getPropertyById(userId);
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
	
	@GetMapping("/search/{city}")
	public List<Property> searchByCity(@PathVariable String city)
	{
		return propService.getPropertyByCity(city);
	}
	
	@GetMapping("/validateproperty/{pid}")
	public int validate(@PathVariable int pid)
	{
		return propService.validate(pid);
	}

}
