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

import com.botlie.employeeAssimilation.entity.ClientEntity;
import com.botlie.employeeAssimilation.service.ClientService;



@RestController
@RequestMapping("/client")
@CrossOrigin("*")
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@PostMapping("/post")
	public ClientEntity addDetails(@RequestBody ClientEntity clientEntity)
	{
		return this.clientService.addData(clientEntity);
	}
	
	
	@GetMapping("/get")
	public List<ClientEntity> getData()
	{
		List<ClientEntity> all = this.clientService.getAll();
		return all;
		
	}
	@GetMapping("/status")
	public List<ClientEntity> getSts()
	{
		return this.clientService.getStatus();
	}
	
	@PutMapping("put/{id}")
	public ClientEntity update(@PathVariable int id,@RequestBody ClientEntity clientEntity)
	{
		return this.clientService.updateStatus(id, clientEntity);
	}
}
