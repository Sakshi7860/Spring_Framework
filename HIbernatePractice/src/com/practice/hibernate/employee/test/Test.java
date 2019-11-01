package com.practice.hibernate.employee.test;

import com.practice.hibernate.employee.Employee;
import com.practice.hibernate.employee.dao.EmployeeDao;
import com.practice.hibernate.employee.dao.Impl.EmployeeDaoImpl;

public class Test {

	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDaoImpl();
	Employee emp=new Employee();
		emp.setEid(104);
		emp.setEname("sakshi");
    	emp.setEcourse("BCA");
    	//System.out.println(dao.insert(emp));
    	System.out.println(dao.getDetail(102));
//    	System.out.println(dao.getDetails());
    	//dao.delete(emp.getEid());
    	//dao.update(emp.getEid());
		//int res=dao.insert(emp);
	 // Employee employee=dao.getDetail(102);
		//Employee employee=dao.getDetail(emp.getEid());
    	
		//System.out.println(employee);
//		if(res>0)
//			System.out.println("Inserted Successfully");
		
		

	}

}
