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

import com.botlie.employeeAssimilation.entity.EmployeeDetails;
import com.botlie.employeeAssimilation.service.EmployeeService;


@RestController

@RequestMapping("/employee")

@CrossOrigin("*")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/get")
	public List<EmployeeDetails> getDetails()
	{
		return this.employeeService.getDataAll();
	}
	

	@PostMapping("/post")

	public EmployeeDetails addData(@RequestBody EmployeeDetails employeeDetails)
	{
		return this.employeeService.saveData(employeeDetails);
	}
	
	
	
	@PutMapping("/put/{id}")
	public EmployeeDetails updateDetails(@PathVariable int id,@RequestBody EmployeeDetails employeeDetails)
	{
		return this.employeeService.updateData(id, employeeDetails);
	}
}
