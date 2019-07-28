package com.project.spring.springcoreadvanced.springjdbctemplate;

import java.util.List;

public interface EmployeeDao {
	int insert(Employee employee);
	int update(int empId);
	int delete(int empId);
	Employee getEmployee(int empId);
	List<Employee> getEmployeeDetails();
}
