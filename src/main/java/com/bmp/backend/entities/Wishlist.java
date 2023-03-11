package com.bmp.backend.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="wishlist")
public class Wishlist {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int wishid;
	
	@Column
	private int buyerid;
	
	@OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "propid",referencedColumnName = "pid")
	private Property property;

	public Wishlist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Wishlist(int wishid, int buyerid, Property property) {
		super();
		this.wishid = wishid;
		this.buyerid = buyerid;
		this.property = property;
	}

	@Override
	public String toString() {
		return "Wishlist [wishid=" + wishid + ", buyerid=" + buyerid + ", property=" + property + "]";
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

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}
		
	
}
