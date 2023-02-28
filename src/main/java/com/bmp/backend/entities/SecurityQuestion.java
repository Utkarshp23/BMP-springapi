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
	private int qid;
	
	@Column
	private String question;

	public SecurityQuestion() 
	{
	
	}

	public SecurityQuestion(int qid, String question) {
		this.qid = qid;
		this.question = question;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
}
