package com.example.boot.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Greeting {
	
	@Id
	Integer id;
	private String greetingName;
	private GreetingType type;
	

	public Greeting(Integer id, String greetingName, GreetingType type) {
		super();
		this.id = id;
		this.greetingName = greetingName;
		this.type = type;
	}

	public Greeting() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGreetingName() {
		return greetingName;
	}

	public void setGreetingName(String greetingName) {
		this.greetingName = greetingName;
	}

	public GreetingType getType() {
		return type;
	}

	public void setType(GreetingType type) {
		this.type = type;
	}

}
