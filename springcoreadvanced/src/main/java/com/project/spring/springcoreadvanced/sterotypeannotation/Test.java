package com.project.spring.springcoreadvanced.sterotypeannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/project/spring/springcoreadvanced/sterotypeannotation/Config.xml");
		Employee employee = (Employee) context.getBean("emp");
		Employee employee1 = (Employee) context.getBean("emp");
		System.out.println(employee.hashCode()); // both objects have diff address becoz their scope has set prototype
		System.out.println(employee1.hashCode());

	}

}
