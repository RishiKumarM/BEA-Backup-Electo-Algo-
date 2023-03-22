package com.botlie.employeeAssimilation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gamification")
public class Gamification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="gamification_id")
	private int gamification_id;
	
	private String gamification;
	private boolean status;
	
	public int getGamification_id() {
		return gamification_id;
	}
	public void setGamification_id(int gamification_id) {
		this.gamification_id = gamification_id;
	}
	public String getGamification() {
		return gamification;
	}
	public void setGamification(String gamification) {
		this.gamification = gamification;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Gamification(int gamification_id, String gamification, boolean status) {
		super();
		this.gamification_id = gamification_id;
		this.gamification = gamification;
		this.status = status;
	}
	public Gamification() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
