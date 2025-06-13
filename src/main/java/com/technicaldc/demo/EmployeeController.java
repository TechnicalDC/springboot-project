package com.technicaldc.demo;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeDAO employeeDAO;

	@GetMapping("/")
	public Employees getEmployees() {
		return employeeDAO.getAllEmployees();
	}

	@PostMapping("/")
	public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) {
		Integer newId = employeeDAO
			.getAllEmployees()
			.getEmployeeList()
			.size() + 1;

		employee.setId(newId);
		employeeDAO.addEmployee(employee);

		URI location = ServletUriComponentsBuilder
			.fromCurrentRequest()
			.path("/{id}")
			.buildAndExpand(employee.getId())
			.toUri();

		return ResponseEntity.created(location).build();
	}
}
