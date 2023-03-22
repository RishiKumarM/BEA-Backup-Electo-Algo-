package com.botlie.employeeAssimilation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pre_Offer")
public class Pre_Offer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Pre_Id;

	private String pre;

	private int setup_id;

	public int getSetup_id() {
		return setup_id;
	}

	public void setSetup_id(int setup_id) {
		this.setup_id = setup_id;
	}

	public int getPre_Id() {
		return Pre_Id;
	}

	public void setPre_Id(int pre_Id) {
		Pre_Id = pre_Id;
	}

	public String getPre() {
		return pre;
	}

	public void setPre(String pre) {
		this.pre = pre;
	}

	public Pre_Offer(int pre_Id, String pre, int setup_id) {
		super();
		Pre_Id = pre_Id;
		this.pre = pre;
		this.setup_id = setup_id;
	}

	public Pre_Offer() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
