package com.practice.hibernate.student.dao.Impl;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernate.course.Course;
import com.practice.hibernate.student.Student;
import com.practice.hibernate.student.dao.StudentDao;

//In this mapping a student can have multiple courses and multiple courses can be allocated to a student. So in course side also, we have many to one relationship.
public class StudentDaoImpl implements StudentDao {
	SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Course.class).buildSessionFactory();

	@Override
	public void insert(Student s) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		session.close();
	}
	@Override
	public void insert(Course c) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Student getDetail(int sid) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		Student s=session.get(Student.class, sid);
		return s;
	}
	
	@Override
	public void delete(int sid) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		Student c=session.get(Student.class, sid);
		session.delete(c);
		session.getTransaction().commit();
		session.close();
	}


}
