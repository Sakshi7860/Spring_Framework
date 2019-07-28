package com.practice.hibernate.Laptop;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.practice.hibernate.Student.Student;

@Entity
public class Laptop {
	@Id
	int lid;
	String model;
	int price;
//	@ManyToOne
//	Student student;
	@ManyToMany
	List<Student> student=new ArrayList<>();
//	public Student getStudent() {
//		return student;
//	}
//	public void setStudent(Student student) {
//		this.student = student;
//	}
	public int getLid() {
		return lid;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", model=" + model + ", price=" + price + "]";
	}
	

}
