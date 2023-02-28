package com.bmp.backend.controllers;

import com.bmp.backend.entities.User;
import com.bmp.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://localhost:3000")
@RestController
public class UserController
{
    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public User signupUser(@RequestBody User u)
    {
        return userService.signupUser(u);
    }
}
