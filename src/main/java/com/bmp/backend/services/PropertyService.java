package com.bmp.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.bmp.backend.entities.Property;
import com.bmp.backend.entities.PropertyType;
import com.bmp.backend.entities.User;
import com.bmp.backend.entities.UserCategory;
import com.bmp.backend.repositories.PropertyRepository;

@Service
public class PropertyService 
{
	@Autowired
	PropertyRepository prepo;
	
//	public UserCategory getOwener(int id)
//    {
//    	UserCategory uc;
//    	Optional<UserCategory> usercategory;
//    	try
//    	{
//    		uc=usercategory.get();
//    	}
//    	catch(Exception e)
//    	{
//    		uc=null;
//    	}
//    	
//    	return uc;
//    }
	

	public List<Property> getProperty()
    {
        return prepo.findAll();
    }
	
	public Property addProperty(@RequestBody Property p)
    {
        return prepo.save(p);
    }
	
	public int delProperty(int pid)
    {
        return prepo.deleteProperty(pid);
    }

    public List<Property> getPropertyById(int userId)
    {
        return prepo.getPropertyById(userId);
    }
    
    public List<Property> getPropertyByCity(String city)
    {
    	return prepo.getByCity(city);
    }

}
