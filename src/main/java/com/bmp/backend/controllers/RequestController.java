package com.bmp.backend.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bmp.backend.entities.Request;
import com.bmp.backend.services.RequestService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class RequestController 
{
	@Autowired
	RequestService reqserv;
	
	@PostMapping("/sendrequest")
	public Request sendRequest (@RequestBody Request r)
	{
		return reqserv.sendRequest(r);
	}
	
	@GetMapping("/getmyrequest/{buyerid}")
	public List<Request> getRequest(@PathVariable int buyerid)
	{
		return reqserv.getallrequestById(buyerid);
	}

}
