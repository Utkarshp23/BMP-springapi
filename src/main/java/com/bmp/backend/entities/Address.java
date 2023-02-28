package com.bmp.backend.entities;

import javax.persistence.*;

@Entity
@Embeddable
@Table(name = "address")
public class Address 
{

//	@Column(nullable = true)
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addid;
	
	@Column
	private String addline1;
	
	@Column
	private String addline2;
	
	@Column
	private String state;
	
	@Column
	private String city;
	
	@Column
	private String pincode;

	public Address() {
	}

	public Address(int addid, String addline1, String addline2, String state, String city, String pincode) {
		this.addid = addid;
		this.addline1 = addline1;
		this.addline2 = addline2;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}

	public int getAddid() {
		return addid;
	}

	public void setAddid(int addid) {
		this.addid = addid;
	}

	public String getAddline1() {
		return addline1;
	}

	public void setAddline1(String addline1) {
		this.addline1 = addline1;
	}

	public String getAddline2() {
		return addline2;
	}

	public void setAddline2(String addline2) {
		this.addline2 = addline2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
