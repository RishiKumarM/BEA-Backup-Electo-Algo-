package com.botlie.employeeAssimilation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.botlie.employeeAssimilation.entity.Pre_Offer;
import com.botlie.employeeAssimilation.repository.Pre_OfferRepository;


@Service
public class Pre_OfferService {


	@Autowired
	private  Pre_OfferRepository   pre_OfferRepository;
	
	public Pre_Offer addData(Pre_Offer pre_Offer)
	{
		return this.pre_OfferRepository.save(pre_Offer);
	}
	
	public List<Pre_Offer> getAll()
	{
		List<Pre_Offer> findAll = this.pre_OfferRepository.findAll();
		return findAll;
	}
	
//	public Pre_Offer updateStatus(int id, Pre_Offer pre_Offer)
//	{
//		Pre_Offer pre_Offer1=this.pre_OfferRepository.findById(id).orElse(pre_Offer);
//		pre_Offer1.setStatus(pre_Offer.getStatus());
//	return	this.setupRepository.save(company);
//	
//	}
	
//	public List<CompanySetup> getStatus()
//	{
//	return this.setupRepository.findByStatus();
//	}
}
