package com.botlie.employeeAssimilation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pre_Onboarding")
public class Pre_Onboarding {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String pre_Onboarding;

	private int setup_id;

	public int getSetup_id() {
		return setup_id;
	}

	public void setSetup_id(int setup_id) {
		this.setup_id = setup_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPre_Onboarding() {
		return pre_Onboarding;
	}

	public void setPre_Onboarding(String pre_Onboarding) {
		this.pre_Onboarding = pre_Onboarding;
	}

	public Pre_Onboarding(int id, String pre_Onboarding, int setup_id) {
		super();
		this.id = id;
		this.pre_Onboarding = pre_Onboarding;
		this.setup_id = setup_id;
	}

	public Pre_Onboarding() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
