package com.botlie.employeeAssimilation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.botlie.employeeAssimilation.entity.CompanySetup;
import com.botlie.employeeAssimilation.entity.Offer;
import com.botlie.employeeAssimilation.repository.SetupRepository;

@Service
public class SetupService {

	@Autowired
	private  SetupRepository    setupRepository;
	
	public CompanySetup addData(CompanySetup companySetup)
	{
		return this.setupRepository.save(companySetup);
	}
	
	public List<CompanySetup> getAll()
	{
		List<CompanySetup> findAll = this.setupRepository.findAll();
		return findAll;
	}
	
	public CompanySetup updateStatus(int id, CompanySetup companySetup)
	{
		CompanySetup company=this.setupRepository.findById(id).orElse(companySetup);
		company.setStatus(companySetup.getStatus());
	return	this.setupRepository.save(company);
	
	}
	
	public List<CompanySetup> getStatus()
	{
	return this.setupRepository.findByStatus();
	}
//	public List<CompanySetup> getOffer()
//	{
//		 List<CompanySetup> findBySetupId = this.setupRepository.findBySetupId();
//		 return findBySetupId;
//	}
}
