package com.technicaldc.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeDAO employeeDAO;

	@GetMapping("/")
	public Employees getEmployees() {
		return employeeDAO.getAllEmployees();
	}
}
