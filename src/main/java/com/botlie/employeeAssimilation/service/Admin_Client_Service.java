package com.botlie.employeeAssimilation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.botlie.employeeAssimilation.entity.Admin_client;
import com.botlie.employeeAssimilation.repository.Admin_Client_Repository;

@Service
public class Admin_Client_Service {

	@Autowired
	private Admin_Client_Repository admin_Client_Repository;
	
	public Admin_client addData(Admin_client admin_client)
	{
		return this.admin_Client_Repository.save(admin_client);
	}
	
	public List<Admin_client> getAll()
	{
		List<Admin_client> findAll = this.admin_Client_Repository.findAll();
		return findAll;
	}
	public Admin_client updateStatus(int id, Admin_client admin_client)
	{
		Admin_client admin=this.admin_Client_Repository.findById(id).orElse(admin_client);
		admin.setStatus(admin_client.getStatus());
		return this.admin_Client_Repository.save(admin);
	
	}
	
	public List<Admin_client> getStatus()
	{
		return this.admin_Client_Repository.findByStatus();
	}
}
