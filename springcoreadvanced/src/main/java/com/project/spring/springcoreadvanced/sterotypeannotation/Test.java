package com.project.spring.springcoreadvanced.sterotypeannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/project/spring/springcoreadvanced/sterotypeannotation/Config.xml");
		Employee employee = (Employee) context.getBean("employee");
		Employee employee1 = (Employee) context.getBean("employee");
		System.out.println(employee);
		System.out.println(employee.hashCode()); // both objects have diff address becoz their scope has set prototype
		System.out.println(employee1.hashCode());

	}

}
