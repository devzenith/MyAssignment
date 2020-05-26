package com.example.boot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.boot.demo.model.Greeting;
import com.example.boot.demo.model.GreetingType;
import com.example.boot.demo.service.GreetingService;

@RestController
@RequestMapping("/greet")
public class GreetingController {
	
	@Autowired
	GreetingService greetingService;
	
	
	@RequestMapping(path="/default", method = RequestMethod.GET)
	public String defaultGreet() {
		
		return "Hello There";
	}
	
	@RequestMapping(path = "/object/default", method = RequestMethod.GET)
	public Greeting defaultObjectGreeting() {
		return new Greeting();
	}

	@RequestMapping(path = "/{name}", method = RequestMethod.GET)
	public String nameGreet(@PathVariable String name) {
		return greetingService.getGreetingForName(name);
	}
	
	@RequestMapping(path = "/display/all", method = RequestMethod.GET)
	public List<Greeting> displayAllGreetings() {
		return greetingService.displayAllGreetings();
	}
	
	@RequestMapping(path = "/db/{name}/{type}", method = RequestMethod.GET)
	public String dbGreet(@PathVariable String name, @PathVariable GreetingType type) {

		List<Greeting> typedGreetings = greetingService.getGreetingsByType(type);
		 System.out.println(typedGreetings.size());
		if (typedGreetings != null && typedGreetings.size() > 0) {
			int greetIndex = (int) Math.round(Math.random()*10);
			System.out.println(greetIndex);
			if (greetIndex > (typedGreetings.size()-1))
				greetIndex = typedGreetings.size() - 1;
			 System.out.println(greetIndex);
			return typedGreetings.get(greetIndex).getGreetingName() + "  " + name;
		} else {
			return "No Greeting For You :(";
		}
	}

}
