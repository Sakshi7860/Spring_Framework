package com.practice.hibernate.employee.dao;

import java.util.List;

import com.practice.hibernate.employee.Employee;

public interface EmployeeDao {
	Employee getDetail(int eid);
	List<Employee> getDetails();
	int insert(Employee emp);
	void update(int eid);
	void delete(int eid);	

}
