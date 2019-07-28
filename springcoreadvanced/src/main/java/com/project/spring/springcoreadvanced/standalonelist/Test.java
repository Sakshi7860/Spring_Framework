package com.project.spring.springcoreadvanced.standalonelist;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
		public static void main(String args[])
		{
			ApplicationContext context=new ClassPathXmlApplicationContext("com/project/spring/springcoreadvanced/standalonelist/Config.xml");
			Student s=(Student)context.getBean("student");
			System.out.println(s.getCourses().getClass().getName());
			System.out.println(s);
		}

	

}
