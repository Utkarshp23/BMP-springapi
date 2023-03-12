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
    @Column
	private String status;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addid_fk",referencedColumnName = "addid")
	private Address address;

//	@OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "ucatid_fk",referencedColumnName = "ucatid")
//	private UserCategory ucat;

//    @OneToOne
//    @JoinColumn(name = "ucatid_fk",referencedColumnName = "ucatid")
    @Column
    private int ucatid_fk;
    
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "qid_fk",referencedColumnName = "qid")
//	private SecurityQuestion secque;
//    @OneToOne
//    @JoinColumn(name = "qid_fk",referencedColumnName = "qid")
    @Column
    private int qid_fk;

    @Column
	private String ans;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userid, String username, String password, String fname, String lname, String email, String contact,
			String status, Address address, int ucatid_fk, int qid_fk, String ans) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.contact = contact;
		this.status = status;
		this.address = address;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getUcatid_fk() {
		return ucatid_fk;
	}

	public void setUcatid_fk(int ucatid_fk) {
		this.ucatid_fk = ucatid_fk;
	}

	public int getQid_fk() {
		return qid_fk;
	}

	public void setQid_fk(int qid_fk) {
		this.qid_fk = qid_fk;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", fname=" + fname
				+ ", lname=" + lname + ", email=" + email + ", contact=" + contact + ", status=" + status + ", address="
				+ address + ", ucatid_fk=" + ucatid_fk + ", qid_fk=" + qid_fk + ", ans=" + ans + "]";
	}

}
