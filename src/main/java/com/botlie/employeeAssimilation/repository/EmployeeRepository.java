package com.botlie.employeeAssimilation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.botlie.employeeAssimilation.entity.EmployeeDetails;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDetails,Integer>{

}
