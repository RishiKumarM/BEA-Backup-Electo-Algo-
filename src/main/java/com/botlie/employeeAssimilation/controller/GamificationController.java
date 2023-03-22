package com.botlie.employeeAssimilation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.botlie.employeeAssimilation.entity.Gamification;
import com.botlie.employeeAssimilation.service.GamificationService;

@RestController
@RequestMapping("/gamification")
@CrossOrigin("*")
public class GamificationController {

	@Autowired
	private GamificationService gamificationService;
	
	
	
	@PostMapping("/post")
	public Gamification addDetails(@RequestBody Gamification gamification)
	{
		return this.gamificationService.addData(gamification);
	}
	
	
	@GetMapping("/get")
	public List<Gamification> getData()
	{
		List<Gamification> all = this.gamificationService.getAll();
		return all;
		
	}
	@GetMapping("/status")
	public List<Gamification> getSts()
	{
		return this.gamificationService.getStatus();
	}
	
	@PutMapping("put/{id}")
	public Gamification update(@PathVariable int id,@RequestBody Gamification gamification)
	{
		return this.gamificationService.updateStatus(id, gamification);
	}
}
