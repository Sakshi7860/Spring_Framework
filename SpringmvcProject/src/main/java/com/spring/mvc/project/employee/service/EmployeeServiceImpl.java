package com.spring.mvc.project.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.mvc.project.employee.Employee;
import com.spring.mvc.project.employee.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;

	@Transactional
	@Override
	public int create(Employee emp) {
		 return employeeDao.add(emp);
		
	}

	@Override
	@Transactional
	public List<Employee> getDetails() {
		return employeeDao.getdetails();
	}

	@Override
	public Employee getdetail(int id) {
		// TODO Auto-generated method stub
		return employeeDao.getdetail(id);
	}
	
	@Transactional
	@Override
	public void update(Employee emp) {
		 employeeDao.update(emp);
		
	}

}
