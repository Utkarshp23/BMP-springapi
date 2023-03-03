package com.bmp.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bmp.backend.entities.Feedback;
@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> 
{
	

}
