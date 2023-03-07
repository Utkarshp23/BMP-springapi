package com.bmp.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.bmp.backend.entities.UserCategory;
import com.bmp.backend.entities.Wishlist;
import com.bmp.backend.repositories.WishlistRepository;

@Service
public class WishlistService 
{
	@Autowired
	WishlistRepository wishrepo;
	
	public Wishlist addWishList (@RequestBody Wishlist w)
	{
		return wishrepo.save(w);
	}
	
	public List<Wishlist> getAllWishes(int id)
    {
        return wishrepo.getallWishlist(id);
    }

}
