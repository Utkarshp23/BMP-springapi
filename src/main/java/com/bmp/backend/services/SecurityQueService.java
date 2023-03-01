package com.bmp.backend.services;

import com.bmp.backend.entities.SecurityQuestion;
import com.bmp.backend.entities.UserCategory;
import com.bmp.backend.repositories.SecurityQueRepository;
import com.bmp.backend.repositories.UserCatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecurityQueService {

    @Autowired
    SecurityQueRepository secQueService;

    public List<SecurityQuestion> getAllSecQue()
    {
        return secQueService.findAll();
    }
}
