package com.bank.breach.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Franchises {

	@JsonInclude(Include.NON_NULL)
	public String id;
	
	public List<String> details;
	
	public List<String> getDetails() {
		return details;
	}

	@JsonProperty("details")
	public void setDetails(List<String> details) {
		this.details = details;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
