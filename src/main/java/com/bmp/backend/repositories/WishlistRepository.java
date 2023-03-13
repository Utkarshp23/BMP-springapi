package com.bmp.backend.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.bmp.backend.entities.Wishlist;
//import com.bmp.backend.entities.Wishlist;
@Transactional
@Repository
public interface WishlistRepository extends JpaRepository<Wishlist, Integer>
{
	@Query("select r from Wishlist r where buyerid=?1")
	public List<Wishlist> getallWishlist(int id);
	
	@Modifying
	@Query("delete Wishlist w where wishid=?1 ")
	public int deleteWish(int id);
//	
//	@Query("select p from Property p LEFT JOIN Wishlist w where w.buyerid=:id")
//	public List<Property> getallWishlist(int id);
	

}
