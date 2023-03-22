package com.botlie.employeeAssimilation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.botlie.employeeAssimilation.entity.SecondNav;
import com.botlie.employeeAssimilation.repository.SecondNavRepository;

@Service
public class SecondNavService {

	@Autowired
	private SecondNavRepository secondNavRepository;
	
	public SecondNav addData(SecondNav secondNav)
	{
		return this.secondNavRepository.save(secondNav);
	}
	
	public List<SecondNav> getData()
	{
		return this.secondNavRepository.findAll();
	}
}