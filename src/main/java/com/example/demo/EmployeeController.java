package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employee/{id}")
	public Employee getEmployeeId(@PathVariable int id) {
		return employeeService.findEmployeeById(id);
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee() {
		return employeeService.findAllEmployees();
	}
}
