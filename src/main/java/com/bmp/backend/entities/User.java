package com.bmp.backend.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.*;

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
    @JoinColumn(name = "addid_fk",referencedColumnName = "addid")
	private Address address;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ucatid_fk",referencedColumnName = "ucatid")
	private UserCategory ucat;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "qid_fk",referencedColumnName = "qid")
	private SecurityQuestion secque;
    
    @Column
	private String ans;

    public User() {
    }

    public User(int userid, String username, String password, String fname, String lname, String email, String contact, Address address, UserCategory ucat, SecurityQuestion secque, String ans) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.ucat = ucat;
        this.secque = secque;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public UserCategory getUcat() {
        return ucat;
    }

    public void setUcat(UserCategory ucat) {
        this.ucat = ucat;
    }

    public SecurityQuestion getSecque() {
        return secque;
    }

    public void setSecque(SecurityQuestion secque) {
        this.secque = secque;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }
}
