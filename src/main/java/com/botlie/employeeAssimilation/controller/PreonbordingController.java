package com.botlie.employeeAssimilation.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.botlie.employeeAssimilation.entity.Pre_Onboarding;
import com.botlie.employeeAssimilation.service.PreonbordingService;

@RestController
@RequestMapping("/preonbording")
@CrossOrigin("*")
public class PreonbordingController {

	@Autowired
	private PreonbordingService preonbordingService;
	
	
	
	@PostMapping("/post")
	public Pre_Onboarding addDetails(@RequestBody Pre_Onboarding preOnbording)
	{
		return this.preonbordingService.addData(preOnbording);
	}
	
	
	@GetMapping("/get")
	public List<Pre_Onboarding> getData()
	{
		List<Pre_Onboarding> all = this.preonbordingService.getAll();
		return all;
		
	}

}
