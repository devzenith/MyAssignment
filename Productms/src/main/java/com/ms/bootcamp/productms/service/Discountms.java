package com.ms.bootcamp.productms.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ms.bootcamp.productms.model.DiscountRequest;
import com.ms.bootcamp.productms.model.DiscountResponse;

@FeignClient(name = "discountms", fallback = Discountmsfallback.class)
public interface Discountms {

	@RequestMapping(value = "/caldisc", method = RequestMethod.POST)
	public DiscountResponse calculateDiscount(@RequestBody DiscountRequest request);

}
