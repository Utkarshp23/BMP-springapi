package com.bmp.backend.repositories;

import com.bmp.backend.entities.User;
import com.bmp.backend.entities.UserCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCatRepository extends JpaRepository<UserCategory, Integer> {
}
