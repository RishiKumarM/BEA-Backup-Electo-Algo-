package com.botlie.employeeAssimilation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.botlie.employeeAssimilation.entity.Pre_Onboarding;
import com.botlie.employeeAssimilation.repository.PreOnbordingRepository;

@Service
public class PreonbordingService {

	
	@Autowired
	private PreOnbordingRepository preOnbordingRepository;
	
	public Pre_Onboarding addData(Pre_Onboarding preOnbording)
	{
		return this.preOnbordingRepository.save(preOnbording);
	}

	public List<Pre_Onboarding> getAll()
	{
		return this.preOnbordingRepository.findAll();
	}



}
