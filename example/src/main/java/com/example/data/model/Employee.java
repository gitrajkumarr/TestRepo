package com.example.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@Column(name = "ID")
	private Integer id;
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	@Column(name = "name")
	private String name;


	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


}
