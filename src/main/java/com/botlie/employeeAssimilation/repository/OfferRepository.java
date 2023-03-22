package com.botlie.employeeAssimilation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.botlie.employeeAssimilation.entity.Offer;

public interface OfferRepository extends JpaRepository<Offer, Integer>{

	@Query(value="select offer from offer o INNER JOIN company_setup c on o.setup_id=c.setup_id ",nativeQuery = true)
	public List<Offer> findBySetupId();
}
