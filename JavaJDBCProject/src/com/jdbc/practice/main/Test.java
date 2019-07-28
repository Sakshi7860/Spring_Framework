package com.jdbc.practice.main;

import java.util.List;

import com.jdbc.practice.Student;
import com.jdbc.practice.dao.StudentDao;
import com.project.practice.dao.impl.StudentDaoImpl;

public class Test {

	public static void main(String[] args) {
		StudentDao dao=new StudentDaoImpl();
		Student student=new Student();
		student.setSid(103);
		int sid=student.getSid();
		List<Student> list=dao.getAll();
		System.out.println(list);
//		Student student2=dao.get(sid);
//		System.out.println(student2);
		//int result=dao.insert(student);
		//int result=dao.update(103);
		//int result=dao.delete(105);
		
//		if(result>0)
//			System.out.println("deleted Successfully");
//		else
//		{
//			System.out.println("already deleted");
//		}
		
		

	}

}
