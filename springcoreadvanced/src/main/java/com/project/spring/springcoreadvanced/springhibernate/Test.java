package com.project.spring.springcoreadvanced.springhibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/project/spring/springcoreadvanced/springhibernate/Config.xml");
		
		ProductDao dao=(ProductDao) context.getBean("productDaoImp");
		Product product=(Product) context.getBean("product");
		System.out.println(dao.create(product));
		dao.update(product);
		
	}
	

}
