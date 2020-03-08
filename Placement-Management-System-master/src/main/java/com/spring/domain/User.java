package com.spring.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

//@MappedSuperclass
@Entity  
@Table(name = "user")  
@Inheritance(strategy=InheritanceType.JOINED)  
public class User {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@Column(name="first_name")
	//@NotNull(message = "first name is required")
	private String	firstName;
	@Column(name="last_name")
	//@NotNull(message = "Lastname is required")
	private String	lastName;
	@Column(name="password")
	//@NotNull(message = "password is required")
	private String	password;
	@Column(name="email")
	//@NotNull(message = "email is required")
	private String	email;
	@Column(name="mobile_number")
	//@NotNull(message = "mobileno is required")
	private String	mobile;
	@Column(name="gender")
	//@NotNull(message = "gender is required")
	private String	gender;
	@Column(name="date_of_birth")
	private Date dateOfBirth;
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="address_id")
	private Address	address;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="role_id")
	private Role role;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public User(Long id, String firstName, String lastName, String password, String email, String mobile, String gender,
			Date dateOfBirth,Address address, Role role) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.role = role;
	}
	public User() {}
}
	