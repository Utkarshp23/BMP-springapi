package com.bmp.backend.repositories;

import com.bmp.backend.entities.SecurityQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityQueRepository extends JpaRepository<SecurityQuestion, Integer> {
}
