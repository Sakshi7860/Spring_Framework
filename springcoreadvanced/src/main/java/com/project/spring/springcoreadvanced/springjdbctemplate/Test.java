package com.project.spring.springcoreadvanced.springjdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/project/spring/springcoreadvanced/springjdbctemplate/Config.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(dao.getEmployee(emp.getEno()));

	}
	

}
