package com.practice.hibernate.student.dao;

import com.practice.hibernate.course.Course;
import com.practice.hibernate.student.Student;

public interface StudentDao {
	void insert(Student s);
	void insert(Course c);
	Student getDetail(int sid);
	void delete(int sid);

}
