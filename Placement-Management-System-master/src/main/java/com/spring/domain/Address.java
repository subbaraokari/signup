package com.spring.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String	street_name;
	private String	city;
	private String	state;
	private String	country;
	@OneToMany(mappedBy="address",cascade = CascadeType.ALL)
	private List<User> users;
	public Long getId() {
		return id;
	}
	public List<User> getUser() {
		return users;
	}
	public void setUser(List<User> users) {
		this.users = users;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStreet_name() {
		return street_name;
	}
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	public Address(Long id, String street_name, String city, String state, String country, List<User> users) {
		super();
		this.id = id;
		this.street_name = street_name;
		this.city = city;
		this.state = state;
		this.country = country;
		this.users = users;
	}
	public Address() {}
	public void add(User user)
	{
		if(users==null)
		{
			users=new ArrayList<User>();
		}
		users.add(user);
		user.setAddress(this);
	}
}
