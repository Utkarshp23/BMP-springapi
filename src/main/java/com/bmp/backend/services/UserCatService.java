package com.bmp.backend.services;

import com.bmp.backend.entities.UserCategory;
import com.bmp.backend.repositories.UserCatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCatService {

    @Autowired
    UserCatRepository ucatRepo;

    public List<UserCategory> getAllCats()
    {
        return ucatRepo.findAll();
    }
}
