package com.botlie.employeeAssimilation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.botlie.employeeAssimilation.entity.EmployeeDetails;
import com.botlie.employeeAssimilation.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public EmployeeDetails saveData(EmployeeDetails employeeDetails)
	{
		return this.employeeRepository.save(employeeDetails);
	}
	
	public EmployeeDetails updateData(int id,EmployeeDetails employeeDetails)
	{
		EmployeeDetails findById = this.employeeRepository.findById(id).orElse(employeeDetails);
		findById.setAchievement(employeeDetails.getAchievement());
		findById.setAddress(employeeDetails.getAddress());
		findById.setAllergies(employeeDetails.getAllergies());
		findById.setAssociation(employeeDetails.getAssociation());
		findById.setBloodGroup(employeeDetails.getBloodGroup());
		findById.setChooseOption(employeeDetails.getChooseOption());
		findById.setCity(employeeDetails.getCity());
		findById.setCompanyName(employeeDetails.getCompanyName());
		findById.setContactDetails(employeeDetails.getContactDetails());
		findById.setCountry(employeeDetails.getCountry());
		findById.setDegree(employeeDetails.getDegree());
		findById.setDesignation(employeeDetails.getDesignation());
		findById.setDob(employeeDetails.getDob());
		findById.setEmail(employeeDetails.getEmail());
		findById.setEmployerName(employeeDetails.getEmployerName());
		findById.setEndDate(employeeDetails.getEndDate());
		findById.setFatherAge(employeeDetails.getFatherAge());
		findById.setFatherName(employeeDetails.getFatherName());
		findById.setFatherOccupation(employeeDetails.getFatherOccupation());
		findById.setFirst_name(employeeDetails.getFirst_name());
		findById.setLastName(employeeDetails.getLastName());
		findById.setMarriedStatus(employeeDetails.getMarriedStatus());
		findById.setMedicalConditions(employeeDetails.getMedicalConditions());
		findById.setMiddleName(employeeDetails.getMiddleName());
		findById.setMotherAge(employeeDetails.getMotherAge());
		findById.setMotherName(employeeDetails.getMotherName());
		findById.setMotherOccupation(employeeDetails.getMotherOccupation());
		findById.setName(employeeDetails.getName());
		findById.setNumber(employeeDetails.getNumber());
		findById.setNumberYear(employeeDetails.getNumberYear());
		findById.setOccupation(employeeDetails.getOccupation());
		findById.setPassingYear(employeeDetails.getPassingYear());
		findById.setPercentage(employeeDetails.getPercentage());
		findById.setPhysicallyChallanged(employeeDetails.getPhysicallyChallanged());
		findById.setPincode(employeeDetails.getPincode());
		findById.setPosition(employeeDetails.getPosition());
		findById.setProficiency1(employeeDetails.getProficiency1());
		findById.setProficiency2(employeeDetails.getProficiency2());
		findById.setProficiency3(employeeDetails.getProficiency3());
		findById.setProjects(employeeDetails.getProjects());
		findById.setSiblingAge(employeeDetails.getSiblingAge());
		findById.setSiblingName(employeeDetails.getSiblingName());
		findById.setSpeak(employeeDetails.getSpeak());
		findById.setStartDate(employeeDetails.getStartDate());
		findById.setState(employeeDetails.getState());
		findById.setStudy(employeeDetails.getStudy());
		findById.setSubject(employeeDetails.getSubject());
		findById.setSurgry(employeeDetails.getSurgry());
		findById.setTitle(employeeDetails.getTitle());
		findById.setUniversity(employeeDetails.getUniversity());
		findById.setWriteData(employeeDetails.getWriteData());
		
		return this.employeeRepository.save(findById);
	}
	
	public List<EmployeeDetails> getDataAll()
	{
		List<EmployeeDetails> findAll = this.employeeRepository.findAll();
		return findAll;
	}
	
}
