package com.botlie.employeeAssimilation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.botlie.employeeAssimilation.entity.Gamification;
import com.botlie.employeeAssimilation.repository.GamificationRepository;

@Service
public class GamificationService {

	@Autowired
	private GamificationRepository gamificationRepository;
	
	public Gamification addData(Gamification gamification)
	{
		return this.gamificationRepository.save(gamification);
	}
	
	public List<Gamification> getAll()
	{
		List<Gamification> findAll = this.gamificationRepository.findAll();
		return findAll;
	}
	public Gamification updateStatus(int id, Gamification gamification)
	{
		Gamification gamification2=this.gamificationRepository.findById(id).orElse(gamification);
		gamification2.setStatus(gamification.getStatus());
		return this.gamificationRepository.save(gamification2);
	
	}
	
	public List<Gamification> getStatus()
	{
		return this.gamificationRepository.findByStatus();
	}
}
