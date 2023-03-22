package com.botlie.employeeAssimilation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.botlie.employeeAssimilation.entity.Admin_client;
import com.botlie.employeeAssimilation.service.Admin_Client_Service;

@RestController
@RequestMapping("/mapping")
public class Admin_Client_Controller {

	@Autowired
	private Admin_Client_Service admin_Client_Service;
	
	@PostMapping("/post")
	public Admin_client addAdmin(@RequestBody Admin_client admin_client)
	{
	   return this.admin_Client_Service.addData(admin_client);
	}
	
	@GetMapping("/get")
	public List<Admin_client> getData()
	{
		List<Admin_client> all = this.admin_Client_Service.getAll();
		return all;
		
	}
	@GetMapping("/status")
	public List<Admin_client> getSts()
	{
		return this.admin_Client_Service.getStatus();
	}
	
	@PutMapping("put/{id}")
	public Admin_client update(@PathVariable int id,@RequestBody Admin_client admin_client)
	{
		return this.admin_Client_Service.updateStatus(id, admin_client);
	}
	
}
