package com.practice.hibernate.employee.test;

import java.util.List;

import com.practice.hibernate.address.Address;
import com.practice.hibernate.employee.Employee;
import com.practice.hibernate.employee.dao.EmployeeDao;
import com.practice.hibernate.employee.dao.Impl.EmployeeDaoImpl;

public class Test {

	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDaoImpl();
		Address add=new Address();
		add.setCity("UK");
		add.setId(205);
		add.setPincode(2123);
		Employee emp=new Employee();
		emp.setEcourse("MCA");
		emp.setEname("Dev");
		emp.setAddress(add);
		System.out.println(dao.insert(add));
		System.out.println(dao.insert(emp));
		//System.out.println(dao.getDetail1(204));
		//System.out.println(dao.getDetails1());
		//add.getEmployee().setAddress(add);
		//dao.delete1(205);
		//dao.insert(emp);
		//dao.update1(205);
		//dao.insert(add);
		//dao.delete1(301);
		//dao.delete(9);
		//System.out.println(dao.getDetail(3));
		//dao.update(9);
		//System.out.println(dao.getDetail(8));
		
		
	}
}

