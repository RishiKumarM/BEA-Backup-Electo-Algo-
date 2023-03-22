package com.botlie.employeeAssimilation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.botlie.employeeAssimilation.entity.ClientEntity;


public interface ClientRepository extends JpaRepository<ClientEntity, Integer>{

	@Query(value="select * from client_entity where status=1",nativeQuery = true)
	public List<ClientEntity> findByStatus();
}
