package com.bmp.backend.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bmp.backend.entities.Address;
import com.bmp.backend.entities.Property;
import com.bmp.backend.entities.User;
import com.bmp.backend.entities.UserCategory;
@Repository
public interface PropertyRepository extends JpaRepository<Property, Integer> 
{
//	@Query("select u from UserCategory u where ucatid=:id")
//	public Optional<UserCategory> checkOwner(int id);
//	
//	
//	@Query("select u from UserCategory u where ucatid=:2")
//	public Optional<UserCategory> checkCustomer(int id);
	
	@Query("update Property set status=:deleted where pid=:id ")
	public int deleteProperty(int id);

	@Query("select p from Property p where userid=:userid")
	public List<Property> getPropertyById(@Param("userid") int userid);

}
