package com.bmp.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.bmp.backend.entities.Wishlist;
@Repository
public interface WishlistRepository extends JpaRepository<Wishlist, Integer> 
{
	
	@Query("select r from Wishlist r where buyerid=:id")
	public List<Wishlist> getallWishlist(int id);

}
