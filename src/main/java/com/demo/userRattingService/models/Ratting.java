package com.demo.userRattingService.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ratting {
	
	@Id
	private int id;
	
	private int ratting;
	
	private String comment;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRatting() {
		return ratting;
	}

	public void setRatting(int rating) {
		this.ratting = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	

}
