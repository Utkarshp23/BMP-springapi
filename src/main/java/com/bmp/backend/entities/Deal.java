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
@Table(name="deal")
public class Deal
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dealid;
	
	@Column
	private int buyerid;
	
	@Column
	private int ownerid;
	
	@Column
	private int propid;
	
	@Column
	private int reqid;
	
	@JsonFormat(pattern = "yyyy-mm-dd")
    @Column
    Date date;
	
    @Column
    private String status;

	public Deal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Deal(int dealid, int buyerid, int ownerid, int propid, int reqid, Date date, String status) {
		super();
		this.dealid = dealid;
		this.buyerid = buyerid;
		this.ownerid = ownerid;
		this.propid = propid;
		this.reqid = reqid;
		this.date = date;
		this.status = status;
	}

	public int getDealid() {
		return dealid;
	}

	public void setDealid(int dealid) {
		this.dealid = dealid;
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

	public int getReqid() {
		return reqid;
	}

	public void setReqid(int reqid) {
		this.reqid = reqid;
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
