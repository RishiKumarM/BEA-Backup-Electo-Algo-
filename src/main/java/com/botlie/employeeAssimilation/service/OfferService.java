package com.botlie.employeeAssimilation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.botlie.employeeAssimilation.entity.Offer;
import com.botlie.employeeAssimilation.repository.OfferRepository;

@Service
public class OfferService {

	@Autowired
	private OfferRepository offerRepository;

	public Offer addData(Offer offer) {
		return this.offerRepository.save(offer);
	}

	public List<Offer> getAll() {
		List<Offer> findAll = this.offerRepository.findAll();
		return findAll;
	}
	
	public List<Offer> getOffer()
	{
		 List<Offer> findBySetupId = this.offerRepository.findBySetupId();
		 return findBySetupId;
	}

}
