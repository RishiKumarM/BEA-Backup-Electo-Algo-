package com.botlie.employeeAssimilation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.botlie.employeeAssimilation.entity.Admin_client;

public interface Admin_Client_Repository extends JpaRepository<Admin_client, Integer>{

	@Query(value="select * from client_admin where status=1",nativeQuery = true)
	public List<Admin_client> findByStatus();
	
}
