package com.bmp.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.bmp.backend.entities.Deal;
import com.bmp.backend.repositories.DealRepository;

@Service
public class DealService 
{
	@Autowired
	DealRepository dealrepo;
	
	public List<Deal> getAllDeal(@RequestBody int ownid)
    {
        return dealrepo.getalldeal(ownid);
    }
	
	public int updatestatus(String s , int id )
	{
		return dealrepo.updateStatus(s,id);
	}

}
