package com.project.spring.springcoreadvanced.autowiringbyannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	int empno;
	String ename;
//	@Autowired
//   @Qualifier("address1")
	@Autowired
	Address address;
//	@Autowired
	
	public Employee(int empno, String ename, Address address) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.address = address;
	}

//	public void setEmpno(int empno) {
//		this.empno = empno;
//	}
//	public void setEname(String ename) {
//		this.ename = ename;
//	}
//	
//	public void setAddress(Address address) {
//		this.address = address;
//	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", address=" + address + "]";
	}
	

}
