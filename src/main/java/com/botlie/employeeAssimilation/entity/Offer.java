package com.botlie.employeeAssimilation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Offer")
public class Offer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "offer_id")
	private int offer_id;
	private int setup_id;
	private String offer;
	
	public int getOffer_id() {
		return offer_id;
	}

	public void setOffer_id(int offer_id) {
		this.offer_id = offer_id;
	}

	public int getSetup_id() {
		return setup_id;
	}

	public void setSetup_id(int setup_id) {
		this.setup_id = setup_id;
	}


	public String getOffer() {
		return offer;
	}

	public void setOffer(String offer) {
		this.offer = offer;
	}

	public Offer(int offer_id, int setup_id, String offer) {
		super();
		this.offer_id = offer_id;
		this.setup_id = setup_id;
		this.offer = offer;
	}

	public Offer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

