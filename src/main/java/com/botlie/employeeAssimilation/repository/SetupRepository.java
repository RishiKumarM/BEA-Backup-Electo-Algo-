package com.botlie.employeeAssimilation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.botlie.employeeAssimilation.entity.CompanySetup;
import com.botlie.employeeAssimilation.entity.Offer;

public interface SetupRepository extends JpaRepository<CompanySetup, Integer>{
	@Query(value="select * from company_setup where status=1",nativeQuery = true)
	public List<CompanySetup> findByStatus();
	
	
//	@Query(value="select offer from offer o INNER JOIN company_setup c on o.setup_id=c.setup_id",nativeQuery = true)
//	public List<CompanySetup> findBySetupId();

}
