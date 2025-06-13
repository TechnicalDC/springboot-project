package com.technicaldc.demo;

import java.util.Date;

public class Employee{
	private Integer id;
	private String  fullName;
	private String  email;

	public Employee() {
	}

	public Employee(Integer id, String fullName, String email ) {
		this.id = id;
		this.fullName = fullName;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + fullName + ", email=" + email + "]";
	}
}
