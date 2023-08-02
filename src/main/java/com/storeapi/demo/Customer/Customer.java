package com.storeapi.demo.Customer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int CustomerId;
	private String FirstName;
	private String LastName;
	private String UserName;
	private String Password;
	private String Gender;
	private String Email;
	private String Mobile;
	private String Address;
	private String DateOfBirth;
	
	public Customer() {

	}
	public Customer(int customerId, String firstName, String lastName, String userName, String password, String gender, String email,
			String mobile, String address, String dateOfBirth) {
		super();
		this.CustomerId = customerId;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.UserName = userName;
		this.Password = password;
		this.Gender = gender;
		this.Email = email;
		this.Mobile = mobile;
		this.Address = address;
		this.DateOfBirth = dateOfBirth;
	}
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
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
	public String getUsertName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", UserName=" + UserName + ", Password=" + Password + ", Gender=" + Gender + ", Email=" + Email + ", Mobile=" + Mobile
				+ ", Address=" + Address + ", DateOfBirth=" + DateOfBirth + "]";
	}
	
	
}
