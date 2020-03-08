package com.spring.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
public class UserDto {

	private Long id;
	private String	firstName;
	private String	lastName;
	private String	password;
	private String	email;
	private String	mobile;
	private String	gender;
	private Date dateOfBirth;
	private String rollName;
	public UserDto() {
		
	}
	public UserDto(Long id, String firstName, String lastName, String password, String email, String mobile,
			String gender, Date dateOfBirth, String rollName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.rollName = rollName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getRollName() {
		return rollName;
	}
	public void setRollName(String rollName) {
		this.rollName = rollName;
	}
	
}
