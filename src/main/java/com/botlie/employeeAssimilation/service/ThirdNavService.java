package com.botlie.employeeAssimilation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.botlie.employeeAssimilation.entity.ThirdNav;
import com.botlie.employeeAssimilation.repository.ThirdNavRepository;

@Service
public class ThirdNavService {

	@Autowired
	private ThirdNavRepository thirdNavRepository;

	public ThirdNav addData(ThirdNav thirdNav) {
		return this.thirdNavRepository.save(thirdNav);
	}

	public List<ThirdNav> getData() {
		return this.thirdNavRepository.findAll();
	}
}