package com.spring.dto;

public class SeniorDto {
	private String	designation;
	private Integer	yearOfPassing;
	private String	department;
	private String name;
	private String createdBy;
	private String description;
	public SeniorDto() {
		
	}
	public SeniorDto(String designation, Integer yearOfPassing, String department, String name, String createdBy,
			String description) {
		super();
		this.designation = designation;
		this.yearOfPassing = yearOfPassing;
		this.department = department;
		this.name = name;
		this.createdBy = createdBy;
		this.description = description;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Integer getYearOfPassing() {
		return yearOfPassing;
	}
	public void setYearOfPassing(Integer yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
