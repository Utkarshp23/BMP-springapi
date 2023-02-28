package com.bmp.backend.services;

import com.bmp.backend.entities.User;
import com.bmp.backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

    @Autowired
    UserRepository userrepo;

    public User signupUser(@RequestBody User u)
    {
        return userrepo.save(u);
    }

}
