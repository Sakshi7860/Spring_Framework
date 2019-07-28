package com.project.spring.springcoreadvanced.sterotypeannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class EmployeeConfiguration {

	@Bean
	@Scope("prototype")
	public Employee getEmployee(){
		Employee emp = new Employee();
		emp.setEmpno(101);
		emp.setEname("Sakshi");
		emp.setAddress(getAddress());
		return emp;
	}
	
	@Bean
	public Address getAddress() {
		// TODO Auto-generated method stub
		Address adr = new Address();
		adr.setCity("Sunam");
		adr.setHno(407);
		adr.setPincode("df");
		return adr;
	}
}
