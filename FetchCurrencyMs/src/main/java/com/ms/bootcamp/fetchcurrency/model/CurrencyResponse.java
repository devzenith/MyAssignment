package com.ms.bootcamp.fetchcurrency.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Component
@JsonInclude(Include.NON_NULL)
public class CurrencyResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String statusMessage;
	private String ErrorMessage;
	private double amount;	
	
	
	
	public CurrencyResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CurrencyResponse(String statusMessage, String errorMessage, double amount) {
		super();
		this.statusMessage = statusMessage;
		ErrorMessage = errorMessage;
		this.amount = amount;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public String getErrorMessage() {
		return ErrorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		ErrorMessage = errorMessage;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

}
