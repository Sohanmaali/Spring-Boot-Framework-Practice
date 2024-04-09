package com.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.entites.Product;

@Component
public class ProductDao {
//	@Autowired
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public ProductDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int addProduct(Product product) {

		return (Integer) this.hibernateTemplate.save(product);
	}
}
