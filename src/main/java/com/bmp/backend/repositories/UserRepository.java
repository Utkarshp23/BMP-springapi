package com.bmp.backend.repositories;

import com.bmp.backend.entities.User;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Transactional
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	@Query("select u from User u where username=:username and password=:password")
	public Optional<User> getLogin(@Param("username") String username,@Param("password") String password);

	@Query("select u.fname, u.lname from User u where userid=?1")
	public Object getUserName(int userid);

	
	@Modifying
	@Query("update User p set status='Verified' where userid=?1")
	public int validateUser (int id);
	


	@Query("select u from User u where userid=?1")
	public User getUser(int userid);

	@Query("select u from User u where username=?1")
	public User getUser(String uname);

}
