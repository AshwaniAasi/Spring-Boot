package com.user.entity;

public class Contact
{
	private Integer cid;
	private String email;
	private String contactName;
	private Integer userId;
	public Contact() {
		super();
	}
	public Contact(Integer cid, String email, String contactName, Integer userId) {
		super();
		this.cid = cid;
		this.email = email;
		this.contactName = contactName;
		this.userId = userId;
	}
	
	public Integer getCid() {return cid;	}
	public void setCid(Integer cid) {this.cid = cid;	}
	
	public String getEmail() {return email;	}
	public void setEmail(String email) {this.email = email;	}
	
	public String getContactName() {	return contactName;	}
	public void setContactName(String contactName) {this.contactName = contactName;	}
	
	public Integer getUserId() {	return userId;	}
	public void setUserId(Integer userId) {this.userId = userId;	}
	
	
	 
}
