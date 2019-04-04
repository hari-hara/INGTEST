package com.bank.breach.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.breach.model.Franchises;

@CrossOrigin
@RestController
@RequestMapping("/bank/breach") 
public class BreachController {

	
	@GetMapping("/version")
	public String version() {
		return "10.10.10:10";
	}
	
	@GetMapping("/getFranchise")
	public Franchises getFranchise() { 
		
		Franchises f = new Franchises();
		f.setId("1");
		List<String> detail = new ArrayList<>();
		detail.add("RBSI");
		detail.add("SERVICES");
		detail.add("PRIVATE BANKING");
		f.setDetails(detail);
		return f;
	}
	
	@GetMapping("/getBusiness/{franchiseName}")
	public Franchises getSubFranchise(@PathParam("franchiseName") String franchiseName) { 
		
		System.out.println("lll: "+franchiseName);
		Franchises f = new Franchises();
		List<String> detail = new ArrayList<>();
		if("RBSI".equals(franchiseName)) {
		detail.add("CUSTOMER EXPERIENCE");
		detail.add("RISK");
		detail.add("PAYMENT");
		detail.add("FINANCE");
		}
		f.setDetails(detail);
		return f;
	}
}
