package com.bmp.backend.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

	@GetMapping("/getpropreq/{propid}")
	public List<Request> getAllRequestByPropId(@PathVariable int propid)
	{
		return reqserv.getAllRequestByPropId(propid);
	}


	@GetMapping("/updatereq/{reqid}")
	public int updateReqStatus(@PathVariable int reqid)
	{
		return reqserv.updateReqStatus(reqid);
	}

	@DeleteMapping("/deletereq/{reqid}")
	public  int deleteReq(@PathVariable int reqid){
		return  reqserv.deleteReq(reqid);
	}

}
