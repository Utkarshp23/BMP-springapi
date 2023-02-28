package com.bmp.backend.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "user_category")
public class UserCategory 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ucatid;
    
    @Column
    private String cattype;

	public UserCategory() {
	}

	public UserCategory(int ucatid, String cattype) {
		this.ucatid = ucatid;
		this.cattype = cattype;
	}

	public int getUcatid() {
		return ucatid;
	}

	public void setUcatid(int ucatid) {
		this.ucatid = ucatid;
	}

	public String getCattype() {
		return cattype;
	}

	public void setCattype(String cattype) {
		this.cattype = cattype;
	}
}
