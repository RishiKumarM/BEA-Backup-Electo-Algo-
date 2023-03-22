package com.botlie.employeeAssimilation.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="company_setup")
public class CompanySetup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="setup_id")
	private int setup_id;
	
	@Column(name="setup")
	private String setup;
	
	private boolean status;

	public int getSetup_id() {
		return setup_id;
	}

	public void setSetup_id(int setup_id) {
		this.setup_id = setup_id;
	}

	public String getSetup() {
		return setup;
	}

	public void setSetup(String setup) {
		this.setup = setup;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public CompanySetup(int setup_id, String setup, boolean status) {
		super();
		this.setup_id = setup_id;
		this.setup = setup;
		this.status = status;
	}

	public CompanySetup() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
