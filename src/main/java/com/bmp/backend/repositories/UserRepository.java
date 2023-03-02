package com.bmp.backend.repositories;

import com.bmp.backend.entities.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	@Query("select u from User u where username=:username and password=:password")
	public Optional<User> getLogin(String username,String password);
}
