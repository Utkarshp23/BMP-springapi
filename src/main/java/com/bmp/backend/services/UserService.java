package com.bmp.backend.services;

import com.bmp.backend.entities.User;
import com.bmp.backend.repositories.UserRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

    @Autowired
    UserRepository userrepo;
//    
    public User getLogin(String username,String password)
    {
    	User u;
    	Optional<User> user=userrepo.getLogin(username,password);
    	try
    	{
    		u=user.get();
    	}
    	catch(Exception e)
    	{
    		u=null;
    	}
    	
    	return u;
    }
    
    public User signupUser(@RequestBody User u)
    {
        return userrepo.save(u);
    }

	public Object getUserName(int userid)
	{
		return userrepo.getUserName(userid);
	}

}
