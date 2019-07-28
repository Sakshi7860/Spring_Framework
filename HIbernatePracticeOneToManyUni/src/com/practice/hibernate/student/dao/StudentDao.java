package com.practice.hibernate.student.dao;

import java.util.List;

import com.practice.hibernate.student.Student;

public interface StudentDao {
	void insert(Student s);
	Student getDetail(int sid);
	void delete(int sid);
	List<Student> getDetails();
	void update(int sid);
}
