package com.technicaldc.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Employees{
	private List<Employee> employeeList;

	// Get the employee list (initialize if null)
	public List<Employee> getEmployeeList() {
		if (employeeList == null) {
			employeeList = new ArrayList<>();
		}
		return employeeList;
	}

	public Employee getEmployeeById(Integer id) {
		return getEmployeeList()
			.stream()
			.filter(emp -> emp.getId() == id)
			.findFirst();
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
}
