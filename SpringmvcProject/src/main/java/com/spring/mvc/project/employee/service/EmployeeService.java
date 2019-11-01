package com.spring.mvc.project.employee.service;

import java.util.List;

import com.spring.mvc.project.employee.Employee;

public interface EmployeeService {
	int create(Employee emp);
	List<Employee> getDetails();
	Employee getdetail(int id);
	void update(Employee emp);

}
