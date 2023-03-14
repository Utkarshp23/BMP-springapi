package com.bmp.backend.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bmp.backend.entities.Request;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface RequestRepository extends JpaRepository<Request, Integer> 
{
	@Query("select r from Request r where buyerid=?1")
	public List<Request> getallRequest(int id);

	@Query("select r from Request r where propid=?1")
	public List<Request> getAllRequestByPropId(int id);

	@Modifying
	@Query("update Request r set r.status='Accepted' where r.reqid=?1")
	public int updateReqStatus(int requid);

	@Modifying
	@Query("delete from Request r where r.propid=?1")
	public int deleteByPropId(int id);

}
