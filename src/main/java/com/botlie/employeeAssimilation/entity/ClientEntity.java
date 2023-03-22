package com.botlie.employeeAssimilation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "client_entity")
public class ClientEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="clint_id")
	private int clint_id;
	
	private String Pre_onboarding;
	private boolean status;
	
	public int getClint_id() {
		return clint_id;
	}
	public void setClint_id(int clint_id) {
		this.clint_id = clint_id;
	}
	public String getPre_onboarding() {
		return Pre_onboarding;
	}
	public void setPre_onboarding(String pre_onboarding) {
		Pre_onboarding = pre_onboarding;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public ClientEntity(int clint_id, String pre_onboarding, boolean status) {
		super();
		this.clint_id = clint_id;
		Pre_onboarding = pre_onboarding;
		this.status = status;
	}
	public ClientEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
