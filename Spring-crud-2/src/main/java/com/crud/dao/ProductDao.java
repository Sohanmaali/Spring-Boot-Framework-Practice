package com.crud.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.crud.entities.*;

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

//	========================================================================================================
	@Transactional
	public void addProduct(Product product) {

		this.hibernateTemplate.saveOrUpdate(product);
	}

	@Transactional
	public void deleteProduct(int id) {
		// Retrieve the product object associated with the given ID
		Product productToDelete = this.hibernateTemplate.get(Product.class, id);
		if (productToDelete != null) {
			// Delete the retrieved product object
			this.hibernateTemplate.delete(productToDelete);
		} else {
			// Handle the case where the product with the given ID doesn't exist
			// You may throw an exception or log a message here
		}
	}

	public Product getProduct(int id) {
		// Use hibernateTemplate's get method to retrieve the Product
		Product product = this.hibernateTemplate.get(Product.class, id);
		return product;
	}

	public List<Product> getProducts() {
		// Use hibernateTemplate's loadAll method to retrieve all Product objects
		List<Product> products = (List<Product>) hibernateTemplate.loadAll(Product.class);
		return products;
	}

	@Transactional
	public void updateProduct(Product product) {

		this.hibernateTemplate.update(product);
	}
}
