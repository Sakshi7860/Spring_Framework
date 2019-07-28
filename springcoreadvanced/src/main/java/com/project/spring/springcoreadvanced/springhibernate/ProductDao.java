package com.project.spring.springcoreadvanced.springhibernate;

import java.util.List;

public interface ProductDao {
	int create(Product product);
	void delete(Product product);
	Product find(int id);
	List<Product> getAll();
	void update(Product product);

}
