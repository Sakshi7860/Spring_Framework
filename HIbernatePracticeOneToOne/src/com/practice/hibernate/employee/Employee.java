package com.practice.hibernate.employee;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.practice.hibernate.address.Address;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	int eid;
	@Column(name="e_name")
	String ename;
	@Column(name="e_course")
	String ecourse;
	@OneToOne
//	@JoinColumn(name="address_id")
	Address address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", ecourse=" + ecourse + ", address=" + address + "]";
	}
	
	

}
