package com.spring.mvc.project.employee.dao;

import java.util.List;

import com.spring.mvc.project.employee.Employee;

public interface EmployeeDao {
	
	int add(Employee emp);
	List<Employee> getdetails();
	Employee getdetail(int id);
	void update(Employee emp);
}
