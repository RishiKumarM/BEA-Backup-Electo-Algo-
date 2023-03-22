package com.botlie.employeeAssimilation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.botlie.employeeAssimilation.entity.Pre_Offer;
import com.botlie.employeeAssimilation.service.Pre_OfferService;


@RestController
@RequestMapping("/pre_offer")
@CrossOrigin("*")
public class Pre_OfferController {

	@Autowired
	private Pre_OfferService pre_OfferService;
	
	@PostMapping("/post")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Pre_Offer addDetails(@RequestBody Pre_Offer pre_Offer)
	{
		return this.pre_OfferService.addData(pre_Offer);
	}
	
	
	@GetMapping("/get")
	@ResponseStatus(HttpStatus.OK)
	public List<Pre_Offer> getData()
	{
		List<Pre_Offer> all = this.pre_OfferService.getAll();
		return all;
		
	}
//	@GetMapping("/status")
//	@ResponseStatus(HttpStatus.OK)
//	public List<CompanySetup> getSts()
//	{
//		return this.setupService.getStatus();
//	}
//	
//	@PutMapping("put/{id}")
//	@ResponseStatus(HttpStatus.ACCEPTED)
//	public CompanySetup update(@PathVariable int id,@RequestBody CompanySetup companySetup)
//	{
//		return this.setupService.updateStatus(id, companySetup);
//	}
}
