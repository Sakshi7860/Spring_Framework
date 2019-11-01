package com.practice.hibernate.Student.test;

import com.practice.hibernate.Laptop.Laptop;
import com.practice.hibernate.Student.Student;
import com.practice.hibernate.Student.dao.StudentDao;
import com.practice.hibernate.Student.dao.Impl.StudentDaoImpl;

public class Test {

	public static void main(String[] args) {
		
		StudentDao dao=new StudentDaoImpl();
		Laptop laptop=new Laptop();
		laptop.setLid(1001);
		laptop.setModel("HP");
		laptop.setPrice(10000);
		
		Student student=new Student();
		student.setSid(101);
		student.setSname("Sarb");
//		student.getLaptop().add(laptop);
//		laptop.getStudent().add(student);
		//dao.insert(student);
		//System.out.println(dao.insert(student));
		//System.out.println(dao.insert(laptop));
		System.out.println(dao.insert(student));
		
		
	}

}
