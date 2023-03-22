package com.botlie.employeeAssimilation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="first_nav")
public class FirstNav {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int first_id;
	private String nav;
	
	
	public int getFirst_id() {
		return first_id;
	}
	public void setFirst_id(int first_id) {
		this.first_id = first_id;
	}
	public String getNav() {
		return nav;
	}
	public void setNav(String nav) {
		this.nav = nav;
	}	
	
}