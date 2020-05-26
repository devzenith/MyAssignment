package com.ms.bootcamp.fetchcurrency.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.bootcamp.fetchcurrency.model.CurrencyResponse;
import com.ms.bootcamp.fetchcurrency.model.Request;

@Service
public class CurrencyService {
	
	private static Logger log = LoggerFactory.getLogger(CurrencyService.class);
	
	@Autowired
	CurrencyInvetoryms inventoryms;
	
	
	public CurrencyResponse getComputedCurrency(Request request) {
		
		log.info(">>getComputedCurrency call");
		CurrencyResponse response= inventoryms.fetchConversionFactor(request);		
		response.setStatusMessage("Amount calculated for country Code " + request.getCountryCode());		
		
		return response;
		
	}
	
	

}
