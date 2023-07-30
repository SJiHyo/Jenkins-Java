package com.storeapi.demo.Admin;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {
	
	@Id
	private int UserId;
	private String Password;
	private String FirstName;
	private String LastName;
	private String UserName;
	private String Email;
	
	public Admin() {
		
	}
	public Admin(int userId, String password, String firstName, String lastName, String userName, String email) {
		super();
		this.UserId = userId;
		this.Password = password;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.UserName = userName;
		this.Email = email;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "Admin [UserId=" + UserId + ", Password=" + Password + ", FirstName=" + FirstName + ", LastName="
				+ LastName + ", UserName=" + UserName + ", Email=" + Email + "]";
	}
		
	
}
