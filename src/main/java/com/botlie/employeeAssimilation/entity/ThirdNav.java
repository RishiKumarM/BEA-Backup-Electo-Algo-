package com.botlie.employeeAssimilation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="third_nav")
public class ThirdNav {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int third_id;
	private String nav;
	
	public int getThird_id() {
		return third_id;
	}
	public void setThird_id(int third_id) {
		this.third_id = third_id;
	}
	public String getNav() {
		return nav;
	}
	public void setNav(String nav) {
		this.nav = nav;
	}
	public ThirdNav() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
