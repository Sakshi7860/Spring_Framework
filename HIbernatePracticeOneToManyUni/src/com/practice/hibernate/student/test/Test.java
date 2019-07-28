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
		Student s=new Student();
		s.setSname("Asha");
		s.setRoll_no(1002);
		Course course=new Course();
		course.setCname("BCA");
		Course course1=new Course();
		course1.setCname("Mtech");
		List<Course> list=new ArrayList<>();
		list.add(course);
		s.setCourses(list);
		//dao.insert(s);
		//System.out.println(dao.getDetails());
		//dao.delete(11);
		dao.update(17);
		

	}

}
