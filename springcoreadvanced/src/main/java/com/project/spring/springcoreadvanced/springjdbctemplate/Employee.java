package com.project.spring.springcoreadvanced.springjdbctemplate;

public class Employee {
	int eno;
	String ename;
	String ecity;

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEcity() {
		return ecity;
	}

	public void setEcity(String ecity) {
		this.ecity = ecity;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", ecity=" + ecity + "]";
	}

}
