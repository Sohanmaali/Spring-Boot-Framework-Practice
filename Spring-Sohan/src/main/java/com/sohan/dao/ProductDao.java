package com.sohan.dao;

import com.sohan.entites.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ProductDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public ProductDao(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	/**
	 * 
	 */
	public ProductDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int addProduct(Product product) {
		this.hibernateTemplate.save(product);
		return product.getId(); // Assuming getId() returns the generated ID
	}
}
