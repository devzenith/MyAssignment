package com.ms.bootcamp.productms.service;

import org.springframework.stereotype.Component;

import com.ms.bootcamp.productms.model.DiscountRequest;
import com.ms.bootcamp.productms.model.DiscountResponse;

@Component
public class Discountmsfallback implements Discountms {

	@Override
	public DiscountResponse calculateDiscount(DiscountRequest request) {
		// As decided by domain experts for this flow.
		return new DiscountResponse(request.getCategory(), request.getMrp(), request.getMrp(), 0.0, 0.0);
	}

}
