package com.bmp.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bmp.backend.entities.Deal;
import com.bmp.backend.entities.Request;
import com.bmp.backend.services.DealService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class DealController 
{
	@Autowired
	DealService dealserv;
	
	@GetMapping("/getalldeals/{ownerid}")
	public List<Deal> getAllDeal(@PathVariable int ownerid)
	{
		return dealserv.getAllDeal(ownerid);
	}
	
//	@PutMapping("/updatestatus")
//	public int updateStatus(@RequestBody String status , @RequestBody int reqid)
//	{
//		System.out.println(reqid+" & Status "+status);
//		return dealserv.updatestatus(status, reqid);
//	}

}
