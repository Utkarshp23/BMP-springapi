package com.bmp.backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "security_question")
public class SecurityQuestion 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ucatid;
	
	@Column
	private String question;

	public SecurityQuestion() 
	{
	
	}

	public SecurityQuestion(int ucatid, String question) 
	{		
		this.ucatid = ucatid;
		this.question = question;
	}

	public int getUcatid() {
		return ucatid;
	}

	public void setUcatid(int ucatid) {
		this.ucatid = ucatid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	

}
