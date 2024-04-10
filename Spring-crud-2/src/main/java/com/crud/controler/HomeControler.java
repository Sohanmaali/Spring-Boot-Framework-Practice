package com.crud.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.crud.dao.ProductDao;
import com.crud.entities.Product;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeControler {
	@Autowired
	private ProductDao productDao;

	@RequestMapping("/")
//	public String home() {
	public String home(Model m) {

		List<Product> product = this.productDao.getProducts();
		m.addAttribute("product", product);
		return "index";
	}

	@RequestMapping(path = "/addproductsub", method = RequestMethod.POST)
	public RedirectView addproductsub(@ModelAttribute Product product, HttpServletRequest request) {
		System.out.println(product);
		this.productDao.addProduct(product);
		RedirectView redirectView = new RedirectView();

		redirectView.setUrl(request.getContextPath() + "/");

		return redirectView;
	}

	@RequestMapping("/addProduct")
	public String addProduct() {

		return "addProduct";
	}

	@RequestMapping("/back")
	public RedirectView back(HttpServletRequest request) {

		RedirectView redirectView = new RedirectView();

		redirectView.setUrl(request.getContextPath() + "/");

		return redirectView;

	}

	@RequestMapping("/deleteProduct/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int id, HttpServletRequest request) {

		this.productDao.deleteProduct(id);
		RedirectView redirectView = new RedirectView();

		redirectView.setUrl(request.getContextPath() + "/");

		return redirectView;
	}

	@RequestMapping("/editProduct/{productId}")
	public String editProduct(@PathVariable("productId") int id, Model m) {

		Product product = this.productDao.getProduct(id);
		m.addAttribute("product", product);
		System.out.println(product);
		return "editProduct";
	}
}
