package org.rest.rohit.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class comment {
	
	private long id;
	private String commentMessage;
	private Date created;
	private String author;
	
	public comment(){
		
		
	}
	
	public comment(long id, String commentMessage, String author){
		this.id = id;
		this.commentMessage = commentMessage;
		this.author = author;
		this.created = new Date();
		
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCommentMessage() {
		return commentMessage;
	}

	public void setCommentMessage(String commentMessage) {
		this.commentMessage = commentMessage;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
	
	
	
	
}

