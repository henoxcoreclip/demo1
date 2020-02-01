package com.example.demo1;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeePrint {

	@Autowired
	EmployeePrint employeePrint;

	@GetMapping("/employees")
	public Map<Integer, String> getEmployee() {

		return employeePrint.getEmployee();
	}

	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable("id") int id) {

		return employeePrint.getEmployee(id);
	}

	@GetMapping("/employees/name")
	public Employee getEmployee(@PathVariable("name") String name) {

		return employeePrint.getEmployee(name);
	}

}