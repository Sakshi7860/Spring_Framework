package com.project.spring.springcoreadvanced.autowiringbyConstructor;

public class Address {
	String city;
	int hno;
	String pincode;
	public void setCity(String city) {
		this.city = city;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", hno=" + hno + ", pincode=" + pincode + "]";
	}
	

}
