package com.practice.hibernate.employee.dao;

import java.util.List;

import com.practice.hibernate.address.Address;
import com.practice.hibernate.employee.Employee;

public interface EmployeeDao {
	Employee getDetail(int eid);
	Address getDetail1(int aid);
	List<Employee> getDetails();
	List<Address> getDetails1();
	int insert(Employee emp);
	int insert(Address add);
	void update(int eid);
	void update1(int aid);
	void delete(int eid);	
	void delete1(int aid);	
		

}
