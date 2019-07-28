package com.project.spring.springcoreadvanced.autowiringbyConstructor;
public class Employee {
	int empno;
	String ename;
	Address address;
	public Employee(int empno, String ename, Address address) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", address=" + address + "]";
	}
	
}
