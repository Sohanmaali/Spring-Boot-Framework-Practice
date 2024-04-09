package com.sohan;

import com.sohan.dao.ProductDao;
import com.sohan.entites.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/sohan/config.xml");

		ProductDao productDao = context.getBean("productDao", ProductDao.class);

		Product product = new Product("Sample Product", "100", "This is a sample product");
		int productId = productDao.addProduct(product);

		System.out.println("Product added with ID: " + productId);
	}
}
