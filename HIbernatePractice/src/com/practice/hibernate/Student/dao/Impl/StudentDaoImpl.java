package com.practice.hibernate.Student.dao.Impl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.practice.hibernate.Laptop.Laptop;
import com.practice.hibernate.Student.Student;
import com.practice.hibernate.Student.dao.StudentDao;

public class StudentDaoImpl implements StudentDao {
	SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class).buildSessionFactory();

	@Override
	public int insert(Student student) {
		Session session=factory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		int res=(int)session.save(student);  //persist wont return anything but save return id of the column
		//session.saveOrUpdate(student);   // It wont give the exception if primary key coulmn already exist and tryig to insert the entry with same id. It will simply update the database.
		//Student res=(Student) session.merge(student); //It return the object which get updated
		//session.update(student);//It will update the data without any return type.
		//session.delete(student); //It will delete the object from db
		//Student s=session.get(Student.class,102);  //fetch the data corresponding to 102 id
		//Student s= session.load(Student.class, 101);  //also same as get but
		//System.out.println(s); //will fetch only when ref get used.i.e s which we get in above step
		tx.commit(); 
		session.close();
		
		return res;
	}

	@Override
	public int insert(Laptop laptop) {
		Session session=factory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		int res=(int)session.save(laptop); 
		tx.commit();
		session.close();
		return res;
	}

	@Override
	public Student get(int id) {
		Session session=factory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Student s=session.get(Student.class, id);
		tx.commit();
		session.close();
		return s;
	}

}
