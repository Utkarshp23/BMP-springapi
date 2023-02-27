package com.bmp.backend.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "user")
public class User {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int userid;
    @Column
	private String username;
    @Column
	private String password;
    @Column
	private String fname;
    @Column
	private String lname;
    @Column
	private String email;
    @Column
	private String contact;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addid")
    @Column
	private Address addid_fk;
    
    //@JsonIgnoreProperties("user_category")
	@OneToOne
	@JoinColumn(name="ucatid")
	private UserCategory ucatid_fk;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "qid")
    @Column
	private SecurityQuestion qid_fk;
    
    @Column
	private String ans;

	public User() 
	{
	
	}

	public User(int userid, String username, String password, String fname, String lname, String email, String contact,
			Address addid_fk, UserCategory ucatid_fk, SecurityQuestion qid_fk, String ans) 
	{	
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.contact = contact;
		this.addid_fk = addid_fk;
		this.ucatid_fk = ucatid_fk;
		this.qid_fk = qid_fk;
		this.ans = ans;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Address getAddid_fk() {
		return addid_fk;
	}

	public void setAddid_fk(Address addid_fk) {
		this.addid_fk = addid_fk;
	}

	public UserCategory getUcatid_fk() {
		return ucatid_fk;
	}

	public void setUcatid_fk(UserCategory ucatid_fk) {
		this.ucatid_fk = ucatid_fk;
	}

	public SecurityQuestion getQid_fk() {
		return qid_fk;
	}

	public void setQid_fk(SecurityQuestion qid_fk) {
		this.qid_fk = qid_fk;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}
	
	
}
