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
@Table(name="property")
public class Property 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int pid;
	
	
	@Column
	private int userid;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addid_fk",referencedColumnName = "addid")
	private Address address;
	
	@Column
	private int ptypeid;
	
	@Column 
	private int ftypeid;
	
	@Column
	private double price;
	
	@Column
	private String status;

	@Column
	private String s_status;

	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Property(int pid, int userid, Address address, int ptypeid, int ftypeid, double price, String status,String s_status) {
		super();
		this.pid = pid;
		this.userid = userid;
		this.address = address;
		this.ptypeid = ptypeid;
		this.ftypeid = ftypeid;
		this.price = price;
		this.status = status;
		this.s_status=s_status;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getPtypeid() {
		return ptypeid;
	}

	public void setPtypeid(int ptypeid) {
		this.ptypeid = ptypeid;
	}

	public int getFtypeid() {
		return ftypeid;
	}

	public void setFtypeid(int ftypeid) {
		this.ftypeid = ftypeid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getS_status() {
		return s_status;
	}

	public void setS_status(String s_status) {
		this.s_status = s_status;
	}
}
