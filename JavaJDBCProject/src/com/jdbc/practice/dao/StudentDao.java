package com.jdbc.practice.dao;

import java.util.List;

import com.jdbc.practice.Student;

public interface StudentDao {
	int insert(Student student);
	int update(int sid);
	int delete(int sid);
	Student get(int sid);
	List<Student> getAll();
	
	

}
