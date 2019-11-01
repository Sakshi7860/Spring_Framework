package com.spring.mvc.project.employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.mvc.project.employee.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	public int add(Employee emp) {
		return (int) hibernateTemplate.save(emp);
		
	}

	@Override
	public List<Employee> getdetails() {
		return hibernateTemplate.loadAll(Employee.class);
	}
	
	@Override
	public Employee getdetail(int id) {
		return hibernateTemplate.get(Employee.class, id);
	}

	@Override
	public void update(Employee emp) {
		hibernateTemplate.update(emp);
		
	}

	
}
