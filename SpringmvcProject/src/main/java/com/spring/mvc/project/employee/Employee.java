package com.spring.mvc.project.employee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	int eid;
	String ename;
	String ecourse;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEcourse() {
		return ecourse;
	}
	public void setEcourse(String ecourse) {
		this.ecourse = ecourse;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", ecourse=" + ecourse + "]";
	}
	

}
