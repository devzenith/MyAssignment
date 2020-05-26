package com.example.boot.demo.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.boot.demo.service.GreetingService;

@Controller
@RequestMapping(path = "/web")
public class GreetingsWebController {

	@Autowired
	GreetingService greetingService;

	@RequestMapping(path = "/{name}", method = RequestMethod.GET)
	public String renderGreeting(@PathVariable String name, Model model) {
		model.addAttribute("greeting", greetingService.getGreetingForName(name));
		return "index";
	}
	
	

}