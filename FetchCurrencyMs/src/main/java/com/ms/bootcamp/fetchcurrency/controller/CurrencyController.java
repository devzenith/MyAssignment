package com.ms.bootcamp.fetchcurrency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.bootcamp.fetchcurrency.model.CurrencyResponse;
import com.ms.bootcamp.fetchcurrency.model.Request;
import com.ms.bootcamp.fetchcurrency.service.CurrencyService;

@RestController
@RequestMapping("/fetchCurrencyMs")
public class CurrencyController {
	
	@Autowired
	CurrencyService service;
	
	@PostMapping("/getcurrency")
	public CurrencyResponse getComputedCurrency(@RequestBody Request request) {
		
			
		return service.getComputedCurrency(request);
		 
	}

}
