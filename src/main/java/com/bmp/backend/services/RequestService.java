package com.bmp.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.bmp.backend.entities.Request;
import com.bmp.backend.repositories.RequestRepository;

@Service
public class RequestService 
{
	@Autowired
	RequestRepository reqrepo;
	
	public Request sendRequest(@RequestBody Request req)
	{
		return reqrepo.save(req);
	}
	
	public List<Request> getallrequestById(int id)
	{
		return reqrepo.getallRequest(id);
	}

}
