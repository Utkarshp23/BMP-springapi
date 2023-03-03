package com.bmp.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bmp.backend.entities.PropertyType;
@Repository
public interface PropertyTypeRepository extends JpaRepository<PropertyType, Integer> 
{
	

}
