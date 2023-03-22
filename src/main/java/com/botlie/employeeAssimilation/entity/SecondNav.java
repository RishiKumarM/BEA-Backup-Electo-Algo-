package com.botlie.employeeAssimilation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="second_nav")
public class SecondNav {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int second_id;
	private String nav;
	public int getSecond_id() {
		return second_id;
	}
	public void setSecond_id(int second_id) {
		this.second_id = second_id;
	}
	public String getNav() {
		return nav;
	}
	public void setNav(String nav) {
		this.nav = nav;
	}
	public SecondNav() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SecondNav(int second_id, String nav) {
		super();
		this.second_id = second_id;
		this.nav = nav;
	}
	
	
	
}
