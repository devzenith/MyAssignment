package com.ms.bootcamp.fetchcurrency.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ms.bootcamp.fetchcurrency.model.CurrencyResponse;
import com.ms.bootcamp.fetchcurrency.model.Request;


@FeignClient(name="currencyinventoryms", configuration=CurrencyConfig.class, fallback=CurrencyInventorymsfallback.class)
public interface CurrencyInvetoryms {
	
	@RequestMapping(value = "/currencyInventoryMs/fetchconv", method = RequestMethod.POST)
	public CurrencyResponse fetchConversionFactor(@RequestBody Request request);

}
