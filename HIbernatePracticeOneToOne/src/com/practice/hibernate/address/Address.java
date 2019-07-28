package com.practice.hibernate.address;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.practice.hibernate.employee.Employee;

@Entity
@Table(name="address")
public class Address {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String city;
	@Column(name="pin_code")
	int pincode;
//	@OneToOne(mappedBy="address",cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
//	Employee employee;       //Bi-directional OneToOne Mapping

	public int getId() {
		return id;
	}

//	public Employee getEmployee() {
//		return employee;
//	}
//
//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

//	@Override
//	public String toString() {
//		return "Address [id=" + id + ", city=" + city + ", pincode=" + pincode + "]";
//	}

//	public Employee getEmployee() {
//		return employee;
//	}
//
//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}

//	@Override
//	public String toString() {
//		return "Address [id=" + id + ", city=" + city + ", pincode=" + pincode + ", employeeId=" +employee.getEid()+", empName= "+employee.getEname()+"]";
//	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", pincode=" + pincode+"]";
	}




	

}
