package com.bmp.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmp.backend.entities.FlatType;
import com.bmp.backend.entities.UserCategory;
import com.bmp.backend.repositories.FlatTypeRepository;

@Service
public class FlatTypeService 
{
	@Autowired
	FlatTypeRepository frepo;
	
	public List<FlatType> getAllFlatType()
    {
        return frepo.findAll();
    }
	
	

}
