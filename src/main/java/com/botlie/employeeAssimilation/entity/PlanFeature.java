package com.botlie.employeeAssimilation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "plan_feature")
public class PlanFeature {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;
	
	
	private String Options;


	public PlanFeature(int id, String options) {
		super();
		this.id = id;
		Options = options;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getOptions() {
		return Options;
	}


	public void setOptions(String options) {
		Options = options;
	}


	public PlanFeature() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	@Column(name = "Yearly")
//	private String yearlyOptions;
//	
//	@Column(name = "Others")
//	private String othersOptions;
	
	
}
