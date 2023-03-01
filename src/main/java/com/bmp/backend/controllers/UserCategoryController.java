package com.bmp.backend.controllers;

import com.bmp.backend.entities.UserCategory;
import com.bmp.backend.services.UserCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UserCategoryController {

    @Autowired
    UserCatService ucatService;

    @GetMapping("/getusertypes")
    public List<UserCategory> getAllCats()
    {
        return ucatService.getAllCats();
    }

}
