package com.practice.hibernate.student.dao.Impl;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernate.course.Course;
import com.practice.hibernate.student.Student;
import com.practice.hibernate.student.dao.StudentDao;

//Here, in one to many relationship- one student can have multiple courses but one course can be allocated to one student only.

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
	public Student getDetail(int sid) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		Student s=session.get(Student.class, sid);
		
		return s;
	}
	
	@Override
	public List<Student> getDetails() {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		List<Student> list=session.createQuery("from Student").getResultList();
		
		return list;
	}
	
	@Override
	public void delete(int sid) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		Student s=session.get(Student.class, sid);
		session.delete(s);
		session.getTransaction().commit();
		session.close();
		
		
	}

	@Override
	public void update(int sid) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		Student st=session.get(Student.class, sid);
		st.setRoll_no(1003);
		List<Course> list=st.getCourses();
		list.get(0).setCname("MCA");
		session.update(st);
		session.getTransaction().commit();
		session.close();
		}

}
