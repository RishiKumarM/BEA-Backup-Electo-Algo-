package com.botlie.employeeAssimilation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.botlie.employeeAssimilation.entity.CompanySetup;
import com.botlie.employeeAssimilation.entity.Offer;
import com.botlie.employeeAssimilation.service.SetupService;



@RestController
@RequestMapping("/company")
@CrossOrigin("*")
public class SetupController {

	@Autowired
	private SetupService setupService;
	
	@PostMapping("/post")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public CompanySetup addDetails(@RequestBody CompanySetup companySetup)
	{
		return this.setupService.addData(companySetup);
	}
	
	
	@GetMapping("/get")
	@ResponseStatus(HttpStatus.OK)
	public List<CompanySetup> getData()
	{
		List<CompanySetup> all = this.setupService.getAll();
		return all;
		
	}
	@GetMapping("/status")
	@ResponseStatus(HttpStatus.OK)
	public List<CompanySetup> getSts()
	{
		return this.setupService.getStatus();
	}
//	@GetMapping("/getOffer")
//	@ResponseStatus(HttpStatus.OK)
//	public List<CompanySetup> getAllOffer()
//	{
//		return this.setupService.getOffer();
//	}
	
	@PutMapping("put/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public CompanySetup update(@PathVariable int id,@RequestBody CompanySetup companySetup)
	{
		return this.setupService.updateStatus(id, companySetup);
	}
}
