package com.example.demo1;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class EmployeeList {
	Map<Integer, String> employee = new HashMap<Integer, String>() {
		{
			put(1, "Thierry");
			put(2, "Sebastien");
			put(3, "Elfyn");
			put(4, "Kris");
			put(5, "Lappi");
			put(6, "Daniel");
		}
	};

	public Map<Integer, String> getEmployee() {
		return employee;
	}

	public Employee getEmployee(int id) {
		return (Employee) employee.entrySet().stream().filter(i -> i.getKey() == id).findFirst().get();
	}

	public Employee getEmployee(String name) {
		return (Employee) employee.entrySet().stream().filter(i -> i.getValue() == name).findFirst().get();
	}

}
