package com.botlie.employeeAssimilation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.botlie.employeeAssimilation.entity.ClientEntity;
import com.botlie.employeeAssimilation.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	public ClientEntity addData(ClientEntity clientEntity)
	{
		return this.clientRepository.save(clientEntity);
	}
	
	public List<ClientEntity> getAll()
	{
		List<ClientEntity> findAll = this.clientRepository.findAll();
		return findAll;
	}
	
	public ClientEntity updateStatus(int id, ClientEntity clientEntity)
	{
		ClientEntity client=this.clientRepository.findById(id).orElse(clientEntity);
		client.setStatus(clientEntity.getStatus());
	return	this.clientRepository.save(client);
	
	}
	
	public List<ClientEntity> getStatus()
	{
	return this.clientRepository.findByStatus();
	}
}
