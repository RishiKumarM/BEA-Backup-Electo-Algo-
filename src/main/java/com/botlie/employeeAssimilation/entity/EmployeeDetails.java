package com.botlie.employeeAssimilation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "emaployee_details")
public class EmployeeDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
//	personal details
	private String title;
	@Column(name = "first_name")
	private String first_name;
	@Column(name = "middle_name")
	private String middleName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "married_status")
	private String marriedStatus;

	private String email;
	private long number;
	private String dob;
	@Column(name = "physical_challanged")
	private String physicallyChallanged;
	@Column(name = "employee_address")
	private String address;
	@Column(name = "employee_city")
	private String city;
	@Column(name = "employee_pincode")
	private int pincode;
	@Column(name = "employee_state")
	private String state;
	@Column(name = "employee_country")
	private String country;
	@Column(name = "father_name")
	private String fatherName;
	@Column(name = "father_age")

	private int fatherAge;
	@Column(name = "father_occupation")

	private String fatherOccupation;
	@Column(name = "mother_name")

	private String motherName;
	@Column(name = "mother_age")

	private int motherAge;
	private String motherOccupation;
	private String siblingName;
	private int siblingAge;
	private String chooseOption;
	private String occupation;
	private String name;
	private long contactDetails;
	private String emailId;
	private String employerName;
	private String designation;
	private String association;
	private String proficiency1;
	private String proficiency2;
	private String proficiency3;
	private String speak;
	private String study;
	private String writeData;
	private String companyName;
	private String position;
	private int startDate;
	private int endDate;
	private int numberYear;
	private String projects;
	private String degree;
	private String university;
	private int passingYear;
	private int percentage;
	private String subject;
	private String achievement;
	private String bloodGroup;
	private String allergies;
	private String surgry;
	private String medicalConditions;


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMarriedStatus() {
		return marriedStatus;
	}
	public void setMarriedStatus(String marriedStatus) {
		this.marriedStatus = marriedStatus;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPhysicallyChallanged() {
		return physicallyChallanged;
	}
	public void setPhysicallyChallanged(String physicallyChallanged) {
		this.physicallyChallanged = physicallyChallanged;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public int getFatherAge() {
		return fatherAge;
	}
	public void setFatherAge(int fatherAge) {
		this.fatherAge = fatherAge;
	}
	public String getFatherOccupation() {
		return fatherOccupation;
	}
	public void setFatherOccupation(String fatherOccupation) {
		this.fatherOccupation = fatherOccupation;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public int getMotherAge() {
		return motherAge;
	}
	public void setMotherAge(int motherAge) {
		this.motherAge = motherAge;
	}
	public String getMotherOccupation() {
		return motherOccupation;
	}
	public void setMotherOccupation(String motherOccupation) {
		this.motherOccupation = motherOccupation;
	}
	public String getSiblingName() {
		return siblingName;
	}
	public void setSiblingName(String siblingName) {
		this.siblingName = siblingName;
	}
	public int getSiblingAge() {
		return siblingAge;
	}
	public void setSiblingAge(int siblingAge) {
		this.siblingAge = siblingAge;
	}
	public String getChooseOption() {
		return chooseOption;
	}
	public void setChooseOption(String chooseOption) {
		this.chooseOption = chooseOption;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(long contactDetails) {
		this.contactDetails = contactDetails;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAssociation() {
		return association;
	}
	public void setAssociation(String association) {
		this.association = association;
	}
	public String getProficiency1() {
		return proficiency1;
	}
	public void setProficiency1(String proficiency1) {
		this.proficiency1 = proficiency1;
	}
	public String getProficiency2() {
		return proficiency2;
	}
	public void setProficiency2(String proficiency2) {
		this.proficiency2 = proficiency2;
	}
	public String getProficiency3() {
		return proficiency3;
	}
	public void setProficiency3(String proficiency3) {
		this.proficiency3 = proficiency3;
	}
	public String getSpeak() {
		return speak;
	}
	public void setSpeak(String speak) {
		this.speak = speak;
	}
	public String getStudy() {
		return study;
	}
	public void setStudy(String study) {
		this.study = study;
	}
	public String getWriteData() {
		return writeData;
	}
	public void setWriteData(String writeData) {
		this.writeData = writeData;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getStartDate() {
		return startDate;
	}
	public void setStartDate(int startDate) {
		this.startDate = startDate;
	}
	public int getEndDate() {
		return endDate;
	}
	public void setEndDate(int endDate) {
		this.endDate = endDate;
	}
	public int getNumberYear() {
		return numberYear;
	}
	public void setNumberYear(int numberYear) {
		this.numberYear = numberYear;
	}
	public String getProjects() {
		return projects;
	}
	public void setProjects(String projects) {
		this.projects = projects;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public int getPassingYear() {
		return passingYear;
	}
	public void setPassingYear(int passingYear) {
		this.passingYear = passingYear;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAchievement() {
		return achievement;
	}
	public void setAchievement(String achievement) {
		this.achievement = achievement;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getAllergies() {
		return allergies;
	}
	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}
	public String getSurgry() {
		return surgry;
	}
	public void setSurgry(String surgry) {
		this.surgry = surgry;
	}
	public String getMedicalConditions() {
		return medicalConditions;
	}
	public void setMedicalConditions(String medicalConditions) {
		this.medicalConditions = medicalConditions;
	}
	public EmployeeDetails(int id, String title, String first_name, String middleName, String lastName,
			String marriedStatus, String email, long number, String dob, String physicallyChallanged, String address,
			String city, int pincode, String state, String country, String fatherName, int fatherAge,
			String fatherOccupation, String motherName, int motherAge, String motherOccupation, String siblingName,
			int siblingAge, String chooseOption, String occupation, String name, long contactDetails, String emailId,
			String employerName, String designation, String association, String proficiency1, String proficiency2,
			String proficiency3, String speak, String study, String writeData, String companyName, String position,
			int startDate, int endDate, int numberYear, String projects, String degree, String university,
			int passingYear, int percentage, String subject, String achievement, String bloodGroup, String allergies,
			String surgry, String medicalConditions) {
		super();
		this.id = id;
		this.title = title;
		this.first_name = first_name;
		this.middleName = middleName;
		this.lastName = lastName;
		this.marriedStatus = marriedStatus;
		this.email = email;
		this.number = number;
		this.dob = dob;
		this.physicallyChallanged = physicallyChallanged;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
		this.fatherName = fatherName;
		this.fatherAge = fatherAge;
		this.fatherOccupation = fatherOccupation;
		this.motherName = motherName;
		this.motherAge = motherAge;
		this.motherOccupation = motherOccupation;
		this.siblingName = siblingName;
		this.siblingAge = siblingAge;
		this.chooseOption = chooseOption;
		this.occupation = occupation;
		this.name = name;
		this.contactDetails = contactDetails;
		this.emailId = emailId;
		this.employerName = employerName;
		this.designation = designation;
		this.association = association;
		this.proficiency1 = proficiency1;
		this.proficiency2 = proficiency2;
		this.proficiency3 = proficiency3;
		this.speak = speak;
		this.study = study;
		this.writeData = writeData;
		this.companyName = companyName;
		this.position = position;
		this.startDate = startDate;
		this.endDate = endDate;
		this.numberYear = numberYear;
		this.projects = projects;
		this.degree = degree;
		this.university = university;
		this.passingYear = passingYear;
		this.percentage = percentage;
		this.subject = subject;
		this.achievement = achievement;
		this.bloodGroup = bloodGroup;
		this.allergies = allergies;
		this.surgry = surgry;
		this.medicalConditions = medicalConditions;
	}
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
