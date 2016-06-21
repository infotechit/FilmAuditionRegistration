package com.actingregistration.entities;

public class Actor {
	
	private int actorId;
	private String firstName;
	private String lastName;
	private String emailId;
	private int pincode;
	private long contactNo;
	private String actorDescription;

	public Actor() {
		super();
	}
	
	public Actor(String firstName, String lastName, String emailId, int pincode, long contactNo,
			String actorDescription) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.pincode = pincode;
		this.contactNo = contactNo;
		this.actorDescription = actorDescription;
	}
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getActorDescription() {
		return actorDescription;
	}
	public void setActorDescription(String actorDescription) {
		this.actorDescription = actorDescription;
	}
	
	
}