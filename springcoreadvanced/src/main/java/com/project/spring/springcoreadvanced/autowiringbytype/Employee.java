package com.project.spring.springcoreadvanced.autowiringbytype;
public class Employee {
	int empno;
	String ename;
	Address address;
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", address=" + address + "]";
	}
	
	

}
