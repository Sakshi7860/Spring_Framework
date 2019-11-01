package com.project.spring.springcoreadvanced.springhibernate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ProductDaoImp implements ProductDao {
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Transactional
	@Override
	public int create(Product product) {
		Integer result=(Integer) hibernateTemplate.save(product);
		return result;
	}

	@Override
	public Product find(int id) {
		Product product=hibernateTemplate.get(Product.class, id);
		return product;
	}

	@Transactional
	@Override
	public void delete(Product product) {
		hibernateTemplate.delete(product);
		
	}

	@Override
	public List<Product> getAll() {
		List<Product> list=hibernateTemplate.loadAll(Product.class);
		return list;
	}

	@Transactional
	@Override
	public void update(Product product) {
		hibernateTemplate.update(product);
		//(Product)hibernateTemplate.merge(product)   //return the object of product
	}

	
}
