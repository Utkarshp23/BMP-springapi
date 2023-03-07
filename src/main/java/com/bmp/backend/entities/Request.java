package com.bmp.backend.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="request")
public class Request 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int reqid;
	
	@Column
	private int buyerid;
	
	@Column
	private int ownerid;
	
	@Column
	private int propid;
	
	@JsonFormat(pattern = "yyyy-mm-dd")
    @Column
    Date date;
	
	@Column
	private String status;

	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Request(int reqid, int buyerid, int ownerid, int propid, Date date, String status) {
		super();
		this.reqid = reqid;
		this.buyerid = buyerid;
		this.ownerid = ownerid;
		this.propid = propid;
		this.date = date;
		this.status = status;
	}

	public int getReqid() {
		return reqid;
	}

	public void setReqid(int reqid) {
		this.reqid = reqid;
	}

	public int getBuyerid() {
		return buyerid;
	}

	public void setBuyerid(int buyerid) {
		this.buyerid = buyerid;
	}

	public int getOwnerid() {
		return ownerid;
	}

	public void setOwnerid(int ownerid) {
		this.ownerid = ownerid;
	}

	public int getPropid() {
		return propid;
	}

	public void setPropid(int propid) {
		this.propid = propid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	

}
