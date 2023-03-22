package com.botlie.employeeAssimilation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Onboarding")
public class Onboarding {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Onboarding_Id;
	private String onboarding;
	private int setup_id;
	public int getOnboarding_Id() {
		return Onboarding_Id;
	}
	public void setOnboarding_Id(int onboarding_Id) {
		Onboarding_Id = onboarding_Id;
	}
	public String getOnboarding() {
		return onboarding;
	}
	public void setOnboarding(String onboarding) {
		this.onboarding = onboarding;
	}
	public int getSetup_id() {
		return setup_id;
	}

	public void setSetup_id(int setup_id) {
		this.setup_id = setup_id;
	}
	public Onboarding(int onboarding_Id, String onboarding, int setup_id) {
		super();
		Onboarding_Id = onboarding_Id;
		this.onboarding = onboarding;
		this.setup_id = setup_id;
	}
	public Onboarding() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
