package com.bmp.backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="flattype")
public class FlatType 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int ftypeid;
	
	@Column
	private String ftype;

	public FlatType() 
	{
		
	}

	public FlatType(int ftypeid, String ftype) 
	{	
		this.ftypeid = ftypeid;
		this.ftype = ftype;
	}

	public int getFtypeid() {
		return ftypeid;
	}

	public void setFtypeid(int ftypeid) {
		this.ftypeid = ftypeid;
	}

	public String getFtype() {
		return ftype;
	}

	public void setFtype(String ftype) {
		this.ftype = ftype;
	}
		
	

}
