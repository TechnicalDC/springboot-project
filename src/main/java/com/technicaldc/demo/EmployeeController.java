package com.technicaldc.demo;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeDAO employeeDto;

	@GetMapping("/")
	public Employees getEmployees() {
		return employeeDto.getAllEmployees();
	}

	public Employee getEmployee(@RequestParam Integer id) {
		return null;
	}

	@PostMapping("/")
	public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) {
		Integer newId = employeeDto
			.getAllEmployees()
			.getEmployeeList()
			.size() + 1;

		employee.setId(newId);
		employeeDto.addEmployee(employee);

		URI location = ServletUriComponentsBuilder
			.fromCurrentRequest()
			.path("/{id}")
			.buildAndExpand(employee.getId())
			.toUri();

		return ResponseEntity.created(location).build();
	}
}
