package com.bmp.backend.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.bmp.backend.entities.Property;
import com.bmp.backend.entities.UserCategory;
import com.bmp.backend.entities.Wishlist;
import com.bmp.backend.repositories.PropertyRepository;
import com.bmp.backend.repositories.WishlistRepository;

@Service
public class WishlistService 
{
	@Autowired
	WishlistRepository wishrepo;
	
	@Autowired
	PropertyRepository prorepo;
	
	public Wishlist addWishList (@RequestBody Wishlist w)
	{
		return wishrepo.save(w);
	}
	
//	public List<Property> getAllWishes(int id)
//    {
//		List<Wishlist> wl = wishrepo.getallWishlist(id);
//		List<Property> pl = new ArrayList<Property>();
//		for (Wishlist wishlist : wl) 
//		{
//			Optional<Property> p = prorepo.findById(wishlist.getPropid());
//			pl.add(p);
//		}
//        return pl;
//        
//    }
	
	public List<Wishlist> getAllWishes(int id)
	{
		return wishrepo.getallWishlist(id);
	}
	
	public int deleteWish(int id)
	{
		return wishrepo.deleteWish(id);
	}

}
