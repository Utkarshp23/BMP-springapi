package com.bmp.backend.controllers;

import com.bmp.backend.entities.SecurityQuestion;
import com.bmp.backend.entities.UserCategory;
import com.bmp.backend.services.SecurityQueService;
import com.bmp.backend.services.UserCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class SecurityQueController {

    @Autowired
    SecurityQueService secQueService;

    @GetMapping("/getsecque")
    public List<SecurityQuestion> getAllSecQue()
    {
        return secQueService.getAllSecQue();
    }
}
