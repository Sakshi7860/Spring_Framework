package com.project.spring.springcoreadvanced.springhibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "product")
@Component
public class Product {
	@Id
	@Value("202")
	private int pid;
	@Value("Belt")
	private String pname;
	@Value("200")
	private int price;

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
}
