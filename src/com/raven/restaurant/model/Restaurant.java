package com.raven.restaurant.model;

public class Restaurant {
	
	int rest_id, phone, hours_id;
	String name,location,emailId;
	public Restaurant(int rest_id, int phone, int hours_id, String name, String location, String emailId) {
		super();
		this.rest_id = rest_id;
		this.phone = phone;
		this.hours_id = hours_id;
		this.name = name;
		this.location = location;
		this.emailId = emailId;
	}
	public Restaurant() {
		super();
	}
	public int getRest_id() {
		return rest_id;
	}
	public void setRest_id(int rest_id) {
		this.rest_id = rest_id;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getHours_id() {
		return hours_id;
	}
	public void setHours_id(int hours_id) {
		this.hours_id = hours_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Restaurant [rest_id=" + rest_id + ", phone=" + phone + ", hours_id=" + hours_id + ", name=" + name
				+ ", location=" + location + ", emailId=" + emailId + "]";
	}
	
	

}
