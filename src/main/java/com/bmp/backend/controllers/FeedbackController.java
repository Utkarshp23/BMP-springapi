package com.bmp.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bmp.backend.entities.Feedback;
import com.bmp.backend.entities.Property;
import com.bmp.backend.entities.UserCategory;
import com.bmp.backend.services.FeedbackService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class FeedbackController 
{
	
	@Autowired
    FeedbackService feedService;
	
	@PostMapping("/addfeedback")
    public Feedback addfeed(@RequestBody Feedback f)
    {
        return feedService.addFeed(f);
    }
	
	@GetMapping("/getallfeed")
    public List<Feedback> getAllFeed()
    {
        return feedService.getAllFeed();
    }
	

}
