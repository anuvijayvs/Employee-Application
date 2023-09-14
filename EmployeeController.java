package com.src.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.src.employee.model.Employee;
import com.src.employee.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
        @Autowired
        EmployeeService empService;

        @RequestMapping(value="/createEmployee", method=RequestMethod.POST)
        public Employee createEmployee(@RequestBody Employee emp) {
            return empService.createEmployee(emp);
        }
        
        @RequestMapping(value="/findAllEmployees", method=RequestMethod.GET)
        public List<Employee> findAllEmployees() {
            return empService.getEmployees();
        }

        @RequestMapping(value="/updateEmployee/{empId}", method=RequestMethod.PUT)
        public Employee updateEmployee(@PathVariable(value = "empId") Long id, @RequestBody Employee empDetails) {
            return empService.updateEmployee(id, empDetails);
        }

        @RequestMapping(value="/deleteEmployee/{empId}", method=RequestMethod.DELETE)
        public void deleteEmployees(@PathVariable(value = "empId") Long id) {
            empService.deleteEmployee(id);
        }
}