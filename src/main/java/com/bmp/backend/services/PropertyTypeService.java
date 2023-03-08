package com.bmp.backend.services;

import java.util.List;

import com.bmp.backend.entities.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmp.backend.entities.PropertyType;
import com.bmp.backend.entities.UserCategory;
import com.bmp.backend.repositories.PropertyTypeRepository;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class PropertyTypeService 
{
	@Autowired
	PropertyTypeRepository protyrepo;
	
	public List<PropertyType> getAllProType()
    {
        return protyrepo.findAll();
    }
}
