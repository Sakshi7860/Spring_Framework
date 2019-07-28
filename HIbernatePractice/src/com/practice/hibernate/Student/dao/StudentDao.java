package com.practice.hibernate.Student.dao;

import com.practice.hibernate.Laptop.Laptop;
import com.practice.hibernate.Student.Student;

public interface StudentDao {
	
	int insert(Student student);
	int insert(Laptop laptop);
	Student get(int id);

}
