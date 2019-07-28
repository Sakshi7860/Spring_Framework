package com.practice.hibernate.employee.dao.Impl;


import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernate.address.Address;
import com.practice.hibernate.employee.Employee;
import com.practice.hibernate.employee.dao.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao {
	SessionFactory sessionFactory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(Address.class).buildSessionFactory();

	@Override
	public Employee getDetail(int eid) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		Employee emp=session.get(Employee.class, eid);
		
		//Giving the ClassCastException :java.lang.ClassCastException: java.util.ArrayList cannot be cast to com.practice.hibernate.employee.Employee
		//Employee emp=(Employee) session.createQuery("from Employee where eid="+eid).list();  
		return emp;
	}

	@Override
	public List<Employee> getDetails() {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		//List<Employee> emp=session.createQuery("from Employee ").getResultList();
		SQLQuery<Employee> q=session.createSQLQuery("select * form employee");
		List<Employee> list=q.list();
		
		
		return list;
		
	}
	
	@Override
	public List<Address> getDetails1() {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		List<Address> add=session.createQuery("from Address ").getResultList();
		
		return add;
		
	}

	@Override
	public int insert(Employee emp) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		int res=(int) session.save(emp);
		session.getTransaction().commit();
		return res;
	}

	@Override
	public void update(int eid) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		Employee emp=session.get(Employee.class, eid);
		emp.setEname("ashu");
		emp.getAddress().setCity("Mumbai");
		session.getTransaction().commit();
		
	}

	@Override
	public void update1(int aid) {
//		Session session=sessionFactory.getCurrentSession();
//		session.beginTransaction();
//		Address add=session.get(Address.class, aid);
//		add.setCity("Dubai");
//		add.getEmployee().setEcourse("M.Com");
//		session.getTransaction().commit();
		
	}

	@Override
	public void delete(int eid) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		Employee emp=session.get(Employee.class,eid);
		session.delete(emp);
		session.getTransaction().commit();
		
}

	@Override
	public int insert(Address add) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		int res=(int) session.save(add);
		session.getTransaction().commit();
		session.close();
		return res;
		
	}
	@Override
	public void delete1(int aid) {
//		Session session=sessionFactory.getCurrentSession();
//		session.beginTransaction();
//		Address add=session.get(Address.class,aid);
//		//System.out.println(add);
//		//add.getEmployee().setAddress(null);
//		add.getEmployee().setAddress(null);
//		session.delete(add);
//		session.getTransaction().commit();		
}

	@Override
	public Address getDetail1(int aid) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		Address add=session.get(Address.class, aid);
		
		return add;
		
	}

	
	
	

}
