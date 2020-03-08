package com.spring.dto;

public class AddressDto {
	private Long id;
	private String	street_name;
	private String	city;
	private String	state;
	private String	country;
	public AddressDto() {
		
	}
	public AddressDto(Long id, String street_name, String city, String state, String country) {
		super();
		this.id = id;
		this.street_name = street_name;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public Long getId() {
		return id;
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
	
}
