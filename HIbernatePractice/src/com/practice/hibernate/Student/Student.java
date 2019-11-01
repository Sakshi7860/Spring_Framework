package com.practice.hibernate.Student;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.practice.hibernate.Laptop.Laptop;

@Entity
public class Student {
	@Id
	int sid;
	String sname;
//	@OneToOne
//	Laptop laptop;
	//@OneToMany  //will create 3 tables, One for Student, second for laptop, third for Student_laptop mapping.
//	@ManyToMany(mappedBy="student")
//	List<Laptop> laptop =new ArrayList<>();
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
//public List<Laptop> getLaptop() {
//		return laptop;
//	}
//	public void setLaptop(List<Laptop> laptop) {
//		this.laptop = laptop;
//	}
	//	public Laptop getLaptop() {
//		return laptop;
//	}
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
//	@Override
//	public String toString() {
//		return "Student [sid=" + sid + ", sname=" + sname + ", laptop=" + laptop + "]";
//	}
//	
	
	
}
