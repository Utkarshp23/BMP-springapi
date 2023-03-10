package com.bmp.backend.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bmp.backend.entities.Request;
@Repository
public interface RequestRepository extends JpaRepository<Request, Integer> 
{
	@Query("select r from Request r where buyerid=?1")
	public List<Request> getallRequest(int id);

}
