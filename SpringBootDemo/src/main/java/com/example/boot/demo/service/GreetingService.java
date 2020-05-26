package com.example.boot.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import com.example.boot.demo.dao.GreetingRepository;
import com.example.boot.demo.model.Greeting;
import com.example.boot.demo.model.GreetingBean;
import com.example.boot.demo.model.GreetingType;

@Component
public class GreetingService {

	@Autowired
	GreetingRepository repo;
	
	public String getGreetingForName(String name) {
		GreetingBean greet = new GreetingBean();
		greet.setName(name);
		return greet.composeGreet();
	}
	
	public List<Greeting> displayAllGreetings()
	{
		return repo.findAll();
	}
	
	public List<Greeting> getGreetingsByType(GreetingType type) {
		Greeting greet = new Greeting();
		greet.setType(type);
		Example<Greeting> typeExample = Example.of(greet);
		return repo.findAll(typeExample);
		
	}
}