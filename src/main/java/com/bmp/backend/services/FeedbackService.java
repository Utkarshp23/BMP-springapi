package com.bmp.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.bmp.backend.entities.Feedback;
import com.bmp.backend.entities.UserCategory;
import com.bmp.backend.repositories.FeedbackRepository;

@Service
public class FeedbackService 
{
	@Autowired
	FeedbackRepository feedrepo;
	
	public List<Feedback> getAllFeed()
    {
        return feedrepo.findAll();
    }
	
	public Feedback addFeed(@RequestBody Feedback f)
    {
        return feedrepo.save(f);
    }

}
