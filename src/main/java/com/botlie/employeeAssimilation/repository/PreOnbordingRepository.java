package com.botlie.employeeAssimilation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.botlie.employeeAssimilation.entity.Pre_Onboarding;



public interface PreOnbordingRepository extends JpaRepository<Pre_Onboarding,Integer>{
//
//	@Query(value="select * from preonbording where status=1",nativeQuery = true)
//	public List<Onbording> findByStatus();

	
}
