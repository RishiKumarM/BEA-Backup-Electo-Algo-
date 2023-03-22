package com.botlie.employeeAssimilation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.botlie.employeeAssimilation.entity.FirstNav;
import com.botlie.employeeAssimilation.repository.FirstNavRepository;

@Service
public class FirstNavService {

	@Autowired
	private FirstNavRepository firstNavRepository;
	
	public FirstNav addData(FirstNav firstNav)
	{
		return this.firstNavRepository.save(firstNav);
	}
	
	public List<FirstNav> getData()
	{
		return this.firstNavRepository.findAll();
	}
}
