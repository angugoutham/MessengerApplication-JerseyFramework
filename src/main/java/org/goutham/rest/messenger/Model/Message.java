package org.goutham.rest.messenger.Model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Message {

	
	private  long id;
	private String message;
	private Date  Created; 
	private String Author;
	
	public Message()
	{
		
	}
	public Message(long id, String message, Date created, String author) {
		super();
		this.id = id;
		this.message = message;
		Created = created;
		Author = author;
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
		return Created;
	}
	public void setCreated(Date created) {
		Created = created;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
}
