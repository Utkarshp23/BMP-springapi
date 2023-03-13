package com.bmp.backend.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.Mapping;

import com.bmp.backend.entities.Deal;
@Repository
public interface DealRepository extends JpaRepository<Deal, Integer> 
{
	@Query("select d from Deal d where ownerid =?1")
	public List<Deal> getalldeal (int ownid);
	
	@Modifying
	@Query("update Deal d set d.status=:state where d.reqid=?1")
	public int updateStatus(String state , int id);

}
