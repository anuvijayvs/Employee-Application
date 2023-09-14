package com.src.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.src.employee.model.Employee;
import com.src.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository empRepository;

	public Employee createEmployee(Employee emp) {
		return empRepository.save(emp);
	}

	public List<Employee> getEmployees() {
		return empRepository.findAll();
	}

	public void deleteEmployee(Long empId) {
		empRepository.deleteById(empId);
	}

	public Employee updateEmployee(Long empId, Employee employeeDetails) {
		Employee emp = empRepository.findById(empId).get();
		emp.setName(employeeDetails.getName());
		emp.setGender(employeeDetails.getGender());
		emp.setContact(employeeDetails.getContact());

		return empRepository.save(emp);
	}
}