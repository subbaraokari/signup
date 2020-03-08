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

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="role")
public class Role{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String	name;
	private String	description;
	@OneToMany(mappedBy="role",cascade = CascadeType.ALL)
	private List<User> users;
	public List<User> getUser() {
		return users;
	}
	public void setUser(List<User> users) {
		this.users = users;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Role(Long id, String name, String description, List<User> users) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.users = users;
	}
	public Role() {}
	public void add(User user)
	{
		if(users!=null)
		{
			users=new ArrayList<>();
		}
		users.add(user);
		user.setRole(this);
	}
}
