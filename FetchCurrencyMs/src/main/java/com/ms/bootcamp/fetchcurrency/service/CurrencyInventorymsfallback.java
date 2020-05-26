package com.ms.bootcamp.fetchcurrency.service;

import org.springframework.stereotype.Component;

import com.ms.bootcamp.fetchcurrency.model.CurrencyResponse;
import com.ms.bootcamp.fetchcurrency.model.Request;

@Component
public class CurrencyInventorymsfallback implements CurrencyInvetoryms{

	@Override
	public CurrencyResponse fetchConversionFactor(Request request) {
		// TODO Auto-generated method stub
		
		CurrencyResponse curresponse= new CurrencyResponse("Calculation not performed",null,0.0);
		
		
		return curresponse;
	}
	
	

}
