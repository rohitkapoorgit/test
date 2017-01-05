package org.rest.rohit.messenger.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@XmlRootElement
public class message {
	
	private long id;
	private String message;
	private Date created;
	private String author;
	private Map<Long,comment> comments = new HashMap<>();
	
	public message(){
		
		
	}
	
	public message(long id, String message, String author){
		this.id = id;
		this.message = message;
		this.author = author;
		this.created = new Date();
		
		
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
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
	
	@XmlTransient
	public Map<Long, comment> getComments(){
		
		return comments;
		
	}
	
	public void setComments(Map<Long, comment> comments){
		
		this.comments = comments;
		
	}
	
	
}
