package com.bmp.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bmp.backend.entities.FlatType;
@Repository
public interface FlatTypeRepository extends JpaRepository<FlatType, Integer> 
{
	

}
