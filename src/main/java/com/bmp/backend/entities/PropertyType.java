package com.bmp.backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="propertytype")
public class PropertyType 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int ptypeid;
	
	@Column
	private String ptype;

	public PropertyType() 
	{
		
	}

	public PropertyType(int ptypeid, String ptype) 
	{		
		this.ptypeid = ptypeid;
		this.ptype = ptype;
	}

	public int getPtypeid() {
		return ptypeid;
	}

	public void setPtypeid(int ptypeid) {
		this.ptypeid = ptypeid;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	
		

}
