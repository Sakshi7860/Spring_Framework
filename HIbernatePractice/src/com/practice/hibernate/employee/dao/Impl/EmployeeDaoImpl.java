package com.practice.hibernate.employee.dao.Impl;


import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.practice.hibernate.employee.Employee;
import com.practice.hibernate.employee.dao.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao {
	SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

	@Override
	public Employee getDetail(int eid) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
	   Employee emp=session.get(Employee.class, eid);
	   	Employee emp1=session.get(Employee.class, eid);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		Employee e=session.load(Employee.class, eid);
//		Employee e1=session.load(Employee.class, eid);session.load(Employee.class, eid);session.load(Employee.class, eid);session.load(Employee.class, eid);
		System.out.println(e);
//		System.out.println(e1);
		session.getTransaction().commit();
		return emp;
		
	}

	@Override	
	public int insert(Employee emp) {
		int res=0;
		Session session= sessionFactory.getCurrentSession();
		org.hibernate.Transaction tx=session.beginTransaction();
		res=(int) session.save(emp);
		
		
		Employee emp1=session.get(Employee.class, emp.getEid());
		System.out.println(emp1.getEid());
		//session.detach(emp);
		emp1.setEcourse("fkfn");
//		emp.setEid(303);
		//session.save(emp);
		session.getTransaction().commit();
		
		//session.save(emp);
		sessionFactory.close();
		return res;
	}

	@Override
	public void update(int eid) {
//		try {
//		Session session=sessionFactory.getCurrentSession();
//		session.beginTransaction();
//		Employee emp=session.get(Employee.class, eid);
//		emp.setEname("Dhavni");
//		session.getTransaction().commit();
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		try
//		{
//			Session session=sessionFactory.getCurrentSession();
//			session.beginTransaction();
//			Query query=session.createQuery("update Employee set ename=:ename where eid=:eid");
//			query.setParameter("ename","Rekha");
//			query.setParameter("eid", eid);
//			query.executeUpdate();
//			session.getTransaction().commit();
//			
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		
		try
		{
			Session session=sessionFactory.getCurrentSession();
			session.beginTransaction();
			Employee emp=session.get(Employee.class, eid);
			Query query=session.createQuery("update Employee set ename='Raju' where eid="+eid);
			query.executeUpdate();
			session.getTransaction().commit();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
}

	@Override
	public void delete(int eid) {
//		try
//		{
//			Session session=sessionFactory.getCurrentSession();
//			session.beginTransaction();
//			Query query=session.createQuery("delete from Employee where eid="+eid);
//			query.executeUpdate();
//			session.getTransaction().commit();
//			
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		
		
		try
		{
			Session session=sessionFactory.getCurrentSession();
			session.beginTransaction();
			Employee emp=session.get(Employee.class, eid);
			session.delete(emp);
			session.getTransaction().commit();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getDetails() {
		List<Employee> list=null;
		try {
		Session session=sessionFactory.getCurrentSession();
		Transaction tx=(Transaction) session.beginTransaction();
		list=session.createQuery("from Employee").list();
		tx.commit();
		//session.getTransaction().commit();   -->commit is required if you make any updation and deletion operation. To get details, It can be skipped.
		//System.out.println(list);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}

}
