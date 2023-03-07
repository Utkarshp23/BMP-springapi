package com.bmp.backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wishlist")
public class Wishlist {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int wishid;
	
	@Column
	private int buyerid;
	
	@Column
	private int propid;

	public Wishlist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Wishlist(int wishid, int buyerid, int propid) {
		super();
		this.wishid = wishid;
		this.buyerid = buyerid;
		this.propid = propid;
	}

	public int getWishid() {
		return wishid;
	}

	public void setWishid(int wishid) {
		this.wishid = wishid;
	}

	public int getBuyerid() {
		return buyerid;
	}

	public void setBuyerid(int buyerid) {
		this.buyerid = buyerid;
	}

	public int getPropid() {
		return propid;
	}

	public void setPropid(int propid) {
		this.propid = propid;
	}
	
	
}
