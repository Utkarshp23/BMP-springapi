package com.bmp.backend.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bmp.backend.entities.Address;
import com.bmp.backend.entities.Property;
import com.bmp.backend.entities.User;
import com.bmp.backend.entities.UserCategory;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface PropertyRepository extends JpaRepository<Property, Integer> 
{
//	@Query("select u from UserCategory u where ucatid=:id")
//	public Optional<UserCategory> checkOwner(int id);
//	
//	
//	@Query("select u from UserCategory u where ucatid=:2")
//	public Optional<UserCategory> checkCustomer(int id);
	
//	@Query("update Property p set status=:deleted where pid=:id ")
//	public int deleteProperty(int id);

	@Modifying
	@Query("delete Property p where pid=?1 ")
	public int deleteProperty( int id);
//	@Param("pid")

	@Query("select p from Property p where userid=?1")
	public List<Property> getPropertyById(int userid);

//	@Param("userid")
	
	@Query("select p from Property p where p.address.city=?1")
	public List<Property> getByCity(String city);
	
	@Modifying
	@Query("update Property p set status='Verified' where pid=?1")
	public int validate (int pid);

}
