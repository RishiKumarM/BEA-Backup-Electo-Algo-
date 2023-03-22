package com.botlie.employeeAssimilation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.botlie.employeeAssimilation.entity.Onboarding;
import com.botlie.employeeAssimilation.repository.OnboardingRepository;


@Service
public class OnboardingService {

	@Autowired
	private OnboardingRepository onboardingRepository;
	
	public Onboarding addData(Onboarding Onbording)
	{
		return this.onboardingRepository.save(Onbording);
	}

	public List<Onboarding> getAll()
	{
		return this.onboardingRepository.findAll();
	}
}
