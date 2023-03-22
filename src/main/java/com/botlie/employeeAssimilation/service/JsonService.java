package com.botlie.employeeAssimilation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.botlie.employeeAssimilation.entity.JsonEntity;
import com.botlie.employeeAssimilation.repository.JsonRepository;



@Service
public class JsonService {
	@Autowired
	private JsonRepository jsonRepository;
	
	//getAll
		public List<JsonEntity> getAll() {
			 List<JsonEntity> findAll =  (List<JsonEntity>)this.jsonRepository.findAll();
			return findAll;
		}
		
		//getSingle
		public Optional<JsonEntity> getSingle(Integer id) {
			return this.jsonRepository.findById(id);
		}
		
		public JsonEntity getStatus(){
			return this.jsonRepository.findByStatus();
		}

}
