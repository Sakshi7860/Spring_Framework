package com.practice.hibernate.student.test;

import java.util.ArrayList;
import java.util.List;
import com.practice.hibernate.course.Course;
import com.practice.hibernate.student.Student;
import com.practice.hibernate.student.dao.StudentDao;
import com.practice.hibernate.student.dao.Impl.StudentDaoImpl;

public class Test {
	public static void main(String[] args) {
		StudentDao dao=new StudentDaoImpl();
//	System.out.println(dao.getDetail(17));
	Student student=new Student();
		student.setRoll_no(2004);
		student.setSname("neha");
		Course course=new Course();
		course.setCname("B.ED");
		Course course2=new Course();
		course2.setCname("M.ED");
		List<Course> list=new ArrayList<>();
		list.add(course);
		list.add(course2);
		
		student.setCourses(list);
		course.setStudent(student);
		course2.setStudent(student);
//		dao.insert(student);
//		dao.insert(course);
//		dao.insert(course2);
		dao.delete(21);  //If you try to delete the id for student which is parent class, then it would give error as a foreign key constraint fails, 
						//So first need to delete it from child table. Thats why we use delete for child table.
	}
}
