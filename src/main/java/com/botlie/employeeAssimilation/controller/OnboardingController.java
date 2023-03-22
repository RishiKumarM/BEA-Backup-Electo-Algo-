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

import com.botlie.employeeAssimilation.entity.Onboarding;
import com.botlie.employeeAssimilation.service.OnboardingService;


@RestController
@RequestMapping("/onboarding")
@CrossOrigin("*")
public class OnboardingController {



		@Autowired
		private OnboardingService onboardingService;
		
		@PostMapping("/post")
		@ResponseStatus(HttpStatus.ACCEPTED)
		public Onboarding addDetails(@RequestBody Onboarding onboarding)
		{
			return this.onboardingService.addData(onboarding);
		}
		
		
		@GetMapping("/get")
		@ResponseStatus(HttpStatus.OK)
		public List<Onboarding> getData()
		{
			List<Onboarding> all = this.onboardingService.getAll();
			return all;
			
		}
}
