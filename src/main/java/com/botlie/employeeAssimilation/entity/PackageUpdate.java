package com.botlie.employeeAssimilation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Client_Package_Table")
public class PackageUpdate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int adminId;
	private String generateTime;
	private String selectedAmount;	
	private String selectedPlan;
	private String businessEmail;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getGenerateTime() {
		return generateTime;
	}
	public void setGenerateTime(String generateTime) {
		this.generateTime = generateTime;
	}
	public String getSelectedAmount() {
		return selectedAmount;
	}
	public void setSelectedAmount(String selectedAmount) {
		this.selectedAmount = selectedAmount;
	}
	public String getSelectedPlan() {
		return selectedPlan;
	}
	public void setSelectedPlan(String selectedPlan) {
		this.selectedPlan = selectedPlan;
	}
	public String getBusinessEmail() {
		return businessEmail;
	}
	public void setBusinessEmail(String businessEmail) {
		this.businessEmail = businessEmail;
	}
	public PackageUpdate(int id, int adminId, String generateTime, String selectedAmount, String selectedPlan,
			String businessEmail) {
		super();
		this.id = id;
		this.adminId = adminId;
		this.generateTime = generateTime;
		this.selectedAmount = selectedAmount;
		this.selectedPlan = selectedPlan;
		this.businessEmail = businessEmail;
	}
	public PackageUpdate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
