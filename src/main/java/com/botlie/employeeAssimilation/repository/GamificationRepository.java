package com.botlie.employeeAssimilation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.botlie.employeeAssimilation.entity.Gamification;

public interface GamificationRepository extends JpaRepository<Gamification,Integer>{

	@Query(value="select * from gamification where status=1",nativeQuery = true)
	public List<Gamification> findByStatus();
}
