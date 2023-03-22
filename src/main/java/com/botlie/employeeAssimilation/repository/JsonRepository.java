package com.botlie.employeeAssimilation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.botlie.employeeAssimilation.entity.JsonEntity;

public interface JsonRepository extends JpaRepository<JsonEntity, Integer>{
 
	@Query(value = "select * from employeeassimilation.json_entity ORDER BY id DESC LIMIT 1;",nativeQuery = true)
	public JsonEntity findByStatus();	
}
