package com.bmp.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bmp.backend.entities.Request;
import com.bmp.backend.entities.Wishlist;
import com.bmp.backend.services.RequestService;
import com.bmp.backend.services.WishlistService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class WishlistController 
{
	@Autowired
	WishlistService wishserv;
	
	@PostMapping("/addtowishlist")
	public Wishlist saveToWishlist (@RequestBody Wishlist w)
	{
		return wishserv.addWishList(w);
	}
	
	@GetMapping("/getmywishlist/{buyerid}")
	public List<Wishlist> getWish(@PathVariable int buyerid)
	{
		return wishserv.getAllWishes(buyerid);
	}
	

}
