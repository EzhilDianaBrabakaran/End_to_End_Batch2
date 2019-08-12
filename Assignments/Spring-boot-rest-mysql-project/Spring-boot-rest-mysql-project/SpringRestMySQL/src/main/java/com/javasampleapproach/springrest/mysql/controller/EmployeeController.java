package com.javasampleapproach.springrest.mysql.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.springrest.mysql.model.Employee;
import com.javasampleapproach.springrest.mysql.repo.EmployeeRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeRepository repository;

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		System.out.println("Get all Employees...");

		List<Employee> employees = new ArrayList<>();
		repository.findAll().forEach(employees::add);

		return employees;
	}

	@PostMapping(value = "/employees/create")
	public Employee postEmployee(@RequestBody Employee customer) {

		Employee _customer = repository.save(new Employee(customer.getName(), customer.getAge()));
		return _customer;
	}

	@DeleteMapping("/employees/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id) {
		System.out.println("Delete Employee with ID = " + id + "...");

		repository.deleteById(id);

		return new ResponseEntity<>("Employee has been deleted!", HttpStatus.OK);
	}

	@DeleteMapping("/employees/delete")
	public ResponseEntity<String> deleteAllEmployees() {
		System.out.println("Delete All Employees...");

		repository.deleteAll();

		return new ResponseEntity<>("All employees have been deleted!", HttpStatus.OK);
	}

	@GetMapping(value = "employees/age/{age}")
	public List<Employee> findByAge(@PathVariable int age) {

		List<Employee> employees = repository.findByAge(age);
		return employees;
	}

	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id, @RequestBody Employee employee) {
		System.out.println("Update Employee with ID = " + id + "...");

		Optional<Employee> employeeData = repository.findById(id);

		if (employeeData.isPresent()) {
			Employee _employee = employeeData.get();
			_employee.setName(employee.getName());
			_employee.setAge(employee.getAge());
			_employee.setActive(employee.isActive());
			return new ResponseEntity<>(repository.save(_employee), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
